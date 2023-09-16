package com.mh.lambda;

public class LambdaTestMain {

	public static void testLambda(String p, TestInterface inf) {
		inf.execute(p);
	}
	
	public static void main(String[] args) {
		LambdaTestMain.testLambda("TEST", (p)->{
			System.out.println(p);
		});
		
		LambdaTestMain.testLambda("TEST1", (p)->{
			System.out.println(p);
		});
	}
	
}
