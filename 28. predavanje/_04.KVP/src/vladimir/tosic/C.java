package vladimir.tosic;

public class C extends Thread {
	
	C (String s){
		super(s);
	}
	
	public void run() {
		
		for(int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
