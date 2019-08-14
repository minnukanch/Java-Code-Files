public  class ConstructorOverloadingDriver {
	
	
	
	
	public static void main(String[] args) {
		
		ConstructorOverloadingExample constructorOverloadingExample = new ConstructorOverloadingExample();
		System.out.println("success");
		
		String name1 = constructorOverloadingExample.sayName();
		System.out.println(name1);
		
		String name2 = constructorOverloadingExampleWithOneArg.sayName();
		System.out.println(name2);
			
	}
	
	
}