//
// OMEXML2003FCMetadata.java
//

/*
OME Bio-Formats package for reading and converting biological file formats.
Copyright (C) 2005-@year@ UW-Madison LOCI and Glencoe Software, Inc.

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

/*-----------------------------------------------------------------------------
 *
 * THIS IS AUTOMATICALLY GENERATED CODE.  DO NOT MODIFY.
 * Created by melissa via MetadataAutogen on Jul 1, 2008 8:53:09 AM PDT
 *
 *-----------------------------------------------------------------------------
 */

package loci.formats.ome;

import ome.xml.OMEXMLNode;
import ome.xml.r2003fc.ome.*;
import java.util.List;
import loci.formats.LogTools;

/**
 * A metadata store implementation for constructing and manipulating OME-XML
 * DOMs for the 2003-FC version of OME-XML. It requires the
 * ome.xml.r2003fc package to compile (part of ome-xml.jar).
 *
 * <dl><dt><b>Source code:</b></dt>
 * <dd><a href="https://skyking.microscopy.wisc.edu/trac/java/browser/trunk/components/bio-formats/src/loci/formats/ome/OMEXML2003FCMetadata.java">Trac</a>,
 * <a href="https://skyking.microscopy.wisc.edu/svn/java/trunk/components/bio-formats/src/loci/formats/ome/OMEXML2003FCMetadata.java">SVN</a></dd></dl>
 *
 * @author Curtis Rueden ctrueden at wisc.edu
 * @author Melissa Linkert linkert at wisc.edu
 */
public class OMEXML2003FCMetadata extends OMEXMLMetadata {

  // -- OMEXMLMetadata API methods --

  /* @see OMEXMLMetadata#dumpXML() */
  public String dumpXML() {
    if (root == null) return null;
    try {
      java.io.ByteArrayOutputStream os = new java.io.ByteArrayOutputStream();
      ome.xml.DOMUtil.writeXML(os, root.getDOMElement().getOwnerDocument());
      return os.toString();
    }
    catch (javax.xml.transform.TransformerException exc) {
      LogTools.trace(exc);
    }
    return null;
  }

  // -- MetadataRetrieve API methods --

  // - Entity counting -

