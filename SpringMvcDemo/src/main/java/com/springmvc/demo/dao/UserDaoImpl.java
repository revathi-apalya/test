package com.springmvc.demo.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.demo.model.Login;
import com.springmvc.demo.model.User;

@Service("userService")
@Transactional
public class UserDaoImpl implements UserDao {

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEmployee(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployeeBySsn(String ssn) {
		// TODO Auto-generated method stub
		
	}
  
  }
  
