package com.test;

public class Out1 {
	private static int a=5;
	private int p=7;
	static class Inner{
		private static int b=4;
		public Inner() {
			System.out.println("这是静态内部类的构造方法");
			System.out.println();
			f();
		}
		public static void g() {
			Out1 out=new Out1();
			System.out.println();
			out.f();
			f();
		}
	}
	public static void f() {}
	public Out1() {
		Inner in=new Inner();
		System.out.println("这是外部类的构造方法");
	}
	public static void main(String[] args) {
		Out1 out=new Out1();
		
	}
}
