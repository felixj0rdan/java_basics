// ACCESSING STATIC AND NON-STATIC INNER CLASS


public class StaticInnerClasses {
	public static void main(String[] args) {
		
		// non-static outer class and non-static outer class
		System.out.println("Non-static outer class and non-static outer class.");
		A1 a1Obj = new A1();
		System.out.println(a1Obj.i);
		A1.B1 b1Obj = a1Obj.new B1();
		System.out.println(b1Obj.j);
		
		// static outer class and non-static inner class
		System.out.println("Static outer class and non-static inner class:");
		A2 a2Obj = new A2();
		System.out.println(a2Obj.i);
		A2.B2 b2Obj = a2Obj.new B2(); 
		System.out.println(b2Obj.j);
		
		// non-static outer class and static inner class
		System.out.println("Non-static outer class and static inner class:");
		A3 a3Obj = new A3();
		System.out.println(a3Obj.i);
		A3.B3 b3Obj = new A3.B3();
		System.out.println(b3Obj.j);
		
		// static outer class and static inner class
		System.out.println("Static outer class and static inner class:");
		A4 a4Obj = new A4();
		System.out.println(a4Obj.i);
		A4.B4 b4Obj = new A4.B4();
		System.out.println(b4Obj.j);
		
		
		
		
	}
	static class A2{
		int i = 20;
		class B2{
			int j = 200;
		}
		
	}
	
	static class A4{
		int i = 40;
		static class B4{
			int j = 400;
		}
		
	}
	
}

class A3{
	int i = 30;
	static class B3 {
		int j = 300;
	}
}

class A1{
	int i = 10;
	class B1{
		int j = 100;
	}
}