
/*
 * public class general {
 * 
 * public static void main(String[] args) {
 * 
 * int[][] x= {{10,30,40},{20,67,56}}; System.out.println(x[0].length); }
 * 
 * } public class general{ public static void main(String[] args) { sum(new
 * int[] {10,30,40,60}); }
 * 
 * public static void sum(int[] x) { for(int x1:x) { System.out.println(" "+
 * x1); } double f=0123.456; System.out.println(f); } }
 */
/*
 * class general{ public static void main(String[] args)throws Exception {
 * Object o=Class.forName(args[0]).newInstance();
 * System.out.println("object created for:"+o.getClass().getName());
 * 
 * } } import static java.lang.Math.*; class general { public static void
 * main(String[] args) { System.out.println(sqrt(4));
 * System.out.println(max(10,20)); System.out.println(random()); } }
 */

/*
 * strictfp abstract class MyClass { abstract void myAbstractMethod(); }
 * 
 * class MySubclass extends MyClass {
 * 
 * void myAbstractMethod() {
 * 
 * } }
 * 
 * public class general { public static void main(String[] args) { MySubclass
 * obj = new MySubclass(); obj.myAbstractMethod(); } }
 * 
 * import java.util.ArrayList; public class general { public static void
 * main(String[] args) { ArrayList l= new ArrayList();
 * System.out.println("hello"); } } import java.util.Date; import java.sql.*;
 * class general { public static void main(String[] args) { Date d=new Date();
 * System.out.println(d.getClass().getName()); } } import static
 * java.lang.Math.sqrt; import static java.lang.Math.*; class general { public
 * static void main(String[] args) { System.out.println(sqrt(4));
 * System.out.println(max(10,20)); System.out.println(random());
 * 
 * } } class general{ public static void main(String[] args) { int i=5; do {
 * System.out.println(i); i++; } while(i<=10); } } interface Interf{ int x=10; }
 * class general implements Interf{ public static void main(String[] args) { int
 * x=777; System.out.println(x);
 * 
 * } }
 */
/*
 * class general{ //public void m1(int i) { //System.out.println("int-arg"); //}
 * public void m1(float f) { System.out.println("float-arg"); } public static
 * void main(String[] args) { general g=new general(); g.m1(10.0);
 * 
 * } }
 */

/*
 * class general{ public void m1(String s) {
 * System.out.println("string version"); } public void m1(Object o) {
 * System.out.println("object version"); } public static void main(String[]
 * args) { general g=new general(); g.m1(new Object()); g.m1("durga");
 * g.m1(null);
 * 
 * } }
 */
/*
 * class P{ public static void m1(){ System.out.println("parent");
 * 
 * } } class C extends P{ public static void m1() { System.out.println("child");
 * } } class general{ public static void main(String[] args) { P p=new P();
 * p.m1(); C c=new C(); c.m1(); P x=new C(); x.m1();
 * 
 * } }
 */
/*
 * class general{ static int s="java".length();
 * 
 * public static void main(String[] args) {
 * 
 * 
 * System.out.println(s);
 * 
 * }}
 */

/*
 * class P{ public void m1(int... x) { System.out.println("parent"); } // public
 * void m(int... x) { // System.out.println("subparent");
 * 
 * //} }
 * 
 * class C extends P{ public void m1(int... x) { System.out.println("cjild"); }
 * } class general{ public static void main(String[] args) { P p=new P();
 * p.m1(10); C c=new C(); c.m1(10); P p1=new C(); p1.m1(10);
 * 
 * } }
 */
  public strictfp class general  {

    // This method performs floating-point calculations
    strictfp void performCalculations(double a, double b) {
        double result = a * b;
        System.out.println("Result of multiplication: " + result);
    }

    public static void main(String[] args) {
    	general  example = new general  ();

        // Call the method to perform calculations
        example.performCalculations(10.5, 20.75);
    }
}

