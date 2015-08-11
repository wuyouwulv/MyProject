package com.wuyouwulv.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Instrumentalisttest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/wuyouwulv/test/spring/instrumentalisttest.xml");
		Instrumentalist kenny = (Instrumentalist) ctx.getBean("kenny");
		kenny.perform();
		
		ctx = new ClassPathXmlApplicationContext(
				"com/wuyouwulv/test/spring/instrumentalisttest.xml");
		Instrumentalist kenny2 = (Instrumentalist) ctx.getBean("kenny2");
		kenny2.perform();
		
		ctx = new ClassPathXmlApplicationContext(
				"com/wuyouwulv/test/spring/instrumentalisttest.xml");
		Instrumentalist kenny3 = (Instrumentalist) ctx.getBean("kenny3");
		kenny3.perform();
		
		ctx = new ClassPathXmlApplicationContext(
				"com/wuyouwulv/test/spring/instrumentalisttest2.xml");
		Instrumentalist kenny4 = (Instrumentalist) ctx.getBean("kenny");
		kenny4.perform();
	}
}
