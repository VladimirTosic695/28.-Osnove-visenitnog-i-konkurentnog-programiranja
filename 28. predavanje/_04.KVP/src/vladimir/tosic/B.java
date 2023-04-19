package vladimir.tosic;

public class B extends Thread {
	
	public B (String s){
		super(s);
	}
	
	public void run() {
		
		for(int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
