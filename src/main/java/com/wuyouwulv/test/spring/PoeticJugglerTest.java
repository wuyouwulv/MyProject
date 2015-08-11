package com.wuyouwulv.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PoeticJugglerTest {
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/wuyouwulv/test/spring/poeticjugglertest.xml");
		Performer poeticDuke = (PoeticJuggler) ctx.getBean("poeticDuke");
		poeticDuke.perform();
		
		ctx = new ClassPathXmlApplicationContext(
				"com/wuyouwulv/test/spring/poeticjugglertest2.xml");
		poeticDuke = (PoeticJuggler) ctx.getBean("poeticDuke2");
		poeticDuke.perform();
	}
}
