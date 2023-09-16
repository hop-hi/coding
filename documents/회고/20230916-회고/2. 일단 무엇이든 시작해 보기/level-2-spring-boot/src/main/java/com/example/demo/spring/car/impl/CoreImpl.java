package com.example.demo.spring.car.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.spring.car.Core;

public class CoreImpl implements Core {

	static Logger logger = LoggerFactory.getLogger(CoreImpl.class);
	
	@Override
	public void run() {
		logger.debug("Core is running....");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		logger.debug("Core is stopped.");
	}

}
