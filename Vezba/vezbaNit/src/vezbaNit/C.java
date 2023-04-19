package vezbaNit;

public class C extends Thread {
	
	int niz[] = {5,8,17};
	
	public C(String s) {
		super(s);
	}
	
	public void run() {
		for(int i = 0; i <= 2; i++) {
			System.out.print(niz[i] + " ");
		}
	}

}
