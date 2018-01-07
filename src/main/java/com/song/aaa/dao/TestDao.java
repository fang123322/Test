package com.song.aaa.dao;

import java.util.List;

import com.song.aaa.po.Test;

public interface TestDao {
	public Test getUser(Integer id);
	public List<Test> getAll();
}
