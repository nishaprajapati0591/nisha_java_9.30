

// default constructor displays null values
public class Student3 {
	int id;
	String name;
	
	void display() {
		System.out.println(id+""+name);
	}	
public static void main(String[] args) {
	Student3 S1=new Student3();
	Student3 S2=new Student3();
	S1.display();
	S2.display();
}
	
}
