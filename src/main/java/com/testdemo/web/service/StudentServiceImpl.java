package com.testdemo.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.testdemo.web.dao.StudentDao;
import com.testdemo.web.vo.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao dao;
	
	@Override
	public Student findById(int id) {
		Student student=dao.findById(id);
		student.setUserAge(8);
		return student;
	}

}
