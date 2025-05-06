
public class Dado {

	private final int NCARAS_DEF    = 6;
	public final int NO_HAY_TIRADAS = -1;
	
	public int numCaras;
	private int ultimaTirada;
	
	/**
	 * Constructor
	 */
	public Dado() {
		this.numCaras = NCARAS_DEF;
		this.ultimaTirada = NO_HAY_TIRADAS;
	}
	/**
	 * Getter para numCaras
	 * @return el número de caras
	 */
	public int getNumCaras() {
		return numCaras;
	}
	/**
	 * Getter para ultimaTirada
	 */
	public int getultimaTirada() {
		return ultimaTirada;
	}
	
	/**
	 * Devuelve un numero aleatorio entre el 1 y el nº de caras
	 */
	public int tirar() {
		ultimaTirada =(int) Math.random()*6 + 1;
		return ultimaTirada;
	}
}
