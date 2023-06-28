package Java;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Q1: WAP to delete a specific number from the given array.
		//           int p[] = {1,4,5,2,3,22,31, 2}; 
		//--Need to remove 22 from the p[] array.
		
		int p[] = {1,4,5,2,3,22,31, 2};
		System.out.println(Arrays.toString(p));
		
		System.out.println("--------");
		
		// Q2: Write a program to create a static Array, having following cricket data:
		//	                        --name, age, team name, DOB, gender, Strike Rate
		//	                        --Try to create multiple Object Arrays for different players 
		//	                        --Try to print all the values of each player on the console
		
		
		Object a[]= new Object[6] ;
		
		a[0]="Ajit";
		a[1]= 22;
		a[2]="Team Web";
		a[3]=1999;
		a[4]='M';
		a[5]=123.4;
		
		System.out.println(Arrays.toString(a));
		
		//For Loop
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//For each loop
		for(Object e:a) {
			System.out.println(e);
		}
		
		
		
		//1. Write a Java program to create a new array list, which contains all color names.
		
		
		 String ar[]= {"yellow", "white", "blue", "cocka"};
		 
		System.out.println(Arrays.toString(ar));
		
		ArrayList<String> ba = new ArrayList<String>();
		
		ba.add("white");
		ba.add("blue");
		ba.add("black");
		ba.add("pink");
		System.out.println(ba);
		
		for(int i=0;i<ba.size();i++) {
			System.out.println(ba.get(i));
		
		}
		
		System.out.println("-----------");
		
		String color= ba.get(2);
		System.out.println(color);
		
		for(int i=4;i>4;i--) {
			System.out.println(ba.get(i));
		}
	
		//2. Write a Java program to retrieve an element at a specified index from a given array list.
		
		int ac[]= new int[4];
		ac[0]= 100;
		ac[1]=200;
		ac[2]=300;
		ac[3]=400;
		 
		System.out.println(Arrays.toString(ac));
		
		System.out.println(ac[3]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
