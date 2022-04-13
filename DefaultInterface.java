// TO DEMONSTRATE DEFAULT INTERFACE METHODS

@FunctionalInterface
interface Demo1 {
	void abc();  // functional interface can have only one interface method
	
	// but it can have multiple default methods
	default void show() { 
		System.out.println("show interface");
	}
	
	// second default method
	default void show2() { 
		System.out.println("show2 interface");
	}
} 

// a class to implement the Demo1 interface methods
class DemoImp implements Demo1 {
	
	// the interface method abc is defined here 
	public void abc() {  
		System.out.println("In abc");
	}
	
	public void xyz() {  
		System.out.println("In xyz");
	}
	
	// the default interface methods gets overridden
	public void show() {  
		System.out.println("In new show(old one overridden.)");
	}
}

public class DefaultInterface {

	public static void main(String[] args) {

		// an object to access the methods
		Demo1 obj = new DemoImp(); 
		obj.abc();
		obj.show(); // default method which got overridden
		obj.show2(); // default method 
	}

}
