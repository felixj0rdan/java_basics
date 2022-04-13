
public class StringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "cat";
		String s2 = "cat";
		
		System.out.println(s1==s2);
		
		String a = "cat";
		String b = new String(a);
		
		System.out.println(a.equals(b));

	}

}
