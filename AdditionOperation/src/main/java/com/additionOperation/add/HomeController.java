package com.additionOperation.add;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.additionOperation.beans.AddService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	 @RequestMapping(value = "/")
	 public String index(Locale locale)
	 { logger.info("Welcome index! The client locale is {}.", locale);
	 
	 
	 return "index"; }
	 
	@RequestMapping(value ="/add", method = RequestMethod.GET)
	public ModelAndView add(@RequestParam int i,@RequestParam int j ) {
		
		/*
		 * int i=Integer.parseInt(request.getParameter("t1")); int
		 * j=Integer.parseInt(request.getParameter("t2"));
		 */
		AddService ac =new AddService();
		int k=ac.add(i, j);
		ModelAndView mv= new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result:"+k);
		return null;
		
	}
	
}
