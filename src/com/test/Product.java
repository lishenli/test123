package com.test;

import java.util.List;

public class Product implements Runnable {

	private List container = null;
	private int count;

	public Product(List lst) {
		this.container = lst;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (true) {    
			   synchronized (container) {    
			    if (container.size() > MultiThread.MAX) {    
			     try {    
			      container.wait();  
			     } catch (InterruptedException e) {    
			      e.printStackTrace();    
			     }    
			    }    
			    try {    
			     Thread.sleep(100);    
			    } catch (InterruptedException e) {    
			     e.printStackTrace();    
			    }    
			    container.add(new Object());    
			    System.out.println("我生产了"+(++count)+"个");  
			    container.notify();  
			      
			   }    
			  }    
			    
	}

}
