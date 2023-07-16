package com.deutsche.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	Logger LOG = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/hello")
	public String hello() {
		LOG.info("hello");
		return "Hello world!";
	}

	@GetMapping("/hi")
	public String hi() {
		LOG.info("hi");
		return "How are you?";
	}
}
