/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darioaxel.useradministration.dao.models;

/**
 *
 * @author darioaxel
 */
public class UserFactory {
    public static User build(int ID, String username) {        
       return new User(ID,username);
    }
    public static User build(int ID, String username, String name, String surname, String password, String email) {
        var user = build(ID, username);
        user.setUsername(username);
        user.setName(name);
        user.setSurname(surname);
        user.setPassword(password);
        user.setEmail(email);
        
        return user;
    }
}
