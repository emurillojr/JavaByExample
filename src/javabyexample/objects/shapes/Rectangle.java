package javabyexample.objects.shapes;

public class Rectangle extends Parallelogram {

	public Rectangle() {
		super();
	}

	public Rectangle(double side1, double side2) {
		super(side1, side2);
	}

	public double getSide1() {
		return super.getBase();
	}

	public void setSide1(double side1) {
		super.setBase(side1);
	}

	public double getSide2() {
		return super.getHeight();
	}

	public void setSide2(double side2) {
		super.setHeight(side2);
	}
}
