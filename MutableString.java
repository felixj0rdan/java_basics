// TO DEMONSTRATE STRING BUFFER

public class MutableString {

	public static void main(String[] args) {
		
		// create a string buffer object and store a string in it
		StringBuffer sbf = new StringBuffer("felix");
		
		// now we can perform functions on the object itself 
		// it is a mutable string
		sbf.append("j");  // there are more such functions like this to modify the string object
		System.out.println(sbf);
		

	}

}
