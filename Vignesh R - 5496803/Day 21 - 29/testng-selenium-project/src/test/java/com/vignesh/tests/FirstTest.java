package com.vignesh.tests;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class FirstTest {

    @BeforeClass
    public void setUp() {
        System.out.println("Running before class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Running before each test method");
    }

    @Test
    public void testAddition() {
        int a = 5;
        int b = 3;
        int sum = a + b;
        assertEquals(sum, 8, "5 + 3 should be 8");
        System.out.println("testAddition executed");
    }

    @Test
    public void testString() {
        String str = "TestNG";
        assertTrue(str.contains("NG"));
        System.out.println("testString executed");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Running after each test method");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Running after class");
    }
}