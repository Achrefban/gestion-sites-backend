package Achref.Bannouri.GestionSites.model;

import org.springframework.data.annotation.Id;

//@Document(collection = "QuatreG")
 public class QuatreG{
     @Id
     String id;
     String cnOperatorId ;
     String eci;
     String sectorId;
     String cellName;
     String eNodebNumber;
     String localCellId;
     String eNodebName;
     String pci;
     //pci mod3;
     String DLEARFCN;
     String ReferenceSignalPwr;
     String pa;
     String pb;
     String Azimuth;
     String MechanicalTilt;
     String ElectricalTilt;
     String tac;
     String SGSN;
     String BandWidth;
     String TxRxMode;
     String NCS;
     String cellRadius;
     String rootSeqIndex;
     String Hemisphere;
     String retControlPort;
     String orangeCity;
     String clusterName;

 
 public QuatreG() {

 }
 public QuatreG(String cnOperatorId ,String eci,String sectorId,String cellName,String eNodebNumber,
 String localCellId,String eNodebName,String pci,String DLEARFCN,String ReferenceSignalPwr,String pa,
 String pb,String Azimuth,String MechanicalTilt,String ElectricalTilt,String tac,String SGSN,String BandWidth,
 String TxRxMode,String NCS,String cellRadius,String rootSeqIndex,String Hemisphere,
 String retControlPort,String orangeCity,String clusterName, String id){
     this.cnOperatorId = cnOperatorId;
     this.Azimuth = Azimuth;
     this.BandWidth = BandWidth;
     this.tac = tac;
     this.TxRxMode = TxRxMode;
     this.clusterName = clusterName;
     this.eci = eci;
     this.cellName = cellName;
     this.sectorId = sectorId;
     this.eNodebName = eNodebName ;
     this.eNodebNumber = eNodebNumber;
     this.localCellId = localCellId;
     this.pci = pci;
     this.DLEARFCN = DLEARFCN;
     this.ReferenceSignalPwr = ReferenceSignalPwr;
     this.pa = pa;
     this.pb = pb;
     this.Azimuth = Azimuth;
     this.MechanicalTilt = MechanicalTilt;
     this.ElectricalTilt = ElectricalTilt;
     this.tac = tac;
     this.SGSN = SGSN;
     this.retControlPort = retControlPort;
     this.orangeCity = orangeCity;
     this.id = id;
    }
/**
 * @return the azimuth
 */
public String getAzimuth() {
    return Azimuth;
}
/**
 * @param azimuth the azimuth to set
 */
public void setAzimuth(String azimuth) {
    this.Azimuth = azimuth;
}
/**
 * @return the bandWidth
 */
public String getBandWidth() {
    return BandWidth;
}
/**
 * @param bandWidth the bandWidth to set
 */
public void setBandWidth(String bandWidth) {
    this.BandWidth = bandWidth;
}
/**
 * @return the cellName
 */
public String getCellName() {
    return cellName;
}
/**
 * @param cellName the cellName to set
 */
public void setCellName(String cellName) {
    this.cellName = cellName;
}
/**
 * @return the cellRadius
 */
public String getCellRadius() {
    return cellRadius;
}
/**
 * @param cellRadius the cellRadius to set
 */
public void setCellRadius(String cellRadius) {
    this.cellRadius = cellRadius;
}
/**
 * @return the clusterName
 */
public String getClusterName() {
    return clusterName;
}
/**
 * @param clusterName the clusterName to set
 */
public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
}
/**
 * @return the cnOperatorId
 */
public String getCnOperatorId() {
    return cnOperatorId;
}
/**
 * @param cnOperatorId the cnOperatorId to set
 */
public void setCnOperatorId(String cnOperatorId) {
    this.cnOperatorId = cnOperatorId;
}
/**
 * @return the dLEARFCN
 */
public String getDLEARFCN() {
    return DLEARFCN;
}
/**
 * @param dLEARFCN the dLEARFCN to set
 */
public void setDLEARFCN(String dLEARFCN) {
    this.DLEARFCN = dLEARFCN;
}
/**
 * @return the eci
 */
public String getEci() {
    return eci;
}
/**
 * @param eci the eci to set
 */
public void setEci(String eci) {
    this.eci = eci;
}
/**
 * @return the electricalTilt
 */
