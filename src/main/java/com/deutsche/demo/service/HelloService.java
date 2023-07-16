package com.deutsche.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public int addNums(int i, int j) {
		return i + j;
	}

}
