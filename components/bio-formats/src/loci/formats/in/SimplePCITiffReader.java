/*
 * #%L
 * OME Bio-Formats package for reading and converting biological file formats.
 * %%
 * Copyright (C) 2005 - 2012 Open Microscopy Environment:
 *   - Board of Regents of the University of Wisconsin-Madison
 *   - Glencoe Software, Inc.
 *   - University of Dundee
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

package loci.formats.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

import loci.common.DateTools;
import loci.common.IniList;
import loci.common.IniParser;
import loci.common.IniTable;
import loci.common.RandomAccessInputStream;
import loci.formats.FormatException;
import loci.formats.FormatTools;
import loci.formats.ImageTools;
import loci.formats.MetadataTools;
import loci.formats.meta.MetadataStore;
import loci.formats.tiff.IFD;
import loci.formats.tiff.TiffParser;

import ome.xml.model.primitives.PositiveFloat;
import ome.xml.model.primitives.PositiveInteger;
import ome.xml.model.primitives.Timestamp;

/**
 * SimplePCITiffReader is the file format reader for TIFF files produced by
 * SimplePCI software.
 *
 * <dl><dt><b>Source code:</b></dt>
 * <dd><a href="http://trac.openmicroscopy.org.uk/ome/browser/bioformats.git/components/bio-formats/src/loci/formats/in/SimplePCITiffReader.java">Trac</a>,
 * <a href="http://git.openmicroscopy.org/?p=bioformats.git;a=blob;f=components/bio-formats/src/loci/formats/in/SimplePCITiffReader.java;hb=HEAD">Gitweb</a></dd></dl>
 */
public class SimplePCITiffReader extends BaseTiffReader {

  // -- Constants --

  private static final String MAGIC_STRING = "Created by Hamamatsu Inc.";
  private static final String DATE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss z";

  private static final int CUSTOM_BITS = 65531;

  // -- Fields --

  private MinimalTiffReader delegate;
  private String date;
  private Integer magnification;
  private String immersion;
  private String cameraType;
  private String cameraName;
  private String binning;
  private ArrayList<Double> exposureTimes;
  private double scaling;

  // -- Constructor --

  public SimplePCITiffReader() {
    super("SimplePCI TIFF", new String[] {"tif", "tiff"});
    suffixSufficient = false;
    domains = new String[] {FormatTools.LM_DOMAIN};
  }

  // -- IFormatReader API methods --

  /* @see loci.formats.IFormatReader#isThisType(RandomAccessInputStream) */
  public boolean isThisType(RandomAccessInputStream stream) throws IOException {
    TiffParser tp = new TiffParser(stream);
    String comment = tp.getComment();
    if (comment == null) return false;
    return comment.trim().startsWith(MAGIC_STRING);
  }

  /**
   * @see loci.formats.IFormatReader#openBytes(int, byte[], int, int, int, int)
   */
  public byte[] openBytes(int no, byte[] buf, int x, int y, int w, int h)
    throws FormatException, IOException
  {
    FormatTools.checkPlaneParameters(this, no, buf.length, x, y, w, h);
    if (getSizeC() == 1) {
      return super.openBytes(no, buf, x, y, w, h);
    }

    byte[] b = delegate.openBytes(no / getSizeC(), x, y, w, h);
    int bpp = FormatTools.getBytesPerPixel(getPixelType());
    int c = getZCTCoords(no)[1];
    ImageTools.splitChannels(
      b, buf, c, getSizeC(), bpp, false, isInterleaved(), w * h * bpp);
    return buf;
  }

  /* @see loci.formats.IFormatReader#close(boolean) */
  public void close(boolean fileOnly) throws IOException {
    super.close(fileOnly);
    if (delegate != null) delegate.close(fileOnly);
    if (!fileOnly) {
      delegate = null;
      date = null;
      magnification = null;
      immersion = null;
      cameraType = null;
      cameraName = null;
      binning = null;
      exposureTimes = null;
      scaling = 0d;
    }
  }

  // -- Internal BaseTiffReader API methods --

