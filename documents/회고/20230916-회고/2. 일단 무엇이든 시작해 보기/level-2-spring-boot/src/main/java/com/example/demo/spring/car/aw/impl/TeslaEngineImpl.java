package com.example.demo.spring.car.aw.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.spring.car.Core;
import com.example.demo.spring.car.impl.EngineImpl;

@Component
@Primary
public class TeslaEngineImpl extends EngineImpl{
	
	@Autowired
	Core core;
	
}
