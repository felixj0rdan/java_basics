// TO DEMONSTRATE INHERITANCE

// main class to inherit other classes
public class Inheritance extends A{

	public static void main(String[] args) {
		
		// creating an A class object
		A aObj = new A();
		aObj.show();  // since the object is A class object, A class method show is executed
		
		// creating a B class object
		B bObj = new B();
		bObj.show();  // since the object is A class object, A class method show() is executed
		
		// object created with A object but B class constructor
		A abObj = new B();
		abObj.show(); // B class function (overrides)
		
		// Inheritance class object
		Inheritance obj = new Inheritance();
		obj.show();   // since Inheritance class extends A class, the method show() in A class is executed
	}

}

// super class A
class A {
	public void show() {
		System.out.println("A class function.");
	}
}


// B class inherits A class
class B extends A{
	// method show() in A class get overridden  
	public void show() {
		System.out.println("B class funciton.");
	}
}