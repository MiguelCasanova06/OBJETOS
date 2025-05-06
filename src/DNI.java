/**
 * 
 */
import java.util.GregorianCalendar;
/**
 * 
 */
public class DNI {
	/**
	 * Lista con letras usadas en el DNI (constante)
	 */
	private final static char listaLetras[]= {
			'T','R','W','A','G','M',
			'Y','F','P','D','X','B',
			'N','J','Z','S','Q','V',
			'H','L','C','K','E'};
	//atributos
	private String numero; //numero y letra del dni
	private char letra;
	private static GregorianCalendar fechaCaducidad;
	private static GregorianCalendar fechaCreacion;
	
	//Constructores
	/**
	 * Construye un objeto DNI por defecto al no pasar por parametro nada
	 */
	public DNI() {
		int num = (int)(Math.random()*99999999);
	}
	/**
	 * 
	 * @param numero
	 */
	public DNI(int numero) {
		this(String.valueOf(numero));
	}
	/**
	 * Construye un objeto DNI con el numero indicado y la 
	 * fecha actual. La letra se calcula automaticamente
	 * @param numero número DNI
	 * @throws IllegalArgumentException cuando no tiene digitos o la
	 * longitud es <7 o >8
	 */
	public DNI (String numero) throws IllegalArgumentException {
		if(numero.isBlank()) {
			throw new IllegalArgumentException("Numero DNI en blanco");
		}
		else if(numero.length()<7 || numero.length()>8) {
			throw new IllegalArgumentException("Longitud DNI incorrectas");

		}
		this.numero = numero;
		this.letra = obtenerLetraDni(Integer.parseInt(numero));
		//Guarda la fecha actual
		this.fechaCreacion = new GregorianCalendar();
	}
	//Constructor de copia
	public DNI(DNI unDNI) {
		this.numero = unDNI.numero;
		this.letra = unDNI.letra;
		this.fechaCreacion = unDNI.getFechaCreacion();
	}

	//getters
	/**
	 * Devuelve el numero del DNI
	 * @return el numero del DNI
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * Devuelve la letra del DNI
	 * @return la letra del DNI
	 */
	public char getLetra() {
		return letra;
	}
	/**
	 * Devuelve la fecha de creacion del dni
	 * @return la fecha de creacion del dni
	 */
	public GregorianCalendar getFechaCreacion() {
		return fechaCreacion;
	}
	//Métodos privados
	/**
	 * Calcula la letra segun la tabla 
	 * <a href=""</a>
	 * @param numero numero del DNI
	 * @return la letra correspondiente al DNI
	 */
	private static char obtenerLetraDni(int numero) {
		int resto = numero % listaLetras.length;
		return listaLetras[resto];
	}
	/**
	 * Método que devuelve si el dni esta caducado o no
	 * @param fechaCreacion del dni
	 * @return caducado o no
	 */
	private static boolean estaCaducado( ) {
		if(fechaCreacion >fechaCaducidad) {
			
		}
	}
    public void setFechaCaducidad(GregorianCalendar fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
	private static int posicionLetra(char letra) {
		int posicion = listaLetras.indexOf(letra);
        if (posicion == -1) {
            throw new IllegalArgumentException("Carácter no válido");
        }
        return posicion;
	}
	

}