  /* @see loci.formats.meta.MetadataRetrieve#getChannelComponentCount(int, int) */
  public int getChannelComponentCount(int imageIndex, int logicalChannelIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getChannelComponentNode(imageIndex, logicalChannelIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorCount(int) */
  public int getDetectorCount(int instrumentIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getDetectorNode(instrumentIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getExperimenterCount() */
  public int getExperimenterCount() {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getExperimenterNode(i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getImageCount() */
  public int getImageCount() {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getImageNode(i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getInstrumentCount() */
  public int getInstrumentCount() {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getInstrumentNode(i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceCount(int) */
  public int getLightSourceCount(int instrumentIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getLightSourceNode(instrumentIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelCount(int) */
  public int getLogicalChannelCount(int imageIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getChannelInfoNode(imageIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getOTFCount(int) */
  public int getOTFCount(int instrumentIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getOTFNode(instrumentIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveCount(int) */
  public int getObjectiveCount(int instrumentIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getObjectiveNode(instrumentIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsCount(int) */
  public int getPixelsCount(int imageIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getPixelsNode(imageIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlaneCount(int, int) */
  public int getPlaneCount(int imageIndex, int pixelsIndex) {
    // NB: Plane unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateCount() */
  public int getPlateCount() {
    // NB: Plate unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateRefCount(int) */
  public int getPlateRefCount(int screenIndex) {
    // NB: PlateRef unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getROICount(int) */
  public int getROICount(int imageIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getROINode(imageIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getReagentCount(int) */
  public int getReagentCount(int screenIndex) {
    // NB: Reagent unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenCount() */
  public int getScreenCount() {
    // NB: Screen unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenAcquisitionCount(int) */
  public int getScreenAcquisitionCount(int screenIndex) {
    // NB: ScreenAcquisition unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getTiffDataCount(int, int) */
  public int getTiffDataCount(int imageIndex, int pixelsIndex) {
    for (int i=0; i<Integer.MAX_VALUE; i++) {
      if (getTiffDataNode(imageIndex, pixelsIndex, i, false) == null) return i;
    }
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellCount(int) */
  public int getWellCount(int plateIndex) {
    // NB: Well unsupported for schema version 2003-FC
    return -1;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellSampleCount(int, int) */
  public int getWellSampleCount(int plateIndex, int wellIndex) {
    // NB: WellSample unsupported for schema version 2003-FC
    return -1;
  }

  // - Entity retrieval -

  // - Arc property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getArcType(int, int) */
  public String getArcType(int instrumentIndex, int lightSourceIndex) {
    ArcNode arc = getArcNode(instrumentIndex, lightSourceIndex, false);
      return arc == null ? null : arc.getType();
    }

  // - ChannelComponent property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getChannelComponentColorDomain(int, int, int) */
  public String getChannelComponentColorDomain(int imageIndex, int logicalChannelIndex, int channelComponentIndex) {
    ChannelComponentNode channelComponent = getChannelComponentNode(imageIndex, logicalChannelIndex, channelComponentIndex, false);
      return channelComponent == null ? null : channelComponent.getColorDomain();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getChannelComponentIndex(int, int, int) */
  public Integer getChannelComponentIndex(int imageIndex, int logicalChannelIndex, int channelComponentIndex) {
    ChannelComponentNode channelComponent = getChannelComponentNode(imageIndex, logicalChannelIndex, channelComponentIndex, false);
      return channelComponent == null ? null : channelComponent.getIndex();
    }

  // - Detector property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorGain(int, int) */
  public Float getDetectorGain(int instrumentIndex, int detectorIndex) {
    DetectorNode detector = getDetectorNode(instrumentIndex, detectorIndex, false);
      return detector == null ? null : detector.getGain();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorID(int, int) */
  public String getDetectorID(int instrumentIndex, int detectorIndex) {
    DetectorNode detector = getDetectorNode(instrumentIndex, detectorIndex, false);
      return detector == null ? null : detector.getNodeID();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorManufacturer(int, int) */
  public String getDetectorManufacturer(int instrumentIndex, int detectorIndex) {
    DetectorNode detector = getDetectorNode(instrumentIndex, detectorIndex, false);
      return detector == null ? null : detector.getManufacturer();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorModel(int, int) */
  public String getDetectorModel(int instrumentIndex, int detectorIndex) {
    DetectorNode detector = getDetectorNode(instrumentIndex, detectorIndex, false);
      return detector == null ? null : detector.getModel();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorOffset(int, int) */
  public Float getDetectorOffset(int instrumentIndex, int detectorIndex) {
    DetectorNode detector = getDetectorNode(instrumentIndex, detectorIndex, false);
      return detector == null ? null : detector.getOffset();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorSerialNumber(int, int) */
  public String getDetectorSerialNumber(int instrumentIndex, int detectorIndex) {
    DetectorNode detector = getDetectorNode(instrumentIndex, detectorIndex, false);
      return detector == null ? null : detector.getSerialNumber();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorType(int, int) */
  public String getDetectorType(int instrumentIndex, int detectorIndex) {
    DetectorNode detector = getDetectorNode(instrumentIndex, detectorIndex, false);
      return detector == null ? null : detector.getType();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorVoltage(int, int) */
  public Float getDetectorVoltage(int instrumentIndex, int detectorIndex) {
    DetectorNode detector = getDetectorNode(instrumentIndex, detectorIndex, false);
      return detector == null ? null : detector.getVoltage();
    }

  // - DetectorSettings property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorSettingsDetector(int, int) */
  public String getDetectorSettingsDetector(int imageIndex, int logicalChannelIndex) {
    DetectorRefNode detectorRef = getDetectorRefNode(imageIndex, logicalChannelIndex, false);
      return detectorRef == null ? null : detectorRef.getNodeID();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorSettingsGain(int, int) */
  public Float getDetectorSettingsGain(int imageIndex, int logicalChannelIndex) {
    DetectorRefNode detectorRef = getDetectorRefNode(imageIndex, logicalChannelIndex, false);
      return detectorRef == null ? null : detectorRef.getGain();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getDetectorSettingsOffset(int, int) */
  public Float getDetectorSettingsOffset(int imageIndex, int logicalChannelIndex) {
    DetectorRefNode detectorRef = getDetectorRefNode(imageIndex, logicalChannelIndex, false);
      return detectorRef == null ? null : detectorRef.getOffset();
    }

  // - Dimensions property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getDimensionsPhysicalSizeX(int, int) */
  public Float getDimensionsPhysicalSizeX(int imageIndex, int pixelsIndex) {
    ImageNode image = getImageNode(imageIndex, false);
      return image == null ? null : image.getPixelSizeX();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getDimensionsPhysicalSizeY(int, int) */
  public Float getDimensionsPhysicalSizeY(int imageIndex, int pixelsIndex) {
    ImageNode image = getImageNode(imageIndex, false);
      return image == null ? null : image.getPixelSizeY();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getDimensionsPhysicalSizeZ(int, int) */
  public Float getDimensionsPhysicalSizeZ(int imageIndex, int pixelsIndex) {
    ImageNode image = getImageNode(imageIndex, false);
      return image == null ? null : image.getPixelSizeZ();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getDimensionsTimeIncrement(int, int) */
  public Float getDimensionsTimeIncrement(int imageIndex, int pixelsIndex) {
    ImageNode image = getImageNode(imageIndex, false);
      return image == null ? null : image.getTimeIncrement();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getDimensionsWaveIncrement(int, int) */
  public Integer getDimensionsWaveIncrement(int imageIndex, int pixelsIndex) {
    ImageNode image = getImageNode(imageIndex, false);
      return image == null ? null : image.getWaveIncrement();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getDimensionsWaveStart(int, int) */
  public Integer getDimensionsWaveStart(int imageIndex, int pixelsIndex) {
    ImageNode image = getImageNode(imageIndex, false);
      return image == null ? null : image.getWaveStart();
    }

  // - DisplayOptions property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getDisplayOptionsID(int) */
  public String getDisplayOptionsID(int imageIndex) {
    DisplayOptionsNode displayOptions = getDisplayOptionsNode(imageIndex, false);
      return displayOptions == null ? null : displayOptions.getNodeID();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getDisplayOptionsZoom(int) */
  public Float getDisplayOptionsZoom(int imageIndex) {
    DisplayOptionsNode displayOptions = getDisplayOptionsNode(imageIndex, false);
      return displayOptions == null ? null : displayOptions.getZoom();
    }

  // - DisplayOptionsProjection property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getDisplayOptionsProjectionZStart(int) */
  public Integer getDisplayOptionsProjectionZStart(int imageIndex) {
    ProjectionNode projection = getProjectionNode(imageIndex, false);
      return projection == null ? null : projection.getZstart();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getDisplayOptionsProjectionZStop(int) */
  public Integer getDisplayOptionsProjectionZStop(int imageIndex) {
    ProjectionNode projection = getProjectionNode(imageIndex, false);
      return projection == null ? null : projection.getZstop();
    }

  // - DisplayOptionsTime property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getDisplayOptionsTimeTStart(int) */
  public Integer getDisplayOptionsTimeTStart(int imageIndex) {
    TimeNode time = getTimeNode(imageIndex, false);
      return time == null ? null : time.getTstart();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getDisplayOptionsTimeTStop(int) */
  public Integer getDisplayOptionsTimeTStop(int imageIndex) {
    TimeNode time = getTimeNode(imageIndex, false);
      return time == null ? null : time.getTstop();
    }

  // - Experimenter property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getExperimenterEmail(int) */
  public String getExperimenterEmail(int experimenterIndex) {
    ExperimenterNode experimenter = getExperimenterNode(experimenterIndex, false);
      return experimenter == null ? null : experimenter.getEmail();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getExperimenterFirstName(int) */
  public String getExperimenterFirstName(int experimenterIndex) {
    ExperimenterNode experimenter = getExperimenterNode(experimenterIndex, false);
      return experimenter == null ? null : experimenter.getFirstName();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getExperimenterID(int) */
  public String getExperimenterID(int experimenterIndex) {
    ExperimenterNode experimenter = getExperimenterNode(experimenterIndex, false);
      return experimenter == null ? null : experimenter.getNodeID();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getExperimenterInstitution(int) */
  public String getExperimenterInstitution(int experimenterIndex) {
    ExperimenterNode experimenter = getExperimenterNode(experimenterIndex, false);
      return experimenter == null ? null : experimenter.getInstitution();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getExperimenterLastName(int) */
  public String getExperimenterLastName(int experimenterIndex) {
    ExperimenterNode experimenter = getExperimenterNode(experimenterIndex, false);
      return experimenter == null ? null : experimenter.getLastName();
    }

  // - Filament property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getFilamentType(int, int) */
  public String getFilamentType(int instrumentIndex, int lightSourceIndex) {
    FilamentNode filament = getFilamentNode(instrumentIndex, lightSourceIndex, false);
      return filament == null ? null : filament.getType();
    }

  // - Image property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getImageCreationDate(int) */
  public String getImageCreationDate(int imageIndex) {
    ImageNode image = getImageNode(imageIndex, false);
      return image == null ? null : image.getCreationDate();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getImageDescription(int) */
  public String getImageDescription(int imageIndex) {
    ImageNode image = getImageNode(imageIndex, false);
      return image == null ? null : image.getDescription();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getImageID(int) */
  public String getImageID(int imageIndex) {
    ImageNode image = getImageNode(imageIndex, false);
      return image == null ? null : image.getNodeID();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getImageInstrumentRef(int) */
  public String getImageInstrumentRef(int imageIndex) {
    ImageNode image = getImageNode(imageIndex, false);
      InstrumentNode node = image.getInstrument();
    if (node == null) return null;
    return node.getNodeID();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getImageName(int) */
  public String getImageName(int imageIndex) {
    ImageNode image = getImageNode(imageIndex, false);
      return image == null ? null : image.getName();
    }

  // - ImagingEnvironment property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getImagingEnvironmentAirPressure(int) */
  public Float getImagingEnvironmentAirPressure(int imageIndex) {
    ImagingEnvironmentNode imagingEnvironment = getImagingEnvironmentNode(imageIndex, false);
      return imagingEnvironment == null ? null : imagingEnvironment.getAirPressure();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getImagingEnvironmentCO2Percent(int) */
  public Float getImagingEnvironmentCO2Percent(int imageIndex) {
    ImagingEnvironmentNode imagingEnvironment = getImagingEnvironmentNode(imageIndex, false);
      return imagingEnvironment == null ? null : imagingEnvironment.getCO2Percent();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getImagingEnvironmentHumidity(int) */
  public Float getImagingEnvironmentHumidity(int imageIndex) {
    ImagingEnvironmentNode imagingEnvironment = getImagingEnvironmentNode(imageIndex, false);
      return imagingEnvironment == null ? null : imagingEnvironment.getHumidity();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getImagingEnvironmentTemperature(int) */
  public Float getImagingEnvironmentTemperature(int imageIndex) {
    ImagingEnvironmentNode imagingEnvironment = getImagingEnvironmentNode(imageIndex, false);
      return imagingEnvironment == null ? null : imagingEnvironment.getTemperature();
    }

  // - Instrument property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getInstrumentID(int) */
  public String getInstrumentID(int instrumentIndex) {
    InstrumentNode instrument = getInstrumentNode(instrumentIndex, false);
      return instrument == null ? null : instrument.getNodeID();
    }

  // - Laser property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getLaserFrequencyMultiplication(int, int) */
  public Integer getLaserFrequencyMultiplication(int instrumentIndex, int lightSourceIndex) {
    LaserNode laser = getLaserNode(instrumentIndex, lightSourceIndex, false);
      return laser == null ? null : booleanToInteger(laser.getFrequencyDoubled());
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLaserLaserMedium(int, int) */
  public String getLaserLaserMedium(int instrumentIndex, int lightSourceIndex) {
    LaserNode laser = getLaserNode(instrumentIndex, lightSourceIndex, false);
      return laser == null ? null : laser.getMedium();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLaserPulse(int, int) */
  public String getLaserPulse(int instrumentIndex, int lightSourceIndex) {
    LaserNode laser = getLaserNode(instrumentIndex, lightSourceIndex, false);
      return laser == null ? null : laser.getPulse();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLaserTuneable(int, int) */
  public Boolean getLaserTuneable(int instrumentIndex, int lightSourceIndex) {
    LaserNode laser = getLaserNode(instrumentIndex, lightSourceIndex, false);
      return laser == null ? null : laser.getTunable();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLaserType(int, int) */
  public String getLaserType(int instrumentIndex, int lightSourceIndex) {
    LaserNode laser = getLaserNode(instrumentIndex, lightSourceIndex, false);
      return laser == null ? null : laser.getType();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLaserWavelength(int, int) */
  public Integer getLaserWavelength(int instrumentIndex, int lightSourceIndex) {
    LaserNode laser = getLaserNode(instrumentIndex, lightSourceIndex, false);
      return laser == null ? null : laser.getWavelength();
    }

  // - LightSource property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceID(int, int) */
  public String getLightSourceID(int instrumentIndex, int lightSourceIndex) {
    LightSourceNode lightSource = getLightSourceNode(instrumentIndex, lightSourceIndex, false);
      return lightSource == null ? null : lightSource.getNodeID();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceManufacturer(int, int) */
  public String getLightSourceManufacturer(int instrumentIndex, int lightSourceIndex) {
    LightSourceNode lightSource = getLightSourceNode(instrumentIndex, lightSourceIndex, false);
      return lightSource == null ? null : lightSource.getManufacturer();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceModel(int, int) */
  public String getLightSourceModel(int instrumentIndex, int lightSourceIndex) {
    LightSourceNode lightSource = getLightSourceNode(instrumentIndex, lightSourceIndex, false);
      return lightSource == null ? null : lightSource.getModel();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourcePower(int, int) */
  public Float getLightSourcePower(int instrumentIndex, int lightSourceIndex) {
    // NB: Power unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceSerialNumber(int, int) */
  public String getLightSourceSerialNumber(int instrumentIndex, int lightSourceIndex) {
    LightSourceNode lightSource = getLightSourceNode(instrumentIndex, lightSourceIndex, false);
      return lightSource == null ? null : lightSource.getSerialNumber();
    }

  // - LightSourceSettings property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceSettingsAttenuation(int, int) */
  public Float getLightSourceSettingsAttenuation(int imageIndex, int logicalChannelIndex) {
    LightSourceRefNode lightSourceRef = getLightSourceRefNode(imageIndex, logicalChannelIndex, false);
      return lightSourceRef == null ? null : lightSourceRef.getAttenuation();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceSettingsLightSource(int, int) */
  public String getLightSourceSettingsLightSource(int imageIndex, int logicalChannelIndex) {
    LightSourceRefNode lightSourceRef = getLightSourceRefNode(imageIndex, logicalChannelIndex, false);
      return lightSourceRef == null ? null : lightSourceRef.getNodeID();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLightSourceSettingsWavelength(int, int) */
  public Integer getLightSourceSettingsWavelength(int imageIndex, int logicalChannelIndex) {
    LightSourceRefNode lightSourceRef = getLightSourceRefNode(imageIndex, logicalChannelIndex, false);
      return lightSourceRef == null ? null : lightSourceRef.getWavelength();
    }

  // - LogicalChannel property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelContrastMethod(int, int) */
  public String getLogicalChannelContrastMethod(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
      return channelInfo == null ? null : channelInfo.getContrastMethod();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelEmWave(int, int) */
  public Integer getLogicalChannelEmWave(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
      return channelInfo == null ? null : channelInfo.getEmWave();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelExWave(int, int) */
  public Integer getLogicalChannelExWave(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
      return channelInfo == null ? null : channelInfo.getExWave();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelFluor(int, int) */
  public String getLogicalChannelFluor(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
      return channelInfo == null ? null : channelInfo.getFluor();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelID(int, int) */
  public String getLogicalChannelID(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
      return channelInfo == null ? null : channelInfo.getNodeID();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelIlluminationType(int, int) */
  public String getLogicalChannelIlluminationType(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
      return channelInfo == null ? null : channelInfo.getIlluminationType();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelMode(int, int) */
  public String getLogicalChannelMode(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
      return channelInfo == null ? null : channelInfo.getMode();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelName(int, int) */
  public String getLogicalChannelName(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
      return channelInfo == null ? null : channelInfo.getName();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelNdFilter(int, int) */
  public Float getLogicalChannelNdFilter(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
      return channelInfo == null ? null : channelInfo.getNDfilter();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelPhotometricInterpretation(int, int) */
  public String getLogicalChannelPhotometricInterpretation(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
      return channelInfo == null ? null : channelInfo.getPhotometricInterpretation();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelPinholeSize(int, int) */
  public Integer getLogicalChannelPinholeSize(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
      return channelInfo == null ? null : channelInfo.getPinholeSize();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelPockelCellSetting(int, int) */
  public Integer getLogicalChannelPockelCellSetting(int imageIndex, int logicalChannelIndex) {
    // NB: PockelCellSetting unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getLogicalChannelSamplesPerPixel(int, int) */
  public Integer getLogicalChannelSamplesPerPixel(int imageIndex, int logicalChannelIndex) {
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, logicalChannelIndex, false);
      return channelInfo == null ? null : channelInfo.getSamplesPerPixel();
    }

  // - OTF property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getOTFID(int, int) */
  public String getOTFID(int instrumentIndex, int otfIndex) {
    OTFNode otf = getOTFNode(instrumentIndex, otfIndex, false);
      return otf == null ? null : otf.getNodeID();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getOTFOpticalAxisAveraged(int, int) */
  public Boolean getOTFOpticalAxisAveraged(int instrumentIndex, int otfIndex) {
    OTFNode otf = getOTFNode(instrumentIndex, otfIndex, false);
      return otf == null ? null : otf.getOpticalAxisAvrg();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getOTFPixelType(int, int) */
  public String getOTFPixelType(int instrumentIndex, int otfIndex) {
    OTFNode otf = getOTFNode(instrumentIndex, otfIndex, false);
      return otf == null ? null : otf.getPixelType();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getOTFSizeX(int, int) */
  public Integer getOTFSizeX(int instrumentIndex, int otfIndex) {
    OTFNode otf = getOTFNode(instrumentIndex, otfIndex, false);
      return otf == null ? null : otf.getSizeX();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getOTFSizeY(int, int) */
  public Integer getOTFSizeY(int instrumentIndex, int otfIndex) {
    OTFNode otf = getOTFNode(instrumentIndex, otfIndex, false);
      return otf == null ? null : otf.getSizeY();
    }

  // - Objective property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveCalibratedMagnification(int, int) */
  public Float getObjectiveCalibratedMagnification(int instrumentIndex, int objectiveIndex) {
    ObjectiveNode objective = getObjectiveNode(instrumentIndex, objectiveIndex, false);
      return objective == null ? null : objective.getMagnification();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveCorrection(int, int) */
  public String getObjectiveCorrection(int instrumentIndex, int objectiveIndex) {
    // NB: Correction unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveID(int, int) */
  public String getObjectiveID(int instrumentIndex, int objectiveIndex) {
    ObjectiveNode objective = getObjectiveNode(instrumentIndex, objectiveIndex, false);
      return objective == null ? null : objective.getNodeID();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveImmersion(int, int) */
  public String getObjectiveImmersion(int instrumentIndex, int objectiveIndex) {
    // NB: Immersion unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveLensNA(int, int) */
  public Float getObjectiveLensNA(int instrumentIndex, int objectiveIndex) {
    ObjectiveNode objective = getObjectiveNode(instrumentIndex, objectiveIndex, false);
      return objective == null ? null : objective.getLensNA();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveManufacturer(int, int) */
  public String getObjectiveManufacturer(int instrumentIndex, int objectiveIndex) {
    ObjectiveNode objective = getObjectiveNode(instrumentIndex, objectiveIndex, false);
      return objective == null ? null : objective.getManufacturer();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveModel(int, int) */
  public String getObjectiveModel(int instrumentIndex, int objectiveIndex) {
    ObjectiveNode objective = getObjectiveNode(instrumentIndex, objectiveIndex, false);
      return objective == null ? null : objective.getModel();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveNominalMagnification(int, int) */
  public Integer getObjectiveNominalMagnification(int instrumentIndex, int objectiveIndex) {
    // NB: NominalMagnification unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveSerialNumber(int, int) */
  public String getObjectiveSerialNumber(int instrumentIndex, int objectiveIndex) {
    ObjectiveNode objective = getObjectiveNode(instrumentIndex, objectiveIndex, false);
      return objective == null ? null : objective.getSerialNumber();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getObjectiveWorkingDistance(int, int) */
  public Float getObjectiveWorkingDistance(int instrumentIndex, int objectiveIndex) {
    // NB: WorkingDistance unsupported for schema version 2003-FC
    return null;
  }

  // - Pixels property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsBigEndian(int, int) */
  public Boolean getPixelsBigEndian(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
      return pixels == null ? null : pixels.getBigEndian();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsDimensionOrder(int, int) */
  public String getPixelsDimensionOrder(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
      return pixels == null ? null : pixels.getDimensionOrder();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsID(int, int) */
  public String getPixelsID(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
      return pixels == null ? null : pixels.getNodeID();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsPixelType(int, int) */
  public String getPixelsPixelType(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
      return pixels == null ? null : pixels.getPixelType();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsSizeC(int, int) */
  public Integer getPixelsSizeC(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
      return pixels == null ? null : pixels.getSizeC();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsSizeT(int, int) */
  public Integer getPixelsSizeT(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
      return pixels == null ? null : pixels.getSizeT();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsSizeX(int, int) */
  public Integer getPixelsSizeX(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
      return pixels == null ? null : pixels.getSizeX();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsSizeY(int, int) */
  public Integer getPixelsSizeY(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
      return pixels == null ? null : pixels.getSizeY();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getPixelsSizeZ(int, int) */
  public Integer getPixelsSizeZ(int imageIndex, int pixelsIndex) {
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, false);
      return pixels == null ? null : pixels.getSizeZ();
    }

  // - Plane property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getPlaneTheC(int, int, int) */
  public Integer getPlaneTheC(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: TheC unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlaneTheT(int, int, int) */
  public Integer getPlaneTheT(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: TheT unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlaneTheZ(int, int, int) */
  public Integer getPlaneTheZ(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: TheZ unsupported for schema version 2003-FC
    return null;
  }

  // - PlaneTiming property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getPlaneTimingDeltaT(int, int, int) */
  public Float getPlaneTimingDeltaT(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: DeltaT unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlaneTimingExposureTime(int, int, int) */
  public Float getPlaneTimingExposureTime(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: ExposureTime unsupported for schema version 2003-FC
    return null;
  }

  // - Plate property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getPlateDescription(int) */
  public String getPlateDescription(int plateIndex) {
    // NB: Description unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateExternalIdentifier(int) */
  public String getPlateExternalIdentifier(int plateIndex) {
    // NB: ExternalIdentifier unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateID(int) */
  public String getPlateID(int plateIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateName(int) */
  public String getPlateName(int plateIndex) {
    // NB: Name unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getPlateStatus(int) */
  public String getPlateStatus(int plateIndex) {
    // NB: Status unsupported for schema version 2003-FC
    return null;
  }

  // - PlateRef property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getPlateRefID(int, int) */
  public String getPlateRefID(int screenIndex, int plateRefIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  // - ROI property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getROIID(int, int) */
  public String getROIID(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
      return roi == null ? null : roi.getNodeID();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getROIT0(int, int) */
  public Integer getROIT0(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
      return roi == null ? null : roi.getT0();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getROIT1(int, int) */
  public Integer getROIT1(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
      return roi == null ? null : roi.getT1();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getROIX0(int, int) */
  public Integer getROIX0(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
      return roi == null ? null : roi.getX0();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getROIX1(int, int) */
  public Integer getROIX1(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
      return roi == null ? null : roi.getX1();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getROIY0(int, int) */
  public Integer getROIY0(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
      return roi == null ? null : roi.getY0();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getROIY1(int, int) */
  public Integer getROIY1(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
      return roi == null ? null : roi.getY1();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getROIZ0(int, int) */
  public Integer getROIZ0(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
      return roi == null ? null : roi.getZ0();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getROIZ1(int, int) */
  public Integer getROIZ1(int imageIndex, int roiIndex) {
    ROINode roi = getROINode(imageIndex, roiIndex, false);
      return roi == null ? null : roi.getZ1();
    }

  // - Reagent property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getReagentDescription(int, int) */
  public String getReagentDescription(int screenIndex, int reagentIndex) {
    // NB: Description unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getReagentID(int, int) */
  public String getReagentID(int screenIndex, int reagentIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getReagentName(int, int) */
  public String getReagentName(int screenIndex, int reagentIndex) {
    // NB: Name unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getReagentReagentIdentifier(int, int) */
  public String getReagentReagentIdentifier(int screenIndex, int reagentIndex) {
    // NB: ReagentIdentifier unsupported for schema version 2003-FC
    return null;
  }

  // - Screen property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getScreenID(int) */
  public String getScreenID(int screenIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenName(int) */
  public String getScreenName(int screenIndex) {
    // NB: Name unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenProtocolDescription(int) */
  public String getScreenProtocolDescription(int screenIndex) {
    // NB: ProtocolDescription unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenProtocolIdentifier(int) */
  public String getScreenProtocolIdentifier(int screenIndex) {
    // NB: ProtocolIdentifier unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenReagentSetDescription(int) */
  public String getScreenReagentSetDescription(int screenIndex) {
    // NB: ReagentSetDescription unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenType(int) */
  public String getScreenType(int screenIndex) {
    // NB: Type unsupported for schema version 2003-FC
    return null;
  }

  // - ScreenAcquisition property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getScreenAcquisitionEndTime(int, int) */
  public String getScreenAcquisitionEndTime(int screenIndex, int screenAcquisitionIndex) {
    // NB: EndTime unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenAcquisitionID(int, int) */
  public String getScreenAcquisitionID(int screenIndex, int screenAcquisitionIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getScreenAcquisitionStartTime(int, int) */
  public String getScreenAcquisitionStartTime(int screenIndex, int screenAcquisitionIndex) {
    // NB: StartTime unsupported for schema version 2003-FC
    return null;
  }

  // - StageLabel property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getStageLabelName(int) */
  public String getStageLabelName(int imageIndex) {
    StageLabelNode stageLabel = getStageLabelNode(imageIndex, false);
      return stageLabel == null ? null : stageLabel.getName();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getStageLabelX(int) */
  public Float getStageLabelX(int imageIndex) {
    StageLabelNode stageLabel = getStageLabelNode(imageIndex, false);
      return stageLabel == null ? null : stageLabel.getX();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getStageLabelY(int) */
  public Float getStageLabelY(int imageIndex) {
    StageLabelNode stageLabel = getStageLabelNode(imageIndex, false);
      return stageLabel == null ? null : stageLabel.getY();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getStageLabelZ(int) */
  public Float getStageLabelZ(int imageIndex) {
    StageLabelNode stageLabel = getStageLabelNode(imageIndex, false);
      return stageLabel == null ? null : stageLabel.getZ();
    }

  // - StagePosition property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getStagePositionPositionX(int, int, int) */
  public Float getStagePositionPositionX(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: PositionX unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getStagePositionPositionY(int, int, int) */
  public Float getStagePositionPositionY(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: PositionY unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getStagePositionPositionZ(int, int, int) */
  public Float getStagePositionPositionZ(int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: PositionZ unsupported for schema version 2003-FC
    return null;
  }

  // - TiffData property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getTiffDataFileName(int, int, int) */
  public String getTiffDataFileName(int imageIndex, int pixelsIndex, int tiffDataIndex) {
    // NB: FileName unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getTiffDataFirstC(int, int, int) */
  public Integer getTiffDataFirstC(int imageIndex, int pixelsIndex, int tiffDataIndex) {
    TiffDataNode tiffData = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, false);
      return tiffData == null ? null : tiffData.getFirstC();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getTiffDataFirstT(int, int, int) */
  public Integer getTiffDataFirstT(int imageIndex, int pixelsIndex, int tiffDataIndex) {
    TiffDataNode tiffData = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, false);
      return tiffData == null ? null : tiffData.getFirstT();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getTiffDataFirstZ(int, int, int) */
  public Integer getTiffDataFirstZ(int imageIndex, int pixelsIndex, int tiffDataIndex) {
    TiffDataNode tiffData = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, false);
      return tiffData == null ? null : tiffData.getFirstZ();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getTiffDataIFD(int, int, int) */
  public Integer getTiffDataIFD(int imageIndex, int pixelsIndex, int tiffDataIndex) {
    TiffDataNode tiffData = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, false);
      return tiffData == null ? null : tiffData.getIFD();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getTiffDataNumPlanes(int, int, int) */
  public Integer getTiffDataNumPlanes(int imageIndex, int pixelsIndex, int tiffDataIndex) {
    TiffDataNode tiffData = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, false);
      return tiffData == null ? null : tiffData.getNumPlanes();
    }

  /* @see loci.formats.meta.MetadataRetrieve#getTiffDataUUID(int, int, int) */
  public String getTiffDataUUID(int imageIndex, int pixelsIndex, int tiffDataIndex) {
    // NB: UUID unsupported for schema version 2003-FC
    return null;
  }

  // - Well property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getWellColumn(int, int) */
  public Integer getWellColumn(int plateIndex, int wellIndex) {
    // NB: Column unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellExternalDescription(int, int) */
  public String getWellExternalDescription(int plateIndex, int wellIndex) {
    // NB: ExternalDescription unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellExternalIdentifier(int, int) */
  public String getWellExternalIdentifier(int plateIndex, int wellIndex) {
    // NB: ExternalIdentifier unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellID(int, int) */
  public String getWellID(int plateIndex, int wellIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellRow(int, int) */
  public Integer getWellRow(int plateIndex, int wellIndex) {
    // NB: Row unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellType(int, int) */
  public String getWellType(int plateIndex, int wellIndex) {
    // NB: Type unsupported for schema version 2003-FC
    return null;
  }

  // - WellSample property retrieval -

  /* @see loci.formats.meta.MetadataRetrieve#getWellSampleID(int, int, int) */
  public String getWellSampleID(int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: ID unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellSampleIndex(int, int, int) */
  public Integer getWellSampleIndex(int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: Index unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellSamplePosX(int, int, int) */
  public Float getWellSamplePosX(int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: PosX unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellSamplePosY(int, int, int) */
  public Float getWellSamplePosY(int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: PosY unsupported for schema version 2003-FC
    return null;
  }

  /* @see loci.formats.meta.MetadataRetrieve#getWellSampleTimepoint(int, int, int) */
  public Integer getWellSampleTimepoint(int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: Timepoint unsupported for schema version 2003-FC
    return null;
  }

  // -- MetadataStore API methods --

  /* @see loci.formats.meta.MetadataStore#setRoot(Object) */
  public void createRoot() {
    try {
      root = ome.xml.OMEXMLFactory.newOMENode("2003-FC");
    }
    catch (java.io.IOException exc) { LogTools.trace(exc); }
    catch (org.xml.sax.SAXException exc) { LogTools.trace(exc); }
    catch (javax.xml.parsers.ParserConfigurationException exc) {
      LogTools.trace(exc);
    }
  }

  /* @see loci.formats.meta.MetadataStore#setRoot(Object) */
  public void setRoot(Object root) {
    if (!(root instanceof OMENode)) {
      throw new IllegalArgumentException(
        "Invalid root type: " + root.getClass().getName() + ". " +
        "This metadata store accepts root objects of type " +
        OMENode.class.getName());
    }
    this.root = (OMENode) root;
  }

  // - Arc property storage -

  /* @see loci.formats.meta.MetadataStore#setArcType(String, int, int) */
  public void setArcType(String type, int instrumentIndex, int lightSourceIndex) {
    if (type == null) return;
    ArcNode arcNode = getArcNode(instrumentIndex, lightSourceIndex, true);
      arcNode.setType(type);
    }

  // - ChannelComponent property storage -

  /* @see loci.formats.meta.MetadataStore#setChannelComponentColorDomain(String, int, int, int) */
  public void setChannelComponentColorDomain(String colorDomain, int imageIndex, int logicalChannelIndex, int channelComponentIndex) {
    if (colorDomain == null) return;
    ChannelComponentNode channelComponentNode = getChannelComponentNode(imageIndex, logicalChannelIndex, channelComponentIndex, true);
      channelComponentNode.setColorDomain(colorDomain);
    }

  /* @see loci.formats.meta.MetadataStore#setChannelComponentIndex(Integer, int, int, int) */
  public void setChannelComponentIndex(Integer index, int imageIndex, int logicalChannelIndex, int channelComponentIndex) {
    if (index == null) return;
    ChannelComponentNode channelComponentNode = getChannelComponentNode(imageIndex, logicalChannelIndex, channelComponentIndex, true);
      channelComponentNode.setIndex(index);
    }

  // - Detector property storage -

  /* @see loci.formats.meta.MetadataStore#setDetectorGain(Float, int, int) */
  public void setDetectorGain(Float gain, int instrumentIndex, int detectorIndex) {
    if (gain == null) return;
    DetectorNode detectorNode = getDetectorNode(instrumentIndex, detectorIndex, true);
      detectorNode.setGain(gain);
    }

  /* @see loci.formats.meta.MetadataStore#setDetectorID(String, int, int) */
  public void setDetectorID(String id, int instrumentIndex, int detectorIndex) {
    if (id == null) return;
    DetectorNode detectorNode = getDetectorNode(instrumentIndex, detectorIndex, true);
      detectorNode.setNodeID(id);
    }

  /* @see loci.formats.meta.MetadataStore#setDetectorManufacturer(String, int, int) */
  public void setDetectorManufacturer(String manufacturer, int instrumentIndex, int detectorIndex) {
    if (manufacturer == null) return;
    DetectorNode detectorNode = getDetectorNode(instrumentIndex, detectorIndex, true);
      detectorNode.setManufacturer(manufacturer);
    }

  /* @see loci.formats.meta.MetadataStore#setDetectorModel(String, int, int) */
  public void setDetectorModel(String model, int instrumentIndex, int detectorIndex) {
    if (model == null) return;
    DetectorNode detectorNode = getDetectorNode(instrumentIndex, detectorIndex, true);
      detectorNode.setModel(model);
    }

  /* @see loci.formats.meta.MetadataStore#setDetectorOffset(Float, int, int) */
  public void setDetectorOffset(Float offset, int instrumentIndex, int detectorIndex) {
    if (offset == null) return;
    DetectorNode detectorNode = getDetectorNode(instrumentIndex, detectorIndex, true);
      detectorNode.setOffset(offset);
    }

  /* @see loci.formats.meta.MetadataStore#setDetectorSerialNumber(String, int, int) */
  public void setDetectorSerialNumber(String serialNumber, int instrumentIndex, int detectorIndex) {
    if (serialNumber == null) return;
    DetectorNode detectorNode = getDetectorNode(instrumentIndex, detectorIndex, true);
      detectorNode.setSerialNumber(serialNumber);
    }

  /* @see loci.formats.meta.MetadataStore#setDetectorType(String, int, int) */
  public void setDetectorType(String type, int instrumentIndex, int detectorIndex) {
    if (type == null) return;
    DetectorNode detectorNode = getDetectorNode(instrumentIndex, detectorIndex, true);
      detectorNode.setType(type);
    }

  /* @see loci.formats.meta.MetadataStore#setDetectorVoltage(Float, int, int) */
  public void setDetectorVoltage(Float voltage, int instrumentIndex, int detectorIndex) {
    if (voltage == null) return;
    DetectorNode detectorNode = getDetectorNode(instrumentIndex, detectorIndex, true);
      detectorNode.setVoltage(voltage);
    }

  // - DetectorSettings property storage -

  /* @see loci.formats.meta.MetadataStore#setDetectorSettingsDetector(String, int, int) */
  public void setDetectorSettingsDetector(String detector, int imageIndex, int logicalChannelIndex) {
    if (detector == null) return;
    DetectorRefNode detectorRefNode = getDetectorRefNode(imageIndex, logicalChannelIndex, true);
      detectorRefNode.setNodeID(detector);
    }

  /* @see loci.formats.meta.MetadataStore#setDetectorSettingsGain(Float, int, int) */
  public void setDetectorSettingsGain(Float gain, int imageIndex, int logicalChannelIndex) {
    if (gain == null) return;
    DetectorRefNode detectorRefNode = getDetectorRefNode(imageIndex, logicalChannelIndex, true);
      detectorRefNode.setGain(gain);
    }

  /* @see loci.formats.meta.MetadataStore#setDetectorSettingsOffset(Float, int, int) */
  public void setDetectorSettingsOffset(Float offset, int imageIndex, int logicalChannelIndex) {
    if (offset == null) return;
    DetectorRefNode detectorRefNode = getDetectorRefNode(imageIndex, logicalChannelIndex, true);
      detectorRefNode.setOffset(offset);
    }

  // - Dimensions property storage -

  /* @see loci.formats.meta.MetadataStore#setDimensionsPhysicalSizeX(Float, int, int) */
  public void setDimensionsPhysicalSizeX(Float physicalSizeX, int imageIndex, int pixelsIndex) {
    if (physicalSizeX == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
      imageNode.setPixelSizeX(physicalSizeX);
    }

  /* @see loci.formats.meta.MetadataStore#setDimensionsPhysicalSizeY(Float, int, int) */
  public void setDimensionsPhysicalSizeY(Float physicalSizeY, int imageIndex, int pixelsIndex) {
    if (physicalSizeY == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
      imageNode.setPixelSizeY(physicalSizeY);
    }

  /* @see loci.formats.meta.MetadataStore#setDimensionsPhysicalSizeZ(Float, int, int) */
  public void setDimensionsPhysicalSizeZ(Float physicalSizeZ, int imageIndex, int pixelsIndex) {
    if (physicalSizeZ == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
      imageNode.setPixelSizeZ(physicalSizeZ);
    }

  /* @see loci.formats.meta.MetadataStore#setDimensionsTimeIncrement(Float, int, int) */
  public void setDimensionsTimeIncrement(Float timeIncrement, int imageIndex, int pixelsIndex) {
    if (timeIncrement == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
      imageNode.setTimeIncrement(timeIncrement);
    }

  /* @see loci.formats.meta.MetadataStore#setDimensionsWaveIncrement(Integer, int, int) */
  public void setDimensionsWaveIncrement(Integer waveIncrement, int imageIndex, int pixelsIndex) {
    if (waveIncrement == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
      imageNode.setWaveIncrement(waveIncrement);
    }

  /* @see loci.formats.meta.MetadataStore#setDimensionsWaveStart(Integer, int, int) */
  public void setDimensionsWaveStart(Integer waveStart, int imageIndex, int pixelsIndex) {
    if (waveStart == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
      imageNode.setWaveStart(waveStart);
    }

  // - DisplayOptions property storage -

  /* @see loci.formats.meta.MetadataStore#setDisplayOptionsID(String, int) */
  public void setDisplayOptionsID(String id, int imageIndex) {
    if (id == null) return;
    DisplayOptionsNode displayOptionsNode = getDisplayOptionsNode(imageIndex, true);
      displayOptionsNode.setNodeID(id);
    }

  /* @see loci.formats.meta.MetadataStore#setDisplayOptionsZoom(Float, int) */
  public void setDisplayOptionsZoom(Float zoom, int imageIndex) {
    if (zoom == null) return;
    DisplayOptionsNode displayOptionsNode = getDisplayOptionsNode(imageIndex, true);
      displayOptionsNode.setZoom(zoom);
    }

  // - DisplayOptionsProjection property storage -

  /* @see loci.formats.meta.MetadataStore#setDisplayOptionsProjectionZStart(Integer, int) */
  public void setDisplayOptionsProjectionZStart(Integer zStart, int imageIndex) {
    if (zStart == null) return;
    ProjectionNode projectionNode = getProjectionNode(imageIndex, true);
      projectionNode.setZstart(zStart);
    }

  /* @see loci.formats.meta.MetadataStore#setDisplayOptionsProjectionZStop(Integer, int) */
  public void setDisplayOptionsProjectionZStop(Integer zStop, int imageIndex) {
    if (zStop == null) return;
    ProjectionNode projectionNode = getProjectionNode(imageIndex, true);
      projectionNode.setZstop(zStop);
    }

  // - DisplayOptionsTime property storage -

  /* @see loci.formats.meta.MetadataStore#setDisplayOptionsTimeTStart(Integer, int) */
  public void setDisplayOptionsTimeTStart(Integer tStart, int imageIndex) {
    if (tStart == null) return;
    TimeNode timeNode = getTimeNode(imageIndex, true);
      timeNode.setTstart(tStart);
    }

  /* @see loci.formats.meta.MetadataStore#setDisplayOptionsTimeTStop(Integer, int) */
  public void setDisplayOptionsTimeTStop(Integer tStop, int imageIndex) {
    if (tStop == null) return;
    TimeNode timeNode = getTimeNode(imageIndex, true);
      timeNode.setTstop(tStop);
    }

  // - Experimenter property storage -

  /* @see loci.formats.meta.MetadataStore#setExperimenterEmail(String, int) */
  public void setExperimenterEmail(String email, int experimenterIndex) {
    if (email == null) return;
    ExperimenterNode experimenterNode = getExperimenterNode(experimenterIndex, true);
      experimenterNode.setEmail(email);
    }

  /* @see loci.formats.meta.MetadataStore#setExperimenterFirstName(String, int) */
  public void setExperimenterFirstName(String firstName, int experimenterIndex) {
    if (firstName == null) return;
    ExperimenterNode experimenterNode = getExperimenterNode(experimenterIndex, true);
      experimenterNode.setFirstName(firstName);
    }

  /* @see loci.formats.meta.MetadataStore#setExperimenterID(String, int) */
  public void setExperimenterID(String id, int experimenterIndex) {
    if (id == null) return;
    ExperimenterNode experimenterNode = getExperimenterNode(experimenterIndex, true);
      experimenterNode.setNodeID(id);
    }

  /* @see loci.formats.meta.MetadataStore#setExperimenterInstitution(String, int) */
  public void setExperimenterInstitution(String institution, int experimenterIndex) {
    if (institution == null) return;
    ExperimenterNode experimenterNode = getExperimenterNode(experimenterIndex, true);
      experimenterNode.setInstitution(institution);
    }

  /* @see loci.formats.meta.MetadataStore#setExperimenterLastName(String, int) */
  public void setExperimenterLastName(String lastName, int experimenterIndex) {
    if (lastName == null) return;
    ExperimenterNode experimenterNode = getExperimenterNode(experimenterIndex, true);
      experimenterNode.setLastName(lastName);
    }

  // - Filament property storage -

  /* @see loci.formats.meta.MetadataStore#setFilamentType(String, int, int) */
  public void setFilamentType(String type, int instrumentIndex, int lightSourceIndex) {
    if (type == null) return;
    FilamentNode filamentNode = getFilamentNode(instrumentIndex, lightSourceIndex, true);
      filamentNode.setType(type);
    }

  // - Image property storage -

  /* @see loci.formats.meta.MetadataStore#setImageCreationDate(String, int) */
  public void setImageCreationDate(String creationDate, int imageIndex) {
    if (creationDate == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
      imageNode.setCreationDate(creationDate);
    }

  /* @see loci.formats.meta.MetadataStore#setImageDescription(String, int) */
  public void setImageDescription(String description, int imageIndex) {
    if (description == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
      imageNode.setDescription(description);
    }

  /* @see loci.formats.meta.MetadataStore#setImageID(String, int) */
  public void setImageID(String id, int imageIndex) {
    if (id == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
      imageNode.setNodeID(id);
    }

  /* @see loci.formats.meta.MetadataStore#setImageInstrumentRef(String, int) */
  public void setImageInstrumentRef(String instrumentRef, int imageIndex) {
    if (instrumentRef == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
      OMENode ome = (OMENode) root;
    List list = ome.getInstrumentList();
    InstrumentNode node = null;
    for (int i=0; i<list.size(); i++) {
      OMEXMLNode o = (OMEXMLNode) list.get(i);
      if (o.getNodeID().equals(instrumentRef)) node = (InstrumentNode) o;
    }
    if (node == null) {
      node = new InstrumentNode(ome);
      node.setNodeID(instrumentRef);
    }
    InstrumentRefNode ref = new InstrumentRefNode(imageNode);
    ref.setInstrumentNode(node);
    }

  /* @see loci.formats.meta.MetadataStore#setImageName(String, int) */
  public void setImageName(String name, int imageIndex) {
    if (name == null) return;
    ImageNode imageNode = getImageNode(imageIndex, true);
      imageNode.setName(name);
    }

  // - ImagingEnvironment property storage -

  /* @see loci.formats.meta.MetadataStore#setImagingEnvironmentAirPressure(Float, int) */
  public void setImagingEnvironmentAirPressure(Float airPressure, int imageIndex) {
    if (airPressure == null) return;
    ImagingEnvironmentNode imagingEnvironmentNode = getImagingEnvironmentNode(imageIndex, true);
      imagingEnvironmentNode.setAirPressure(airPressure);
    }

  /* @see loci.formats.meta.MetadataStore#setImagingEnvironmentCO2Percent(Float, int) */
  public void setImagingEnvironmentCO2Percent(Float cO2Percent, int imageIndex) {
    if (cO2Percent == null) return;
    ImagingEnvironmentNode imagingEnvironmentNode = getImagingEnvironmentNode(imageIndex, true);
      imagingEnvironmentNode.setCO2Percent(cO2Percent);
    }

  /* @see loci.formats.meta.MetadataStore#setImagingEnvironmentHumidity(Float, int) */
  public void setImagingEnvironmentHumidity(Float humidity, int imageIndex) {
    if (humidity == null) return;
    ImagingEnvironmentNode imagingEnvironmentNode = getImagingEnvironmentNode(imageIndex, true);
      imagingEnvironmentNode.setHumidity(humidity);
    }

  /* @see loci.formats.meta.MetadataStore#setImagingEnvironmentTemperature(Float, int) */
  public void setImagingEnvironmentTemperature(Float temperature, int imageIndex) {
    if (temperature == null) return;
    ImagingEnvironmentNode imagingEnvironmentNode = getImagingEnvironmentNode(imageIndex, true);
      imagingEnvironmentNode.setTemperature(temperature);
    }

  // - Instrument property storage -

  /* @see loci.formats.meta.MetadataStore#setInstrumentID(String, int) */
  public void setInstrumentID(String id, int instrumentIndex) {
    if (id == null) return;
    InstrumentNode instrumentNode = getInstrumentNode(instrumentIndex, true);
      instrumentNode.setNodeID(id);
    }

  // - Laser property storage -

  /* @see loci.formats.meta.MetadataStore#setLaserFrequencyMultiplication(Integer, int, int) */
  public void setLaserFrequencyMultiplication(Integer frequencyMultiplication, int instrumentIndex, int lightSourceIndex) {
    if (frequencyMultiplication == null) return;
    LaserNode laserNode = getLaserNode(instrumentIndex, lightSourceIndex, true);
      laserNode.setFrequencyDoubled(integerToBoolean(frequencyMultiplication));
    }

  /* @see loci.formats.meta.MetadataStore#setLaserLaserMedium(String, int, int) */
  public void setLaserLaserMedium(String laserMedium, int instrumentIndex, int lightSourceIndex) {
    if (laserMedium == null) return;
    LaserNode laserNode = getLaserNode(instrumentIndex, lightSourceIndex, true);
      laserNode.setMedium(laserMedium);
    }

  /* @see loci.formats.meta.MetadataStore#setLaserPulse(String, int, int) */
  public void setLaserPulse(String pulse, int instrumentIndex, int lightSourceIndex) {
    if (pulse == null) return;
    LaserNode laserNode = getLaserNode(instrumentIndex, lightSourceIndex, true);
      laserNode.setPulse(pulse);
    }

  /* @see loci.formats.meta.MetadataStore#setLaserTuneable(Boolean, int, int) */
  public void setLaserTuneable(Boolean tuneable, int instrumentIndex, int lightSourceIndex) {
    if (tuneable == null) return;
    LaserNode laserNode = getLaserNode(instrumentIndex, lightSourceIndex, true);
      laserNode.setTunable(tuneable);
    }

  /* @see loci.formats.meta.MetadataStore#setLaserType(String, int, int) */
  public void setLaserType(String type, int instrumentIndex, int lightSourceIndex) {
    if (type == null) return;
    LaserNode laserNode = getLaserNode(instrumentIndex, lightSourceIndex, true);
      laserNode.setType(type);
    }

  /* @see loci.formats.meta.MetadataStore#setLaserWavelength(Integer, int, int) */
  public void setLaserWavelength(Integer wavelength, int instrumentIndex, int lightSourceIndex) {
    if (wavelength == null) return;
    LaserNode laserNode = getLaserNode(instrumentIndex, lightSourceIndex, true);
      laserNode.setWavelength(wavelength);
    }

  // - LightSource property storage -

  /* @see loci.formats.meta.MetadataStore#setLightSourceID(String, int, int) */
  public void setLightSourceID(String id, int instrumentIndex, int lightSourceIndex) {
    if (id == null) return;
    LightSourceNode lightSourceNode = getLightSourceNode(instrumentIndex, lightSourceIndex, true);
      lightSourceNode.setNodeID(id);
    }

  /* @see loci.formats.meta.MetadataStore#setLightSourceManufacturer(String, int, int) */
  public void setLightSourceManufacturer(String manufacturer, int instrumentIndex, int lightSourceIndex) {
    if (manufacturer == null) return;
    LightSourceNode lightSourceNode = getLightSourceNode(instrumentIndex, lightSourceIndex, true);
      lightSourceNode.setManufacturer(manufacturer);
    }

  /* @see loci.formats.meta.MetadataStore#setLightSourceModel(String, int, int) */
  public void setLightSourceModel(String model, int instrumentIndex, int lightSourceIndex) {
    if (model == null) return;
    LightSourceNode lightSourceNode = getLightSourceNode(instrumentIndex, lightSourceIndex, true);
      lightSourceNode.setModel(model);
    }

  /* @see loci.formats.meta.MetadataStore#setLightSourcePower(Float, int, int) */
  public void setLightSourcePower(Float power, int instrumentIndex, int lightSourceIndex) {
    // NB: Power unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setLightSourceSerialNumber(String, int, int) */
  public void setLightSourceSerialNumber(String serialNumber, int instrumentIndex, int lightSourceIndex) {
    if (serialNumber == null) return;
    LightSourceNode lightSourceNode = getLightSourceNode(instrumentIndex, lightSourceIndex, true);
      lightSourceNode.setSerialNumber(serialNumber);
    }

  // - LightSourceSettings property storage -

  /* @see loci.formats.meta.MetadataStore#setLightSourceSettingsAttenuation(Float, int, int) */
  public void setLightSourceSettingsAttenuation(Float attenuation, int imageIndex, int logicalChannelIndex) {
    if (attenuation == null) return;
    LightSourceRefNode lightSourceRefNode = getLightSourceRefNode(imageIndex, logicalChannelIndex, true);
      lightSourceRefNode.setAttenuation(attenuation);
    }

  /* @see loci.formats.meta.MetadataStore#setLightSourceSettingsLightSource(String, int, int) */
  public void setLightSourceSettingsLightSource(String lightSource, int imageIndex, int logicalChannelIndex) {
    if (lightSource == null) return;
    LightSourceRefNode lightSourceRefNode = getLightSourceRefNode(imageIndex, logicalChannelIndex, true);
      lightSourceRefNode.setNodeID(lightSource);
    }

  /* @see loci.formats.meta.MetadataStore#setLightSourceSettingsWavelength(Integer, int, int) */
  public void setLightSourceSettingsWavelength(Integer wavelength, int imageIndex, int logicalChannelIndex) {
    if (wavelength == null) return;
    LightSourceRefNode lightSourceRefNode = getLightSourceRefNode(imageIndex, logicalChannelIndex, true);
      lightSourceRefNode.setWavelength(wavelength);
    }

  // - LogicalChannel property storage -

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelContrastMethod(String, int, int) */
  public void setLogicalChannelContrastMethod(String contrastMethod, int imageIndex, int logicalChannelIndex) {
    if (contrastMethod == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
      channelInfoNode.setContrastMethod(contrastMethod);
    }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelEmWave(Integer, int, int) */
  public void setLogicalChannelEmWave(Integer emWave, int imageIndex, int logicalChannelIndex) {
    if (emWave == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
      channelInfoNode.setEmWave(emWave);
    }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelExWave(Integer, int, int) */
  public void setLogicalChannelExWave(Integer exWave, int imageIndex, int logicalChannelIndex) {
    if (exWave == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
      channelInfoNode.setExWave(exWave);
    }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelFluor(String, int, int) */
  public void setLogicalChannelFluor(String fluor, int imageIndex, int logicalChannelIndex) {
    if (fluor == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
      channelInfoNode.setFluor(fluor);
    }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelID(String, int, int) */
  public void setLogicalChannelID(String id, int imageIndex, int logicalChannelIndex) {
    if (id == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
      channelInfoNode.setNodeID(id);
    }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelIlluminationType(String, int, int) */
  public void setLogicalChannelIlluminationType(String illuminationType, int imageIndex, int logicalChannelIndex) {
    if (illuminationType == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
      channelInfoNode.setIlluminationType(illuminationType);
    }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelMode(String, int, int) */
  public void setLogicalChannelMode(String mode, int imageIndex, int logicalChannelIndex) {
    if (mode == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
      channelInfoNode.setMode(mode);
    }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelName(String, int, int) */
  public void setLogicalChannelName(String name, int imageIndex, int logicalChannelIndex) {
    if (name == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
      channelInfoNode.setName(name);
    }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelNdFilter(Float, int, int) */
  public void setLogicalChannelNdFilter(Float ndFilter, int imageIndex, int logicalChannelIndex) {
    if (ndFilter == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
      channelInfoNode.setNDfilter(ndFilter);
    }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelPhotometricInterpretation(String, int, int) */
  public void setLogicalChannelPhotometricInterpretation(String photometricInterpretation, int imageIndex, int logicalChannelIndex) {
    if (photometricInterpretation == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
      channelInfoNode.setPhotometricInterpretation(photometricInterpretation);
    }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelPinholeSize(Integer, int, int) */
  public void setLogicalChannelPinholeSize(Integer pinholeSize, int imageIndex, int logicalChannelIndex) {
    if (pinholeSize == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
      channelInfoNode.setPinholeSize(pinholeSize);
    }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelPockelCellSetting(Integer, int, int) */
  public void setLogicalChannelPockelCellSetting(Integer pockelCellSetting, int imageIndex, int logicalChannelIndex) {
    // NB: PockelCellSetting unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setLogicalChannelSamplesPerPixel(Integer, int, int) */
  public void setLogicalChannelSamplesPerPixel(Integer samplesPerPixel, int imageIndex, int logicalChannelIndex) {
    if (samplesPerPixel == null) return;
    ChannelInfoNode channelInfoNode = getChannelInfoNode(imageIndex, logicalChannelIndex, true);
      channelInfoNode.setSamplesPerPixel(samplesPerPixel);
    }

  // - OTF property storage -

  /* @see loci.formats.meta.MetadataStore#setOTFID(String, int, int) */
  public void setOTFID(String id, int instrumentIndex, int otfIndex) {
    if (id == null) return;
    OTFNode otfNode = getOTFNode(instrumentIndex, otfIndex, true);
      otfNode.setNodeID(id);
    }

  /* @see loci.formats.meta.MetadataStore#setOTFOpticalAxisAveraged(Boolean, int, int) */
  public void setOTFOpticalAxisAveraged(Boolean opticalAxisAveraged, int instrumentIndex, int otfIndex) {
    if (opticalAxisAveraged == null) return;
    OTFNode otfNode = getOTFNode(instrumentIndex, otfIndex, true);
      otfNode.setOpticalAxisAvrg(opticalAxisAveraged);
    }

  /* @see loci.formats.meta.MetadataStore#setOTFPixelType(String, int, int) */
  public void setOTFPixelType(String pixelType, int instrumentIndex, int otfIndex) {
    if (pixelType == null) return;
    OTFNode otfNode = getOTFNode(instrumentIndex, otfIndex, true);
      otfNode.setPixelType(pixelType);
    }

  /* @see loci.formats.meta.MetadataStore#setOTFSizeX(Integer, int, int) */
  public void setOTFSizeX(Integer sizeX, int instrumentIndex, int otfIndex) {
    if (sizeX == null) return;
    OTFNode otfNode = getOTFNode(instrumentIndex, otfIndex, true);
      otfNode.setSizeX(sizeX);
    }

  /* @see loci.formats.meta.MetadataStore#setOTFSizeY(Integer, int, int) */
  public void setOTFSizeY(Integer sizeY, int instrumentIndex, int otfIndex) {
    if (sizeY == null) return;
    OTFNode otfNode = getOTFNode(instrumentIndex, otfIndex, true);
      otfNode.setSizeY(sizeY);
    }

  // - Objective property storage -

  /* @see loci.formats.meta.MetadataStore#setObjectiveCalibratedMagnification(Float, int, int) */
  public void setObjectiveCalibratedMagnification(Float calibratedMagnification, int instrumentIndex, int objectiveIndex) {
    if (calibratedMagnification == null) return;
    ObjectiveNode objectiveNode = getObjectiveNode(instrumentIndex, objectiveIndex, true);
      objectiveNode.setMagnification(calibratedMagnification);
    }

  /* @see loci.formats.meta.MetadataStore#setObjectiveCorrection(String, int, int) */
  public void setObjectiveCorrection(String correction, int instrumentIndex, int objectiveIndex) {
    // NB: Correction unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setObjectiveID(String, int, int) */
  public void setObjectiveID(String id, int instrumentIndex, int objectiveIndex) {
    if (id == null) return;
    ObjectiveNode objectiveNode = getObjectiveNode(instrumentIndex, objectiveIndex, true);
      objectiveNode.setNodeID(id);
    }

  /* @see loci.formats.meta.MetadataStore#setObjectiveImmersion(String, int, int) */
  public void setObjectiveImmersion(String immersion, int instrumentIndex, int objectiveIndex) {
    // NB: Immersion unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setObjectiveLensNA(Float, int, int) */
  public void setObjectiveLensNA(Float lensNA, int instrumentIndex, int objectiveIndex) {
    if (lensNA == null) return;
    ObjectiveNode objectiveNode = getObjectiveNode(instrumentIndex, objectiveIndex, true);
      objectiveNode.setLensNA(lensNA);
    }

  /* @see loci.formats.meta.MetadataStore#setObjectiveManufacturer(String, int, int) */
  public void setObjectiveManufacturer(String manufacturer, int instrumentIndex, int objectiveIndex) {
    if (manufacturer == null) return;
    ObjectiveNode objectiveNode = getObjectiveNode(instrumentIndex, objectiveIndex, true);
      objectiveNode.setManufacturer(manufacturer);
    }

  /* @see loci.formats.meta.MetadataStore#setObjectiveModel(String, int, int) */
  public void setObjectiveModel(String model, int instrumentIndex, int objectiveIndex) {
    if (model == null) return;
    ObjectiveNode objectiveNode = getObjectiveNode(instrumentIndex, objectiveIndex, true);
      objectiveNode.setModel(model);
    }

  /* @see loci.formats.meta.MetadataStore#setObjectiveNominalMagnification(Integer, int, int) */
  public void setObjectiveNominalMagnification(Integer nominalMagnification, int instrumentIndex, int objectiveIndex) {
    // NB: NominalMagnification unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setObjectiveSerialNumber(String, int, int) */
  public void setObjectiveSerialNumber(String serialNumber, int instrumentIndex, int objectiveIndex) {
    if (serialNumber == null) return;
    ObjectiveNode objectiveNode = getObjectiveNode(instrumentIndex, objectiveIndex, true);
      objectiveNode.setSerialNumber(serialNumber);
    }

  /* @see loci.formats.meta.MetadataStore#setObjectiveWorkingDistance(Float, int, int) */
  public void setObjectiveWorkingDistance(Float workingDistance, int instrumentIndex, int objectiveIndex) {
    // NB: WorkingDistance unsupported for schema version 2003-FC
  }

  // - Pixels property storage -

  /* @see loci.formats.meta.MetadataStore#setPixelsBigEndian(Boolean, int, int) */
  public void setPixelsBigEndian(Boolean bigEndian, int imageIndex, int pixelsIndex) {
    if (bigEndian == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
      pixelsNode.setBigEndian(bigEndian);
    }

  /* @see loci.formats.meta.MetadataStore#setPixelsDimensionOrder(String, int, int) */
  public void setPixelsDimensionOrder(String dimensionOrder, int imageIndex, int pixelsIndex) {
    if (dimensionOrder == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
      pixelsNode.setDimensionOrder(dimensionOrder);
    }

  /* @see loci.formats.meta.MetadataStore#setPixelsID(String, int, int) */
  public void setPixelsID(String id, int imageIndex, int pixelsIndex) {
    if (id == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
      pixelsNode.setNodeID(id);
    }

  /* @see loci.formats.meta.MetadataStore#setPixelsPixelType(String, int, int) */
  public void setPixelsPixelType(String pixelType, int imageIndex, int pixelsIndex) {
    if (pixelType == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
      pixelsNode.setPixelType(pixelType);
    }

  /* @see loci.formats.meta.MetadataStore#setPixelsSizeC(Integer, int, int) */
  public void setPixelsSizeC(Integer sizeC, int imageIndex, int pixelsIndex) {
    if (sizeC == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
      pixelsNode.setSizeC(sizeC);
    }

  /* @see loci.formats.meta.MetadataStore#setPixelsSizeT(Integer, int, int) */
  public void setPixelsSizeT(Integer sizeT, int imageIndex, int pixelsIndex) {
    if (sizeT == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
      pixelsNode.setSizeT(sizeT);
    }

  /* @see loci.formats.meta.MetadataStore#setPixelsSizeX(Integer, int, int) */
  public void setPixelsSizeX(Integer sizeX, int imageIndex, int pixelsIndex) {
    if (sizeX == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
      pixelsNode.setSizeX(sizeX);
    }

  /* @see loci.formats.meta.MetadataStore#setPixelsSizeY(Integer, int, int) */
  public void setPixelsSizeY(Integer sizeY, int imageIndex, int pixelsIndex) {
    if (sizeY == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
      pixelsNode.setSizeY(sizeY);
    }

  /* @see loci.formats.meta.MetadataStore#setPixelsSizeZ(Integer, int, int) */
  public void setPixelsSizeZ(Integer sizeZ, int imageIndex, int pixelsIndex) {
    if (sizeZ == null) return;
    PixelsNode pixelsNode = getPixelsNode(imageIndex, pixelsIndex, true);
      pixelsNode.setSizeZ(sizeZ);
    }

  // - Plane property storage -

  /* @see loci.formats.meta.MetadataStore#setPlaneTheC(Integer, int, int, int) */
  public void setPlaneTheC(Integer theC, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: TheC unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPlaneTheT(Integer, int, int, int) */
  public void setPlaneTheT(Integer theT, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: TheT unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPlaneTheZ(Integer, int, int, int) */
  public void setPlaneTheZ(Integer theZ, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: TheZ unsupported for schema version 2003-FC
  }

  // - PlaneTiming property storage -

  /* @see loci.formats.meta.MetadataStore#setPlaneTimingDeltaT(Float, int, int, int) */
  public void setPlaneTimingDeltaT(Float deltaT, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: DeltaT unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPlaneTimingExposureTime(Float, int, int, int) */
  public void setPlaneTimingExposureTime(Float exposureTime, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: ExposureTime unsupported for schema version 2003-FC
  }

  // - Plate property storage -

  /* @see loci.formats.meta.MetadataStore#setPlateDescription(String, int) */
  public void setPlateDescription(String description, int plateIndex) {
    // NB: Description unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPlateExternalIdentifier(String, int) */
  public void setPlateExternalIdentifier(String externalIdentifier, int plateIndex) {
    // NB: ExternalIdentifier unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPlateID(String, int) */
  public void setPlateID(String id, int plateIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPlateName(String, int) */
  public void setPlateName(String name, int plateIndex) {
    // NB: Name unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setPlateStatus(String, int) */
  public void setPlateStatus(String status, int plateIndex) {
    // NB: Status unsupported for schema version 2003-FC
  }

  // - PlateRef property storage -

  /* @see loci.formats.meta.MetadataStore#setPlateRefID(String, int, int) */
  public void setPlateRefID(String id, int screenIndex, int plateRefIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  // - ROI property storage -

  /* @see loci.formats.meta.MetadataStore#setROIID(String, int, int) */
  public void setROIID(String id, int imageIndex, int roiIndex) {
    if (id == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
      roiNode.setNodeID(id);
    }

  /* @see loci.formats.meta.MetadataStore#setROIT0(Integer, int, int) */
  public void setROIT0(Integer t0, int imageIndex, int roiIndex) {
    if (t0 == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
      roiNode.setT0(t0);
    }

  /* @see loci.formats.meta.MetadataStore#setROIT1(Integer, int, int) */
  public void setROIT1(Integer t1, int imageIndex, int roiIndex) {
    if (t1 == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
      roiNode.setT1(t1);
    }

  /* @see loci.formats.meta.MetadataStore#setROIX0(Integer, int, int) */
  public void setROIX0(Integer x0, int imageIndex, int roiIndex) {
    if (x0 == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
      roiNode.setX0(x0);
    }

  /* @see loci.formats.meta.MetadataStore#setROIX1(Integer, int, int) */
  public void setROIX1(Integer x1, int imageIndex, int roiIndex) {
    if (x1 == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
      roiNode.setX1(x1);
    }

  /* @see loci.formats.meta.MetadataStore#setROIY0(Integer, int, int) */
  public void setROIY0(Integer y0, int imageIndex, int roiIndex) {
    if (y0 == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
      roiNode.setY0(y0);
    }

  /* @see loci.formats.meta.MetadataStore#setROIY1(Integer, int, int) */
  public void setROIY1(Integer y1, int imageIndex, int roiIndex) {
    if (y1 == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
      roiNode.setY1(y1);
    }

  /* @see loci.formats.meta.MetadataStore#setROIZ0(Integer, int, int) */
  public void setROIZ0(Integer z0, int imageIndex, int roiIndex) {
    if (z0 == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
      roiNode.setZ0(z0);
    }

  /* @see loci.formats.meta.MetadataStore#setROIZ1(Integer, int, int) */
  public void setROIZ1(Integer z1, int imageIndex, int roiIndex) {
    if (z1 == null) return;
    ROINode roiNode = getROINode(imageIndex, roiIndex, true);
      roiNode.setZ1(z1);
    }

  // - Reagent property storage -

  /* @see loci.formats.meta.MetadataStore#setReagentDescription(String, int, int) */
  public void setReagentDescription(String description, int screenIndex, int reagentIndex) {
    // NB: Description unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setReagentID(String, int, int) */
  public void setReagentID(String id, int screenIndex, int reagentIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setReagentName(String, int, int) */
  public void setReagentName(String name, int screenIndex, int reagentIndex) {
    // NB: Name unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setReagentReagentIdentifier(String, int, int) */
  public void setReagentReagentIdentifier(String reagentIdentifier, int screenIndex, int reagentIndex) {
    // NB: ReagentIdentifier unsupported for schema version 2003-FC
  }

  // - Screen property storage -

  /* @see loci.formats.meta.MetadataStore#setScreenID(String, int) */
  public void setScreenID(String id, int screenIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setScreenName(String, int) */
  public void setScreenName(String name, int screenIndex) {
    // NB: Name unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setScreenProtocolDescription(String, int) */
  public void setScreenProtocolDescription(String protocolDescription, int screenIndex) {
    // NB: ProtocolDescription unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setScreenProtocolIdentifier(String, int) */
  public void setScreenProtocolIdentifier(String protocolIdentifier, int screenIndex) {
    // NB: ProtocolIdentifier unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setScreenReagentSetDescription(String, int) */
  public void setScreenReagentSetDescription(String reagentSetDescription, int screenIndex) {
    // NB: ReagentSetDescription unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setScreenType(String, int) */
  public void setScreenType(String type, int screenIndex) {
    // NB: Type unsupported for schema version 2003-FC
  }

  // - ScreenAcquisition property storage -

  /* @see loci.formats.meta.MetadataStore#setScreenAcquisitionEndTime(String, int, int) */
  public void setScreenAcquisitionEndTime(String endTime, int screenIndex, int screenAcquisitionIndex) {
    // NB: EndTime unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setScreenAcquisitionID(String, int, int) */
  public void setScreenAcquisitionID(String id, int screenIndex, int screenAcquisitionIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setScreenAcquisitionStartTime(String, int, int) */
  public void setScreenAcquisitionStartTime(String startTime, int screenIndex, int screenAcquisitionIndex) {
    // NB: StartTime unsupported for schema version 2003-FC
  }

  // - StageLabel property storage -

  /* @see loci.formats.meta.MetadataStore#setStageLabelName(String, int) */
  public void setStageLabelName(String name, int imageIndex) {
    if (name == null) return;
    StageLabelNode stageLabelNode = getStageLabelNode(imageIndex, true);
      stageLabelNode.setName(name);
    }

  /* @see loci.formats.meta.MetadataStore#setStageLabelX(Float, int) */
  public void setStageLabelX(Float x, int imageIndex) {
    if (x == null) return;
    StageLabelNode stageLabelNode = getStageLabelNode(imageIndex, true);
      stageLabelNode.setX(x);
    }

  /* @see loci.formats.meta.MetadataStore#setStageLabelY(Float, int) */
  public void setStageLabelY(Float y, int imageIndex) {
    if (y == null) return;
    StageLabelNode stageLabelNode = getStageLabelNode(imageIndex, true);
      stageLabelNode.setY(y);
    }

  /* @see loci.formats.meta.MetadataStore#setStageLabelZ(Float, int) */
  public void setStageLabelZ(Float z, int imageIndex) {
    if (z == null) return;
    StageLabelNode stageLabelNode = getStageLabelNode(imageIndex, true);
      stageLabelNode.setZ(z);
    }

  // - StagePosition property storage -

  /* @see loci.formats.meta.MetadataStore#setStagePositionPositionX(Float, int, int, int) */
  public void setStagePositionPositionX(Float positionX, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: PositionX unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setStagePositionPositionY(Float, int, int, int) */
  public void setStagePositionPositionY(Float positionY, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: PositionY unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setStagePositionPositionZ(Float, int, int, int) */
  public void setStagePositionPositionZ(Float positionZ, int imageIndex, int pixelsIndex, int planeIndex) {
    // NB: PositionZ unsupported for schema version 2003-FC
  }

  // - TiffData property storage -

  /* @see loci.formats.meta.MetadataStore#setTiffDataFileName(String, int, int, int) */
  public void setTiffDataFileName(String fileName, int imageIndex, int pixelsIndex, int tiffDataIndex) {
    // NB: FileName unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setTiffDataFirstC(Integer, int, int, int) */
  public void setTiffDataFirstC(Integer firstC, int imageIndex, int pixelsIndex, int tiffDataIndex) {
    if (firstC == null) return;
    TiffDataNode tiffDataNode = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, true);
      tiffDataNode.setFirstC(firstC);
    }

  /* @see loci.formats.meta.MetadataStore#setTiffDataFirstT(Integer, int, int, int) */
  public void setTiffDataFirstT(Integer firstT, int imageIndex, int pixelsIndex, int tiffDataIndex) {
    if (firstT == null) return;
    TiffDataNode tiffDataNode = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, true);
      tiffDataNode.setFirstT(firstT);
    }

  /* @see loci.formats.meta.MetadataStore#setTiffDataFirstZ(Integer, int, int, int) */
  public void setTiffDataFirstZ(Integer firstZ, int imageIndex, int pixelsIndex, int tiffDataIndex) {
    if (firstZ == null) return;
    TiffDataNode tiffDataNode = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, true);
      tiffDataNode.setFirstZ(firstZ);
    }

  /* @see loci.formats.meta.MetadataStore#setTiffDataIFD(Integer, int, int, int) */
  public void setTiffDataIFD(Integer ifd, int imageIndex, int pixelsIndex, int tiffDataIndex) {
    if (ifd == null) return;
    TiffDataNode tiffDataNode = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, true);
      tiffDataNode.setIFD(ifd);
    }

  /* @see loci.formats.meta.MetadataStore#setTiffDataNumPlanes(Integer, int, int, int) */
  public void setTiffDataNumPlanes(Integer numPlanes, int imageIndex, int pixelsIndex, int tiffDataIndex) {
    if (numPlanes == null) return;
    TiffDataNode tiffDataNode = getTiffDataNode(imageIndex, pixelsIndex, tiffDataIndex, true);
      tiffDataNode.setNumPlanes(numPlanes);
    }

  /* @see loci.formats.meta.MetadataStore#setTiffDataUUID(String, int, int, int) */
  public void setTiffDataUUID(String uuid, int imageIndex, int pixelsIndex, int tiffDataIndex) {
    // NB: UUID unsupported for schema version 2003-FC
  }

  // - Well property storage -

  /* @see loci.formats.meta.MetadataStore#setWellColumn(Integer, int, int) */
  public void setWellColumn(Integer column, int plateIndex, int wellIndex) {
    // NB: Column unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellExternalDescription(String, int, int) */
  public void setWellExternalDescription(String externalDescription, int plateIndex, int wellIndex) {
    // NB: ExternalDescription unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellExternalIdentifier(String, int, int) */
  public void setWellExternalIdentifier(String externalIdentifier, int plateIndex, int wellIndex) {
    // NB: ExternalIdentifier unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellID(String, int, int) */
  public void setWellID(String id, int plateIndex, int wellIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellRow(Integer, int, int) */
  public void setWellRow(Integer row, int plateIndex, int wellIndex) {
    // NB: Row unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellType(String, int, int) */
  public void setWellType(String type, int plateIndex, int wellIndex) {
    // NB: Type unsupported for schema version 2003-FC
  }

  // - WellSample property storage -

  /* @see loci.formats.meta.MetadataStore#setWellSampleID(String, int, int, int) */
  public void setWellSampleID(String id, int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: ID unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellSampleIndex(Integer, int, int, int) */
  public void setWellSampleIndex(Integer index, int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: Index unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellSamplePosX(Float, int, int, int) */
  public void setWellSamplePosX(Float posX, int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: PosX unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellSamplePosY(Float, int, int, int) */
  public void setWellSamplePosY(Float posY, int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: PosY unsupported for schema version 2003-FC
  }

  /* @see loci.formats.meta.MetadataStore#setWellSampleTimepoint(Integer, int, int, int) */
  public void setWellSampleTimepoint(Integer timepoint, int plateIndex, int wellIndex, int wellSampleIndex) {
    // NB: Timepoint unsupported for schema version 2003-FC
  }

  // -- Helper methods --

  // Experimenter+
  private ExperimenterNode getExperimenterNode(int experimenterIndex, boolean create) {
    OMENode ome = (OMENode) root;
    // get Experimenter+ node
    int count = ome.getExperimenterCount();
    if (!create && count <= experimenterIndex) return null;
    for (int i=count; i<=experimenterIndex; i++) new ExperimenterNode(ome);
    List list = ome.getExperimenterList();
    return (ExperimenterNode) list.get(experimenterIndex);
  }

  // Image+
  private ImageNode getImageNode(int imageIndex, boolean create) {
    OMENode ome = (OMENode) root;
    // get Image+ node
    int count = ome.getImageCount();
    if (!create && count <= imageIndex) return null;
    for (int i=count; i<=imageIndex; i++) new ImageNode(ome);
    List list = ome.getImageList();
    return (ImageNode) list.get(imageIndex);
  }

  // Image+/ChannelInfo+
  private ChannelInfoNode getChannelInfoNode(int imageIndex, int channelInfoIndex, boolean create) {
    // get Image+ node
    ImageNode image = getImageNode(imageIndex, create);
    if (image == null) return null;
    // get ChannelInfo+ node
    int count = image.getChannelInfoCount();
    if (!create && count <= channelInfoIndex) return null;
    for (int i=count; i<=channelInfoIndex; i++) new ChannelInfoNode(image);
    List list = image.getChannelInfoList();
    return (ChannelInfoNode) list.get(channelInfoIndex);
  }

  // Image+/ChannelInfo+/ChannelComponent+
  private ChannelComponentNode getChannelComponentNode(int imageIndex, int channelInfoIndex, int channelComponentIndex, boolean create) {
    // get Image+/ChannelInfo+ node
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, channelInfoIndex, create);
    if (channelInfo == null) return null;
    // get ChannelComponent+ node
    int count = channelInfo.getChannelComponentCount();
    if (!create && count <= channelComponentIndex) return null;
    for (int i=count; i<=channelComponentIndex; i++) new ChannelComponentNode(channelInfo);
    List list = channelInfo.getChannelComponentList();
    return (ChannelComponentNode) list.get(channelComponentIndex);
  }

  // Image+/ChannelInfo+/DetectorRef
  private DetectorRefNode getDetectorRefNode(int imageIndex, int channelInfoIndex, boolean create) {
    // get Image+/ChannelInfo+ node
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, channelInfoIndex, create);
    if (channelInfo == null) return null;
    // get DetectorRef node
    DetectorRefNode detectorRef = channelInfo.getDetectorRef();
    if (detectorRef == null) {
      if (create) detectorRef = new DetectorRefNode(channelInfo);
      else return null;
    }
    return detectorRef;
  }

  // Image+/ChannelInfo+/LightSourceRef
  private LightSourceRefNode getLightSourceRefNode(int imageIndex, int channelInfoIndex, boolean create) {
    // get Image+/ChannelInfo+ node
    ChannelInfoNode channelInfo = getChannelInfoNode(imageIndex, channelInfoIndex, create);
    if (channelInfo == null) return null;
    // get LightSourceRef node
    LightSourceRefNode lightSourceRef = channelInfo.getLightSourceRef();
    if (lightSourceRef == null) {
      if (create) lightSourceRef = new LightSourceRefNode(channelInfo);
      else return null;
    }
    return lightSourceRef;
  }

  // Image+/DisplayOptions
  private DisplayOptionsNode getDisplayOptionsNode(int imageIndex, boolean create) {
    // get Image+ node
    ImageNode image = getImageNode(imageIndex, create);
    if (image == null) return null;
    // get DisplayOptions node
    DisplayOptionsNode displayOptions = image.getDisplayOptions();
    if (displayOptions == null) {
      if (create) displayOptions = new DisplayOptionsNode(image);
      else return null;
    }
    return displayOptions;
  }

  // Image+/DisplayOptions/Projection
  private ProjectionNode getProjectionNode(int imageIndex, boolean create) {
    // get Image+/DisplayOptions node
    DisplayOptionsNode displayOptions = getDisplayOptionsNode(imageIndex, create);
    if (displayOptions == null) return null;
    // get Projection node
    ProjectionNode projection = displayOptions.getProjection();
    if (projection == null) {
      if (create) projection = new ProjectionNode(displayOptions);
      else return null;
    }
    return projection;
  }

  // Image+/DisplayOptions/ROI+
  private ROINode getROINode(int imageIndex, int roiIndex, boolean create) {
    // get Image+/DisplayOptions node
    DisplayOptionsNode displayOptions = getDisplayOptionsNode(imageIndex, create);
    if (displayOptions == null) return null;
    // get ROI+ node
    int count = displayOptions.getROICount();
    if (!create && count <= roiIndex) return null;
    for (int i=count; i<=roiIndex; i++) new ROINode(displayOptions);
    List list = displayOptions.getROIList();
    return (ROINode) list.get(roiIndex);
  }

  // Image+/DisplayOptions/Time
  private TimeNode getTimeNode(int imageIndex, boolean create) {
    // get Image+/DisplayOptions node
    DisplayOptionsNode displayOptions = getDisplayOptionsNode(imageIndex, create);
    if (displayOptions == null) return null;
    // get Time node
    TimeNode time = displayOptions.getTime();
    if (time == null) {
      if (create) time = new TimeNode(displayOptions);
      else return null;
    }
    return time;
  }

  // Image+/ImagingEnvironment
  private ImagingEnvironmentNode getImagingEnvironmentNode(int imageIndex, boolean create) {
    // get Image+ node
    ImageNode image = getImageNode(imageIndex, create);
    if (image == null) return null;
    // get ImagingEnvironment node
    ImagingEnvironmentNode imagingEnvironment = image.getImagingEnvironment();
    if (imagingEnvironment == null) {
      if (create) imagingEnvironment = new ImagingEnvironmentNode(image);
      else return null;
    }
    return imagingEnvironment;
  }

  // Image+/Pixels+
  private PixelsNode getPixelsNode(int imageIndex, int pixelsIndex, boolean create) {
    // get Image+ node
    ImageNode image = getImageNode(imageIndex, create);
    if (image == null) return null;
    // get Pixels+ node
    int count = image.getPixelsCount();
    if (!create && count <= pixelsIndex) return null;
    for (int i=count; i<=pixelsIndex; i++) new PixelsNode(image);
    List list = image.getPixelsList();
    return (PixelsNode) list.get(pixelsIndex);
  }

  // Image+/Pixels+/TiffData+
  private TiffDataNode getTiffDataNode(int imageIndex, int pixelsIndex, int tiffDataIndex, boolean create) {
    // get Image+/Pixels+ node
    PixelsNode pixels = getPixelsNode(imageIndex, pixelsIndex, create);
    if (pixels == null) return null;
    // get TiffData+ node
    int count = pixels.getTiffDataCount();
    if (!create && count <= tiffDataIndex) return null;
    for (int i=count; i<=tiffDataIndex; i++) new TiffDataNode(pixels);
    List list = pixels.getTiffDataList();
    return (TiffDataNode) list.get(tiffDataIndex);
  }

  // Image+/StageLabel
  private StageLabelNode getStageLabelNode(int imageIndex, boolean create) {
    // get Image+ node
    ImageNode image = getImageNode(imageIndex, create);
    if (image == null) return null;
    // get StageLabel node
    StageLabelNode stageLabel = image.getStageLabel();
    if (stageLabel == null) {
      if (create) stageLabel = new StageLabelNode(image);
      else return null;
    }
    return stageLabel;
  }

  // Instrument+
  private InstrumentNode getInstrumentNode(int instrumentIndex, boolean create) {
    OMENode ome = (OMENode) root;
    // get Instrument+ node
    int count = ome.getInstrumentCount();
    if (!create && count <= instrumentIndex) return null;
    for (int i=count; i<=instrumentIndex; i++) new InstrumentNode(ome);
    List list = ome.getInstrumentList();
    return (InstrumentNode) list.get(instrumentIndex);
  }

  // Instrument+/Detector+
  private DetectorNode getDetectorNode(int instrumentIndex, int detectorIndex, boolean create) {
    // get Instrument+ node
    InstrumentNode instrument = getInstrumentNode(instrumentIndex, create);
    if (instrument == null) return null;
    // get Detector+ node
    int count = instrument.getDetectorCount();
    if (!create && count <= detectorIndex) return null;
    for (int i=count; i<=detectorIndex; i++) new DetectorNode(instrument);
    List list = instrument.getDetectorList();
    return (DetectorNode) list.get(detectorIndex);
  }

  // Instrument+/LightSource+
  private LightSourceNode getLightSourceNode(int instrumentIndex, int lightSourceIndex, boolean create) {
    // get Instrument+ node
    InstrumentNode instrument = getInstrumentNode(instrumentIndex, create);
    if (instrument == null) return null;
    // get LightSource+ node
    int count = instrument.getLightSourceCount();
    if (!create && count <= lightSourceIndex) return null;
    for (int i=count; i<=lightSourceIndex; i++) new LightSourceNode(instrument);
    List list = instrument.getLightSourceList();
    return (LightSourceNode) list.get(lightSourceIndex);
  }

  // Instrument+/LightSource+/Arc
  private ArcNode getArcNode(int instrumentIndex, int lightSourceIndex, boolean create) {
    // get Instrument+/LightSource+ node
    LightSourceNode lightSource = getLightSourceNode(instrumentIndex, lightSourceIndex, create);
    if (lightSource == null) return null;
    // get Arc node
    ArcNode arc = lightSource.getArc();
    if (arc == null) {
      if (create) arc = new ArcNode(lightSource);
      else return null;
    }
    return arc;
  }

  // Instrument+/LightSource+/Filament
  private FilamentNode getFilamentNode(int instrumentIndex, int lightSourceIndex, boolean create) {
    // get Instrument+/LightSource+ node
    LightSourceNode lightSource = getLightSourceNode(instrumentIndex, lightSourceIndex, create);
    if (lightSource == null) return null;
    // get Filament node
    FilamentNode filament = lightSource.getFilament();
    if (filament == null) {
      if (create) filament = new FilamentNode(lightSource);
      else return null;
    }
    return filament;
  }

  // Instrument+/LightSource+/Laser
  private LaserNode getLaserNode(int instrumentIndex, int lightSourceIndex, boolean create) {
    // get Instrument+/LightSource+ node
    LightSourceNode lightSource = getLightSourceNode(instrumentIndex, lightSourceIndex, create);
    if (lightSource == null) return null;
    // get Laser node
    LaserNode laser = lightSource.getLaser();
    if (laser == null) {
      if (create) laser = new LaserNode(lightSource);
      else return null;
    }
    return laser;
  }

  // Instrument+/OTF+
  private OTFNode getOTFNode(int instrumentIndex, int otfIndex, boolean create) {
    // get Instrument+ node
    InstrumentNode instrument = getInstrumentNode(instrumentIndex, create);
    if (instrument == null) return null;
    // get OTF+ node
    int count = instrument.getOTFCount();
    if (!create && count <= otfIndex) return null;
    for (int i=count; i<=otfIndex; i++) new OTFNode(instrument);
    List list = instrument.getOTFList();
    return (OTFNode) list.get(otfIndex);
  }

  // Instrument+/Objective+
  private ObjectiveNode getObjectiveNode(int instrumentIndex, int objectiveIndex, boolean create) {
    // get Instrument+ node
    InstrumentNode instrument = getInstrumentNode(instrumentIndex, create);
    if (instrument == null) return null;
    // get Objective+ node
    int count = instrument.getObjectiveCount();
    if (!create && count <= objectiveIndex) return null;
    for (int i=count; i<=objectiveIndex; i++) new ObjectiveNode(instrument);
    List list = instrument.getObjectiveList();
    return (ObjectiveNode) list.get(objectiveIndex);
  }

}
