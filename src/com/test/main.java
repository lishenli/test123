package com.test;

import java.util.concurrent.ConcurrentHashMap;

class A {
  public String run(D obj){
	  return ("A & D");
  }
  public String run(A obj) {
	  return ("A & A");
  }
}
     
class B extends A {
	public String run(B obj) {
		return ("B & B");
	}
	public String run(A obj) {
		return ("B & A");
	}
}
class C extends B{} 
class D extends B {}
public class main {
	public static void main(String[] args){
		A aa = new A();
		A ab= new B();
		B b=new B();
		C c =new C();
		D d=new D();
		System.out.println(aa.run(b));
		System.out.println(aa.run(c));
		System.out.println(aa.run(d));
		System.out.println();
		System.out.println(ab.run(b));
		System.out.println(ab.run(c));
		System.out.println(ab.run(d));
		System.out.println();
		System.out.println(b.run(b));
		System.out.println(b.run(c));
		System.out.println(b.run(d));
		
		String name="1111efefd";
		name.replace("e", "E");
		System.out.println(name);
		
		
		int i=0;
		for(;++i<=2;i++){
			System.out.println(i);
		}
		System.out.println(i);
		
		
		String str="abc";
		String str1="a";
		String str2="bc";
		System.out.println(str==str1+str2);
		
		System.out.println(test());
		//Singleton singleton = new Singleton();
		//between 20 and 30  X>=20and X<30
		//len(字段) sql里计算字符串的长度
		// like '里%'
		//$("input[name='id']") $("input[name='id']")
		//request.getContextPath() request.getRealPath
		ConcurrentHashMap map=new ConcurrentHashMap();
	}
	
	static int test(){
		int a=0;
		try{
			return test1();
			
		}catch(Exception ce){
			
		} finally{
			return test2();
		}
	}
	
	static int test1(){
		System.out.println("12345");
		return 1;
	}
	static int test2(){
		System.out.println("2222");
		return 2;
	}
}
