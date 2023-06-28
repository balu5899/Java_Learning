package Java;

public class Class_Object_Concepts {
	
	//class variable---class data member
	String name;
	int age;
	String city;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String name = "Naveen" ;   //local variable
		
		//class- blueprint of object/category of object
		//object- Physical entity
		
		//object of the class new keyword
		
		Class_Object_Concepts obj = new Class_Object_Concepts();
		obj.name= "balaji";
		obj.age=23;
		obj.city= "pune";
		System.out.println(obj.name +" "+obj.city +" " +obj.age);
		
		
				
		Class_Object_Concepts obj1 = new Class_Object_Concepts();
		obj1.name= "Ajith";
		obj1.age=21;
		obj1.city= "Satarta";
		System.out.println(obj1.name+" "+ obj.age+" "+ obj.city);
		
		
		Class_Object_Concepts obj2 = new Class_Object_Concepts();
		obj2.name="Sidd";
		obj2.age=27;
		obj2.city="Latur";
		
		System.out.println(obj2.name +" " +obj2.age + " " + obj2.city);
		
		
		
		
		
		
		
		
		

	}

}
