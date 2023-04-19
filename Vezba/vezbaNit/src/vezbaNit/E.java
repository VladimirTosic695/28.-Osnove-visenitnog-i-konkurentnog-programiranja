package vezbaNit;

public class E implements Runnable {
	
	@Override
	public void run() {
	System.out.println(Thread.currentThread().getName());	
	}

}
