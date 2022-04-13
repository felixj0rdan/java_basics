

@FunctionalInterface
interface Demo1 {
	void abc();
//	void xyz();
	default void show() {
		System.out.println("show interface");
	}
	default void show2() {
		System.out.println("show interface");
	}
} 

class DemoImp implements Demo1 {
	public void abc() {
		System.out.println("ine abc");
	}
	public void xyz() {
		System.out.println("ine xyz");
	}
	public void show() {
		System.out.println("In new show");
	}
}

public class DefaultInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 obj = new DemoImp();
		obj.show();
	}

}
