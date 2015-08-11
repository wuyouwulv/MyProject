package com.wuyouwulv.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByNameTest {
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/wuyouwulv/test/spring/bynametest.xml");
		Performer performer = (Performer) ctx.getBean("kenny");
		performer.perform();
	}
}
