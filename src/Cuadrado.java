/**
 * 
 */

/**
 * 
 */
public class Cuadrado {

	//Atributos
	
	public double lado;
	private double area;
	public double perimetro;
	private static final double NUMERO_LADOS = 4;

	
	//getters
	public double getLado() {
		return lado;
	}

	//setters
	public void setLado(double nuevoLado) {
		this.lado = nuevoLado;
	}
	
	//constructores
	/**
	 * constructor por defecto, el lado sera el citado por defecto
	 */
	public Cuadrado() {
		this.lado = NUMERO_LADOS;
	}
	/**
	 * constructor con un parametro
	 * @param lado valor del lado del cuadrado
	 */
	public Cuadrado(double lado) {
		this.lado=lado;
	}
	
	//metodos
	public double obtenerArea() {
		area = lado * lado;
		return area;
	}
	public double obtenerPerimetro() {
		perimetro = 4 * lado;
		return perimetro;
	}
	public void escalar(int porcentaje) {
		this.lado = lado * (1+porcentaje/100);
	}
	public void dibujarEnConsola() {
		for( int i = 0; i< (int)lado; i++) {
			for(int j = 0; j<(int) lado; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
