package vladimir.tosic;

// Nit moze napraviti i kada klasu Thread prosirimo novom nasledjenom klasom a zatim napravim
// instancu te klase

// nova potklasa mora da redefinise metodu run()

public class A extends Thread {
	
	public A (String s) {
		super(s); // poziva konstruktor Thread sledeceg oblika: 
		// public Thread (String imeNiti)
	}
	
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
