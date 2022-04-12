
public class Inheritance extends B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aObj = new A();
		aObj.show();  // A class function
		
		B bObj = new B();
		bObj.show();  // B class function
		
		A abObj = new B();
		abObj.show(); // B class function (overrides)
		
		Inheritance obj = new Inheritance();
		obj.show();   // Inheritance class function;
	}
//	void show() {
//		System.out.println("Inheritance class function.");
//	}

}

class A {
	static void show() {
		System.out.println("A class function.");
	}
//	staic vo
}

class B extends A{
	static void show() {
		System.out.println("B class funciton.");
	}
}