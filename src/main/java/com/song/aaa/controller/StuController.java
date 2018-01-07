package com.song.aaa.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.song.aaa.po.Student;
import com.song.aaa.service.StuService;

@Controller
@RequestMapping("/stu")
public class StuController {
	@Autowired
	private StuService stuService;
	@RequestMapping("/list")
	public String list(HttpServletRequest request,Model model) {
		List<Student> list = stuService.getAll();
		model.addAttribute("list", list); 
		return "aaa";  
	}
	@RequestMapping("/add")
	public String add(Student s,HttpServletRequest request,HttpServletResponse resp ,Model model) {
		System.out.println(s.getName());
		List<Student> list = stuService.getAll();
		model.addAttribute("list", list); 
		return "aaa";  
	}
}
