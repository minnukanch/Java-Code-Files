package com.semanticsquare.basics; // Matching directory structure on the file system and we got to place the below class in the above directory structure

/**
*Demonstrates Java's basic langisge features
* @author Minnu 
*
*/

public class BasicsDemo {
	static void print() {
    System.out.println("\n\nInside print ...");
    System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
    System.out.println();                 // Print empty line
    System.out.print("Hello, world!!");   // Cursor stayed after the printed string
    System.out.println("Hello,");
    System.out.print(" ");                // Print a space
    System.out.print("world!!");
	}
	
	
	static void switchExample() {
		System.out.println("\nInside switchExample ...");
		int month = 3;
		
		switch (month) {
			case 1: System.out.println("january");
			break;
			case 2: System.out.println("February");
			break;
			case 3: System.out.println("March");
			break;
			default: System.out.println("April");
		}
	}
	
	static int min(int x, int y) {
		int result = (x < y) ? x:y;
		return result;
	}
	
	static void stringExamples() {
	System.out.println("\nInside stringExamples ...");
	String s = "hello world!";
	System.out.println("s: " + s);
	
	/*System.out.println("\ns.length(): " + s.length());
	System.out.println("s.isEmpty(): " + s.isEmpty()); */
	
	// Comparison
	 System.out.println("\ns.equals(\"Hello World!\"): " + s.equals("HELLO WORLD!"));
	System.out.println("s.equalsIgnoreCase(\"Hello World!\"): " + s.equalsIgnoreCase("HELLO WORLD!"));
	System.out.println("s.compareTo(\"Hello World!\"): " + s.compareTo("Hello World!")); 

	// Searching 
	System.out.println("\ns.contains(\"Hello World!\"): " + s.contains("HELLO WORLD!"));
	System.out.println("s.contains(\"world!\"): " + s.contains("world!"));
	System.out.println("s.startsWith(\"HELLO WORLD!\"): " + s.startsWith("HELLO WORLD!"));
	System.out.println("s.startsWith(\"hello World!\"): " + s.startsWith("hello world!"));
	System.out.println("s.endsWith(\"!\"): " + s.endsWith("!"));
	System.out.println("s.indexOf(\"lo\"): " + s.indexOf("lo"));
	System.out.println("s.indexOf (\"o\"): " + s.indexOf('o'));
	System.out.println("s.lastIndexOf(\"o\"): " + s.lastIndexOf('o'));
	
	// Examining individual characters
		System.out.println("\ns.charAt(4): " + s.charAt(4));
		
	// Extracting substrings
		System.out.println("\ns.substring(4): " + s.substring(4));
		System.out.println("s.substring(4, 9): " + s.substring(4, 9));
		
	// Case conversions (Note: String is immutable. So, only a copy is returned)
		System.out.println("\ns.toUpperCase(): " + s.toUpperCase());
		System.out.println("s.toLowerCase(): " + s.toLowerCase());
		
		System.out.println("\ns.trim(): " + s.trim()); // returns a copy of string after trimming any leading & trailing white spaces
		
	// Replace (e.g., replace comma's with white-space)
		System.out.println("\ns.replaceAll(\"o\", \"r\"): " + s.replaceAll("o", "r"));
		
	// Split (e.g., split a document into words or split a line of text by tab or comma or white space)
		System.out.println("\ns.split(\"o\"): ");
		String[] sa = s.split("o");
		for (String temp : sa) {
			System.out.println(temp);
		}	

}

	 static void Examples(){
		
		String sg = "Hello";
		
		String sg1 = sg.concat("World");
		
		String sk = "World"; // Here sg1 is created with the Hello World and is stored in the heap where the objects are stored.
							 // So,here sk would point to the name World in the String pool. 
		System.out.println("/nis sk same as sg1: " + sk == sg1); // Therefore sk and sg1 are not equal respectively.
		
	}
	
	static void stringPool() {
		System.out.println("\nInside stringPool...");
		String s1 = "hello!";
		String s2 = "hello!";
		String s3 = "hello!".intern();
		String s4 = new String("hello!");
		final String s5 = "lo!"; // It recognizes at compile time itself respectivley, that means it converts into byte code
		
		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1 == s3: " + (s1 == s3));
		System.out.println("s1 == s4: " + (s1 == s4));
		System.out.println("s1 == s4.intern(): " + (s1 == s4.intern()));
		System.out.println("s1 == \"hel\" + \"lo!\": " + (s1 == "hel" + "lo!"));
		System.out.println("s1 == \"hel\" + s5: " + (s1 == "hel" + s5));
		
		String s = "hello" + "world!";
		System.out.println("s:" + s);
		
		StringBuffer sb = new StringBuffer(s);
		sb.append("good").append("morning :)");
		System.out.println("sb: " + sb.toString());
		System.out.println("sb.length: " + sb.length());
		sb.delete(1, 5);
		System.out.println("sb: " + sb.toString());
		System.out.println("sb.length: " + sb.length());
		sb.insert(1, "ey");
		
	}
			public BasicsDemo(){
				System.out.println("Inside no-args constructor ...");
			}
			
			
			public BasicsDemo(int id){
				System.out.println("Inside parameter with a parameter ...");
			}
				
				
		
