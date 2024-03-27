package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double length;
	private double width;
	public Rectangle (double l, double w) {
		length=l;
		width=w;
	}
	public double Area() {
		return length*width;
	}
	public boolean isSquare() {
		return length==width;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle (2.0,3.0);
	}

}
