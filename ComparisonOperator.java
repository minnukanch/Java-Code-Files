public class ComparisonOperator { 
	// Relational Operators 
    static void   comparisonOperators() {
	 int age = 25;
	/* if (age > 21) {
		 
		System.out.println("Graduate student");
		
	}*/
	
	System.out.println("age > 21: " + (age > 21));
		System.out.println("age >= 21: " + (age >= 21));  
		System.out.println("age < 21: " + (age < 21));
		System.out.println("age <= 21: " + (age <= 21));	  
		System.out.println("age == 21: " + (age == 21)); 
		System.out.println("age != 21: " + (age != 21));
		
	boolean isinternational = true;
		System.out.println("isinternational == true: " + (isinternational==true));
		System.out.println("isinternational != true: " + (isinternational != true));
		//System.out.println("isInternational <= true: " + (isInternational <= true)); 

    Student s1 = new Student(1000, "Subba");
	Student s2 = new Student(1000, "Subba");
	System.out.println("s1 == s2: " + (s1 == s2)); 
	System.out.println("s1 != s2: " + (s1 != s2));
	
	update(s1, "john");
}
	static boolean update(Student s, String) // How did you use an instance variable in a static method? (name)
		if (s == null) {                     //  are you using s.name since student is an object in the class Student? Can you explain in detail		
		                                     
			return false;
		}
			s.name = name;
			return true;
	}
	
public static void main(String[] args) {	
	   comparisonOperators();
	}       
}