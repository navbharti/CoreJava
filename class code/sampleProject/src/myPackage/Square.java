package myPackage;

public class Square {
	private double side;
	
	public double area() {
		return side * side;
	}
	
	public double perimeter() {
		return 4 * side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	
}
