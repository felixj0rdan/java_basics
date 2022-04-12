public class TestGarbage{
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
 }
 static void check(int[] a) {
	 a[2] = 9;
 }
 static void check2(Integer x) {
	 x=x+10;
 }
}