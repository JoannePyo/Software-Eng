package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// 100% statement coverage of buggyMethod1 and no fault.
// But this test does less than 100% coverage and no fault.

public class BuggyClassTestSC1a {
    BuggyClass bugglyClassTest;

    @Before
    public void setup(){
        bugglyClassTest = new BuggyClass();
    }

    @After
    public void tearDown(){
        bugglyClassTest = null;
    }

    @Test
    public void buggyMethodTest1() {
        //x is 9 and y is 3. The expected output is 3 form 9/3.
        assertEquals(3, bugglyClassTest.buggyMethod1(9, 3));
    }
}
