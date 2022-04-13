
public class MemberInnerClasses {
	public static void main(String[] args) {
		AA aObj = new AA();
		System.out.println(aObj.i);
		
		AA.BB bObj = aObj.new BB();
		System.out.println(bObj.j);
	}
}

class AA{
	int i=10;
	class BB{
		int j=20;
		private int x;
		BB(){}
		private BB(int x) {
			this.j = x;
		}
	}
	public static void main(String[] args) {
		
		AA obj1 = new AA();
		BB obj = obj1.new BB(80);
//		obj.x=10;
		System.out.println(obj.x);
		
		
		
	}
}