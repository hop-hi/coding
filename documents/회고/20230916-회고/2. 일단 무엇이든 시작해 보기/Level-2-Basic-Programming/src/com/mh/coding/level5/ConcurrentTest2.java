package com.mh.coding.level5;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ConcurrentTest2 {
	public static void main(String[] args) {
		ScheduledExecutorService reloadScheduler = Executors.newSingleThreadScheduledExecutor();
		/*
		 (a, b)->{
		 	System.out.println("a=" + a);
		 }
		 
		  (a,b)=>{
		  
		  }
		 */
		reloadScheduler.scheduleAtFixedRate(()->{
			System.out.println("0................");
		}, 0, 100, TimeUnit.MILLISECONDS);
	}
}
