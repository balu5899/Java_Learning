package Java;

import java.util.ArrayList;

public class Dynamic_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array List-Default class
		//create  the object of Array List
		
		//LF--Load Factor--->pc/2----->size()/2
		//vc=10, pc=0,
		//pc=10,vc=0,
		//LF---pc/2----.10/2--5
		//pc=15, vc=0
		//LF=15/2--7
		 
		
		//use cases
		//uber--->no of cars
		//amazon---- no of links
		//no of employee
		//user list
		//total links----link list
		//total image----image list
		
		
		
		ArrayList ar= new ArrayList();
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
	//	System.out.println(ar.get(4));  //IndexOutOfBoundsException:
		
		ar.add(400);
		System.out.println(ar.get(3));
		
		
		ar.add(23.44);
		ar.add("balaji");
		ar.add('c');
		ar.add(true);
		 
		
		//INTERNAL STRUCTURE OF DYNAMIC ARRAY
		//there will be two terms one is called  Virtual memory and second one is Physical memory.
		//First in dynamics array list 10 virtual memory will be created than again 5. the formula of calculating is LF=PC/2
		//Load factor in Array list is LF=PC/2;
		
		
		
		//Generics in arraylist
		ArrayList<Integer> marksheet = new ArrayList<Integer>();//vc=10, pc=0
		
		marksheet.add(100);//0
		marksheet.add(200);//1
		marksheet.add(300);//2
	//  marksheet.add("Testing");
		
	   System.out.println(marksheet.size());
	   
	   System.out.println("------");
	   ArrayList<String> emp= new ArrayList<String>(); //vc=10; pc=0
	   
	   emp.add("Ajit");
	   emp.add("Vaibhav");
	   emp.add("Pihu");
	//   emp.add(100);
	    System.out.println(emp.size());
	     
	    for(int i=0;i<emp.size();i++) {
	    	System.out.println(emp.get(i));
	    	if(emp.get(i).equals("Vaibhav")) {
	    		System.out.println(" he is in first year");
	    	}
	    }
	    
	    for(String e: emp) {
	    	System.out.println(e);
	    	
	    }
	    
	    
	    
	    
	   ArrayList<Double> ab = new ArrayList<Double>();//vc=10; pc=04
	   ab.add(12.22);
	   //ab.add(12);
	   ab.add(34.44);
	  // ab.add("String);"
	   
	  System.out.println(ab.size());
	  System.out.println(ab.get(1));
	   		
	   
		
		
		

	}

}
