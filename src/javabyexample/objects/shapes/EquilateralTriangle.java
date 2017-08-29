package javabyexample.objects.shapes;

public class EquilateralTriangle extends Triangle {
	public double side;

	public EquilateralTriangle() {
		this(0);
	}

	public EquilateralTriangle(double side) {
		super(side, side, side);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
		super.setSide1(side);
		super.setSide2(side);
		super.setSide3(side);
	}

	public double calcArea() {
		System.out.println("In Equilateral Triangle Calc Area");
		double height = this.side * Math.sqrt(3) * 0.5;
		double base = this.side;
		double area = 0.5 * base * height;
		return area;
	}
}
