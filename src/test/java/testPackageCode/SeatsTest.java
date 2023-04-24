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
public class SeatsTest {
    
    public SeatsTest() {
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
     * Test of getNumPassengers method, of class Seats.
     */
    @Test
    public void testGetNumPassengers() {
        System.out.println("getNumPassengers");
        Seats instance = new Seats(250);
        int expResult = 10;
        instance.setnumPassengers(10);
        int result = instance.getNumPassengers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isFull method, of class Seats.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        Seats instance = new Seats(250);
        instance.setnumPassengers(250);
        boolean expResult = true;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of bookSeat method, of class Seats.
     */
    @Test
    public void testBookSeat() {
        System.out.println("bookSeat");
        Seats instance = new Seats(250);
        instance.bookSeat();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacity method, of class Seats.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Seats instance = new Seats(250);
        int expResult = 250;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacity method, of class Seats.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 0;
        Seats instance = new Seats(250);
        instance.setCapacity(capacity);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setnumPassengers method, of class Seats.
     */
    @Test
    public void testSetnumPassengers() {
        System.out.println("setnumPassengers");
        int numPassengers = 10;
        Seats instance = new Seats(250);
        instance.setnumPassengers(numPassengers);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
