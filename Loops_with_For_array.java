package Java;

import java.util.Arrays;

public class Loops_with_For_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	     int a[]= new int[3];
	     a[0]=10;
	     a[1]=20;
	     a[2]=30;
	     
	     for(int i=0;i<a.length;i++) {
	    	 System.out.println(a[i]);
	     }
	     System.out.println("-----");
	     //FOR EACH LOOP
	     
	     for(int e:a) {
	    	 System.out.println(e);
	     }
	     
	     System.out.println("--------");
	     
	     String  emp[] =new String[4];
	     emp[0]="balaji";
	     emp[1]="ajith";
	     emp[2]="salary";
	     emp[3]="vaibhva";
	     
	     for(String e: emp) {
	    	 System.out.println(e);
	    	 if(e.equals("balaji")) {
	    		 System.out.println("he is man");
	    	 }
	     }
	     for(int k=3;k>=0;k--) {
	    	 System.out.println(emp[k]);
	    	
	    	}

			Object em[]=new Object[4];
			em[0]="Balaji";
			em[1]= 100;
			em[2]='m';
			em[3]=23.33;
			 System.out.println(Arrays.toString(em));
			 for(Object e:em) {
				 System.out.println(e );
			 }
	     }
	}


