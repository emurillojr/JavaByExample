package javabyexample.objects.shapes;

public class TestClosedShape {
	public static void main(String[] args) {
		Circle smallCircle = new Circle(2.00);
		System.out.println("Small Circle ");
		System.out.println("Radius: " + smallCircle.getRadius());
		System.out.println("Diameter: " + smallCircle.calcDiameter());
		System.out.println("Perimeter: " + smallCircle.calcPerimeter());
		System.out.println("Area: " + smallCircle.calcArea());
		System.out.println();

		Circle bigCircle = new Circle(3);
		System.out.println("Big Circle ");
		System.out.println("Radius: " + bigCircle.getRadius());
		System.out.println("Diameter: " + bigCircle.calcDiameter());
		System.out.println("Perimeter: " + bigCircle.calcPerimeter());
		System.out.println("Area: " + bigCircle.calcArea());
		System.out.println();

		System.out.println("Random Circle ");
		System.out.println("Diameter: " + Circle.calcDiameter(8));
		System.out.println("Perimeter: " + Circle.calcPerimeter(8));
		System.out.println("Area: " + Circle.calcArea(8));
		System.out.println();

		Triangle smallTriangle = new Triangle(2, 2, 2.82);
		System.out.println("Small Triangle ");
		System.out.println("Perimeter: " + smallTriangle.calcPerimeter());
		System.out.println("Area: " + smallTriangle.calcArea());
		System.out.println();

		EquilateralTriangle etri = new EquilateralTriangle(3);
		System.out.println("Equilateral Triangle ");
		System.out.println("Perimeter: " + etri.calcPerimeter());
		System.out.println("Area: " + etri.calcArea());
		System.out.println("Side1: " + etri.getSide1());
		System.out.println("Side2: " + etri.getSide1());
		System.out.println("Side3: " + etri.getSide1());
		System.out.println();

		Parallelogram prgm = new Parallelogram(3, 4);
		System.out.println("Parallelogram: ");
		System.out.println("Perimeter: " + prgm.calcPerimeter());
		System.out.println("Area: " + prgm.calcArea());
		System.out.println();

		Rectangle rectangle = new Rectangle(5, 4);
		System.out.println("Rectangle: ");
		System.out.println("Perimeter: " + rectangle.calcPerimeter());
		System.out.println("Area: " + rectangle.calcArea());
		System.out.println();

		Square square = new Square(5);
		System.out.println("Square: ");
		System.out.println("Perimeter: " + square.calcPerimeter());
		System.out.println("Area: " + square.calcArea());
		System.out.println();

		ClosedShape cshapes[] = new ClosedShape[7];
		cshapes[0] = new Circle(1);
		cshapes[1] = new Triangle(2, 2, 2.82);
		cshapes[2] = new EquilateralTriangle(3);
		cshapes[3] = new Parallelogram(3, 4);
		cshapes[4] = new Rectangle(5, 4);
		cshapes[5] = new Square(5);
		cshapes[6] = new Circle(2);

		for (int count = 0; count < cshapes.length; count++) {
			ClosedShape cshape = cshapes[count];
			System.out.println(count + ".  Class: " + cshape.getClass().getName());
			System.out.println("Perimeter: " + cshape.calcPerimeter() + "  Area: " + cshape.calcArea());
			System.out.println("");

		}

		// Count the number of circles
		int circleCount = 0;
		for (int count = 0; count < cshapes.length; count++) {
			ClosedShape cshape = cshapes[count];
			if (cshape instanceof javabyexample.objects.shapes.Circle) {
				circleCount++;
			}
		}

		System.out.println("Number of circle objects: " + circleCount);

	}
}
