package paket;

public class A extends Thread {
	
	A (String s){
		super(s);
	}
	
	public void run() {
		for(int i = 1; i < 3; i++) {
			System.out.println(Thread.currentThread());
		}
	}
	
	
}
