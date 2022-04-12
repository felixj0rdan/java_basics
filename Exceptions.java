
public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// default exceptions
		try {
			System.out.println(1/0);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			int arr[] = new int[3];
			arr[4] = 4;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		// user defined exceptions
		onlyEvens(5);

	}
	static void onlyEvens(int a) {
		try {
			if(a%2 != 0) // if odd
				throw new OddException("Got odd number.");
			System.out.println("even");
		} catch (OddException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
class OddException extends Exception {
	public OddException(String s) {
		super(s);
	}
}
