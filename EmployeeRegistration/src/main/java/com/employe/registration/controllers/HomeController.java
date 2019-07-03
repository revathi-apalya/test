package com.employe.registration.controllers;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.employe.registration.beans.Employee;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/empform")
	public ModelAndView home(Locale locale) {
		logger.info("Welcome to emp form! The client locale is {}.", locale);
		
		
		return new ModelAndView("empform","command",new Employee()) ;
	}
	   @RequestMapping(value="/save",method = RequestMethod.POST)  
	    public ModelAndView save(@ModelAttribute("emp") Employee emp){  
	        //write code to save emp object  
	        //here, we are displaying emp object to prove emp has data  
	        System.out.println(emp.getName()+" "+emp.getSalary()+" "+emp.getDesignation());  
	          
	        //return new ModelAndView("empform","command",emp);//will display object data  
	        return new ModelAndView("redirect:/viewemp");//will redirect to viewemp request mapping  
	    }  
	@RequestMapping("/viewform")
	public ModelAndView viewform() {
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1,"rahul",36979,"salesman"));
		list.add(new Employee(12,"shahul",369794,"accountant"));
		list.add(new Employee(18,"ramesh",369792,"po"));
		list.add(new Employee(16,"ravi",369796,"manager"));
		return new ModelAndView("viewemp","list",list);
		
	}
	
}
