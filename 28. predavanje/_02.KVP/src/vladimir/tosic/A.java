package vladimir.tosic;

// Nit se moze napraviti za svaki objekat koji implementira interfejs Runnable
// da bi klasa implementirala interfejs Runnable, potrebno je samo da ima metodu run(),
// deklarisanu u sledecem obliku: public void run()

// u metodi run() zadajete kod koji treba da se izvrsava u novoj niti
// Kada se izvrsi metoda run(), nit se unistava

public class A implements Runnable {
	
	
		public void run() {
			
			for(int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName());
			}
			
		}
	

}
