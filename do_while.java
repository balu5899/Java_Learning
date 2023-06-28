package Java;

public class do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3. Do while
		
		
		//USE CASES
		 //webtable pagination; check if the element is alreday present in th table click on that
		 //go and check the first element first and than start the loop
		 //calender
		
       int i =1;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=10);
		
		
		
		for (int j=1;j<=5;j++) {
			System.out.println( "i am batman");
			
		}
		for (int l=1;l<10;l++) {
			System.out.println("i am batman" +" " + l);
			
		}
		/*for(int p=10;p>0;p++) {
			System.out.println(p);
		}
		
		/*for(int a=1;a<=100;a++) {
			if(a%2==0) {
			System.out.println(a);
		}
		}*/
		  int c=3;
		 if(c%2==0) {
			 System.out.println("print even no");
		 }
		 else {
			 System.out.println("print odd num");
		 }
	   int d=1;
	   for( d=1;d<=100;d++) {
		   if(d%2!=0)
		   System.out.println(d);
	   }
		
	   for(int r=10;r>=1;r--) {
		   System.out.println(r);
		   
	   }
		for(char v='a';v<='z';v++) {
			
	 		System.out.println((int)v);
	 		
	 		
	 		System.out.println("_______________________________");
			}
		for(int q=0;q<10;q++) {
			System.out.println((double)q);
		}
		System.out.println("______");
		for(int e=0;e<=100;e++) {
			if(e%9==0)
			System.out.println(e);
		}
	}

}
