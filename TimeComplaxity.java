package Java;

public class TimeComplaxity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =1;
		System.out.println(i);//1
		
		//Constant time-  Big O(1)
		
		String s="tom";
		System.out.println(s);//O(n)
		
		
		int n=10;   
		for (n=1 ; n<10;n++) {
			System.out.println(n);
			System.out.println(n+1);
			System.out.println(n+2);
		}
		
		//1 +n +n +n= 3n+1;-->Liner Eq
		//3n+1-->3n--->O(n)
		
		
		
		
		
		

	}

}
