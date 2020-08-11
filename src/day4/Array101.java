package day4;

public class Array101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//collection of data;
		//1,2,3,4,5,6;
		
		//Araay is not dynamic, constant size;
		String a[] = new String[10];
		
		//indexing
		//numbering
//		0-- first data
//		1
//		2
//		3
//		4
//		5
//		6
//		7
//		8
//		9== data data
		
		a[0]="Asdasd";
		a[1]="adasd";
		

		//Araay constant  --> arrayList dyaminc
		
		System.out.println(a);
		
		System.out.println(a[0]);
		System.out.println("---");
		System.out.println(a.length);
		
		System.out.println("---");
		
		for(int i=0; i<a.length ; i++) {
			System.out.println(a[i]);
		}
		
	//	System.out.println();
		//a[0]=0;
		System.out.println("---");
		System.out.println(a[0]);
		
	}

}
