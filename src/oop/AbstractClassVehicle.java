package oop;


abstract class Vehicle{
	public abstract void startEngine();
	public abstract void stopEngine();

}

class MotorCycle extends Vehicle {

	public void startEngine() {
		System.out.println("MotorCycle engine started");
	}
	public void stopEngine() {
		System.out.println("MotorCycle engine stopped");
	}

}

class Car extends Vehicle {

	public void startEngine() {
		System.out.println("Car engine started");
	}
	public void stopEngine() {
		System.out.println("Car engine stopped");
	}
}

public class  AbstractClassVehicle {
	public static void main(String[] args) {
	
		Vehicle car = new Car();
		Vehicle motorcycle = new MotorCycle();
		car.startEngine();
		car.stopEngine();
		motorcycle.startEngine();
		motorcycle.stopEngine();
	}
}
