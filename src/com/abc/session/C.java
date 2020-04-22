package com.abc.session;

public abstract class C {
	private void m1() {
		System.out.println("C");
	}
	public static void main(String[] args) {
		C a1 = new D();
		a1.m1();
	}
}
class D extends C {
	private void m1() {
		System.out.println("D");

	}

}
