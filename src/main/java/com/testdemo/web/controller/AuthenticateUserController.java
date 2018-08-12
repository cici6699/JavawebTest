package com.testdemo.web.controller;

import java.util.List;

import javax.annotation.Resource;  
import javax.servlet.http.HttpSession;  
import org.springframework.stereotype.Controller; 
import org.springframework.validation.BindingResult;  
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.testdemo.web.service.UserService;
import com.testdemo.web.vo.User;

@Controller
public class AuthenticateUserController {
	@Resource
	private UserService userService;

	/**
	 * 系统首页
	 * 教学内容：get 方式返回页面
	 * @return 返回系统首页
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getIndex() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	} 
	
	/**
	 * 登录系统
	 * 教学内容：post方式传输页面，页面参数转换，session用法
	 * @param username 用户名
	 * @param userpsw  用户密码
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST) 
	public ModelAndView login(
			@Validated @RequestParam("name") String username, 
			@Validated @RequestParam("psw") String userpsw,
			HttpSession session) {
		ModelAndView mav;  
		User user = userService.selectUserByNamePsw(username, userpsw);
		if (user == null) {
			mav = new ModelAndView("login");
			mav.addObject("error", "用户名或密码错误信息！");
		} else {
			session.setAttribute("currUser", user);
			mav = new ModelAndView("introduce");
		} 
		return mav;
	} 
	
	@RequestMapping(value = "/to_login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	@RequestMapping(value = "/logout")
	public ModelAndView logout(HttpSession session) {
		session.removeAttribute("currUser");
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public ModelAndView about() {
		ModelAndView mav = new ModelAndView("about");
		return mav;
	}

	@RequestMapping(value = "/introduce")
	public ModelAndView introduce() {
		ModelAndView mav = new ModelAndView("introduce");
		return mav;
	}

	@RequestMapping(value = "/to_reginster")
	public ModelAndView getReginster() {
		ModelAndView mav = new ModelAndView("reginsteruser");
		return mav;
	}

	@RequestMapping(value = "/reginster", method = RequestMethod.POST) 
	public ModelAndView reginster(@Validated User u, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> itemsErrorList = bindingResult.getAllErrors();
			ModelAndView mav = new ModelAndView("reginsteruser");
			mav.addObject("itemsErrorList", itemsErrorList);
			return mav;
		} else {
			userService.insertUser(u);
			ModelAndView mav = new ModelAndView("introduce");
			return mav;
		}

	}

}