public String getElectricalTilt() {
    return ElectricalTilt;
}
 /**
  * @param electricalTilt the electricalTilt to set
  */
 public void setElectricalTilt(String electricalTilt) {
     this.ElectricalTilt = electricalTilt;
 }
 /**
  * @return the eNodebName
  */
 public String geteNodebName() {
     return eNodebName;
 }
 /**
  * @param eNodebName the eNodebName to set
  */
 public void seteNodebName(String eNodebName) {
     this.eNodebName = eNodebName;
 }
 /**
  * @return the eNodebNumber
  */
 public String geteNodebNumber() {
     return eNodebNumber;
 }
 /**
  * @param eNodebNumber the eNodebNumber to set
  */
 public void seteNodebNumber(String eNodebNumber) {
     this.eNodebNumber = eNodebNumber;
 }
 /**
  * @return the hemisphere
  */
 public String getHemisphere() {
     return Hemisphere;
 }
 /**
  * @param hemisphere the hemisphere to set
  */
 public void setHemisphere(String hemisphere) {
     this.Hemisphere = hemisphere;
 }
 /**
  * @return the localCellId
  */
 public String getLocalCellId() {
     return localCellId;
 }
 /**
  * @param localCellId the localCellId to set
  */
 public void setLocalCellId(String localCellId) {
     this.localCellId = localCellId;
 }
 /**
  * @return the mechanicalTilt
  */
 public String getMechanicalTilt() {
     return MechanicalTilt;
 }
 /**
  * @param mechanicalTilt the mechanicalTilt to set
  */
 public void setMechanicalTilt(String mechanicalTilt) {
     this.MechanicalTilt = mechanicalTilt;
 }
 /**
  * @return the nCS
  */
 public String getNCS() {
     return NCS;
 }
 /**
  * @param nCS the nCS to set
  */
 public void setNCS(String nCS) {
     this.NCS = nCS;
 }
 /**
  * @return the orangeCity
  */
 public String getOrangeCity() {
     return orangeCity;
 }
 /**
  * @param orangeCity the orangeCity to set
  */
 public void setOrangeCity(String orangeCity) {
     this.orangeCity = orangeCity;
 }
 /**
  * @return the pa
  */
 public String getPa() {
     return pa;
 }
 /**
  * @param pa the pa to set
  */
 public void setPa(String pa) {
     this.pa = pa;
 }
 /**
  * @return the pb
  */
 public String getPb() {
     return pb;
 }
 /**
  * @param pb the pb to set
  */
 public void setPb(String pb) {
     this.pb = pb;
 }
 /**
  * @return the pci
  */
 public String getPci() {
     return pci;
 }
 /**
  * @param pci the pci to set
  */
 public void setPci(String pci) {
     this.pci = pci;
 }
 /**
  * @return the referenceSignalPwr
  */
 public String getReferenceSignalPwr() {
     return ReferenceSignalPwr;
 }
 /**
  * @param referenceSignalPwr the referenceSignalPwr to set
  */
 public void setReferenceSignalPwr(String referenceSignalPwr) {
     this.ReferenceSignalPwr = referenceSignalPwr;
 }
 /**
  * @return the retControlPort
  */
 public String getRetControlPort() {
     return retControlPort;
 }
 /**
  * @param retControlPort the retControlPort to set
  */
 public void setRetControlPort(String retControlPort) {
     this.retControlPort = retControlPort;
 }
 /**
  * @return the rootSeqIndex
  */
 public String getRootSeqIndex() {
     return rootSeqIndex;
 }
 /**
  * @param rootSeqIndex the rootSeqIndex to set
  */
 public void setRootSeqIndex(String rootSeqIndex) {
     this.rootSeqIndex = rootSeqIndex;
 }
 /**
  * @return the sectorId
  */
 public String getSectorId() {
     return sectorId;
 }
 /**
  * @param sectorId the sectorId to set
  */
 public void setSectorId(String sectorId) {
     this.sectorId = sectorId;
 }
 /**
  * @return the sGSN
  */
 public String getSGSN() {
     return SGSN;
 }
 /**
  * @param sGSN the sGSN to set
  */
 public void setSGSN(String sGSN) {
     this.SGSN = sGSN;
 }
 /**
  * @return the tac
  */
 public String getTac() {
     return tac;
 }
 /**
  * @param tac the tac to set
  */
 public void setTac(String tac) {
     this.tac = tac;
 }
 /**
  * @return the txRxMode
  */
 public String getTxRxMode() {
     return TxRxMode;
 }
 /**
  * @param txRxMode the txRxMode to set
  */
 public void setTxRxMode(String txRxMode) {
     this.TxRxMode = txRxMode;
 } 
}

