package com.mavendemo.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddController {
	@RequestMapping(value ="add",method = RequestMethod.GET)
public String add(HttpServletRequest request) {
		
String s=request.getParameter("first number");
String e=request.getParameter("second number");
	return ;
}
	
	
	
}
