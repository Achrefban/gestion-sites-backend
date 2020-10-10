package Achref.Bannouri.GestionSites.model;

import java.util.*;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sites")
public class Site {
    
    @Id @Indexed
    String siteId;
    String projectPhase;
    String region;
    String city;
    String siteName;
    String newSiteName;
    String clusterName ;
    Number longitude ;
    Number lattitude ;
    String siteType;
    List <DeuxG> DeuxGCell;
    List <DeuxGNeufCent> DeuxGNeufCentCell;
    List <TroisG> TroisGCell;
    List <QuatreG> QuatreGCell;
     

   
    public Site() {

    }
    public Site(String projectPhase, String region, String city, String siteName, String newSiteName, String clusterName
    , Number longitude, Number lattitude, String siteType) {
        this.projectPhase = projectPhase;
        this.region = region;
        this.city = city;
        this.siteName = siteName;
        this.siteType = siteType;
        this.newSiteName = newSiteName;
        this.clusterName = clusterName;
        this.longitude = longitude;
        this.lattitude = lattitude;
        this.DeuxGCell= new ArrayList<DeuxG>();
        this.DeuxGNeufCentCell= new ArrayList<DeuxGNeufCent>();
        this.TroisGCell= new ArrayList<TroisG>();
        this.QuatreGCell= new ArrayList<QuatreG>();
        

    }
    /**
     * @return the siteType
     */
    public String getSiteType() {
        return siteType;
    }
    /**
     * @param siteType the siteType to set
     */
    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }
    /**
     * @return the deuxGCell
     */
    public List<DeuxG> getDeuxGCell() {
        return DeuxGCell;
    }
    /**
     * @param deuxGCell the deuxGCell to set
     */
    public void setDeuxGCell(List<DeuxG> deuxGCell) {
        this.DeuxGCell = deuxGCell;
    }
    /**
     * @return the deuxGNeufCentCell
     */
    public List<DeuxGNeufCent> getDeuxGNeufCentCell() {
        return DeuxGNeufCentCell;
    }
    /**
     * @param deuxGNeufCentCell the deuxGNeufCentCell to set
     */
    public void setDeuxGNeufCentCell(List<DeuxGNeufCent> deuxGNeufCentCell) {
        this.DeuxGNeufCentCell = deuxGNeufCentCell;
    }
    /**
     * @return the quatreGCell
     */
    public List<QuatreG> getQuatreGCell() {
        return QuatreGCell;
    }
    /**
     * @param quatreGCell the quatreGCell to set
     */
    public void setQuatreGCell(List<QuatreG> quatreGCell) {
        this.QuatreGCell = quatreGCell;
    }
    /**
     * @return the troisGCell
     */
    public List<TroisG> getTroisGCell() {
        return TroisGCell;
    }
    /**
     * @param troisGCell the troisGCell to set
     */
    public void setTroisGCell(List<TroisG> troisGCell) {
        this.TroisGCell = troisGCell;
    }
    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }
    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
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
     * @return the lattitude
     */
    public Number getLattitude() {
        return lattitude;
    }
    /**
     * @param lattitude the lattitude to set
     */
    public void setLattitude(Number lattitude) {
        this.lattitude = lattitude;
    }
    /**
     * @return the longitude
     */
    public Number getLongitude() {
        return longitude;
    }
    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(Number longitude) {
        this.longitude = longitude;
    }
    /**
     * @return the newSiteName
     */
    public String getNewSiteName() {
        return newSiteName;
    }
    /**
     * @param newSiteName the newSiteName to set
     */
    public void setNewSiteName(String newSiteName) {
        this.newSiteName = newSiteName;
    }
    /**
     * @return the projectPhase
     */
    public String getProjectPhase() {
        return projectPhase;
    }
    /**
     * @param projectPhase the projectPhase to set
     */
    public void setProjectPhase(String projectPhase) {
        this.projectPhase = projectPhase;
    }
    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }
    /**
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }
    /**
     * @return the siteId
     */
    public String getSiteId() {
        return siteId;
    }
    /**
     * @param siteId the siteId to set
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }
    /**
     * @return the siteName
     */
    public String getSiteName() {
        return siteName;
    }
    /**
     * @param siteName the siteName to set
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }
    
}