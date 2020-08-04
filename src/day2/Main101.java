package day2;

public class Main101 {

	public static void main(String[] args) {

//		1. we do something

//		2. we do something if this or that happens

//		3. we do something again and again

		// decision control
		// 1. if condition

//		
//		if(age  >  20) {
//			System.out.println("Adult");
//		}
//		
//		
//		else {
//			System.out.println("Bacchai ho");
//		}
//		

//		age<10 - Child
//		11=19 Teen
//		21=35 Young
//		35 + old
//		int age = 35;
//		// else if
//		if (age < 10) {
//			System.out.println("Child");
//		} else if (age < 20) {
//			System.out.println("Teen");
//		} else if (age < 36) {
//			System.out.println("Young");
//		} else {
//			System.out.println("Old");
//		}

		// switch case;
		// 1=Sun, 2= Mon, 3= Tues..
		int weekDay = 8;

		switch (weekDay) {

		case 1:
			System.out.println("Sunday");
			break;

		case 2:
			System.out.println("Monday");
			break;

		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wed");
			break;

		case 5:
			System.out.println("Thurs");
			break;

		case 6:
			System.out.println("Fri");
			break;

		case 7:
			System.out.println("Sat");
			break;

		default:
			System.out.println("Send some valid input");
		}

		// Loops
		// 1. while
		// 2. do while
		// 3. For loop

		// index initialization
		// condition;
		// increment //decrement

//		int i=0;
//		while (i < 10) {
//			System.out.println(i+ " : Urgyen");			
//			i=i+1;
//			//i++;
//		}
		// end

//		int i = 0;
//		do {
//			System.out.println("Hello");
//			i++;
//		} while (i < 10);

		//i++ --> i=i+1;
		//i-- --> i=i-1;
		for(int i=5 ; i< 101 ; i=i+5) {
			System.out.println(i);
		}
		
//		i=5; true; 5 print ; 10;
//		i=10; true; 10 print; 15;
//		
		
		
		
		
	}

}
