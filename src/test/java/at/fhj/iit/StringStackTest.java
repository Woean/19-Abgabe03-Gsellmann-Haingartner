package at.fhj.iit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StringStackTest
{
    public Stack s;
    
    @Before
    public void setup() throws Exception
    {
        s = new StringStack(5); // keep size of 5 !!
    }
    
    /**
     * tests if stack is empty after initialization
     * 
     * use assert
     * - assertTrue to check it's empty
     */
    @Test
    public void testIsEmpty() throws Exception
    {
        Assert.assertTrue(s.isEmpty());
    }
    
    /**
     * tests if stack is empty after pushing
     * 
     * use assert
     * - assertFalse to check it's not empty
     */
    @Test
    public void testIsNotEmpty() throws Exception {


        s.push("Joda");
        assertFalse(s.isEmpty());
    }

    /**
     * tests push and pop function
     * 
     * do following test
     * - use push, 1 or x times
     * - use pull, as often as you use push
     * - use isEmpty to check that's empty again
     * - assert every content of the stack in the correct ordering
     * @throws Exception 
     */
    @Test
    public void testPushPop() throws Exception
    {
        s.push("This");
        s.push("is");
        s.push("the");
        s.push("top");

        assertEquals("top", s.pop());
        assertEquals("the", s.pop());
        assertEquals("is", s.pop());
        assertEquals("This", s.pop());

        assertTrue(s.isEmpty());
    }
    
    /**
     * Feel Free to insert other test cases for the String Stack Implementation !!!
     */
    @Test
    public void testEmptyPush() throws Exception {
        s.push("");
        s.push("");
        assertFalse(s.isEmpty());
    }

    /*
    tests if the right exception comes if you try to pop on an empty stack
     */
    @Test(expected=java.lang.IllegalStateException.class)
    public void testElement() throws Exception{
        s.pop();
    }


}
