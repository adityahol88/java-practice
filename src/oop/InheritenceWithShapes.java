package oop;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
class Rectangle extends Shape{
	double height,width;
	Rectangle(double height, double width){
		this.height = height;
		this.width = width;
	}
	@Override
	double calculateArea() {
		return  this.width * this.height;
	}
}

class Triangle extends Shape{
	double height,base;
	public Triangle(double base,double height) {
		this.height = height;
		this.base = base;
	}
	
	@Override
	double calculateArea() {
		return this.base * this.height * 0.5;
	}
}
public class InheritenceWithShapes {

	public static void main(String[] args) {
		Shape[] shapes = { new Circle(5),
						  new Rectangle(6,4),
						  new Triangle(5,4) };
		for (Shape shape : shapes) {
		    System.out.println("Area of " +
		            shape.getClass().getSimpleName() +
		            " is " +shape.calculateArea());
		}
	}
}
