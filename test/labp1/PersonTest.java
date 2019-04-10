/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labp1;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fu yuanqing
 */
public class PersonTest {
    
    public PersonTest() {
    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Fu";
        Person instance = new Person("Fu",3);
        instance.setName(name);
        Assert.assertEquals(name,instance.getName());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Person.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 3;
        Person instance = new Person("Fu",3);;
        instance.setAge(age);
        Assert.assertEquals(age,instance.getAge());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Person instance = new Person("Fu",3);
        String expResult = "Fu";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Person.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Person instance = new Person("Fu",3);
        int expResult = 3;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of reverseName method, of class Person.
     */
    @Test
    public void testReverseName() {
        System.out.println("reverseName");
        Person instance = new Person("Fu",3);
        String expResult = "uF";
        String result = instance.reverseName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
