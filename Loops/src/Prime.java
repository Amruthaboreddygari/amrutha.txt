
public class Prime {

	public static void main(String[] args) {
		int x=556;
		boolean flag=false;
		if(x<=1) {
		  flag=true;
			for(int i=2;i<=x/2;i++) {
			 if(x%i==0) {
			 flag=true;
			break;
			}
			}
		}
	
	  if(flag!=true) {
		  System.out.println(x+"is prime");
	  }
	  else {
		  System.out.println(x+"is not prime");
	  }
	
		
}
}
