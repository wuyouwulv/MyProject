package com.wuyouwulv.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpELStudyTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/wuyouwulv/test/spring/spelstudytest.xml");
		SpELStudy sample = (SpELStudy) ctx.getBean("spelstudy");
		System.out.println(sample.count);
		System.out.println(sample.message);
		System.out.println(sample.capacity);
		System.out.println(sample.capacity2);
		System.out.println(sample.name);
		System.out.println(sample.enabled);
	}
}
