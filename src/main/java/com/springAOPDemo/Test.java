package com.springAOPDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		System.out.println(System.currentTimeMillis());
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		OperationService operationService = ctx.getBean("operationService", OperationService.class);

		System.out.println(operationService.getOperation().getName());

		operationService.getOperation().setName("Nisha");
		System.out.println(System.currentTimeMillis());
		operationService.getOperation().throwException();

		ctx.close();

		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); Operation e
		 * = (Operation) context.getBean("opBean");
		 * System.out.println("Main method called");
		 * 
		 * System.out.println("calling msg..."); e.msg();
		 * System.out.println("calling m..."); e.m();
		 * System.out.println("calling k..."); e.k();
		 */
	}

}
