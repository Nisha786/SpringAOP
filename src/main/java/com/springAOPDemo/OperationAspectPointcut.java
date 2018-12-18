package com.springAOPDemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class OperationAspectPointcut {

	@Before("getNamePointcut()")
	public void loggingAdvice() {
		System.out.println("@before( getNamePointcut)");
	}

	@Before("getNamePointcut()")
	public void secondAdvice() {
		System.out.println("@Before(getNamePointcut())");
	}

	@Pointcut("execution(public String getName())")
	public void getNamePointcut() {
	}

	@Before("allMethodsPointcut()")
	public void allServiceMethodsAdvice() {
		System.out.println("Before allMethodsPointcut()");
	}

	// Pointcut to execute on all the methods of classes in a package
	@Pointcut("within(com.springAOPDemo.*)")
	public void allMethodsPointcut() {
	}
}
