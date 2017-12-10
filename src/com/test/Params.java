package com.test;

import java.util.HashMap;

public class Params {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Params.print("111", 2);
		HashMap<String,Object> hash=new HashMap<String,Object>();
		
		hash.put("111", "222");
	}
	public static void print(String str, String[] strings) {
		System.out.println("aaaa");

	}
	public static void print(String str, Integer... strings) {
		System.out.println("bbbb");

	}
}
