package javabyexample.objects.shapes;

public class Circle implements ClosedShape {
	public static double pi = 3.14;
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle() {
		this(0);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calcPerimeter() {
		return calcPerimeter(this.radius);
	}

	public double calcDiameter() {
		return calcDiameter(this.radius);
	}

	public double calcArea() {
		return calcArea(this.radius);
	}

	public static double calcPerimeter(double radius) {
		return 2 * pi * radius;
	}

	public static double calcDiameter(double radius) {
		return 2 * radius;
	}

	public static double calcArea(double radius) {
		return pi * Math.pow(radius, 2);
	}
}
