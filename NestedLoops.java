package Java;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Nested loops
		
		
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=4;j++) { 
				System.out.print(i+ ""+ j+" ");
			}
			System.out.println();
		}
		System.out.println("_____________");
		
		//(1+n+n+n) (1+n+n+n)==>(1+3n) (1+3n)==>1+3n+3n^2+9n==> o(n)
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(i+ ""+ j+" ");
			}
			System.out.println();
		}
		
		
		byte f=065;//octal number ==>0 to 7 for each digit
		System.out.println(f);
		//octal to decimal 065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 53
		
		for(char ch='0';ch<='9';ch++) {
			System.out.println(ch+ "="+ (byte)ch);
		}
	}

}
