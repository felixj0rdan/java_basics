// TO DEMONSTRATE GENERICS IN JAVA

import java.util.*;


// class container to an user defined data type T
class Container<T extends Number> {
	private T value;
	
	// method to get the value
	public T getValue() {
		return value;
	}

	// method to set the value
	public void setValue(T value) {
		this.value = value;
	}
	
	// method to show the type of the data 
	public void show() {
		System.out.println(value.getClass().getName());
	}
	
	// ? here means any data type can be used
	// since it extends Number class it can be any data type in Numbers like Integer, Double, Float, etc.
	public void numberList(ArrayList<? extends Number> list) {
		
	}
}

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// container object accepting Integer type data
		Container<Integer> obj = new Container<>();
		
		// sets the value to 9
		obj.setValue(9);
		obj.show();
		System.out.println(obj.getValue());
		obj.numberList(new ArrayList<Integer>()); // to show the type
		
		// container object accepting Double data type
		Container<Double> obj2 = new Container<>();
		
		// sets the value to 3.9
		obj2.setValue(3.9);
		obj2.show();
		System.out.println(obj2.getValue());
	}

}
