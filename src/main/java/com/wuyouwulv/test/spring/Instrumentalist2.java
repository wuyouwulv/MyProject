package com.wuyouwulv.test.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Instrumentalist2 implements Performer {
	public Instrumentalist2() {
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
	
	@Value("Eruption")
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
	
	@Autowired
	//@Qualifier("piano")
	@StringedInstrument
	@Strummed
	private Instrument instrument;

//	public void setInstrument(Instrument instrument) {
//		this.instrument = instrument;
//	}
}
