public class ConstructorOverloadingExample {

	private String firstName;
	private String lastName;
	
	public ConstructorOverloadingExample() {
		super();
		
	}
	
	public ConstructorOverloadingExample(String lastName) {
		this.lastName = lastName;
		
	}
	
	public ConstructorOverloadingExample(String lastName, String firstName) {
		
		this.lastName = lastName;
		this.firstName = firstName;
	}


	public String sayName() {
		return "the name(s) is/are firstName = " + this.firstName + "lastName = " + this.lastName;
	}
	
}