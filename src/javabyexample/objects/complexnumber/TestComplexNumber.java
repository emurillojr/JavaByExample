package javabyexample.objects.complexnumber;

public class TestComplexNumber {

	public static void main(String[] args) {
		System.out.println("Testing ComplexNumber class begins");
		ComplexNumber cn1 = new ComplexNumber(2, 4);
		ComplexNumber cn2 = new ComplexNumber(-1, -2);
		ComplexNumber cn3 = new ComplexNumber(2, -2);
		ComplexNumber cn4 = new ComplexNumber(-3, 4);
		ComplexNumber cn5 = new ComplexNumber();
		System.out.println("Complex Numbers: " + cn1 + " " + cn2 + " " + cn3 + " " + cn4 + " " + cn5);

		System.out.println("Conjugate Complex Numbers: " + cn1.getConjugate() + " " + cn2.getConjugate() + " "
				+ cn3.getConjugate() + " " + cn4.getConjugate());

		cn1.add(cn2);
		System.out.println("Add Complex number cn1.add(cn2): " + cn1);
		cn1.subtract(cn2);
		System.out.println("Add Complex number cn1.subtract(cn2): " + cn1);
		cn1.multiply(cn2);
		System.out.println("Add Complex number cn1.multiply(cn2): " + cn1);
		cn1.divide(cn2);
		System.out.println("Add Complex number cn1.divide(cn2): " + cn1);

		ComplexNumber sum = ComplexNumber.add(cn1, cn2);
		ComplexNumber diff = ComplexNumber.subtract(cn1, cn2);
		ComplexNumber product = ComplexNumber.multiply(cn1, cn2);
		ComplexNumber quotient = ComplexNumber.divide(cn1, cn2);
		ComplexNumber quotient2 = ComplexNumber.divide(product, cn2);

		System.out.println("Add using static method add : " + cn1 + " " + cn2 + "  Sum: " + sum);
		System.out.println("Add using static method subtract : " + cn1 + " " + cn2 + "  diff: " + diff);
		System.out.println("Add using static method multiply : " + cn1 + " " + cn2 + "  product: " + product);
		System.out.println("Add using static method divide : " + cn1 + " " + cn2 + "  quotient: " + quotient);
		System.out.println("Add using static method divide : " + product + " " + cn2 + "  quotient: " + quotient2);

		System.out.println("Testing ComplexNumber class ends");
	}

}