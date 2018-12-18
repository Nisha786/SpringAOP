package com.springAOPDemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class OperationAroundAspect {

	@Around("execution(* com.springAOPDemo.Operation.getName())")
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("@Around execution");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After invoking getName() method. Return value=" + value);
		return value;
	}
}
