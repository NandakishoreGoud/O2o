package com.o2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	@RequestMapping("/home")
	public ModelAndView getEmployeeForm(){
		System.out.println("display home page");
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
}
