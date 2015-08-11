package com.wuyouwulv.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class JugglerTest {
	public static void main(String[] args) throws PerformanceException  {
//		ApplicationContext ctx = new FileSystemXmlApplicationContext(
//				"D:/MyProject/src/main/java/com/wuyouwulv/test/spring/jugglertest.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/wuyouwulv/test/spring/jugglertest.xml");
		Performer performer = (Performer)ctx.getBean("duke");
		performer.perform();
		
		ctx = new ClassPathXmlApplicationContext(
				"com/wuyouwulv/test/spring/jugglertest2.xml");
		performer = (Performer)ctx.getBean("duke");
		performer.perform();
	}
}
