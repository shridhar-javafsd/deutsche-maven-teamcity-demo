package com.lti.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.deutsche.demo.controller.HelloController;

@SpringBootTest(classes = com.lti.demo.AppTests.class)
class AppTests {

//	@Autowired
//	HelloController helloController;

	@Test
	public void testHello() { // positive test case
		String expected = "Hello world!";
		String actual = new HelloController().hello();
		assertEquals(expected, actual);
	}

	@Test
	public void testHello2() { // negative test case
		String unexpected = "Hello galaxy!";
		String actual = new HelloController().hello();
		assertNotEquals(unexpected, actual);
	}
}
