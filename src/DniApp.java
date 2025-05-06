/**
 * 
 */

/**
 * 
 */
public class DniApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DNI dni1 = new DNI("11122233");
		DNI dni2 = new DNI(01234567);
		DNI dni3 = new DNI();
		
		//Array de DNIs
		DNI [] listaDNIs = new DNI [3];
		listaDNIs [0] = dni1;
		listaDNIs [1] = dni2;
		listaDNIs [2] = dni3;
		listaDNIs [3] = copiaDni1;
		
		printDNIs(listaDNIs);
		
		escribirCaducados(listaDNIs);

		
		DNI copiaDni1 = new DNI(dni1);
		
		System.out.printf("Dni1: %s-%c%n",
				dni1.getNumero(),
				dni1.getLetra());
		
		System.out.printf("Copia: %s-%c%n",
				copiaDni1.getNumero(),
				copiaDni1.getLetra());
		

	}

}
