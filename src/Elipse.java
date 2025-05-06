/**
 * 
 */

/**
 * 
 */
public class Elipse {

	//atributos
	public double r;
	public double s;
	private static final double R_DEFECTO = 3;
	private static final double S_DEFECTO = 6;
	private static final double PI = Math.PI;
	public double perimetro;
	public double area;
	//getters y setters
	public double getR() {
		return r;
	}
	public double getS() {
		return s;
	}
	public void setR(double nuevoR) {
		this.r = nuevoR;
	}
	public void setS(double nuevoS) {
		this.s = nuevoS;
	}
	//constructores
	/**
	 * constructor sin parametros, por defecto
	 */
	public Elipse() {
		this.r = R_DEFECTO;
		this.s = S_DEFECTO;
	}
	public Elipse(double r, double s) {
		this.r = r;
		this.s = s;
	}
	//metodos
	 public double obtenerPerimetro() {
		 perimetro = 2*PI*Math.sqrt(((r*r)+(s*s))/2);
		 return perimetro;
	 }
	public double obtenerArea() {
		area = PI * r * s;
		return area;
	}
	
	 public void escalar(int porcentaje) {
	        this.r *= (1 + porcentaje / 100.0);
	        this.s *= (1 + porcentaje / 100.0);
	    }

	    /**
	     * Dibuja la elipse en la consola con caracteres 'o'.
	     */
	    public void dibujarEnConsola() {
	        int a = (int) r;
	        int b = (int) s;
	        for (int y = -b; y <= b; y++) {
	            for (int x = -a; x <= a; x++) {
	                if ((x * x) * (b * b) + (y * y) * (a * a) <= (a * a) * (b * b)) {
	                    System.out.print("o ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
}
