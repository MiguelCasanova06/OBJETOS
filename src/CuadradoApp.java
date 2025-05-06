/**
 * 
 */

/**
 * 
 */
public class CuadradoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Cuadrado cuadrado1 = new Cuadrado();
		Cuadrado cuadrado2 = new Cuadrado(5);
		
		 // Mostrar valores iniciales
        System.out.println("Cuadrado 1 - Lado: " + cuadrado1.getLado() + ", Área: " + cuadrado1.obtenerArea() + ", Perímetro: " + cuadrado1.obtenerPerimetro());
        System.out.println("Cuadrado 2 - Lado: " + cuadrado2.getLado() + ", Área: " + cuadrado2.obtenerArea() + ", Perímetro: " + cuadrado2.obtenerPerimetro());

        // Escalar c2 en 50%
        cuadrado2.escalar(50);
        System.out.println("Cuadrado 2 escalado en 50% - Lado: " + cuadrado2.getLado());

        // Dibujar c2
        System.out.println("Dibujo del Cuadrado 2:");
        cuadrado2.dibujarEnConsola();
	}

}
