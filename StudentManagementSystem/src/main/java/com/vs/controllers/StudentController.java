package com.vs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vs.dto.StudentDTO;
import com.vs.service.IStudentService;

@Controller
public class StudentController {
	@Autowired
	private IStudentService IStudentServiceImpl;
	
	@RequestMapping("/home")
	public String showHomePage(Model m)
	{
		List<StudentDTO> studentList=IStudentServiceImpl.selectStudentList();
		System.out.println("--------In Controller Class "+studentList);
		m.addAttribute("students",studentList);
		return "home-page";
	}
}
