class MathUtils{
	public static double add(int a,int b) {
		return a+b;
	}
	public static double sub(int a,int b) {
		return a-b;
	}
	public static double mul(int a,int b) {
		return a*b;
	}
	public static double div(int a,int b) {
		return a/b;
	}
}

public class Areth {

	public static void main(String[] args) {
		System.out.println(MathUtils.add(20, 10));
		System.out.println(MathUtils.sub(20, 10));
		System.out.println(MathUtils.mul(20, 10));
		System.out.println(MathUtils.div(20, 10));
		
		

	}

}
