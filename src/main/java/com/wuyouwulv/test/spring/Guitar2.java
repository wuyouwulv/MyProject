package com.wuyouwulv.test.spring;

import org.springframework.stereotype.Component;

@Component
public class Guitar2 implements Instrument {
	public Guitar2() {
	}
	public void play() {
		System.out.println("DING2 DING2 DING2");
	}
}
