
interface Calc {
	int operation(int i, int j);
}
public class FunctionalProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// storing lambda fns
		Calc c = (i, j) -> i+j;
		// passing lambda fns
		int res = doFunc(2, 3, c);
		System.out.println(res);

	}
	static int doFunc(int a, int b, Calc calc) {
		return calc.operation(a, b);
	}

}
