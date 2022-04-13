
public class StaticInnerClasses {
	public static void main(String[] args) {
		System.out.println(AAA.i);
		AAA.BBB obj1 = new AAA.BBB();
		System.out.println(obj1.j); 
		System.out.println(AAA.BBB.a);
		
	}
}

class AAA{
	static int i = 10;
	static class BBB {
		int j = 20;
		static int a = 10;
	}
}
