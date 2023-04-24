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
public class FlightInfoTest {
    
    FlightInfo instance = new FlightInfo("ABP123", "India", "USA", "04/25/2023 12:23:00", "04/24/2023 12:23:00", 250);;
    
    public FlightInfoTest() {
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
     * Test of setflightNumber method, of class FlightInfo.
     */
    @Test
    public void testSetflightNumber() {
        System.out.println("setflightNumber");
        String flightNumber = "ABP123";
        instance = new FlightInfo("ABP123", "India", "USA", "04/25/2023 12:23:00", "04/24/2023 12:23:00", 250);

        instance.setflightNumber(flightNumber);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getflightNumber method, of class FlightInfo.
     */
    @Test
    public void testGetflightNumber() {
        System.out.println("getflightNumber");
        String expResult = "ABP123";
        String result = instance.getflightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getorigin method, of class FlightInfo.
     */
    @Test
    public void testGetorigin() {
        System.out.println("getorigin");
        String expResult = "India";
        String result = instance.getorigin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setorigin method, of class FlightInfo.
     */
    @Test
    public void testSetorigin() {
        System.out.println("setorigin");
        String origin = "India";
        instance.setorigin(origin);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDestination method, of class FlightInfo.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        String expResult = "USA";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDestination method, of class FlightInfo.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String destination = "USA";
        instance.setDestination(destination);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
