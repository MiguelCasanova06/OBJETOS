/**
 * 
 */

/**
 * 
 */
public class Barco {

	//tipos de barco 
	public final static int LANCHA = 1;
	public final static int SUBMARINO = 2;
	public final static int BUQUE = 3;
	public final static int PORTAAVIONES = 4;

	//estados del barco
	private final static int INTACTO = 0;
	public final static int TOCADO = 1;
	public final static int HUNDIDO = 2;

	
	//atributos
	private int tipo;
	private int estado;
	private int []casillasX;
	private int []casillasY;
	
	//Constructores
	
	public Barco (int tipo) {
		this.tipo = tipo;
		this.estado = INTACTO;
		this.casillasX = new int [tipo];
		this.casillasY = new int [tipo];
		
	}
	
	//metodos
	public void disparar() {
		
	}
}

