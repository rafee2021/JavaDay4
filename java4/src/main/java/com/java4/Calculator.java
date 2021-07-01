package com.java4;

public class Calculator {
	
	public int add(int x, int y) {
		System.out.println("Addition: " + Math.addExact(x, y));
		return Math.addExact(x, y);
	}
	
	public int subtract(int x, int y) {
		System.out.println("Subtraction: " + Math.subtractExact(x, y));
		return Math.subtractExact(x, y);
	}
	
	public int multiply(int x, int y) {
		System.out.println("Multiplication: " + Math.multiplyExact(x, y));
		return Math.multiplyExact(x, y);
	}
	
	public int divide(int x, int y) {
		System.out.println("Division: " + Math.floorDiv(x, y));
		return Math.floorDiv(x, y);
	}
	
	public int absAdd(int x, int y) {
		int a = add(x, y);
		System.out.println("Absolute Addition: " + Math.abs(a));
		return Math.abs(a);
	}
	
	public int absSubtract(int x, int y) {
		int a = subtract(x, y);
		System.out.println("Absolute Subtraction: " + Math.abs(a));
		return Math.abs(a);
	}
	
	
	
	
	
	
}
