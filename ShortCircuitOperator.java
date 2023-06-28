package Java;

public class ShortCircuitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int a= 700;
		int b=900;
		int c=8888;
		
		// && SHORT CIRCUIT OPERATOR
		if (a>b && a>c) {//false && /false
			System.out.println("A is greater");
		}
		else if (b>c) {
			System.out.println("B is greater");
			}
		else {
			System.out.println("c is greater");
		}
		
		
		
	    	
		
		
		
		
	}

}
