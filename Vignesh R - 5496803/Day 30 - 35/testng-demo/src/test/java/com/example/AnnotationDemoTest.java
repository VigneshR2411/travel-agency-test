package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

public class AnnotationDemoTest {
    private static final Logger log = LoggerFactory.getLogger(AnnotationDemoTest.class);

    @BeforeSuite
    public void beforeSuite() {
        log.info("Before Suite – runs once before all tests in suite");
    }

    @AfterSuite
    public void afterSuite() {
        log.info("After Suite – runs once after all tests in suite");
    }

    @BeforeTest
    public void beforeTest() {
        log.info("Before Test – runs before any <test> tag in testng.xml");
    }

    @AfterTest
    public void afterTest() {
        log.info("After Test – runs after all methods in <test> tag");
    }

    @BeforeClass
    public void beforeClass() {
        log.info("Before Class – runs once before first method of this class");
    }

    @AfterClass
    public void afterClass() {
        log.info("After Class – runs once after all methods of this class");
    }

    @BeforeMethod
    public void beforeMethod() {
        log.info("Before Method – runs before each @Test method");
    }

    @AfterMethod
    public void afterMethod() {
        log.info("After Method – runs after each @Test method");
    }

    @Test
    public void testOne() {
        log.info("Test One executed");
    }

    @Test
    public void testTwo() {
        log.info("Test Two executed");
    }
}