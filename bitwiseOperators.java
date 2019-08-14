public class bitwiseOperators {
	
	static void BitwiseOperators() {
		
		System.out.println("\nInside bitwiseOperators ...");
		
		int x = 1;
		int y = 3;
		
		System.out.println("x & y: " + (x & y));
		System.out.println("x | y: " + (x | y));
		System.out.println("x ^ y: " + (x ^ y));
		System.out.println("~x: " + ~x);
		System.out.println("true & false: " + (true & false));
		
		char c1 = 'a';  // UTF = 0110 0001
		char c2 = 'b';  // UTF = 0110 0010
		System.out.println("c1 | c2: " + (c1 | c2)); // bit-wise work only on integer types but not on double.
		
	}
			
	public static void main(String[] args) {	
	    
        BitwiseOperators();		
  }       
 }
	
	
	