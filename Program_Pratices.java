package Java;

public class Program_Pratices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1.WAP For Odd and Even Number
		
		  //0 is even numer 
		int num=7;
		if (num%2==0) {
			System.out.println(num+ "Numer is evern numer");
		}
		else {
			System.out.println(num + "number is odd num");
		}
		
		//2.WAP to check given alphabet character is Vowel or Consonant using Switch - Case
		
		char  vowel= 'A';
		switch (vowel) {
		case 'a':
			System.out.println("a is vowel");
		break;
		case 'i':
			System.out.println("i is vowel");
		break;
		case 'o':
			System.out.println("o is vowel");
		break;
		case 'u':
			System.out.println("u is vowel");
		break;
		

		default:
			System.out.println("Alphabate is not vowel");
			break;
		}
		
		//3. Please write above problem in if else condition
		
		//char cha= 'a';
		//if (cha ='a') {
		//	System.out.println();
			
			
		}
		
		//4. Switch case real time example
	 //WAP to execute your test cases in all Env like ,QA, PROD, UAT, DEV, STAG
	    
	//LOWECASE WILL CONVER ALL IN LOWRCASE AND TRIM IS CUTING OUTSIDE SPACES
	/*String env = "QA";
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
    }  */
	
	
		
		
		
		
		
}
	   

