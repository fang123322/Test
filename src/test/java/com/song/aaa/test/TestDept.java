package com.song.aaa.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.song.aaa.dao.DeptMapper;
import com.song.aaa.po.Dept;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})  
public class TestDept {
	 private static Logger logger = Logger.getLogger(TestDept.class);  
	 	
	    @Autowired 
	    private DeptMapper dao;
	    @Test  
	    public void test1() {  
	    	List<Dept> list = dao.selectAll();
	    	
	    }  
}
