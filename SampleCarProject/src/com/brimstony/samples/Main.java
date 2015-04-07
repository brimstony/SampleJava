package com.brimstony.samples;

import com.brimstony.samples.types.Car;
import com.brimstony.samples.types.Engine;

public class Main {

	public static void main(String[] args) {
		System.out.println("-- Creating new car!");
		
		Car myCar = new Car();
		//Printing original car info
		System.out.println(myCar.getCarInfo());
		
		System.out.println("-- Replacing engine in car!");
		Engine myNewEngine = new Engine("V8 Hemi");
		myCar.setEngine(myNewEngine);
		
		//Reprinting car info
		System.out.println(myCar.getCarInfo());
		
	}

}
