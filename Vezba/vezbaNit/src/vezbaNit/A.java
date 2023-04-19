package vezbaNit;

public class A extends Thread {
	
	public A(String imeNiti) {
		super(imeNiti);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
