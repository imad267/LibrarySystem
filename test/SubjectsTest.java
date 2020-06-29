/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author imad9
 */
public class SubjectsTest {
    
    public SubjectsTest() {
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
     * Test of set_ID method, of class Subjects.
     */
    @Test
    public void testSet_ID() {
        System.out.println("set_ID");
        Subjects instance = new SubjectsImpl();
        int expResult = 0;
        int result = instance.set_ID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Create method, of class Subjects.
     */
    @Test
    public void testCreate() {
        System.out.println("Create");
        Subjects instance = new SubjectsImpl();
        instance.Create();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Delete method, of class Subjects.
     */
    @Test
    public void testDelete() {
        System.out.println("Delete");
        Subjects instance = new SubjectsImpl();
        instance.Delete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Update method, of class Subjects.
     */
    @Test
    public void testUpdate() {
        System.out.println("Update");
        Subjects instance = new SubjectsImpl();
        instance.Update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Issue method, of class Subjects.
     */
    @Test
    public void testIssue() {
        System.out.println("Issue");
        Subjects instance = new SubjectsImpl();
        instance.Issue();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Return method, of class Subjects.
     */
    @Test
    public void testReturn() {
        System.out.println("Return");
        Subjects instance = new SubjectsImpl();
        instance.Return();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class SubjectsImpl extends Subjects {

        public void Create() {
        }

        public void Delete() {
        }
    }
    
}
