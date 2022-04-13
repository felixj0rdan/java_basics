// final classes can not be inherited
// final methods can not be overridden
public class FinalDemo extends One{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		will throw error if uncommented(ln 8 9)
		One obj = new One();
		
		obj.show();
	}
	
	// final methods can not be overridden, will throw error if uncommented
//	public void show() {
//		System.out.println("Overridden show.");
//	}

}

class One {
	final public void show() {
		System.out.println("In one");
	}
}