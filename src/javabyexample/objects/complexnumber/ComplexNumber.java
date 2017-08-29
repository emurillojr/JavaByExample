package javabyexample.objects.complexnumber;

/**
 * ComplexNumber class is used to represent a complex number
 */
public class ComplexNumber {

	/**
	 * Real value of complex number
	 */
	private int real;

	/**
	 * Imaginary value of complex number
	 */
	private int imaginary;

	/**
	 * Complex Number Constructor. This will create a complex number representing
	 * zero.
	 */
	public ComplexNumber() {
		this(0, 0);
	}

	/**
	 * ComplexNumber constructor. Creates a complex number representing provided
	 * real value and imaginary value.
	 * 
	 * @param real
	 *            Real portion of complex number
	 * @param imaginary
	 *            Imaginary portion of complex number
	 */

	public ComplexNumber(int real, int imaginary) {
		this.setReal(real);
		this.setImaginary(imaginary);
	}

	/**
	 * Returns real value of complex number
	 * 
	 * @return
	 */
	public int getReal() {
		return real;
	}

	/**
	 * Sets real portion of complex number
	 * 
	 * @param real
	 *            Real portion of complex number
	 */
	public void setReal(int real) {
		this.real = real;
	}

	/**
	 * Returns imaginary portion of complex number
	 * 
	 * @return
	 */
	public int getImaginary() {
		return imaginary;
	}

	/**
	 * Sets imaginary portion of complex number
	 * 
	 * @param imaginary
	 *            Imaginary portion of complex number
	 */
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	/**
	 * Adds given complex number cn to itself
	 * 
	 * @param cn
	 *            Complex number to be added
	 */
	public void add(ComplexNumber cn) {
		this.real += cn.getReal();
		this.imaginary += cn.getImaginary();
	}

	/**
	 * Subtracts given complex number cn from itself
	 * 
	 * @param cn
	 *            Complex number to be subtracted
	 */
	public void subtract(ComplexNumber cn) {
		this.real -= cn.getReal();
		this.imaginary -= cn.getImaginary();
	}

	/**
	 * Multiplies the complex number by the given complex number cn
	 * 
	 * @param cn
	 *            Complex number to be multiplied by.
	 */
	public void multiply(ComplexNumber cn) {
		int tempReal = this.real;
		int tempImaginary = this.imaginary;
		this.real = tempReal * cn.getReal() - tempImaginary * cn.getImaginary();
		this.imaginary = tempReal * cn.getImaginary() + tempImaginary * cn.getReal();
	}

	/**
	 * Divides the complex number by the denominator (divisor) provided in this
	 * method
	 * 
	 * @param denominator
	 *            Divisor complex number.
	 */
	public void divide(ComplexNumber denominator) {
		ComplexNumber conjugate = getConjugate(denominator);
		multiply(conjugate);
		int product = (int) (Math.pow(denominator.getReal(), 2) + Math.pow(denominator.getImaginary(), 2));
		this.real = this.real / product;
		this.imaginary = this.imaginary / product;
	}

	/**
	 * Return the conjugate of the given complex number
	 * 
	 * @param cn
	 *            Complex Number
	 * @return conjugate Conjugate of the given complex number
	 */
	public ComplexNumber getConjugate(ComplexNumber cn) {
		ComplexNumber conjugate = new ComplexNumber();
		conjugate.setReal(cn.getReal());
		conjugate.setImaginary(-1 * cn.getImaginary());
		return conjugate;
	}

	/**
	 * Returns the conjugate complex number of itself.
	 * 
	 * @return
	 */
	public ComplexNumber getConjugate() {
		ComplexNumber conjugate = new ComplexNumber();
		conjugate.setReal(this.getReal());
		conjugate.setImaginary(-1 * this.getImaginary());
		return conjugate;
	}

	/**
	 * Proivdes String representation of the complex number. This representation is
	 * helpful in printing on to the screen.
	 * 
	 * @return StringCN Complex number in String form.
	 */
	public String toString() {
		return this.real + (this.imaginary >= 0 ? "+" : "") + this.imaginary + "i ";
	}

	/**
	 * Returns copy of the current complex number
	 * 
	 * @return
	 */
	public ComplexNumber copy() {
		return new ComplexNumber(this.real, this.imaginary);
	}

	/**
	 * Returns sum of the two complex numbers provided
	 * 
	 * @param cn1
	 *            Complex Number 1
	 * @param cn2
	 *            Complex Number 2
	 * @return sum Sum of the complex numbers
	 */
	public static ComplexNumber add(ComplexNumber cn1, ComplexNumber cn2) {
		ComplexNumber sum = cn1.copy();
		sum.add(cn2);
		return sum;
	}

	/**
	 * Returns the difference between two complex numbers i.e, cn1-cn2
	 * 
	 * @param cn1
	 *            Complex Number 1
	 * @param cn2
	 *            Complex Number 2
	 * @return diff Difference between the complex numbers i.e., cn1 - cn2
	 */
	public static ComplexNumber subtract(ComplexNumber cn1, ComplexNumber cn2) {
		ComplexNumber diff = cn1.copy();
		diff.subtract(cn2);
		return diff;
	}

	/**
	 * Returns the product of two complex numbers
	 * 
	 * @param cn1
	 *            Complex Number 1
	 * @param cn2
	 *            Complex Number 2
	 * @return product Product of two complex numbers cn1 and cn2
	 */
	public static ComplexNumber multiply(ComplexNumber cn1, ComplexNumber cn2) {
		ComplexNumber product = cn1.copy();
		product.multiply(cn2);
		return product;
	}

	/**
	 * Returns the quotient - complex number 1 divided by complex number 2
	 * 
	 * @param cn1
	 *            Complex Number 1
	 * @param cn2
	 *            Complex Number 2
	 * @return Quotient Quotient i.e., cn1/cn2
	 */
	public static ComplexNumber divide(ComplexNumber cn1, ComplexNumber cn2) {
		ComplexNumber quotient = cn1.copy();
		quotient.divide(cn2);
		return quotient;
	}

}
