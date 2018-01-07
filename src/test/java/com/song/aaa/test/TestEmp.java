package com.song.aaa.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.song.aaa.dao.EmpMapper;
import com.song.aaa.po.Emp;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})  
public class TestEmp {
	 private static Logger logger = Logger.getLogger(TestEmp.class);  
	 	
	    @Autowired 
	    private EmpMapper dao;
	    @Test  
	    public void test1() {  
	    	Emp e = new Emp();
	    	e.setEname("房宏扬");
	    	dao.insert(e);
	    }  
}
