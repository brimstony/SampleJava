package com.brimstony.samples.types;

public class Engine {

	//"engineType" is a member variable of the Engine class
	private String engineType;
	
	public Engine(String engineType){
		this.engineType = engineType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	
	
}
