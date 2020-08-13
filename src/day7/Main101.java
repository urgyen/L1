package day7;

public class Main101 {

//	public static void add(int a, int b) {
//		System.out.println(a + b);
//	}
//
//	public static void add(double a, double b) {
//		System.out.println(a + b);
//	}
//
//	public static void add(int a, int b, int c) {
//		System.out.println(a + b + c);
//	}

	/// no of arguments
	//type of arguments
	public static void printPErsonDetails(String name, int age) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public static void printPErsonDetails(String name) {
		System.out.println("Name: " + name);

	}
	
	public static void printPErsonDetails(int age) {
		System.out.println("Age: " + age);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Poly morphism
		// euta kura multiple ways

		// 1. Method overloading
//		add(1, 10);
//		add(10, 20, 30);
//		add(1.1, 5.54);

		printPErsonDetails("Apple" , 15);
		printPErsonDetails("Banana");
		printPErsonDetails(15);
		
		// 2. Method overriding
		//Inheritance compulsary
		
		//Dad has a car 
		//Son --> CAr

	}

}
