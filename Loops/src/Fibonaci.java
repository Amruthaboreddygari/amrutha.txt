
public class Fibonaci {

	public static void main(String[] args) {
		int x=0,y=1,sum=0;
		int n=5;
		for(int i=0;i<=n;i++) {
			sum=x+y;
			x=y;
			y=sum;
		
		System.out.println(y);
		}
	}

}
