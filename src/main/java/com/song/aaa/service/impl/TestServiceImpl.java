package com.song.aaa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.song.aaa.dao.TestDao;
import com.song.aaa.po.Test;
import com.song.aaa.service.TestService;
@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDao dao;
	@Override
	public List<Test> getAll() {
		return dao.getAll();
	}

}
