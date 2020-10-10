package Achref.Bannouri.GestionSites.model;


import org.springframework.data.annotation.Id;



//@Document (collection ="TroisG")
public class TroisG {
    @Id
    String id;
    String rncId;
    String cellId;
    String localCellId;
    String cellName;
    String mcc;
    String mnc;
    String lac;
    String rac;
    String sac;
    String frequencyDl;
    String uarfcn;
    String scramblingCode;
    String antennaType;
    String antennaHeight;
    String azimuth;
    String mechanicalTilt;
    String electricalTilt;
    String antGain;
    String tmaType;
    String cpichPower;
    String lienLub;
    String dateCreation;
    public TroisG(){

    }
    public TroisG(String rncId,String cellId,String localCellId,String mcc,String mnc,String lac,String rac,String sac,String frequencyDl,
    String uarfcn,String scramblingCode,String antennaType,String antennaHeight,String azimuth,String mechanicalTilt,
    String electricalTilt,String antGain,String tmaType,String cpichPower,String lienLub,String dateCreation, String id, String cellName) {
        this.rncId = rncId;
        this.cellId = cellId;
        this.cellName = cellName;
        this.localCellId = localCellId;
        this.mcc = mcc;
        this.mnc = mnc;
        this.lac = lac;
        this.rac = rac;
        this.sac = sac;
        this.frequencyDl = frequencyDl;
        this.uarfcn = uarfcn ;
        this.scramblingCode = scramblingCode;
        this.antennaHeight = antennaHeight;
        this.antennaType = antennaType;
        this.azimuth = azimuth;
        this.mechanicalTilt = mechanicalTilt;
        this.electricalTilt = electricalTilt;
        this.antGain = antGain;
        this.tmaType = tmaType;
        this.cpichPower = cpichPower;
        this.lienLub = lienLub;
        this.dateCreation = dateCreation;
        this.id = id;
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
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the antennaHeight
     */
    public String getAntennaHeight() {
        return antennaHeight;
    }
/**
 * @return the antGain
 */
public String getAntGain() {
    return antGain;
}
/**
 * @return the cellId
 */
public String getCellId() {
    return cellId;
}
/**
 * @return the azimuth
 */
public String getAzimuth() {
    return azimuth;
}
/**
 * @return the electricalTilt
 */
public String getElectricalTilt() {
    return electricalTilt;
}
/**
 * @return the cpichPower
 */
public String getCpichPower() {
    return cpichPower;
}
/**
 * @return the antennaType
 */
public String getAntennaType() {
    return antennaType;
}
/**
 * @return the dateCreation
 */
public String getDateCreation() {
    return dateCreation;
}
/**
 * @return the frequencyDl
 */
public String getFrequencyDl() {
    return frequencyDl;
}
/**
 * @return the lac
 */
public String getLac() {
    return lac;
}
/**
 * @return the lienLub
 */
public String getLienLub() {
    return lienLub;
}
/**
 * @return the localCellId
 */
public String getLocalCellId() {
    return localCellId;
}
/**
 * @return the mcc
 */
public String getMcc() {
    return mcc;
}
/**
 * @return the mechanicalTilt
 */
public String getMechanicalTilt() {
    return mechanicalTilt;
}
/**
 * @return the mnc
 */
public String getMnc() {
    return mnc;
}
/**
 * @return the rac
 */
public String getRac() {
    return rac;
}
/**
 * @return the rncId
 */
public String getRncId() {
    return rncId;
}
/**
 * @return the sac
 */
public String getSac() {
    return sac;
}
/**
 * @return the scramblingCode
 */
public String getScramblingCode() {
    return scramblingCode;
}
/**
 * @return the tmaType
 */
public String getTmaType() {
    return tmaType;
}
/**
 * @return the uarfcn
 */
public String getUarfcn() {
    return uarfcn;
}
/**
 * @param antennaHeight the antennaHeight to set
 */
public void setAntennaHeight(String antennaHeight) {
    this.antennaHeight = antennaHeight;
}
/**
 * @param antennaType the antennaType to set
 */
public void setAntennaType(String antennaType) {
    this.antennaType = antennaType;
}
/**
 * @param antGain the antGain to set
 */
public void setAntGain(String antGain) {
    this.antGain = antGain;
}
/**
 * @param azimuth the azimuth to set
 */
public void setAzimuth(String azimuth) {
    this.azimuth = azimuth;
}
/**
 * @param cellId the cellId to set
 */
public void setCellId(String cellId) {
    this.cellId = cellId;
}
/**
 * @param cpichPower the cpichPower to set
 */
public void setCpichPower(String cpichPower) {
    this.cpichPower = cpichPower;
}
/**
 * @param dateCreation the dateCreation to set
 */
public void setDateCreation(String dateCreation) {
    this.dateCreation = dateCreation;
}
/**
 * @param electricalTilt the electricalTilt to set
 */
public void setElectricalTilt(String electricalTilt) {
    this.electricalTilt = electricalTilt;
}
/**
 * @param frequencyDl the frequencyDl to set
 */
public void setFrequencyDl(String frequencyDl) {
    this.frequencyDl = frequencyDl;
}
/**
 * @param lac the lac to set
 */
public void setLac(String lac) {
    this.lac = lac;
}
/**
 * @param lienLub the lienLub to set
 */
public void setLienLub(String lienLub) {
    this.lienLub = lienLub;
}
/**
 * @param localCellId the localCellId to set
 */
public void setLocalCellId(String localCellId) {
    this.localCellId = localCellId;
}
/**
 * @param mcc the mcc to set
 */
public void setMcc(String mcc) {
    this.mcc = mcc;
}
/**
 * @param mechanicalTilt the mechanicalTilt to set
 */
public void setMechanicalTilt(String mechanicalTilt) {
    this.mechanicalTilt = mechanicalTilt;
}
/**
 * @param mnc the mnc to set
 */
public void setMnc(String mnc) {
    this.mnc = mnc;
}
/**
 * @param rac the rac to set
 */
public void setRac(String rac) {
    this.rac = rac;
}
/**
 * @param rncId the rncId to set
 */
public void setRncId(String rncId) {
    this.rncId = rncId;
}
/**
 * @param sac the sac to set
 */
public void setSac(String sac) {
    this.sac = sac;
}
/**
 * @param scramblingCode the scramblingCode to set
 */
public void setScramblingCode(String scramblingCode) {
    this.scramblingCode = scramblingCode;
}
/**
 * @param tmaType the tmaType to set
 */
public void setTmaType(String tmaType) {
    this.tmaType = tmaType;
}
/**
 * @param uarfcn the uarfcn to set
 */
public void setUarfcn(String uarfcn) {
    this.uarfcn = uarfcn;
}
}