package com.abc.session;

public abstract class A {

	private void m1() {
		System.out.println("A");

	}

	public static void main(String[] args) {

		A b = new B();
		b.m1();

	}
}

class B extends A {
	protected void m1() {
		System.out.println("B");
	}
}