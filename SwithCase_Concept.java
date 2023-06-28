package Java;

public class SwithCase_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		
		String browser= "operi";
		switch (browser) {
		case "chrome":
			System.out.println("Launch chrome");
			break;
		case "firefox":
			System.out.println("Launch firefix");
			break;
		case "safari":
			System.out.println("Launch Safari");
			break;
		case "ie":
			System.out.println("Launch Ie");

		default:
			System.out.println("Please pass the right browser ");
			break;
		}
		
		
	}

}
