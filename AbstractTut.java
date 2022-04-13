// TO DEMONSTRATE ABSTRACTION

// abstract class
abstract class Dog {
	public String breed;
	
	public void bark() {  // defined method
		System.out.println("Bark");
	}
	
	public abstract void setBreed(String breed); // abstract method
}

class Dober extends Dog{  // the class Dober extends the abstract class.
	public void setBreed(String breed) {  // and defines the abstract setBreed() method.
		this.breed = breed;
	}
}

public class AbstractTut {

	public static void main(String[] args) {
		
		// Cannot instantiate an object for an abstract class (next two lines will throw an error).
		// Dog d = new Dog();
    	// d.bark();
		
		// but since Dober class extends abstract Dog class, Dog class methods can be accessed by Dober class objects.
		Dober d = new Dober();
		d.bark(); // abstract method of class Dog.
		d.setBreed("Dober");
		
		System.out.println(d.breed);
		
	}

}
