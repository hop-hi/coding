package com.example.demo.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.example.demo.spring.car.Car;

@Component
public class SpringIoC {
	
	static Logger logger = LoggerFactory.getLogger(SpringIoC.class);
	

	public ApplicationContext loadContainer() {
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
		return context;
	}

	public static void main(String[] args) {
		SpringIoC ioc = new SpringIoC();
		Car car = (Car)ioc.loadContainer().getBean("Car");
		car.move();
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				logger.error(e.toString(),e);
			}
			break;
		}
		car.park();

	}
}
