package com.springAOPDemo;

public class Operation {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void throwException() {
		throw new RuntimeException("Dummy Exception");
	}

	/*
	 * public void msg() { System.out.println("msg method invoked"); }
	 * 
	 * public int m() { System.out.println("m method invoked"); return 2; }
	 * 
	 * public int k() { System.out.println("k method invoked"); return 3; }
	 */
}
