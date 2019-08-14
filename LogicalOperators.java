public class LogicalOperators{
	
	static void logicalOperators() {
		System.out.println("\nInside logicalOperators ...");
		int age = 37;
		int salary = 95000;
		boolean hasBadCredit = false;
		
	if (!(age <= 35) && salary > 90,000 && !hadBadCredit) {            // Left-associative grouping ~ Order of grouping 
		System.out.println("Loan approved!");               // Associative property: (a && b) && c = a && (b && c)
	} else {                                                // Applies to both && and || operator
	}                                                       // Operator precedence of logical operators: Helps with only grouping operations. Not the order of excecution.
	                                                        //   (! > && > ||)
	/*if (age > 35 || salary > 90,000) {              //Other Examples: A && B || C && D = A && B || C && D)
	}*/                                                              // A && B && C || D = ((A && B) && C) || D
	
	public static void main(String[] args) {	
	
	
	}