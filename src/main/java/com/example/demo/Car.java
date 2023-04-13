package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class Car {



	
private Engine engine;
private Brakes brakes;
private Gear gear;
//Using Constructor
public Car(Engine engine, Brakes brakes, Gear gear) {
	super();
	this.engine = engine;
	this.brakes = brakes;
	this.gear = gear;
}
//Using Setter
public Engine getEngine() {
	return engine;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}
public Brakes getBrakes() {
	return brakes;
}
public void setBrakes(Brakes brakes) {
	this.brakes = brakes;
}
public Gear getGear() {
	return gear;
}
public void setGear(Gear gear) {
	this.gear = gear;
}

//using Fields
@Autowired
private Engine E1;
@Autowired
private Brakes b1;
@Autowired
private Gear g1;

}
