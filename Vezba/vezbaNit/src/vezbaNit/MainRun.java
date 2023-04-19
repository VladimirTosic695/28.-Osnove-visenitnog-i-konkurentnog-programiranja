package vezbaNit;

public class MainRun {

	public static void main(String[] args) {
		
		D d = new D();
		E e = new E();
		
		Thread t1 = new Thread(d);
		
		Thread t2 = new Thread(e, "jbt");
		
		t1.start();
		t2.start();

	}

}
