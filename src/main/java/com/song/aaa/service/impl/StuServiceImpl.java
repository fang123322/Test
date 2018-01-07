package com.song.aaa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.song.aaa.dao.StuDao;
import com.song.aaa.po.Student;
import com.song.aaa.service.StuService;
@Service
public class StuServiceImpl implements StuService {
	@Autowired
	private StuDao stuDao;
	
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return stuDao.getAll();
	}

	@Override
	public void add(Student s) {
		// TODO Auto-generated method stub
		stuDao.add(s);
	}

	@Override
	public void update(Student s) {
		// TODO Auto-generated method stub
		stuDao.update(s);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		stuDao.delete(id);
	}

}
