package com.test;

public class Out {
	private static int a=4;
	private int c=2;
	private class Inner{
		public Inner() {
			System.out.println(a);
			System.out.println(c);
			f();
		}
		
		
	}
	public Out() {
		Inner in=new Inner();
		System.out.println("这是外部类");
		
	}
	private  void f() {
		
	}
	public static void main(String[] args) {
		Out out=new Out();
		Inner in=out.new Inner();
		
	}

}
