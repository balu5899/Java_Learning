  package Java;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20;
		int b = 30;
		System.out.println(a+b);
		System.out.println("a+b");
		
		String s1 = "testing";
		String s2 = "Automation";
		
		System.out.println(s1+s2);
		System.out.println(a+b+s1+s2);
		System.out.println(a+s2+s2+b);
		System.out.println(s1+s2+a+b);
		System.out.println(s1+s2+(a+b));
		System.out.println(s1 + " " + s2);
		
		char c1= 'A';
		char c2 = 'v';
		
		//a-z= 97-122
		//A-Z= 65-90
		//0-9= 48-57
		
		System.out.println(c1+c2);
		
		char c3 ='z';
		System.out.println(c1+c2+c3);
		
		System.out.println('a'+'b');
		
		System.out.println("a+b");
		
		//System.out.println(a+b);
		
		System.out.println((byte)'a');
		System.out.println((byte)'$');
		
		int i1 = 100;
		int i2 = 300;
		System.out.println("the value of s1 is:" + i1 );
		System.out.println("the values of s2 is" + i2);
		System.out.println("the value of i1 and i2 is  :" + (i1+i2));

	}

}
