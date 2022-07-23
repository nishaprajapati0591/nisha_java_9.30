
public class methodoverriding {
    
void collage() {
		System.out.println("ssit is my collage");
	}
	void collage(int a) {
		System.out.println("My rank" +a);
		
	}
	void collage(int a,String name) {
		System.out.println("my rank and my name");
	}
	public static void main(String[] args) {
		methodoverriding m = new methodoverriding();
		m.collage();
		m.collage(1);
		m.collage(2);
	}
	
	
}




