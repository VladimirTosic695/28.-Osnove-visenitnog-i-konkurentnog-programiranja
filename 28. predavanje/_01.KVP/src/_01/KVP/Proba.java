package _01.KVP;

public class Proba extends Thread {
	
	Proba(String s) {
	super(s);
	}
	public void run() {
		System.out.println("Nova nit");
	}
	

	public static void main(String[] args) {
		
		Proba o = new Proba("prva nit");
		
	
		
		System.out.println(o.getName());
		
		o.start();

	}

}
