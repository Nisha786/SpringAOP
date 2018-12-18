package com.springAOPDemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class OperationAfterAspect {

	@After("args(name)")
	public void logStringArguments(String name) {
		System.out.println("Running After Advice. String argument passed=" + name);
	}

	@AfterThrowing("within(com.springAOPDemo.Operation)")
	public void logExceptions(JoinPoint joinPoint) {
		System.out.println("@AfterThrowing Exception thrown in Employee Method=" + joinPoint.toString());
	}

	@AfterReturning(pointcut = "execution(* getName())", returning = "returnString")
	public void getNameReturningAdvice(String returnString) {
		System.out.println("@AfterReturning getNameReturningAdvice executed. Returned String=" + returnString);
	}
}
