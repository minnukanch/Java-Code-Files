




// Here, the string pool also resides objects but only string objects that are related using string literals.
// To go on the string pool all we need is the string literals. It doesnt matter where that literal appears. Literal can also be a part
// of System or print statement... provided the string literal is created using the string object...

String s4 = new String("hello");
		
		System.out.println("String: " + s4);
		
//Compile term errors vs run-time errors

Compile-term errors;
//a class tries to extend more than one class
//overloading or overidding its not implemented correctly 
//declare two(class or instance) members with the same name 
//trying to change the value of an already initialized constant ( final member)
// attempt to refer to a variable that is not in the scope of the current block

//run-time errors
// trying to invoke a method on an unintialized variable
// ran out memory(memory leaks...) 
// trying to open a file that doesn't exist. 
