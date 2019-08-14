public class ArthemeticOperator {
	
	
	static void preAndPost() {
		
		System.out.println("\nInside PreAndPost ...");
		
		int x = 5;
		
		//int i = ++x;
		//int j = --x;
		
		
		//System.out.println("i: " + i);
		//System.out.println("j:" + j);
		
		//int y = x++;
		
		//iny y = x--;
		
		//int y = ++x;
		
		//int y = --x;
		
		//System.out.println("y: " + y + ", x: " + x);
		
		int[] array = new int[3];
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		
		
		int[] myarray = new int[4];
		
		int index = 0;
		
		myarray[index++] = 10;
		
		myarray[index++] = 20;
		
		myarray[index++] = 30;
		
		myarray[index++] = 40;
		
		System.out.println(index);
		
		//int[] myarray = new int[4];
		
		//int index = -1;
		
		//myarray[++index] = 10;
		
		//myarray[++index] = 20;
		
		//myarray[++index] = 30;
		
		//myarray[++index] = 40;
		
		//System.out.println(index);
		
	}
	
	static void compoundArithemeticAssignment() {
		
		int x = 100;
		
		System.out.println("x += 5: " + (x += 5));
		System.out.println("x -= 5: " + (x -= 5));
		System.out.println("x *= 5: " + (x *= 5));
		System.out.println("x /= 5: " + (x /= 5));
		System.out.println("x %= 5: " + (x %= 5));
		
	}
	
	static void isOddOrEven(int num) {
		System.out.println(num % 2);
	}
	
	public static void main(String[] args) {	
	    preAndPost();
		isOddOrEven(100);
	
	}       
}