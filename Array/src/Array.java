/*import java.util.Arrays;
public class Array {

	public static void main(String[] args) {
		int[] x=new int[3];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		Arrays.stream(x)
		.forEach(System.out::println);
		
	}

}*/
/*public class Array{
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int b[]= {70,80};
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]+" ");{
				for(int i=0;i<b.length;i++)
			System.out.println(b[i]+" ");
		System.out.println();
		}
	}
	
}
/*class Array{
	public static void main(String[] args) {
		int a=100;
		int b;
		int c;
		b=++a;
		c=b++;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println(c);
		
	}
}
*/
/*public class Array{
	int x=10;
	public void m1()
       {
		System.out.println(x);
	}
}
public class Array {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // Check if the arrays have the same length
        if (array1.length != array2.length) {
            System.out.println("Arrays must have the same length for addition.");
            return;
        }

        // Create a new array to hold the sum
        int[] sumArray = new int[array1.length];

        // Perform element-wise addition
        for (int i = 0; i < array1.length; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        // Print the sum array
        System.out.println("Sum of the arrays:");
        for (int num : sumArray) {
            System.out.print(num + " ");
        }
    }
}*/
/*import java.util.Scanner;
public class Array
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		char ch;
		System.out.printf("Enter a Character : ");
		ch = input.next().charAt(0);
 
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
		{
			switch (ch)
			{
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					System.out.println("This is a Vowel");
					break;
 
				default:
					System.out.println("This is a Consonant");
					break;
			}
		}
		else
		{
			System.out.println("This is Not an alphabet");
		}
	}
}*/ 


