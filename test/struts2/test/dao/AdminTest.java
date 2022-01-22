/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package struts2.test.dao;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import struts2.test.beans.User;

/**
 *
 * @author BeingJay
 */
public class AdminTest {
    
    public AdminTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of registerUser method, of class Admin.
     */
    @Test
    public void testRegisterUser() throws Exception {
        System.out.println("registerUser");
        String userName = "JAY";
        String password = "JAY";
        String firstName = "JAYDEEP";
        String lastName = "DAS";
        String email = "JDas@gmail.com";
        String phoneNumber = "9775088196";
        Admin instance = new Admin();
        int expResult = 0;
        int result = instance.registerUser(userName, password, firstName, lastName, email, phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of report method, of class Admin.
     */
    @Test
    public void testReport() throws Exception {
        System.out.println("report");
        Admin instance = new Admin();
        List expResult = null;
        List result = instance.report();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchUserDetails method, of class Admin.
     */
    @Test
    public void testFetchUserDetails() throws Exception {
        System.out.println("fetchUserDetails");
        String userName = "";
        Admin instance = new Admin();
        User expResult = null;
        User result = instance.fetchUserDetails(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUserDetails method, of class Admin.
     */
    @Test
    public void testUpdateUserDetails() throws Exception {
        System.out.println("updateUserDetails");
        String userName = "";
        String password = "";
        String firstName = "";
        String lastName = "";
        String email = "";
        String phoneNumber = "";
        Admin instance = new Admin();
        int expResult = 0;
        int result = instance.updateUserDetails(userName, password, firstName, lastName, email, phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUserDetails method, of class Admin.
     */
    @Test
    public void testDeleteUserDetails() throws Exception {
        System.out.println("deleteUserDetails");
        String userName = "";
        Admin instance = new Admin();
        int expResult = 0;
        int result = instance.deleteUserDetails(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProduct method, of class Admin.
     */
    @Test
    public void testAddProduct() throws Exception {
        System.out.println("addProduct");
        int productId = 0;
        String productName = "";
        String productMake = "";
        double price = 0.0;
        int availability = 0;
        Admin instance = new Admin();
        int expResult = 0;
        int result = instance.addProduct(productId, productName, productMake, price, availability);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showProduct method, of class Admin.
     */
    @Test
    public void testShowProduct() throws Exception {
        System.out.println("showProduct");
        Admin instance = new Admin();
        List expResult = null;
        List result = instance.showProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
