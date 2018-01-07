package com.song.aaa.dao;

import java.util.List;

import com.song.aaa.po.Student;

public interface StuDao {
	List<Student> getAll();
	void add(Student s);
	void update(Student s);
	void delete(int id);
}