  /* @see BaseTiffReader#initStandardMetadata() */
  protected void initStandardMetadata() throws FormatException, IOException {
    super.initStandardMetadata();

    delegate = new MinimalTiffReader();
    delegate.setId(currentId);

    exposureTimes = new ArrayList<Double>();

    String data = ifds.get(0).getComment();

    // remove magic string
    data = data.substring(data.indexOf("\n") + 1);

    date = data.substring(0, data.indexOf("\n"));
    data = data.substring(data.indexOf("\n") + 1);
    data = data.replaceAll("ReadFromDoc", "");

    IniParser parser = new IniParser();
    parser.setCommentDelimiter(";");

    IniList ini = parser.parseINI(new BufferedReader(new StringReader(data)));

    String objective = ini.getTable(" MICROSCOPE ").get("Objective");
    int space = objective.indexOf(" ");
    if (space != -1) {
      magnification = new Integer(objective.substring(0, space - 1));
      immersion = objective.substring(space + 1);
    }

    IniTable cameraTable = ini.getTable(" CAPTURE DEVICE ");
    binning = cameraTable.get("Binning") + "x" + cameraTable.get("Binning");
    cameraType = cameraTable.get("Camera Type");
    cameraName = cameraTable.get("Camera Name");
    core[0].bitsPerPixel = Integer.parseInt(cameraTable.get("Display Depth"));

    IniTable captureTable = ini.getTable(" CAPTURE ");
    int index = 1;
    for (int i=0; i<getSizeC(); i++) {
      if (captureTable.get("c_Filter" + index) != null) {
        exposureTimes.add(new Double(captureTable.get("c_Expos" + index)));
      }
      else i--;
      index++;
    }

    IniTable calibrationTable = ini.getTable(" CALIBRATION ");
    String units = calibrationTable.get("units");
    scaling = Double.parseDouble(calibrationTable.get("factor"));

    core[0].imageCount *= getSizeC();
    core[0].rgb = false;

    if (ifds.get(0).containsKey(CUSTOM_BITS)) {
      core[0].bitsPerPixel = ifds.get(0).getIFDIntValue(CUSTOM_BITS);
    }

    if (getMetadataOptions().getMetadataLevel() != MetadataLevel.MINIMUM) {
      HashMap<String, String> iniMap = ini.flattenIntoHashMap();
      metadata.putAll(iniMap);
    }
  }

  /* @see BaseTiffReader#initMetadataStore() */
  protected void initMetadataStore() throws FormatException {
    super.initMetadataStore();
    MetadataStore store = makeFilterMetadata();
    MetadataTools.populatePixels(store, this, true);

    if (date != null) {
      date = DateTools.formatDate(date, DATE_FORMAT);
      if (date != null) {
        store.setImageAcquisitionDate(new Timestamp(date), 0);
      }
    }

    if (getMetadataOptions().getMetadataLevel() != MetadataLevel.MINIMUM) {
      store.setImageDescription(MAGIC_STRING, 0);
      if (scaling > 0) {
        store.setPixelsPhysicalSizeX(new PositiveFloat(scaling), 0);
        store.setPixelsPhysicalSizeY(new PositiveFloat(scaling), 0);
      }
      else {
        LOGGER.warn("Expected positive value for PhysicalSize; got {}",
          scaling);
      }

      String instrument = MetadataTools.createLSID("Instrument", 0);
      store.setInstrumentID(instrument, 0);
      store.setImageInstrumentRef(instrument, 0);

      store.setObjectiveID(MetadataTools.createLSID("Objective", 0, 0), 0, 0);
      if (magnification > 0) {
        store.setObjectiveNominalMagnification(
          new PositiveInteger(magnification), 0, 0);
      }
      else {
        LOGGER.warn("Expected positive value for NominalMagnification; got {}",
          magnification);
      }
      store.setObjectiveImmersion(getImmersion(immersion), 0, 0);

      String detector = MetadataTools.createLSID("Detector", 0, 0);
      store.setDetectorID(detector, 0, 0);
      store.setDetectorModel(cameraType + " " + cameraName, 0, 0);
      store.setDetectorType(getDetectorType("CCD"), 0, 0);

      for (int i=0; i<getSizeC(); i++) {
        store.setDetectorSettingsID(detector, 0, i);
        store.setDetectorSettingsBinning(getBinning(binning), 0, i);
      }

      for (int i=0; i<getImageCount(); i++) {
        int[] zct = getZCTCoords(i);
        store.setPlaneExposureTime(exposureTimes.get(zct[1]) / 1000000, 0, i);
      }
    }
  }

}
