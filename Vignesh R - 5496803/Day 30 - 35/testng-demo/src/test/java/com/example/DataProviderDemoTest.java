package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DataProviderDemoTest {
    private static final Logger log = LoggerFactory.getLogger(DataProviderDemoTest.class);

    @DataProvider(name = "test-data")
    public Object[][] provideData() {
        return new Object[][]{
                {1, 1, 2},
                {2, 3, 5},
                {5, 5, 10}
        };
    }

    @Test(dataProvider = "test-data")
    public void testAddition(int a, int b, int expected) {
        log.info("Testing {} + {} = {}", a, b, expected);
        assertEquals(a + b, expected);
    }
}