package com.test;

public class Singleton {
	private Singleton(){
        
    }
	//������ʽ
	//private static Singleton instance=null;
    
    
//    public static synchronized Singleton getInstance(){
//        if(instance==null){
//        	synchronized (Singleton.class) {
//				if (instance==null) {
//					instance=new Singleton();
//				}
//			}
//        }
//        return instance;
//    }
    
    //����ʽ
	private static Singleton instance=new Singleton();
    
	  public static Singleton getInstance(){
	      
	      return instance;
	  }
}
