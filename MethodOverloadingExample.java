com.remotetiger.corejava.polymorphism    // they should be of lowercase letters

public class MethodOverLoadingExample {
	
	public String saySomething() {
		
		return "No argument was given, so this is a default message";
		
	}
	
	public String saySomething(String firstName) {
		return "Hello! " + firstName;
	}
	
	public String saySomething(String firstName, String lastName) {
		return "Hello! Mr. " + firstName + " " + lastName;
		
	}
	
	public String saySomething(Integer number) {
		for(int i = 0; i < number; i++) {
			System.out.println(i);
		}
		return "Hello to you " + number + "time(s)";
	}

	public static void main(String[] args){
	
	

	}

}

