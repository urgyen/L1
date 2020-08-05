package day3;

public class Function101 {

	// Function -4
	// on the basis of arguments and return type
//	1. Funtion with arguments and return type

	static public int addNumber(int num1, int num2) {

		int sum = num1 + num2;
		return sum;
	}

//	2. Function with arguments and no return type
	// name=Urgyen
	static public void sayHi(String name, int times) {

		for (int i = 0; i < times; i++) {
			System.out.println(name);
		}
	}

//	3 Function with no arguments and return type
	//Scenario??
	static public double valueOfPI() {
		
		//ambigyuuity
		return 3.1416;
		
	}
	
//	4. Function with no arguments and no return type
	public static void sayHi() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 int
	//	sayHi("Sojan", 10);
		
//		int dataFromMethod= addNumber(55, 110);
//		System.out.println(dataFromMethod-5);

//		System.out.println(addNumber(5, 10));

		
//		double dataFromMethod= valueOfPI();
//		System.out.println(dataFromMethod);
	
//	sayHi();
	
		addNumber(1,5);
	}

}
