package vladimir.tosic;

// Pokretanje nove niti

// novu nit pokrecemo tako sto napravimo instancu objekta tipa Thread **
// to se moze uraditi na 2 nacina
// 1. implementacija interfejsa Runnable (ovde radimo na ovaj nacin) 
// 2. Prosirivanjem (nasledjivanjem) klase Thread

// U Main klasi treba: Nakon kreiranja klase koja implementira interfejs Runnable,
// potrebno je napraviti instancu objekta tipa Thread

public class Main {

	public static void main(String[] args) {
		
		// objekat nase klase
		A a = new A(); // **
		
		//***
		// Oblik konstruktora:
		// Thread(Runnable objekatNit, String imeNiti)
		// objekatNit je instanca klase koja implementira interfejs Runnable
		// Definise mesto gde zapocinje nit.
		// imeNiti - predstavlja ime nove niti (koju ja zadajem)
		
		Thread t1 = new Thread(a, "Nit 1");
		Thread t2 = new Thread(a, "Nit 2");
		Thread t3 = new Thread(a, "Nit 3");
		
		
		// metoda start() poziva metodu run()
		// run() sta ce se izvrsavati a start() kada ce se izvrsavati
		t1.start();
		t2.start();
		t3.start();
		
		
	//	System.out.println(Runtime.getRuntime().availableProcessors());
		
		

	}

}
