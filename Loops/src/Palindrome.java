
public class Palindrome {
	public static void main(String[] args) {
		int x=54345;
		int i=x;
		int rev=0;
		while(x!=0) {
		 int rem=x%10;
		 rev=rev*10+rem;
	      x=x/10;
		 }
		
		if(i==rev) {
			System.out.println(i+"is palindrome");
		}
		else {
			System.out.println(i+"is not palindrome");
		}
}
}
