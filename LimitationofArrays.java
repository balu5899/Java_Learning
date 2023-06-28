package Java;

import java.util.Arrays;

public class LimitationofArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int product []=new int[50];
		
		
		//LIMITATION OF STATIC ARRAY.
		//1. Size is Fixed-to overcome this problem---- we need to use dynamics array
		//2.similar type of data--- to overcome this problem we can use Object array
		
		//Object in class Java
		
		Object emp[]=new Object[4];
		emp[0]="Balaji";
		emp[1]= 100;
		emp[2]='m';
		emp[3]=23.33;
		 System.out.println(Arrays.toString(emp));
		 
		 for( int k=0;k<emp.length;k++) {
			 System.out.println(emp[k]);
			 
		 }
		 
		 //Static Array example
		 //1.Bookmyshow-----only 200 seats crowed increase we cant increase seats right so that is fix.
		 //2.flight/bus booking---->300
		 //3.Country drop down
		
		
		
		

	}

}
