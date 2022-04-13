// TO DEMONSTRATE THE ANONYMOUS INNER CLASS
public class AnonymousInnerClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		// Anonymous inner class is used to define abstract methods 
		Phone phone = new Phone() {
			public void call() {
				System.out.println("Calling..... (Abstract method)");
			}
		};
		
		phone.call();
		
		
		// Anonymous inner class can be used to define Interface methods
		Phone2 p = new Phone2() {
			public void call() {
				System.out.println("Calling..... (Interface method)");
			}
		};
		p.call();
		
	}

}

// abstract class Phone with method call()
abstract class Phone {  
	abstract public void call();
}

// interface Phone2 with method call()
interface Phone2 {
	void call();
}
