package javabyexample.objects.shapes;

public class Triangle implements ClosedShape {
	private double side1 = 0.0;
	private double side2 = 0.0;
	private double side3 = 0.0;

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle() {
		this(0, 0, 0);
	}

	public double calcPerimeter() {
		System.out.println("In Triangle Calc Perimeter");
		double perimeter = 0.0;
		perimeter = this.side1 + this.side2 + this.side3;
		return perimeter;
	}

	public double calcArea() {
		System.out.println("In Triangle Calc Area");
		double area = 0.0;
		double semiPerimeter = calcPerimeter() / 2;
		area = Math.sqrt(semiPerimeter * (semiPerimeter - this.side1) * (semiPerimeter - this.side2)
				* (semiPerimeter - this.side3));
		return area;
	}

}
