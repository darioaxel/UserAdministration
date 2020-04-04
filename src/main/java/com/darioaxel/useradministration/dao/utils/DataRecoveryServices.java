/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darioaxel.useradministration.dao.utils;

import com.darioaxel.useradministration.dao.models.User;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author darioaxel
 */
public class DataRecoveryServices {
    
    private static Path getLocalMockData() {
        return Paths.get(System.getProperty("user.dir"), "utils", "users.json");
    }

    public static List<User> getUsers() {
           
        Gson gson = new Gson();
        User[] users;
        try {
            users = gson.fromJson(new FileReader(getLocalMockData().toString()), User[].class);            

        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found!!");
            return null;
        }
        return Arrays.asList(users);
        //System.out.println(gson.toJson(myTypes));
    }

    public static void saveUsers(List<User> allUsers) {        
        Gson gson = new Gson();
        String usersJson = gson.toJson(allUsers.toArray());
        try (FileWriter fileWriter = new FileWriter(getLocalMockData().toString())) {
           fileWriter.write(usersJson);
        }catch (IOException fnfe) {
            System.out.println("File not found!!");            
        }
    }
}
