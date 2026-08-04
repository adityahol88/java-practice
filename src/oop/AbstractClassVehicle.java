/**
 * Problem: Define an abstract vehicle contract and demonstrate polymorphism
 * by starting and stopping a car and a motorcycle through vehicle references.
 */
package oop;


/** Defines the engine operations shared by concrete vehicles. */
abstract class Vehicle{
	/** Starts the vehicle's engine. */
	public abstract void startEngine();
	/** Stops the vehicle's engine. */
	public abstract void stopEngine();

}

/** A vehicle implementation representing a motorcycle. */
class MotorCycle extends Vehicle {

	/** Prints the motorcycle engine start operation. */
	public void startEngine() {
		System.out.println("MotorCycle engine started");
	}
	/** Prints the motorcycle engine stop operation. */
	public void stopEngine() {
		System.out.println("MotorCycle engine stopped");
	}

}

/** A vehicle implementation representing a car. */
class Car extends Vehicle {

	/** Prints the car engine start operation. */
	public void startEngine() {
		System.out.println("Car engine started");
	}
	/** Prints the car engine stop operation. */
	public void stopEngine() {
		System.out.println("Car engine stopped");
	}
}


/** Demonstrates abstraction and runtime polymorphism with vehicles. */
public class  AbstractClassVehicle {
	/** Creates vehicle objects and invokes their common engine operations. */
	public static void main(String[] args) {
	
		Vehicle car = new Car();
		Vehicle motorcycle = new MotorCycle();
		car.startEngine();
		car.stopEngine();
		motorcycle.startEngine();
		motorcycle.stopEngine();
	}
}
