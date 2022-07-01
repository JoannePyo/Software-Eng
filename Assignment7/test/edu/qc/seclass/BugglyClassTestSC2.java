package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// 100% statement coverage and no fault.
// But less than 100% statement coverage and no fault.
public class BugglyClassTestSC2 {
    BuggyClass buggyClassTest;

    @Before
    public void setUp(){
        buggyClassTest = new BuggyClass();
    }

    @After
    public void tearDown(){
        buggyClassTest = null;
    }

    @Test
    public void buggyMethod2(){
        // b is -1. b % 2 != 0. a is 10. expected output is -10 from 10/-1.
        assertEquals(-10,buggyClassTest.buggyMethod2(10,-1));
    }
}
