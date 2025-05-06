/**
 * 
 */

/**
 * 
 */
public class PistaApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * MAIN: Ejemplo simple de uso de la clase Pista.
		 * @param args Command-line arguments: not used.
		 */			
			// Creo objetos de la clase Pista
			
			Pista pistaA, pistaB;
			pistaA = new Pista();
			pistaB = new Pista();
			//No están cubiertas
			pistaA.setCubierta(true);
			pistaB.setCubierta(true);
			
			System.out.printf("¿Está cubierta pistaA? ");
			System.out.printf("%b%n", pistaA.isCubierta());
			
			
			
			// Pruebo  los nuevos constructores
	   		Pista pistaC = new Pista(9, true);     // Pista nº 9 es cubierta
	   		Pista pistaZ = new Pista(10);           // Pista nº 10
	   		
			System.out.println("Reservo pista A");
			pistaA.reservar();

			System.out.printf("¿Está reservada pistaA? ");
			System.out.printf("%b%n", pistaA.isReservada());
			
			System.out.printf("¿Está reservada pistaB? ");
			System.out.printf("%b%n", pistaB.isReservada());
			
			System.out.printf("¿Está reservada pistaA? ");
			System.out.printf("%b%n", pistaA.isReservada());
			//VA a lanzar excepcion
			pistaA.añadirJugador("        ");
			pistaA.añadirJugador("Juan");
			
			
			// Reservar PistaA y añadir 2 jugadores. Luego eliminar 1
			pistaA.reservar();
			pistaA.añadirJugador("");
			pistaA.añadirJugador("");
			
			System.out.printf("¿Cuántos jugadores tiene pistaA? %d%n ", pistaA.getNumJugadores());
			
			for (int i=0; i<1000;i++) {
				pistaA.añadirJugador("");
			}
			System.out.printf("¿Cuántos jugadores tiene pistaA? %d%n ", pistaA.getNumJugadores());
			

		
			//EJERCICIO: Crear 5 pistas y reservar TODAS
			//creo el array de objetos Pista
			Pista [] pistas = new Pista [4];
			//Creo 5 objetos, usando el constructor en el que 
			//se puede indicar el nº de pista
			for (int i=0;i<pistas.length;i++) {
				pistas [i] = new Pista(i);
			}
			//Reservo todas las pistas: bucle tradicional
			for(int i=0; i<pistas.length;i++) {
				pistas[i].reservar();
			}
			//otra forma: bucle for-each
			for(Pista p: pistas) {
				p.reservar();
				System.out.printf(" * Reservo pista nº %d =>%b %n", p.getNumPista(), p.isReservada());
			}
			

	}

}
