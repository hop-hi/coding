package com.mh.coding.level5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentTest {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(4);
		try {
			executor.submit(()->{
				while(true) {
					System.out.println("0................");
					Thread.sleep(100);
				}
			});
			
			new Thread(()-> {
				while(true) {
					System.out.println("1................");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}	
