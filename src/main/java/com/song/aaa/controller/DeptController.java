package com.song.aaa.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.song.aaa.dao.DeptMapper;
import com.song.aaa.po.Dept;

@Controller
//拦截路径  工程名/dept/add
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	private DeptMapper dao;
	@RequestMapping("/add")
	public String add(Dept dept,HttpServletRequest request,HttpServletResponse resp ,Model model) {
		dao.insert(dept);
		return "index";  
	}
	@RequestMapping("/list")
	public String list(HttpServletRequest request,HttpServletResponse resp ,Model model) {
		List<Dept> list = dao.selectAll();
		request.setAttribute("list", list);
		return "dept/list";  
	}
	
}
