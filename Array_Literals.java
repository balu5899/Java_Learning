package Java;

import java.util.Arrays;

public class Array_Literals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   // 2.Array Literals
	     
		int a []= {10,2,30,40,50};
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		
		int ar[]= new int[4];
		
		
		double d[]= {1.2,2.2,3.2};
		char ch[]= {'a','b','c','d'};
		
		String browser []= {"chrome","Firefox","edge","ie",};
		System.out.println(browser.length);
		
		for( int k=0;k<browser.length;k++) {
			System.out.println(browser[k]);
		    if(browser.equals("edge")) {
		    	System.out.println("Edge is Launching");
		    }
		    else if(browser.equals("ie")) {
		    	System.out.println(" ie is lauching");
		    }
		    else if(browser.equals("firefox")) {
		    	System.out.println("firefox is lauching");
		    }
		    else if(browser.equals("chrome")) {
		    	System.out.println("chrome is laucnhing");
		    }
		   
		    //Amazon-----sep--[50]
		    //nov-----1000;
		    //dec-----10000;
		    //Amazon is dynamic website we cant use sattic array.size is alreday fix.predefined.
		    
		    
		    //uber [25]----at 5---[100]
		    
		    
		   
		}
		
		
		
		
		//int a[]= new int[4];

	}

}
 