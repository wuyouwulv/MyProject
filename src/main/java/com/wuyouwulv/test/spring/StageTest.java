package com.wuyouwulv.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StageTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/wuyouwulv/test/spring/stagetest.xml");
		Stage stage = (Stage) ctx.getBean("theStage");
	}
}
