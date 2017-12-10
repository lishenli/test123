package com.test;

import java.util.List;

//������
public class Consumer implements Runnable {

	private List container = null;    
    private int count;    
    public Consumer(List lst){    
     this.container = lst;    
    }    
    
	@Override
	public void run() {
		// TODO Auto-generated method stub

		while(true){    
			   synchronized (container) {    
			    if(container.size()== 0){    
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
			    container.remove(0);    
			    System.out.println("�ҳ���"+(++count)+"��");  
			    container.notify();  
			      
			   }    
			  } 
		
	}

}	
