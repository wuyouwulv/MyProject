package com.wuyouwulv.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OneManBandTest {
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/wuyouwulv/test/spring/onemanbandtest.xml");
		Performer hank = (Performer) ctx.getBean("hank");
		hank.perform();
		
		ctx = new ClassPathXmlApplicationContext(
				"com/wuyouwulv/test/spring/onemanbandtest.xml");
		Performer hank2 = (Performer) ctx.getBean("hank2");
		hank2.perform();
	}
}
