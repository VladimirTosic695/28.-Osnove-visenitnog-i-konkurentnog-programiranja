package paket;

public class C extends Thread {
	
	C(String s){
		super(s);
	}
	
	public void run() {
		for(int i = 1; i < 2; i++) {
			System.out.println("NIT C");
		}
	}

}
