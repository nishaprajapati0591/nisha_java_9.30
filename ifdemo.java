import java.util.Scanner;

public class ifdemo {
 
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A : ");
		a=sc.nextInt();
		System.out.println("Enter B :");
		b=sc.nextInt();
		if(a % 2 == 0) {
		
			System.out.println("Even number");
		}
		else {
			System.out.println("odd number");
			
		}
	}
}
