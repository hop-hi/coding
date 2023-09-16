package com.example.demo.spring.car.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.spring.car.Wheel;

public class WheelImpl implements Wheel {

	static Logger logger = LoggerFactory.getLogger(WheelImpl.class);
	
	@Override
	public void roll() {
		// TODO Auto-generated method stub
		logger.debug("Wheel is rolling");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		logger.debug("Wheel is pausing...");
	}
	
}
