package com.example.demo.spring.car.aw.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.spring.car.Chair;
import com.example.demo.spring.car.Engine;
import com.example.demo.spring.car.Wheel;
import com.example.demo.spring.car.impl.CarImpl;

@Component
@Primary
public class TeslaCarImpl extends CarImpl{
	
	@Autowired
	Engine engine;
	@Autowired
	Wheel wheel;
	@Autowired
	Chair chair;
}
