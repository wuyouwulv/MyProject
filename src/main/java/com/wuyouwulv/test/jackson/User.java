package com.wuyouwulv.test.jackson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {

	private int age = 22;
	private String name = "alex";
	private List<String> messages = new ArrayList<String>() {
		{
			add("msg 1");
			add("msg 2");
			add("msg 3");
		}
	};

	
	
	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", " +
				"messages=" + messages + "]";
	}

	//getter and setter methods
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
}
