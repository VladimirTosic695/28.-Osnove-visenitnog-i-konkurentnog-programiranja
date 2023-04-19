package paket;

public class Main {

	public static void main(String[] args) {
	
		
		// isAlive() - da utvrdi da li se metoda jos izvrsava // logicke je vrednosti tj. boolean
		
		// join() - ceka da se druga nit zavrsi 
		// prva nit se zavrsi pa onda krene druga tj. naredna nit ceka prethodnu da se zavrsi 
		// pre nego sto krene
		
		A a = new A("Prva nit");
		System.out.println("Prva nit se izvrsava: " + a.t.isAlive());
		
		A a2 = new A("Druga nit");
		System.out.println("Druga nit se izvrsava: " + a2.t.isAlive());
		A a3 = new A("Treca nit");
		System.out.println("Treca nit se izvrsava: " + a3.t.isAlive());
		
		try {
			a.t.join();
			a2.t.join();
			a3.t.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Prva nit se izvrsava: " + a.t.isAlive());
		System.out.println("Druga nit se izvrsava: " + a2.t.isAlive());
		System.out.println("Treca nit se izvrsava: " + a3.t.isAlive());
	}

}
