package com.song.aaa.service;

import java.util.List;

import com.song.aaa.po.Student;

public interface StuService {
	List<Student> getAll();
	void add(Student s);
	void update(Student s);
	void delete(int id);
}
