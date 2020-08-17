package day8;

public class Student {

	// state
	private String name;
	private int age;
	private int year;

	// getters and setters
	public String getName() {
		//Loggers
		return name;
	}

	// data=Ram dai
	public void setName(String data) {
		name = data;
		// name="Ram dai"
	}

	public int getAge() {
		return age;
	}

	//age=65
	public void setAge(int age) {
		if (age > 100) {
			System.out.println("Invalid");
		} else {
			this.age = age;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	// behaviour

	
	public void printName();
	
	//abstract class
	//interface 
}
