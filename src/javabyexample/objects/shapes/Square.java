package javabyexample.objects.shapes;

public class Square extends Rectangle {

	public Square() {
		super();
	}

	public Square(double side) {
		super(side, side);
	}

	public double getSide() {
		return super.getSide1();
	}

	public void setSide(double side) {
		super.setSide1(side);
		super.setSide2(side);
	}
}
