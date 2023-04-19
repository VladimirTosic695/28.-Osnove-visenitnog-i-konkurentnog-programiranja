package paket;

public class A extends Thread {

	public void run() {
		
		int i = 1;
		while(i <= 20) {
			
			try {
				
				Thread.sleep(500);
				
			} catch (Exception e) {
				System.out.println("Greska");
			}
			
			i++;
		
	}
		// sleep(milisekunde) - privremeno zaustavlja (suspenduje) izvrsavanje niti 
		// argument metode sleep je interval u milisekundama
		
		// metoda sleep u klasi Thread moze da izazove izuzetak InterruptedException
		// desice se izuzetak ako neka druga nit pozeli da prekini ovu suspendovanu nit
	}
	
}
