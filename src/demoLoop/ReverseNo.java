package demoLoop;
import java.util.Scanner;
public class ReverseNo {

	public static void main(String[] args) {

		int n1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		while(n>0)
		{
			 n1=n%10;
			n=n/10;
			
			System.out.print(n1);
		}
		
	}

}
