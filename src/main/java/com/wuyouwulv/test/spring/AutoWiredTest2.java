package com.wuyouwulv.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiredTest2 {
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/wuyouwulv/test/spring/autowiredtest2.xml");
		Performer performer = (Performer) ctx.getBean("kenny");
		performer.perform();
	}
}
