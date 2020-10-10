package Achref.Bannouri.GestionSites.model;


import org.springframework.data.annotation.Id;



//@Document(collection = "celluleDeuxGneuufCent")
public class DeuxGNeufCent  {
    @Id
    String id;
    String bscName;
    String cellId;
    String cellName;
    String mcc;
    String mnc;
    String lac;
    String rac;
    String bcch;
    String tch;
    String bsic;
    String ncc;
    String bcc;
    String fhMode;
    String hsn;
    String ma;
    String maio;
    String gprs;
    String edge;
    String antennaType;
    String antennaHeight;
    String azimuth;
    String mechanicalTilt;
    String electricalTilt;
    String antGain;
    String tmaType;
    String trxPower;
    String dateCreation;

    public DeuxGNeufCent() {

    }
    public DeuxGNeufCent (String bscName,String cellId,String cellName,String mcc,String mnc,String lac,String rac,
    String bcch,String tch,String bsic,String ncc,String bcc,String fhMode,String hsn,String ma,String maio,String gprs,
    String edge,String antennaType,String antennaHeight,String azimuth,String mechanicalTilt,String electricalTilt,
    String antGain,String tmaType,String trxPower,String dateCreation, String id){
        this.antennaHeight = antennaHeight;
        this.antennaType = antennaType;
        this.tch = tch;
        this.tmaType = tmaType;
        this.trxPower = trxPower;
        this.antGain = antGain;
        this.bcc = bcc;
        this.cellId = cellId;
        this.cellName = cellName;
        this.mcc = mcc;
        this.mnc = mnc;
        this.lac = lac;
        this.rac = rac;
        this.bcch = bcch;
        this.bsic= bsic;
        this.ncc = ncc;
        this.bcc = bcc;
        this.fhMode = fhMode;
        this.hsn = hsn;
        this.ma = ma;
        this.maio = maio;
        this.gprs = gprs;
        this.edge = edge;
        this.azimuth = azimuth;
        this.mechanicalTilt = mechanicalTilt;
        this.electricalTilt = electricalTilt;
        this.dateCreation = dateCreation;
        this.id = id;
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
        public String getbscName() {
            return bscName;
        }
        public void setbscName(String bscName) {
            this.bscName = bscName;
    
        }
        public String getcellId() {
            return cellId;
        }
        public void setcellId(String cellId) {
            this.cellId = cellId;
    
        }
        public String getcellName() {
            return cellName;
        }
        public void setcellName(String cellName) {
            this.cellName = cellName;
    
        } 
        public String getmcc() {
            return mcc;
        }
        public void setmcc(String mcc) {
            this.mcc = mcc;
    
        }
        public String getmnc() {
            return mnc;
        }
        public void setmnc(String mnc) {
            this.mnc = mnc;
    
        }
        public String getlac() {
            return lac;
        }
        public void setlac(String lac) {
            this.lac = lac;
    
        }
        public String getrac() {
            return rac;
        }
        public void setrac(String rac) {
            this.rac = rac;
    
        }
        public String getbcch() {
            return bcch;
        }
        public void setbcch(String bcch) {
            this.bcch = bcch;
    
        }
        public String gettch() {
            return tch;
        }
        public void settch(String tch) {
            this.tch = tch;
    
        }
        public String getbsic() {
            return bsic;
        }
        public void setbsic(String bsic) {
            this.bsic = bsic;
    
        }
        public String getncc() {
            return ncc;
        }
        public void setncc(String ncc) {
            this.ncc = ncc;
    
        }
        public String getbcc() {
            return bcc;
        }
        public void setbcc(String bcc) {
            this.bcc = bcc;
    
        }
        public String getfhMode() {
            return fhMode;
        }
        public void setfhMode(String fhMode) {
            this.fhMode = fhMode;
    
        }
        public String gethsn() {
            return hsn;
        }
        public void sethsn(String hsn) {
            this.hsn = hsn;
    
        }
        public String getma() {
            return ma;
        }
        public void setma(String ma) {
            this.ma = ma;
    
        }
        public String getmaio() {
            return maio;
        }
        public void setmaio(String maio) {
            this.maio = maio;
    
        }
        public String getgprs() {
            return gprs;
        }
        public void setgprs(String gprs) {
            this.gprs = gprs;
    
        }public String getedge() {
            return edge;
        }
        public void setedge(String edge) {
            this.edge = edge;
    
        }
        public String getantennaType() {
            return antennaType;
        }
        public void setantennaType(String antennaType) {
            this.antennaType = antennaType;
    
        }
        public String getantennaHeight() {
            return antennaHeight;
        }
        public void setantennaHeight(String antennaHeight) {
            this.antennaHeight = antennaHeight;
    
        }
        public String getazimuth() {
            return azimuth;
        }
        public void setazimuth(String azimuth) {
            this.azimuth = azimuth;
    
        }
        public String getmechanicalTilt() {
            return mechanicalTilt;
        }
        public void setmechanicalTilt(String mechanicalTilt) {
            this.mechanicalTilt = mechanicalTilt;
    
        }
        public String getelectricalTilt() {
            return electricalTilt;
        }
        public void setelectricalTilt(String electricalTilt) {
            this.electricalTilt = electricalTilt;
    
        }
        public String getantGain() {
            return antGain;
        }
        public void setantGain(String antGain) {
            this.antGain = antGain;
    
        }
        public String gettmaType() {
            return tmaType;
        }
        public void settmaType(String tmaType) {
            this.tmaType = tmaType;
    
        }
        public String gettrxPower() {
            return trxPower;
        }
        public void settrxPower(String trxPower) {
            this.trxPower = trxPower;
    
        }
        public String getdateCreation() {
            return dateCreation;
        }
        public void setdateCreation(String dateCreation) {
            this.dateCreation = dateCreation;
    
        }
                   
}