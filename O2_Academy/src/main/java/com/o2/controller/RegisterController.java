package com.o2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.o2.dao.RegistrationDao;
import com.o2.model.UserInfo;


@Controller
public class RegisterController {
	
	@Autowired
	RegistrationDao registrationDao;

	@RequestMapping("/registration_form")
	public ModelAndView showRegistrationForm(){
		System.out.println("display Registration page");
		ModelAndView mv = new ModelAndView("register");
		mv.addObject("userInfo", new UserInfo());
		return mv;
	}
	@RequestMapping("/register")
	public void showNext(@ModelAttribute UserInfo userinfo) {
		registrationDao.saveRegistrationData(userinfo);
		System.out.println("Successfuly Saved");
	}
}

