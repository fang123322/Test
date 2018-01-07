package com.song.aaa.po;

public class Student {
	private Integer id;
	private String name;
	private Integer age;
	public Student(String string, Integer i) {
		// TODO Auto-generated constructor stub
		name=string;
		age=i;
	}
	
	public Student() {
		super();
	}

	public Student(int i, String string, int j) {
		// TODO Auto-generated constructor stub
		this(string,j);
		id=i;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
