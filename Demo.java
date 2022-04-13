// TO ACCESS A PRIVATE CONSTRUCTOR AND TO CREATE AN OBJECT

class Demo2 {
	public int i=100;
	// private constructor which can be used to create an object in a different class
	private Demo2() {
		
	}
	
	// static method to create an object using private constructor
	public static Demo2 creatObj() {
		Demo2 d = new Demo2();
		return d;
	}
	
	// non-static method
	public void show() {
		System.out.println("Show");
	}

}

class Demo {
	public static void main(String[] args) {
		// now if we try to create an object with the Demo2 constructor we won't be able to
//		Demo2 demo2 = new Demo2(); //will throw an error
		
		// so we use the method createObj() to create an object
		
		Demo2 demo2 = Demo2.creatObj();  // demo2 is the object created
		
		System.out.println(demo2.i);  // now using demo2 we can access non-static variables
		
		demo2.show();  // we can also access non-static methods
		
	}
}
