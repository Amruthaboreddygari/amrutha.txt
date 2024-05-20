
/*public class Armstrong {
	public static void main(String[] args) {
		int x=153;
		int y=x;int i=0;
		int sum=0;
		int s=String.valueOf(x).length();
		while(x!=0){
			int rem=x%10;
		    i=(int)Math.pow(rem,s);
		    sum=sum+i;
			x=x/10;
		}
		if(y==sum) {
			System.out.println(y+" " +"is armstrong");
		}
		else {
			System.out.println(y+" "+"is not armstong");
		}
		
		
	}

}*/
import java.util.Scanner;
class Armstrong{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int orginalnum=s.nextInt();
		int num=orginalnum;
		int sum=0;
		int digits=String.valueOf(num).length();
		while(num!=0) {
			int rem=num%10;
			sum +=Math.pow(rem, digits);
			num /=10;
		}
		if(orginalnum==sum) {
			System.out.println(orginalnum+" is armstrong number");
		}
		else {
			System.out.println(orginalnum+" is not armstrong number");
			
		}
	}
}

