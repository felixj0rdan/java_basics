import java.util.*;

public class TestGarbage{
	
	int i;
	
 public void finalize () {System.out.println ("object is garbage collected"); }
 public static void main (String args[]) {
  int b[]= {1,2,3,4};
  Integer x=new Integer(9);
  for(int i: b)
	  System.out.print(i+" ");
  check(b);
  System.out.println();
  for(int i: b)
	  System.out.print(i+" ");
  
  
  System.out.println();
  System.out.println(x);
  check2(x);
  System.out.println(x);
  
  List<Integer> list = new ArrayList<>();
  
  list.add(1);
  list.add(2);
  list.add(3);
  list.add(4);
  
  check3(list);
  
  System.out.println(list);
  
  TestGarbage t = new TestGarbage();
  t.i = 3;
  
  changeObjRef(t);
  
  System.out.println(t.i);
  
  String s = "123";
  stringCheck(s);
  
  System.out.println(s);
  
  Integer n = new Integer(13);
  
  check5(n);
  
  System.out.println(n);
  
  
 }
 static void check(int[] a) {
	 a[2] = 9;
 }
 static void check2(Integer y) {
	 y=y+10;
 }
 static void check3(List<Integer> l) {
	 l.set(2, 9); 
 }
 
 static void changeObjRef(TestGarbage a) {
	 a.i = 10;
 }
 
 static void stringCheck(String s) {
	 s = "abc";
 }
 
 static void check5(Integer f) {
	 f = 10;
 }
}