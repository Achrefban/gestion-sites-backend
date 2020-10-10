package Achref.Bannouri.GestionSites.service;

import Achref.Bannouri.GestionSites.model.User;
import Achref.Bannouri.GestionSites.model.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);
}