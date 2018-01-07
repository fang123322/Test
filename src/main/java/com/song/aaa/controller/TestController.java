package com.song.aaa.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.song.aaa.po.Student;
import com.song.aaa.po.Test;
import com.song.aaa.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private TestService testService;
	@RequestMapping("/list")
	public String list(HttpServletRequest request,Model model) {
		List<Test> list = testService.getAll();
		model.addAttribute("list", list); 
		return "testList";  
	}
}
