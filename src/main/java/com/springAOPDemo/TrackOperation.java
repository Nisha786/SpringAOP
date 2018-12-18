package com.springAOPDemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	@Before("execution(public String getName())")
	public void getNameAdvice() {
		System.out.println("Executing Advice on getName()");
	}

	@Before("execution(* com.springAOPDemo.*.get*())")
	public void getAllAdvice() {
		System.out.println("Service method getter called");
	}
	
	
	
	

	/*
	 * @Pointcut("execution(* Operation.*(..))") public void k() {
	 * System.out.println(System.currentTimeMillis());
	 * System.out.println("inside void k()"); } // pointcut name
	 * 
	 * @Before("k()") // applying pointcut on before advice public void
	 * myadvice(JoinPoint jp) // it is advice (before advice) {
	 * System.out.println(System.currentTimeMillis());
	 * System.out.println("additional concern"); //
	 * System.out.println("Method Signature: " + jp.getSignature());
	 * System.out.println(System.currentTimeMillis()); }
	 */
}
