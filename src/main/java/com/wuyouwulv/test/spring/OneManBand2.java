package com.wuyouwulv.test.spring;

import java.util.Collection;
import java.util.Map;

public class OneManBand2 implements Performer {
	public OneManBand2() {
	}
	
	public void perform() {
		for(String key : instruments.keySet()) {
			System.out.print(key + " : ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}
	
	private Map<String, Instrument> instruments;
	
	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}
}

