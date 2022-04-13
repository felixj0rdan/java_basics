// to check the limit of the Integer pool
public class IntegerPool {

	public static void main(String[] args) {
		Integer a , b ;
	    for(int i = 120 ; i <=129; i++) {
	        a = i;
	        b =i; 
	        
	        System.out.println("For value "+i);
	        System.out.println("== : " + (a==b)); // == operator is used to compare the reference 
	        System.out.println(".equals(): "+a.equals(b)); // .equals() fn is used to compare the value the reference holds
	        
	        System.out.println("-----------------------");
	    }
	}

}
