
/*public class Star {

	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
				System.out.println();
			
		}

	}

}*/
/*class Star{
	public static void main(String[] args) {
		int n=5;
		for (int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");
			}
			 System.out.println();
		}
		for (int i=1;i<n;i++) {
		
			for(int j=1;j<n-i+1;j++) {
				
				System.out.print("* ");
			}
			 System.out.println();
		}
	}
}*/
/*
class Star{
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println(i-(i-1));
		}
	}
}*/
class Star{
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<2*n;i++) {
			int c=i>n?2*n-i:i;
			for(int j=0;j<c;j++) {
				System.out.print("* ");
			}
			System.out.println();
				
			
		}
	}
}



















