package com.QACircle.Spring_hibernate.dao;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testerdao {
	ApplicationContext  context  = new ClassPathXmlApplicationContext("applicationContext.xml");
	SessionFactory factory  = (SessionFactory) context.getBean("factory");
	     

}
