package day6;

public class MainClass101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dad d1 = new Dad();
		d1.name = "A";
		d1.age = 55;
		d1.occuaption = "Business";

		d1.eatsFood();
		d1.goesToWork();

		// inheritance
		// 1. Single inheritance

		Son s1 = new Son();
		s1.name = "B";
		s1.age = 25;
		s1.occuaption = "Student";

		s1.goesToWork();
		s1.eatsFood();

		// 2. multi level
		// grand dad --dad --son --grandson

		System.out.println("---");

		GRandSon g1 = new GRandSon();
		s1.name = "C";
		s1.age = 5;
		s1.occuaption = "Child";

		s1.goesToWork();
		s1.eatsFood();
		// defect --> polymorphism ;; overriding

		// 3. Hierarchial --> branching

//		dad	--> Son
//			--> Daughter

		System.out.println("--Daughter calling-");

		Daughter d11 = new Daughter();
		d11.name = "C";
		d11.age = 5;
		d11.occuaption = "Child";

		d11.goesToWork();
		d11.eatsFood();

		// 4. hybrid Inheritance;

		
		//5. Multiple Inheritance;
		
	}

}
