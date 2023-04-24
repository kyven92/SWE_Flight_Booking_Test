/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package testPackageCode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author venky
 */
public class UserAuthenticationTest {
    
    UserAuthentication instance = new UserAuthentication("abc123", "Alpha", "abc@bcd.com", "+123456774", "kjbdbk");;
    
    public UserAuthenticationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of get_userEmail method, of class UserAuthentication.
     */
    @Test
    public void testGet_userEmail() {
        System.out.println("get_userEmail");
        String expResult = "abc@bcd.com";
        String result = instance.get_userEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of set_userEmail method, of class UserAuthentication.
     */
    @Test
    public void testSet_userEmail() {
        System.out.println("set_userEmail");
        String userEmail = "abc@bcd.com";
        instance.set_userEmail(userEmail);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of set_userPhone method, of class UserAuthentication.
     */
    @Test
    public void testSet_userPhone() {
        System.out.println("set_userPhone");
        String userPhone = "+123456774";
        instance.set_userPhone(userPhone);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of set_userPassword method, of class UserAuthentication.
     */
    @Test
    public void testSet_userPassword() {
        System.out.println("set_userPassword");
        String userPassword = "asdAD12@";
        instance.set_userPassword(userPassword);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validate method, of class UserAuthentication.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        String attemptuserID = "";
        String attemptuserPassword = "";
        boolean expResult = false;
        boolean result = instance.validate(attemptuserID, attemptuserPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
