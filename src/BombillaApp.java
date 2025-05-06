/**
 * 
 */

/**
 * 
 */
public class BombillaApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Bombilla b1 = new Bombilla();
		Bombilla b2 = new Bombilla(true);

		
	    b2.encender();
		
		if(b1.isEncendida()) {
			System.out.println("B1: ON");
		}
		else {
			System.out.println("B1: OFF");

		}
		
		if(b2.isEncendida()) {
			System.out.println("B2: ON");
		}
		else {
			System.out.println("B2: OFF");

		}
		


	}

}
