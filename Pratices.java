package Java;

public class Pratices {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

       int a=0;
       int b=78;
       int c=117;
       int d=97;
        if (a>b) {
        	System.out.println("A i greater number");
        }
        if (b>c) {
        	System.out.println("Bis greater num");
        }
        if (c>d) {
        	System.out.println(" c is grtater num");
        }
        if (d>a) {
        	System.out.println("d is greater num");
        }
		
        
		
       if(a>0) {
    	   System.out.println("Print  postive num");
       }
       if(a<0) {
    	   System.out.println("Print negative num");
       }
		
       
       String env = "QA    ";
       switch (env.toLowerCase().trim()) {
	case "qa":
		System.out.println("Running in QA Env");
		break;
	case "uat":
		System.out.println("Running in UAT Env");
		break;
	case "dev":
		System.out.println("Running in DEV Env");
		break;
	case "stag":
		System.out.println("Running in STAG Env");

	default:
		System.out.println("Please Pass The Correct Env :"  + env);
		break;
	}
		  
		  int e= 500;
		  int f = 400;
		  int g= 700;
		  int h= 400;
		  
		 if (e>f && e>g) {
			 System.out.println("e is greater");
		 }
		 else if (e>h) {
			 System.out.println("e is greatr");
		 }
		 else if (f>g && f>h) {
			 System.out.println("f is greater");
		 }
		 else {
			 System.out.println("h is greater");
		 }
				  
	
}
}