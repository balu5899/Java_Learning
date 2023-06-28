package Java;

import java.util.Arrays;

public class Array_Concepts {

	public static void main(String[] args) {{
		// TODO Auto-generated method stub
		
		
		//Limiatation pf array.
		//1.size is fixed.
		
		
		
		//1.With new Keyword
		
		int a[]= new int[5] ;
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(a[2]);
		System.out.println(a[1]);
		
		//System.out.println(a[-1]);//ArrayIndexOutOfBoundsException
		//System.out.println(a[5]);//java.lang.ArrayIndexOutOfBoundsException
		
		int len=a.length;
		System.out.println(len);
		int hi= len-1;
		System.out.println(hi);
		int li=0;
		System.out.println(li);
		
		System.out.println("------------------");
		
		//To print all values form  array: use the loop
		
		for(int i=0;i<4;i++) {
			System.out.println(a[i]);//10 20 30 40
		}
		  
		//without using the loops
		
		System.out.println(a);//[I@76ed5528 -Memory location so called garbage values not exactly garbage values
		
		System.out.println(Arrays.toString(a));
		
		// 2..DOUBLE ARRAY
		
		double q []= new double[3];
		 
		q [0]=10;
		q [1]= 12.0;
		q [2]=13.12;
	//	q[3]=24.56;//ArrayIndexOutOfBoundsException
		
		System.out.println(Arrays.toString(q));
		
		double lab = q.length;		
		for(int k=0;k<3;k++){
			System.out.println(q[k]);
		}
		
		System.out.println("_______-");
		
		//3. String Array
		
		String browser[]=  new String[4];
		 browser[0]="chrome";
		 browser[1]="ie";
		 browser[2]="edge";
		 
				 
		 browser[3]="safari";
		 System.out.println(Arrays.toString(browser));
		 
		  for(int k=0;k<browser.length;k++) {
			 System.out.println(browser[k]);
			 if(browser[k].equals("chrome")) {
				 System.out.println(" chrome browser is laucnhed");
			 }
				 else if(browser[k].equals("ie")) {
					 System.out.println(" ie is launched");
				 }
				 else if(browser[k].equals("edge")) {
					 System.out.println(" edge is launched");
				 }
					 else {
						 System.out.println(" nothing is launced");
					 }
					 
				 }
		  
		  //Static array ex;
		  //Month/days
		  //Book my show for seats size are already fix.
		  //traveles array
		  //
				 
			 }
			 
		 }
		  
		
		 
		
		
		
 
	}





