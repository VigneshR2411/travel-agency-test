package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterXMLTest {
    private static final Logger log = LoggerFactory.getLogger(ParameterXMLTest.class);

    @Parameters({"browser", "url"})
    @Test
    public void testOpenBrowser(String browser, String url) {
        log.info("Opening browser: {} with URL: {}", browser, url);
    }
}
