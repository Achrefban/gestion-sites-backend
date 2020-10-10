package Achref.Bannouri.GestionSites.dao;

import  Achref.Bannouri.GestionSites.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
    User findByUsername(String username);
}