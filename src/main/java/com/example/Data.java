package com.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Data {
	private String name;
	private int age;
	private String telNo;
	
	public Data(String name, int age, String telNo) {
		super();
		this.name = name;
		this.age = age;
		this.telNo = telNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
}
