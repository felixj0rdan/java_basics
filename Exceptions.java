// TO DEMONSTRATE EXCEPTIONS 


public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// default exceptions (few examples)
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
	
	// USER DEFINED EXCEPTION
	// a method to accept only even numbers and throw an exception if an odd number is got
	static void onlyEvens(int a) {
		try {
			if(a%2 != 0) // if odd
				throw new OddException("Got odd number. " + a); // calling the exception
			System.out.println("even");
		} catch (OddException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}

// user defined exception which extends the class Exception 
class OddException extends Exception {
	public OddException(String s) {
		super(s);// to set the message s 
	}
}
