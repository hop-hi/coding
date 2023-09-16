package com.example.demo.spring.car.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.spring.car.Car;
import com.example.demo.spring.car.Chair;
import com.example.demo.spring.car.Engine;
import com.example.demo.spring.car.Wheel;

public class CarImpl implements Car{

	static Logger logger = LoggerFactory.getLogger(CarImpl.class);
	
	Engine engine;
	Wheel wheel;
	Chair chair;
	
	@Override
	public Engine getEngine() {
		// TODO Auto-generated method stub
		return engine;
	}

	@Override
	public void setEngine(Engine engine) {
		// TODO Auto-generated method stub
		this.engine = engine;
	}

	@Override
	public Wheel getWhee() {
		// TODO Auto-generated method stub
		return wheel;
	}

	@Override
	public void setWheel(Wheel wheel) {
		// TODO Auto-generated method stub
		this.wheel = wheel;
	}

	@Override
	public Chair getChair() {
		// TODO Auto-generated method stub
		return chair;
	}

	@Override
	public void setChair(Chair chair) {
		// TODO Auto-generated method stub
		this.chair = chair;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.getEngine().start();
		this.getWhee().roll();
		this.getChair().fold();
	}

	@Override
	public void park() {
		// TODO Auto-generated method stub
		this.getEngine().stop();
		this.getWhee().pause();
		this.getChair().unfold();
	}

}
