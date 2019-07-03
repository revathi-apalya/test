package com.springmvc.demo.dao;
import com.springmvc.demo.model.Login;
import com.springmvc.demo.model.User;

public interface UserDao {

		User findById(int id);
     
	    void saveEmployee(User user);
	      
	    void updateEmployee(User user);
	      
	    void deleteEmployeeBySsn(String ssn);
	  
	   
}
