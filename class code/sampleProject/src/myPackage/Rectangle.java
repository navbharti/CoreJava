package myPackage;

public class Rectangle {
	private double length;
	private double breadth;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public double area() {
		return length * breadth;
	}
	
	public double perimeter() {
		return 2*(length + breadth);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(length, 2)+Math.pow(breadth, 2));
	}
	
	public String toString() {
		String s = String.format("Langth: %f\nBreadth: %f\nArea: %f\nPerimeter: %f\nDiagonal: %f", getLength(), getBreadth(), area(), perimeter(), diagonal());
		return s;
	}
}
