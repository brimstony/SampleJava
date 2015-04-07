package com.brimstony.samples.types;

public class Car {
	
	//"engine" is a member variable of the Car class
	private Engine engine;
	
	//This is the constructor for the Car class
	public Car(){
		Engine thisCarsEngine = new Engine("V6");
		
		this.setEngine(thisCarsEngine);
	}
	
	public String getCarInfo(){
		return "This car has a " + this.getEngine().getEngineType() + " engine.";
	}
	

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	
}
