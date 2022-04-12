
public class STATIC {

	public static void main(String[] args) {
		Airplane plane1 = new Airplane();
		Airplane plane2 = new Airplane();
		Airplane plane3 = new Airplane();
		
		plane1.land();
		
		System.out.println(plane1.hasLanded());
		System.out.println(plane2.hasLanded());
		System.out.println(plane3.hasLanded());
	}

}

//class Airplane {
//
//	private int id;
//	
//	private static boolean landed;
//	
//	public void takenOff() {
//		landed = false;
//	}
//	
//	public void land() {
//		landed = true;
//	}
//	
//	public boolean hasLanded() {
//		return landed;
//	}
//
//}

