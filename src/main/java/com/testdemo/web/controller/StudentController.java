package com.testdemo.web.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.testdemo.web.service.StudentService;
import com.testdemo.web.vo.Student;

@Controller
public class StudentController {
	
	@Resource
	public StudentService service;
	
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public ModelAndView getStudent(int id)
	{
		Student student =service.findById(id);
		System.out.println(student.getUserAge());
		ModelAndView mav=new ModelAndView("studentj");
		mav.addObject("student", student);
		return mav;
	}
}
