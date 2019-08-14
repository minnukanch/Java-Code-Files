public class arrayExample {
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
    System.out.println("\n\n Counting Divisors");
	
	int x = 24;
	int count = 0;
	
	for(i = 1; i <= x; i++) {
		
		if(x % i == 0){
		System.out.println("/n Range of divisors: " + i);
			count++;
		}
	}
	
}
}