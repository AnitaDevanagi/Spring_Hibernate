package com.QACircle.Spring_hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.QACircle.Spring_hibernate.Test;

public class Tester {
	
	
        ApplicationContext  context  = new ClassPathXmlApplicationContext("applicationContext.xml");
		SessionFactory factory  = (SessionFactory) context.getBean("factory");
	    
	
	
	public void getAll() {
		Session session = factory.openSession();
		Test test = session.get(Test.class, 1);
		System.out.println(test);
	}
	
	 public void save(Test test) {
	  Session	session = factory.openSession();
	  Transaction  transaction  = session.beginTransaction();
	  session.save(test);
	  System.out.println("Data Saved");
	  transaction.commit();
	  session.close();
	 }
	 
	 public void delete(Test test) {
		Session session  = factory.openSession();
		Transaction transaction = session.beginTransaction();
	    session.delete(test);
		System.out.println("Data deleted");
		transaction.commit();
		session.close();
	 }
	 
	 public void update(String name,int id) {
		Session session  =factory.openSession();
		Test test= session.get(Test.class, id);
		Transaction transaction  =session.beginTransaction();
		 test.setName(name);
		System.out.println("data updated");
		transaction .commit();
		 
	 }
	   
	public static void main(String[] args) {
		//ApplicationContext  context  = new ClassPathXmlApplicationContext("applicationContext.xml");
		//SessionFactory factory  = (SessionFactory) context.getBean("factory");
		
		Tester tester = new Tester();
		tester.getAll();
		 
		
		Test test = new Test();
		
	    test.setId(10);
	    test.setName("prakash");
	    test.setAddress("Koppal");
	    test.setDeptno(95);
	    tester.save(test);
	    
	    test.setId(8);
	    tester.delete(test);
		
		tester.update("Madhu", 3);
	   
		
		
		
		
		 // LocalSessionFactoryBean sessionfactory=new LocalSessionFactoryBean();
		//sessionfactory.setAnnotatedClasses(null);
		
		
	}

}
