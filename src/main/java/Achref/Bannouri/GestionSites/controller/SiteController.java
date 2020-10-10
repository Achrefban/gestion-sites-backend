package Achref.Bannouri.GestionSites.controller;

import Achref.Bannouri.GestionSites.model.Site;
import Achref.Bannouri.GestionSites.Repository.SiteRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin (origins = "http://localhost:4200", maxAge = 3600) 
@RestController
@RequestMapping({"/sites"})
public class SiteController {
    @Autowired
    SiteRepository siteRepository ; 

     @RequestMapping(method=RequestMethod.GET, value="/sites")
    public Iterable<Site> site() {
        return siteRepository.findAll();
    } 
     @RequestMapping(method=RequestMethod.POST, value="/sites")
    public Site save(@RequestBody Site site) {
        siteRepository.save(site);

        return site;
    }
    @RequestMapping(method=RequestMethod.GET, value="/sites/{siteId}")
    public Site show(@PathVariable String siteId) {
        Optional<Site> mySite= siteRepository.findById(siteId);
        if(mySite.isPresent()){
            return mySite.get();
     
        }
        return null;
    }
    @RequestMapping(method=RequestMethod.PUT, value="/Sites/{siteId}")
    public Site update(@PathVariable String siteId, @RequestBody Site site) {
       // Site s = Optional<Site> mySite = siteRepository.findById(siteId);

       Optional<Site> mySite=  siteRepository.findById(siteId);
        if(mySite.isPresent()){
            Site s = mySite.get();

        if(site.getSiteId() != null)
        s.setSiteId(s.getSiteId());
        if (site.getSiteName() != null)
        s.setSiteName(site.getSiteName());
        if (site.getNewSiteName() != null)
        s.setNewSiteName(site.getNewSiteName());
        if (site.getProjectPhase() != null)
        s.setProjectPhase(site.getProjectPhase());
        if (site.getClusterName() != null)
        s.setClusterName(site.getClusterName());
        if (site.getRegion() != null)
        s.setRegion(site.getRegion());
        if(site.getCity() != null)
        s.setCity(site.getCity());
        siteRepository.save(s);
           
           // siteRepository.save(s);
        return mySite.get();
     
        }
        return null;
        
        //return site;
    }
    @RequestMapping(method=RequestMethod.DELETE, value="/sites/{siteId}")
    public String delete(@PathVariable String siteId) {
        Optional<Site> mySite= siteRepository.findById(siteId);


        if(mySite.isPresent()) {
            Site s = mySite.get();
            siteRepository.delete(s);
            return String.valueOf(s);
         }
        
        /*if(mySite.isPresent()){
            return String.valueOf(mySite);
     
        }*/
        return null;
        
       // return "";
    }

    


}