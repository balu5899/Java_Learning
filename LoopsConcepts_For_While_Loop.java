package Java;

public class LoopsConcepts_For_While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Uses cases of  while loop
		//when number of iternation is not fixed-while loop
		// no of link/images on page
		//webtable pagination 1,2,3,......Next
		//webelement is loading on the page.
		//page load timeout
		//Build is running : 15 min, 1-hr, 2-hr
		//read data from DB:SQL- Roes,Cloums
		
		//2. Uses cases of for loop
		//when number of iteration are fixed -for loop
		//month days dropdowns- 1-12
		//Catagory options on websites
		//Array, Array list
		//excel file-Test data--rows- 1 to row size
		//country dropdown- 1 to 230- if name= brazil- Break;
		//Read data- JSON/XML
		//read data from db
		
		
		
		
		// 1. WHILE LOOP
		int i =1;
		while (i<=10) {  
			System.out.println(i);// 1 TO 10
			i++;
		}
		int k=1;
		while(true) {
			System.out.println("welcome in Taj Hotel");
			if (k>=5) {
				break;
			}
			k++;
		}
		
		//2. FOR LOOP
		//for (inatialize ; condition ; increment/decrement)
		
		//1 to 10
		for ( int j =1;j<=10;j++) {
			System.out.println(j);
		}
		
		for ( int j =1;j<=10;) {
			System.out.println(j);
			j++;
		}
		
	//Dead code 	for (;false ; ) {
	//		System.out.println("welcome in my life");
	//	}
	 int c=1;
	 for (;;) {
		 System.out.println("weclome to navven automation lab");
		 if (c==5) {
			 break;
			 
		 }
		c++;
	 }
		 
	 	int p;
	 	for (p=1;p<=5;p++) {
	 		System.out.println(p);
	 	}

	
	 for (char ch='a'; ch<='z';ch++) {
		 System.out.println(ch + "=" + (byte)(ch));
	 }
	 
	 for (char ba='A';ba<='Z';ba++) {
		 System.out.println(ba);
	 }
	 byte b='a';
	 System.out.println("b");
	 
	 //double, long ,byte, int ,char,float,
	 //wap to print naveen 100 times
	 
	 for(int w=1;w<=100;w++) {
		System.out.println(" hellow naveen");
	 }
	 for (int h=10;h>0;h--) {
		 System.out.println(h);
		 }
	 System.out.println("_____________________________________");
	// int  l=10;
	// while(l>=0) {
	 {
		// System.out.println(l);
	 
	 }

	 
	 //3. do while
	 
	/* m=1;
	 do {
		 m++;
		 System.out.println(m);
		 break;
		 }
	 while(m<=10);8 */
	 
	 //USE CASES
	 //webtable pagination; check if the element is alreday present in th table click on that
	 //go and check the first element first and than start the loop
	 //calender
	 
	 
	 
	 
	 
	 
	}
	
	}
