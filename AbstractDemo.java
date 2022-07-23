
  
    abstract class abs1 {
    	
	void meth1()
		{
			System.out.println("Meth1");
		}
		abstract void meth2();
	}
	class abs2 extends abs1
	{
		void meth2() {
			System.out.println("Meth2");
		}
		
	}
	public class AbstractDemo {

		public static void main(String[] args) {
			abs2 a =new abs2();
			a.meth1();
			a.meth2();
		}
	

}
