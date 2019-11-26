package com.nare.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("c.xml");
		System.out.println(ac.getBean("eob"));
		

	}

}
