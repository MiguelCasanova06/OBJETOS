/**
 * 
 */

/**
 * 
 */
public class GestionPaddleApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ejemplo simple de uso de la clase Pista
		
		//Creo objetos de la clase Pista
		Pista pistaA; 
		pistaA = new Pista();
		
		Pista pistaB = new Pista();
		
		System.out.println("Reservo una pista");
		pistaA.reservar();
		
		System.out.printf("¿Está resersvada pisaA?");
		System.out.printf("%b%n", pistaA.isReservada());

		System.out.printf("¿Está resersvada pisaB?");
		System.out.printf("%b%n", pistaB.isReservada());
		
		
		pistaA.cancelar();
		System.out.printf("¿Está resersvada pisaA?");
		System.out.printf("%b%n", pistaA.isReservada());
		
		//Reservar PistaA y añadir 2 jugadores. Luego eliminar 1
		pistaA.reservar();
		pistaA.añadirJugador("");
		pistaA.añadirJugador("");
		pistaA.eliminarJugador("");
		System.out.printf("¿Cuantos jugadores tiene pistaA? %d%n",pistaA.getNumJugadores());

	}

}
