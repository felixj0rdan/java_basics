
abstract class Dog {
	String breed;
	
	public void bark() {
		System.out.println("Bark");
	}
	
	public abstract void setBreed(String breed);
//	public abstract void run();
}

class Dober extends Dog{
	public void setBreed(String breed) {
		this.breed = breed;
	}
//	public void run() ;
}

public class AbstractTut {

	public static void main(String[] args) {
		
		// Cannot instantiate an object for an abstract class
//		Dog d = new Dog();
//		d.bark();
		
		Dober d = new Dober();
		d.bark();
		d.setBreed("Dober");
		
		System.out.println(d.breed);
		
//		long l = 5000000000l;
	}

}
