package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class ParallelDemoTest {
    private static final Logger log = LoggerFactory.getLogger(ParallelDemoTest.class);

    @Test
    public void testMethod1() throws InterruptedException {
        log.info("Method1 started on thread: {}", Thread.currentThread().getId());
        Thread.sleep(2000);
        log.info("Method1 finished");
    }

    @Test
    public void testMethod2() throws InterruptedException {
        log.info("Method2 started on thread: {}", Thread.currentThread().getId());
        Thread.sleep(2000);
        log.info("Method2 finished");
    }
}
