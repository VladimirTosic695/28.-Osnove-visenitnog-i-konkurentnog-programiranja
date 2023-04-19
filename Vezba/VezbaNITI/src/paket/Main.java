package paket;

public class Main {

	public static void main(String[] args) {
		
		A a = new A("Prva nit");
		B b = new B("Druga nit");
		C c = new C("Treca nit");
		
		System.out.println(Thread.currentThread().getName());
		
		a.setPriority(Thread.MIN_PRIORITY);
		c.setPriority(Thread.MAX_PRIORITY);
		
		a.start();
		b.start();
		c.start();
		
		D d = new D();
		E e = new E();
		R r = new R();
		
		Thread t1 = new Thread(r, "Cetvrta");
		Thread t2 = new Thread(e, "Peta");
		Thread t3 = new Thread(d, "Sesta");
		
		t1.setPriority(1);
		t3.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
