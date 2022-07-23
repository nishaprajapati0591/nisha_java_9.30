import java.util.Scanner;

public class elseifdemo {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter A : ");
		b=sc.nextInt(); 
		System.out.println("Enter B : ");    
		if(a==b) {
			System.out.println("Equal");
		}
		else if(a>b) {
			System.out.println("a is grater");
		}
		else {
			System.out.println("a is lesser");
		}
	}
}
