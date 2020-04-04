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
public class User {
    private final int ID;
    protected String username;
    protected String name;
    protected String surname;
    protected String password;
    protected String email;
            
    public User(int ID, String username) {
        this.ID = ID;
        this.username = username;        
    }
    public int getID() {
        return ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
      
    public String ToString() {
        return ID + " - " + 
               username + " - " +
               surname + "," + name + " - " +
               email;
    }
}
