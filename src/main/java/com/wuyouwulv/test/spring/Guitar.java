package com.wuyouwulv.test.spring;

@StringedInstrument
public class Guitar implements Instrument {
	public Guitar() {
	}
	public void play() {
		System.out.println("DING DING DING");
	}
}
