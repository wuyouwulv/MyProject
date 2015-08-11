package com.wuyouwulv.test.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer {
	public Instrumentalist() {
	}
	
	public void perform() {
		System.out.println("Playing " + song + " : ");
		instrument.play();
	}
	
	public void perform(String song, Instrument instrument) {
		this.song = song;
		this.instrument = instrument;
		System.out.println("Playing " + song + " : ");
		instrument.play();
	}
	
	
	private String song;


	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}
	
	public String screamSong() {
		return song;
	}
	
	private Instrument instrument;

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
}
