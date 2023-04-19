package vladimir.tosic;

public class A extends Thread {
	
	public A (String imeNiti) {
		super(imeNiti);
	}
	
	public void run() {
		
		for(int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
