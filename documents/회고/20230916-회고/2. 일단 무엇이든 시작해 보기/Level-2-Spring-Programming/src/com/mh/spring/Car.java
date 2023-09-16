package com.mh.spring;

public class Car {
	Engine engine;
	Wheel wheel;
	
	public Car(Engine engine, Wheel wheel) {
		this.engine = engine;
		this.wheel = wheel;
	}
	
	public void drive() {
		this.engine.run();
		this.wheel.run();
	}
	
	public static void main(String[] args) {
		
		Engine e1 = new Engine();
		Wheel w1 = new Wheel();
		
		Engine e2 = new Engine() {
			@Override
			public void run() {
				System.out.println("Electronic engine im running");
			}
		};
		
		// 객체를 심어준다. injection
		// Dependency Injection (DI)
		Car car = new Car(e2,w1);
		
		car.drive();
		
	}
}
