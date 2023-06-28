package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar= new ArrayList<Integer>(20);
		//Vc=20; Pc=0;
		//LF= 10;
		
		//vc=5,pc=0
		//pc=5 LF=2
		
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		
	  numlist.add(100);
	  numlist.add(300);
	  numlist.add(200);
	  numlist.add(700);
	  
	  System.out.println(numlist);
	  System.out.println(numlist.size());
	  
	  numlist.remove(2);
	  System.out.println(numlist);
		
		
		
		ArrayList<String>emplist= new ArrayList<String>(Arrays.asList("Tom", "jerry", "peter","Lisa"));
		
		System.out.println(emplist.size());
		System.out.println(emplist);
		 for( String e:emplist) {
			 System.out.println(e);
		 }
		emplist.add("Ajit");
		System.out.println(emplist);
		
		emplist.add(2, "KK");
		System.out.println(emplist);
		
		
		//Remove the elements from array
		
		emplist.remove(2);
		System.out.println(emplist);
		
		//emplist.add(9, "Sidd");//IndexOutOfBoundsException
		//System.out.println(emplist);
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		System.out.println(nums.size());
		
		
		System.out.println("______--");
		  
		List<String > eachlist =Arrays.asList("Balu", "kalu", "shalu");
		System.out.println(eachlist.size());
        System.out.println(eachlist);
        
        
        ArrayList<Integer> numbers =new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(500);
        numbers.add(300);
        
        System.out.println(numbers);
        
        Collections.sort(numbers);  ///Sorting
        System.out.println(numbers);
        
        Collections.reverse(numbers);// revrese the numbers
        System.out.println(numbers);
		
        int test[]= {1,45,43,560,6,0,05};
        System.out.println(Arrays.toString(test));
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));
		
        
        ArrayList<String> mylist =  new ArrayList<String>(Collections.nCopies(5, "iphones"));
        System.out.println(mylist.size());
        System.out.println(mylist);
        
		
		
		
		

	}

}
