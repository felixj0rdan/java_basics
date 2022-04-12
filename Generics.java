import java.util.*;

class Container<T extends Number> {
	T value;
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void show() {
		System.out.println(value.getClass().getName());
	}
	public void numberList(ArrayList<? extends Number> list) {
		
	}
}

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> values = new ArrayList<>();
//		
//		values.add(8);
////		values.add("felix");
//		
//		int a = Integer.parseInt(values.get(0).toString());
//		
//		System.out.println(a);
//		
//		values.forEach(i -> System.out.println(i));
		
		Container<Integer> obj = new Container<>();
		obj.value = 9;
		obj.show();
		obj.numberList(new ArrayList<Integer>());
	}

}
