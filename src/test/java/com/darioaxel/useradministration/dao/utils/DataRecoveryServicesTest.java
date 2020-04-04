package com.darioaxel.useradministration.dao.utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.darioaxel.useradministration.dao.models.User;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

/**
 *
 * @author darioaxel
 */
public class DataRecoveryServicesTest {
    /**
     * Test of getUsers method, of class DataRecoveryServices.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        List<User> result = DataRecoveryServices.getUsers();
        
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }    
}
