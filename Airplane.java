// CLASS DEFINED TO DEMONSTRATE STATIC FUNCTIONALITIES
// used in STATIC class

public class Airplane {
	
	public static int totalPlanes = 100;  // attribute of the Airplane class 

	private int id;  // attribute of an Airplane object 
	private boolean landed;  // attribute of an Airplane object 
	
	public void takenOff() {
		landed = false;
	}
	
	public void land() {
		landed = true;
	}
	
	public boolean hasLanded() {
		return landed;
	}
	
	public static void increasePlanesBy(int newPlanes) {
		totalPlanes += newPlanes;
	}

}
