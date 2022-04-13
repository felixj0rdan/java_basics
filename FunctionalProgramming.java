// TO DEMONSTRATE FUNCTIONAL PROGRAMMING

// interface to declare the method signature
interface Calc {
	int operation(int i, int j);
}
public class FunctionalProgramming {

	public static void main(String[] args) {
		
		// storing function as an object (addition)
		Calc add = new Calc() {
			public int operation(int i, int j) {
				return i+j;
			}
		};
		
		// storing lambda functions (multiplication)
		Calc mult = (i, j) -> i*j;
		
		// passing lambda functions
		int prod = doFunc(4, 3, mult);
		System.out.println(prod);
		
		// passing function as a value
		int sum = doFunc(4, 5, add);
		System.out.println(sum);

	}
	
	// method to which functions are passed
	static int doFunc(int a, int b, Calc calc) {
		return calc.operation(a, b);
	}

}
