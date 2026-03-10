
package com.example;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static org.testng.Assert.*;

public class AssertionDemoTest {

    @Test
    public void testHardAssertions() {
        assertEquals(2 + 2, 4, "Math failed!");
        assertTrue("Hello".contains("ell"));
        assertNotNull(new Object());
        // If any assertion fails, the test stops here.
    }

    @Test
    public void testSoftAssertions() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(2 + 2, 5, "First assertion failed");
        softAssert.assertTrue(false, "Second assertion failed");
        softAssert.assertAll(); // Collects all failures; if any, test fails here.
    }
}