package com.mh.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Invoker implements Executor {
    @Override
    public void execute(Runnable r) {
        r.run();
    }
    
    public static void main(String[] args) {
    	
      ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

      executorService.scheduleAtFixedRate(() -> {
    	    System.out.println("hi world");
      }, 1, 1, TimeUnit.SECONDS);

      System.out.println("#########################################");
      // executorService.shutdown();
    }
}