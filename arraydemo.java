import java.util.Scanner;

public class arraydemo {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     int names = sc.nextInt();
     String names[] = new String[size];
     for(int i=0;i<size;i++) {
	   names[i] = sc.next();
	 }
  for(int i=0;i<names.length;i++) {
	  System.out.println("name"+(i+i) +" is "+ names[i]);
  }
}
}
