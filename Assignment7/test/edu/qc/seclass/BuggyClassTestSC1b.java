package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// less than 50% statement coverage of buggyMethod1 and reveals the fault.
// But This test does more than 50% branch coverage and fault.

public class BuggyClassTestSC1b {
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
    public void buggyMethod1_1(){
        //x is 4 and y is 0. expected output is 0. Error.
        assertEquals(0, buggyClassTest.buggyMethod1(4,0));
    }
}
