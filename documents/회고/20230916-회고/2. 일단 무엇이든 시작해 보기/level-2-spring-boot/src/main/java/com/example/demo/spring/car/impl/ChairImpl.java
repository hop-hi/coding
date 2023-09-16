package com.example.demo.spring.car.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.spring.car.Chair;

public class ChairImpl implements Chair{

	static Logger logger = LoggerFactory.getLogger(ChairImpl.class);
	
	@Override
	public void fold() {
		// TODO Auto-generated method stub
		logger.debug("Chair is folding...");
	}

	@Override
	public void unfold() {
		// TODO Auto-generated method stub
		logger.debug("Chair is unfolding....");
	}
	
}
