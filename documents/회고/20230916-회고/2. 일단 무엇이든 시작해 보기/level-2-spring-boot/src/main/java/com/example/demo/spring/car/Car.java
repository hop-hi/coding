package com.example.demo.spring.car;

public interface Car {
	Engine getEngine();
	void setEngine(Engine engine);
	Wheel getWhee();
	void setWheel(Wheel wheel);
	Chair getChair();
	void setChair(Chair chair);
	void move();
	void park();
}
