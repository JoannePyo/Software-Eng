package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// more than 50% statement coverage of buggyMethod1 and fault.
public class BuggyClassTestBC2 {
    BuggyClass buggyclassTest;

    @Before
    public void setUP() {
        buggyclassTest = new BuggyClass();
    }

    @After
    public void tearDown() {
        buggyclassTest = null;
    }

    @Test
    public void buggyMethod2() {
        //b is 0. so if 0 % 2 = 0. expected output is 0 form 5/0. Error.
        assertEquals(0, buggyclassTest.buggyMethod2(5, 0));
    }
}
