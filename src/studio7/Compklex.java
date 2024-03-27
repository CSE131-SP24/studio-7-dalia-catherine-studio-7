package studio7;

public class Compklex {
	private double real;
	private double imaginary;

	public Compklex (double real, double imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	public double getReal() {
		return real;
	}
	public double getImaginary() {
		return imaginary;
	}
	public Compklex add (Compklex C) {
		double sumReal= this.real+C.getReal();
		double sumImaginary = this.imaginary+C.getImaginary();
		return new Compklex (sumReal, sumImaginary);
	}
	public Compklex multiply (Compklex C) {
		double newReal = (this.real*C.getReal())-(this.imaginary*C.getImaginary());
		double newImaginary = (this.real*C.getImaginary())+(this.imaginary*C.getReal());
		return new Compklex (newReal, newImaginary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
