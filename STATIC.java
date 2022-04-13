// TO DEMONSTRATE THE USES OF STATIC 
// class Airplane is used

public class STATIC {

	public static void main(String[] args) {
		Airplane plane1 = new Airplane();
		Airplane plane2 = new Airplane();
		Airplane plane3 = new Airplane();
		
		plane1.land();  // land() method is called on plane1 object
		
		System.out.println(plane1.hasLanded()); // since land method is called the landed attribute becomes true
		System.out.println(plane2.hasLanded()); // since land method is not called the landed attribute stays false
		System.out.println(plane3.hasLanded()); // since land method is not called the landed attribute stays false
		
		System.out.println(Airplane.totalPlanes); // since totalPlanes is a static it can be accessed using the class itself
		Airplane.increasePlanesBy(10);            // since increasePlanesBy() is a static method it can be accessed using the class itself
		System.out.println(Airplane.totalPlanes); 
	}

}


