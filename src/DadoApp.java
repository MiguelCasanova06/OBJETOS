/**
 * 
 */

/**
 * 
 */
public class DadoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Dado d1 = new Dado();
		int valor = d1.getultimaTirada();
		
		if(valor == d1.NO_HAY_TIRADAS) {
			System.out.println("No has tirado");
		}
	}

}
