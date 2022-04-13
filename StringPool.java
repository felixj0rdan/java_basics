// TO DEMONSTRATE THE FUNCTIONING OF STRING POOL

// == will compare references
// .equals() will compare values

public class StringPool {

	public static void main(String[] args) {

		String s1 = "cat";
		String s2 = "cat";
		
		// the reference is getting compared and since both s1 and s2 point to the same "cat" object
		// in the string pool the output will be true
		System.out.println(s1==s2);  
		
		
		// here a will point to the existing "cat" object in the string pool
		String a = "cat";
		
		// here b will point to a different object "cat" in the java heap
		String b = new String(a);
		
		// since a and b point to two different objects they will different references 
		// and the statement will return false
		System.out.println(a==b);
		
		// even though a and b point to two different references their values will be "cat"
		// so the below statement will print true
		System.out.println(a.equals(b));
		
	}

}
