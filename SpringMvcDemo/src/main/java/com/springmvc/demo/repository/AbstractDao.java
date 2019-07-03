package com.springmvc.demo.repository;

import java.lang.reflect.ParameterizedType;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractDao {

	private final Class persistentClass;
	@SuppressWarnings("unchecked")
    public AbstractDao(){       
        this.persistentClass =(Class) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }
      
    @Autowired
    private SessionFactory sessionFactory;
  
    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }
  
        
    protected Criteria createEntityCriteria(){
        return getSession().createCriteria(persistentClass);
    }
}
