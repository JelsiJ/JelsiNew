package com.deef;

public class Practise {
	 static String name = "jelsi";
	public static void msg() {
		
		System.out.println(name);
	}
public static void msg(int a) {
	System.out.println(a);


}


public static void main(String[] args) {
	Practise p = new Practise();
	p.msg(100);
	p.msg();
}}
