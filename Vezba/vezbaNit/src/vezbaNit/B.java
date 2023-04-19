package vezbaNit;

public class B extends Thread {
	
	public B(String imeNiti) {
		super(imeNiti);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
