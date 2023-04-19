package paket;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		
		Thread t = new Thread(b, "Nit");
		
		a.setPriority(Thread.MAX_PRIORITY);
		t.setPriority(Thread.MIN_PRIORITY);
		
		a.start();
		t.start();

	}

}
