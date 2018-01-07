package com.song.aaa.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.song.aaa.po.Student;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s = (Student)ac.getBean("s");
		Student s1 = (Student)ac.getBean("s");
		System.out.println(s);
		System.out.println(s1);
	}
}
