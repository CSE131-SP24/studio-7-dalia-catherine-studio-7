package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int n, int d) {
		numerator=n;
		denominator=d;
	}
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public Fraction add (Fraction f) {
		int sumNum= this.numerator*f.getDenominator()+f.getNumerator()*this.denominator;
		int sumDenom=this.denominator*f.getDenominator();
		return new Fraction(sumNum, sumDenom);
	}
	public Fraction multiply (Fraction f) {
		return new Fraction(this.numerator*f.getNumerator(), this.denominator*f.getDenominator());
	}
	public Fraction reciprocal(Fraction f) {
		return new Fraction (this.denominator, this.numerator);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
