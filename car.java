package Java;

public class car {

	String name;
	String colour;
	int price ;
	static int wheeler =4 ;
	
	
	 // static is an common property for all the object
	// but will not hold the specific property
	//static var will be stored in CMA (Common memory allocation)
	//and it will create a one copy for all objects
	

public static void main(String[] args) {
	
	 car c1 = new car();
	 c1.name= "BMW";
	 c1.colour= "white";
	 c1.price =80;
	 
	 System.out.println(c1.name + " " + c1.colour + " " +c1.price + " " + car.wheeler);
	  
	  
	  car c2 = new car();
	  c2.name= "AUDI";
	  c2.colour= "BLACK";
	  c2.price =70;
	 
	  System.out.println(c2.name + " " + c2.colour + " " +c2.price+ " " + car.wheeler);
		  
  
		  
		  
		  car c3 = new car();
		  c3.name= "MARUTI";
		  c3.colour= "red";
		  c3.price =70;
		 //c3.wheeler =4;
		  System.out.println(c3.name + " " + c3.colour + " " +c3.price + " " + car.wheeler);		  
	 

		
		
		
		
		
		
		
		
		
	}

}
