
public class Airplane {

	private int id;
	
	private static boolean landed;
	
	public void takenOff() {
		landed = false;
	}
	
	public static void land() {
		landed = true;
	}
	
	public boolean hasLanded() {
		return landed;
	}

}
