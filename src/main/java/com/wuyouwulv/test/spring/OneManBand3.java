package com.wuyouwulv.test.spring;

import java.util.Properties;

public class OneManBand3 implements Performer {
	public OneManBand3() {
	}
	public void perform() {
		System.out.println(instruments.toString());
	}
	private Properties instruments;
	public void setInstruments(Properties instruments) {
		this.instruments = instruments;
	}
}
