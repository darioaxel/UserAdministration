/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darioaxel.useradministration.dao.impl;

import com.darioaxel.useradministration.dao.IUserDAO;
import com.darioaxel.useradministration.dao.models.User;
import com.darioaxel.useradministration.dao.utils.DataRecoveryServices;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author darioaxel
 */
public class UserDAOImpl implements IUserDAO {

    private ArrayList<User> getAllUsersAsArrayList() {
         ArrayList<User> converted = new ArrayList<User>();
         converted.addAll(DataRecoveryServices.getUsers());
         return converted;
    }
    
    @Override
    public List<User> getAllUsers() {
        return DataRecoveryServices.getUsers();
    }

    @Override
    public User getUserByID(int ID) {        
        return getAllUsersAsArrayList().stream().filter(f -> f.getID() == ID).findFirst().orElse(null);
    }

    @Override
    public void createUser(User user) {
       var searchedUser = getUserByID(user.getID());
       if (searchedUser == null) {
           ArrayList<User> newUsers = getAllUsersAsArrayList();
           newUsers.add(user);
           DataRecoveryServices.saveUsers(newUsers);
       }
       else {
           //throw duplicated user
       }
    }

    @Override
    public void updateUser(int ID, User user) {
        ArrayList<User> converted = new ArrayList<User>();
         converted.addAll(DataRecoveryServices.getUsers());
         var searchedUser = converted.stream().filter(f -> f.getID() == user.getID()).findFirst().orElse(null);
        
        if (searchedUser != null) {
           ArrayList<User> newUsers = getAllUsersAsArrayList();
           if (!searchedUser.getEmail().equals(user.getEmail())) {
               searchedUser.setEmail(user.getEmail());
           }
           if (!searchedUser.getEmail().equals(user.getEmail())) {
               searchedUser.setEmail(user.getEmail());
           }
           if (!searchedUser.getName().equals(user.getName())) {
               searchedUser.setName(user.getName());
           }
           if (!searchedUser.getSurname().equals(user.getSurname())) {
               searchedUser.setSurname(user.getSurname());
           }
           DataRecoveryServices.saveUsers(newUsers);
       }
       else {
           //throw not found user
       }
    }

    @Override
    public void deleteUser(int ID) {
       var searchedUser = getUserByID(ID);
       if (searchedUser != null) {
           ArrayList<User> newUsers = getAllUsersAsArrayList();
           newUsers.remove(searchedUser);
           DataRecoveryServices.saveUsers(newUsers);
       }
       else {
           //throw not found user
       }
    }
    
}
