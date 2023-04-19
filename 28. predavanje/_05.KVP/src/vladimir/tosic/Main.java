package vladimir.tosic;

public class Main {

	public static void main(String[] args) {
		
		
		A a = new A();
		B b = new B();
		
		// Kada odredjenoj niti zelim da dodam prioritet prilokom izvrsavanja pozvati metodu: 
		// setPriority() koja je clan klase Thread
		
		// void setPriority(nivo prioriteta)
		// Parametrom (nivo) zadajemo nivo prioriteta niti za koju je metoda pozvana.
		// podrazumevana vrednost nivoa prioriteta je 5 a moze se zadati preko NORM_PRIORITY.
		//Postoji MIN_PRIORITY i MAX_PRIORITY. Vrednost je od 1 do 10
		
		a.setPriority(Thread.MAX_PRIORITY);
		b.setPriority(Thread.MIN_PRIORITY);
		
	//	a.setPriority(Thread.MAX_PRIORITY - 7);
	//	b.setPriority(Thread.MIN_PRIORITY + 5);
		
		a.start();
		b.start();
		
		System.out.println("Kraj glavne niti.");
		

	}

}
