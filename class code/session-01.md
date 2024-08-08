# Introdction
## HelloJava First Program

```java
class HelloJava{
	public static void main(String args[]){
		System.out.println("Welcome Back to OOPS through Java.");
	}
}
```

```java
import java.util.Scanner;
class HelloJava
{
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static boolean bool;
	static char ch;
	public static void main(String args[]){
		int a;
		System.out.println("static byte b"+b);
		System.out.println("static short s"+s);
		System.out.println("static int i"+i);
		System.out.println("static long l"+l);
		System.out.println("static float f"+f);
		System.out.println("static double d"+d);
		System.out.println("static boolean bool"+bool);
		System.out.println("static char ch"+ch);
	}
	
} 

```

## Static vs Non-Static

```java
class Calculator{
	//instance variable
	int num1;

	//static variable
	static int num2;

	//Constructor
	Calculator(){
		num1=1000;
	}
	
	//main method
	public static void main(String args[]){
		System.out.println("main method");

		int ans = sum(10, 20);
		System.out.println("Sum:"+ans);

		Calculator obj1 = new Calculator();
		Calculator obj2 = new Calculator();
		Calculator obj3 = new Calculator();
		//System.out.println("num1: "+ obj1.num1);
		System.out.println("num2: "+ Calculator.num2);
		System.out.println("num2: "+ num2);
		System.out.println("num2: "+ obj1.num1);
		System.out.println("num2: "+ obj2.num1);
		System.out.println("num2: "+ obj3.num1);
	}

	//static method
	static int sum(int n1, int n2){
		return n1+n2;
	}

	//instance block-1
	{
		System.out.println("Instance Block-1");
	}

	//instance block-2
	{
		num1=200;
		System.out.println("Instance Block-2");
	}

	//static block-1
	static {
		num2=100;
		//num1=200;
		System.out.println("Static Block-1");
	}

	//static block-2
	static {
		System.out.println("Static Block-2");
	}
}
```

## How to read input in Java

```java
class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		System.out.println("a: "+a);
	}
}
```

```java
import java.util.Scanner;

class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First Number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int num2 = sc.nextInt();
		
		int ans = add(num1, num2);
		System.out.println("add: "+ans);

		ans = sub(num1, num2);
		System.out.println("subtract: "+ans);

		ans = add(num1, num2);
		System.out.println("Multiply: "+ans);

		float ans1 = add(num1, num2);
		System.out.println("Division: "+ans1);
	}

	static int add(int n1, int n2){
		return n1+n2;
	}

	static int sub(int n1, int n2){
		return n1-n2;
	}

	static mul(int n1, int n2){
		return n1*n2;
	}

	static double div(int n1, int n2){
		return n1/n2*1.0;
	}
}
```