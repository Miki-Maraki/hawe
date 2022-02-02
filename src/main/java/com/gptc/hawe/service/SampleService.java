package com.gptc.hawe.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int comOper(int a, int b) {
		int c = add(a, b);
		int d = sub(a, b);
		int y = c * d;
		return y;
	}
}
