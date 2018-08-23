package com.testdemo.web.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.testdemo.web.service.StudentService;
import com.testdemo.web.vo.Student;

import junit.framework.Assert;
@ContextConfiguration(
		locations={"classpath:spring/application-mvc.xml",
				   "classpath:spring/application.xml",
				   "classpath:mybatis/mybatis-config.xml"
			})
@RunWith(SpringJUnit4ClassRunner.class) 
public class StudentControllerUnitTest {
	//单元测试
	
	@Mock
	StudentService service;
	
	@InjectMocks
	StudentController controller=new StudentController();
	
	
	private MockMvc mockMvc;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		this.mockMvc=MockMvcBuilders.standaloneSetup(controller).build();
	}

	@Test
	public void test() throws Exception {
		Student stu=new Student();
		stu.setUserId(90);
		stu.setUserName("lalalalalala");
		Mockito.when(service.findById(1)).thenReturn(stu);
		MockHttpServletRequestBuilder builder=MockMvcRequestBuilders.get("/student");
		builder.param("id","1");
		MvcResult result=mockMvc.perform(builder).andDo(print()).andExpect(status().isOk()).andReturn();
		Assert.assertEquals(result.getModelAndView().getViewName(), "studentj");
	}
}
