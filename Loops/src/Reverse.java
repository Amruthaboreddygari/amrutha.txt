/*
public class Reverse {

	public static void main(String[] args) {
		int x=12345;
		int  reverse=0;
		for(int i=x;i!=0;i=i/10) {
			int rem=i%10;
			reverse= reverse*10+rem;
			
		}
		System.out.println(reverse);
		
	}

}*/

/*class Reverse{
	public static void main(String[] args) {
		int x=1234,reverse=0;
		
		while(x!=0) {
			
			int remainder=x%10;
			reverse=reverse*10+remainder;
			x=x/10;
			
		}
		System.out.println(reverse);
	}
}*/
class Reverse{
	public static void main(String[] args) {
		int x=123,rev=0;
		do {
			int rem=x%10;
			rev=rev*10+rem;
			x=x/10;
			
		}
		while(x!=0);
		System.out.println(rev);
	}
	
}