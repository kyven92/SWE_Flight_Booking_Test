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
public class PaymentTest {
    
    public PaymentTest() {
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
     * Test of setPaymentId method, of class Payment.
     */
    @Test
    public void testSetPaymentId() {
        System.out.println("setPaymentId");
        String paymentId = "";
        Payment instance = new Payment();
        boolean expResult = false;
        boolean result = instance.setPaymentId(paymentId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaymentId method, of class Payment.
     */
    @Test
    public void testGetPaymentId() {
        System.out.println("getPaymentId");
        Payment instance = new Payment();
        String expResult = "";
        String result = instance.getPaymentId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTicketId method, of class Payment.
     */
    @Test
    public void testSetTicketId() {
        System.out.println("setTicketId");
        String ticketId = "";
        Payment instance = new Payment();
        boolean expResult = false;
        boolean result = instance.setTicketId(ticketId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTicketId method, of class Payment.
     */
    @Test
    public void testGetTicketId() {
        System.out.println("getTicketId");
        Payment instance = new Payment();
        String expResult = "";
        String result = instance.getTicketId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Payment.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Payment instance = new Payment();
        boolean expResult = false;
        boolean result = instance.setStatus(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Payment.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Payment instance = new Payment();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
