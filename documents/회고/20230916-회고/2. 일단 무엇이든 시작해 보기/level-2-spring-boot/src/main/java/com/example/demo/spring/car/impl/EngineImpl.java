package com.example.demo.spring.car.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.spring.car.Core;
import com.example.demo.spring.car.Engine;

public class EngineImpl implements Engine{
	
	static Logger logger =LoggerFactory.getLogger(EngineImpl.class);
	
	Core core;
	
	@Override
	public Core getCore() {
		// TODO Auto-generated method stub
		return core;
	}

	@Override
	public void setCore(Core core) {
		// TODO Auto-generated method stub
		this.core =core;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		logger.debug("Engin is starting...");
		this.getCore().run();
		logger.debug("Engine's core is running....");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		logger.debug("Engine is stopping...");
		this.getCore().stop();
		logger.debug("Engine is stoppd");
	}
	
}
