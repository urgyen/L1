package day5;

public class Laptop {

	//state
	//What does laptop have?
	//variables haru define gareko??
	
	//hardsize  ==  mohan== 1000
	//hardsize = -  arun = 500
	int hardDiskSize;
	String modelName;
	
	String brand;
	double price;
	
	//behaviour?
	//What does laptop do?
	//functions
	
	public void browseWeb() {
		System.out.println("Browsing Web");
	}
	
	public void createDocuments() {
		System.out.println("Creating Docs");
	}
	
	public void printLaptopDetails() {
		System.out.println(hardDiskSize + " -  " + modelName);
	}

}
