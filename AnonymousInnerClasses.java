
public class AnonymousInnerClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Phone obj = new Phone();
//		obj.show();
		
//		Phone obj1 = new SmartPhone();
//		obj1.show();
		
		
		// Anonymous inner class
		Phone phone = new Phone() {
			public void show() {
				System.out.println("Call, sms, cam");
			}
		};
		
		phone.show();
		
		Phone p = () -> System.out.println("Call using lambda");
		p.show();
		
	}

}

//class Phone {
//	public void show() {
//		System.out.println("Call");
//	}
//}

interface Phone {
	void show();
}
