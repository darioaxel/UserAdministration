/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darioaxel.useradministration.dao;

import com.darioaxel.useradministration.dao.models.User;
import java.util.List;

/**
 *
 * @author darioaxel
 */
public interface UserDAO {
    List<User> getAllUsers();
    User getUserByID(int ID);
    void createUser(User user);
    void updateUser(int ID, User user);
    void deleteUser(int ID);
}
