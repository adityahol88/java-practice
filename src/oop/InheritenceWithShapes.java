/**
 * Problem: Model multiple shapes through an abstract base class and print the
 * area of a circle, rectangle, and triangle using polymorphism.
 */
package oop;

/** Defines the common area operation for all shapes. */
abstract class Shape {
    /** Returns the area of this shape. */
    abstract double calculateArea();
}

/** Represents a circle with a given radius. */
class Circle extends Shape {

    private double radius;

    /** Creates a circle with the supplied radius. */
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    /** Returns the circle's area. */
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
/** Represents a rectangle with a given height and width. */
class Rectangle extends Shape{
	double height,width;
	/** Creates a rectangle with the supplied dimensions. */
	Rectangle(double height, double width){
		this.height = height;
		this.width = width;
	}
	@Override
	/** Returns the rectangle's area. */
	double calculateArea() {
		return  this.width * this.height;
	}
}

/** Represents a triangle with a given base and height. */
class Triangle extends Shape{
	double height,base;
	/** Creates a triangle with the supplied base and height. */
	public Triangle(double base,double height) {
		this.height = height;
		this.base = base;
	}
	
	@Override
	/** Returns the triangle's area. */
	double calculateArea() {
		return this.base * this.height * 0.5;
	}
}
/** Demonstrates inheritance and polymorphic area calculation. */
public class InheritenceWithShapes {

	/** Creates sample shapes and prints each shape's area. */
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
