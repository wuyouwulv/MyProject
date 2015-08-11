package com.wuyouwulv.test.spring;

public class Sonnet29 implements Poem {
	private static String[] LINES = {
			"床前明月光，",
			"疑似地上霜。",
			"举头望明月，",
			"低头思故乡。" };
	public Sonnet29() {
	}
	
	public void recite() {
		for(int i=0;i<LINES.length;i++) {
			System.out.println(LINES[i]);
		}
	}
}
