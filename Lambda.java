// TO DEMONSTRATE LAMBDA FUNCTIONS

import java.util.*;
interface Operator{
	int operate(int a, int b);
}
public class Lambda {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=10; i++)
			list.add(i);
		
//		forEach and lamda implementation
		list.forEach(i -> System.out.print(i+" ")); 
		
		System.out.println();
		
//		to define an interface function lambda function can be used
		Operator sumObj = (a, b) -> a+b;
		Operator multObj = (a, b) -> a*b;
		
		System.out.println(sumObj.operate(2, 3));
		System.out.println(multObj.operate(2, 3));
	}
	
}

