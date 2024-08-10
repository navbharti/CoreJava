package myPackage;

public class HelloJava {
	//int num1=10;
	static int num2=100;
	public static void main(String[] args) {
		System.out.println("Welcome to Java");
		HelloJava o = new HelloJava();
		System.out.println(num2);
		
		//create an object of Square
		Square sq = new Square();
		//sq.side = 12.6;
		sq.setSide(12.6);
		double a = sq.area();
		System.out.println("Area: "+a+"sq meteres");
		double p = sq.perimeter();
		System.out.println("Perimeter: "+ p+"meters");

	}
	
	{
		System.out.println("instance block-1");
	}
	
	static {
		System.out.println("static block-1");
		Rectangle r = new Rectangle();
		r.setLength(12.6);
		r.setBreadth(6.6);
		System.out.println(r);
	}

}
