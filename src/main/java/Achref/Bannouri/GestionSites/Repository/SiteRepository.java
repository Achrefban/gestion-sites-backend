package Achref.Bannouri.GestionSites.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import Achref.Bannouri.GestionSites.model.*;



@CrossOrigin(origins = "http://localhost:4200")
public interface SiteRepository extends CrudRepository<Site, String> {

   
   


    //**@Query("SELECT t.title FROM Todo t where t.id = :id") 
   // List<Cellule> findTitleById(@Param("id") Long id);
   

}