		{

			System.out.println("Inside instance initializer ...");
		
		}
			

	public static void main(String[] args) {
		
		
		BasicsDemo bd = new BasicsDemo();
		
		String s4 = new String("hello");
		
		System.out.println("String: " + s4);
		
		stringExamples();
		Examples();
		
		stringPool();
		
	   	// Language Basics 1
		print();
		switchExample();
		int min = min(9,3);
		System.out.println("min: " + min);
		
		int[] kArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int o = kArray.length - 1; o >= 0 ; o--) {
			System.out.println(kArray[o]);
		}
		
		int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int k = 0, l = 0;
		for (k = 1, l = 1; k < myArray.length && l < myArray.length; k++, l++) {
			System.out.println(myArray[k] + " " + myArray[l]);
		}
		
		int[] IsArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(int m = 0; m < IsArray.length; System.out.println(IsArray[m++]));
		
		int[] iArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int i = 0, j = iArray.length - 1, middle = iArray.length/2; i < middle; i++, j--) {     
			int temp = iArray[i];
			iArray[i] = iArray[j];
			iArray[j] = temp;
		}
		for(int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + " ");			
		}
			
		// To find the number of divisors 
		int x = 24;
		int count = 0;
		
		for(int i = 0; i <= 24; i++) {
			if (x % 2 == 0) {
				
				count++;
			}
		}   
		 System.out.println("\ndivisors count: " + count);
		 
		int [][] studentGrades = {{76, 52, 69, 83, 45, 90}, {22, 71, 67, 69, 40}, {53, 87, 91, 26}};
		
	for(int i = 0; i < studentGrades.length; i++) {
		int max = 0;
		System.out.println("Displaying the grades: " + i);
		
		for(int j = 0; j < studentGrades[i].length; j++) {
			if(studentGrades[i][j] > max) {
				max = studentGrades[i][j];
			}
		System.out.println(studentGrades[i][j] + " ");
        }
		 System.out.println("\nmax: " + max);
	} 	 
	       		
	// for-each statement
	
	iArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	for(int i = 0; i < iArray.length; i++) {
		System.out.print(iArray[i] + " ");
	}
	
	for (int i: iArray) {
		System.out.print(i + " ");
	}
	
	// Roliing of two dices together 
	
	int[] Dice1 =  {1, 2, 3, 4, 5, 6};
	int[] Dice2 =  {1, 2, 3, 4, 5, 6};
	
	for (int i = 0;  i < Dice1.length; i++) {
		for (int j = 0; j < Dice2.length; j++) {
			System.out.println(Dice1[i] + " "+ Dice2[j]);
		}
	}
	for(int i: Dice1) {
		for(int j : Dice2) {
			System.out.println(i + " " + j);
	}
	
	}
	
	// Parallel iteration of two arrays 
	int[] dice1 = {1, 2, 3, 4, 5, 6};
	int[] dice2 = {1, 2, 3, 4, 5, 6};

	for(int i = 0, j = 0; i < dice1.length && j < dice2.length; i++, j++) {
		System.out.println(dice1[i] + " " + dice2[j]);

	}
	
	String s1 = "Hello \"Mr\". John, \n\tHow are you\\?"; // Horizontal tabs are especially useful if you are writing data to files
	// For example if we are writing product data, we might have product name, product description. in this area tabs are useful\
	// To Insert a backslash respetively...
	
	// String s2 = "Hello \"Mr\". \'John, How are you?";
	
	// (or) String s2 = "Hello \"Mr\". 'John, How are you?";
	
	
	System.out.println(s1);
	
	char[] s2 = {'h', 'e', 'l', 'l', 'o'};
	
	char[] s3 = {'\'', ' " ', 'l', 'l', 'o'};
	
	
}

public void foo(){
	System.out.println("foo of the basic demo");
}

	
} 



/*

	Item 46: Prefer for each-loops to traditional for loops
	
	1. Cleaner Syntax
	2. No Peformance penalty (could be better for arrays)
	3. Eliminates any opportunities for error (eg., copy-and-paste)
			Note: Preferred for nested iterations
*/

// When would we prefer traditional for: need access to index

// 1. tranform array (Swaping the numbers)
// 2. Parallel iteration ( In each iteration of a for loop, we have to iterate over multiple arrays in the same iteration)
// For example: StudentGrades
// 3. Backward iteration
// 4. Filtering: other data structures 
 
















