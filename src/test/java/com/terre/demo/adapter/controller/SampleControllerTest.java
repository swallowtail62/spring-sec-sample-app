package com.terre.demo.adapter.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SampleControllerTest {

    @Autowired
    SampleController sampleController;

    @Test
    void test() {
        assertEquals("Hello, world", sampleController.testMethod());
    }

}
