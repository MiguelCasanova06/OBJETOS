/**
 * 
 */
import java.util.Arrays;
/**
 * clase que permite crear objetos Pista 
 * 
 */
public class Pista {
	

	private final static int MAX_JUGADORES = 4;
	private final static int NUM_PISTA_DEF = 0;
	private final static boolean ES_CUBIERTA_DEF = false;
	//Atributos: guardan el estado del objeto
	private int numPista;
	private boolean reservada; 
	private boolean cubierta;
	private String[] jugadores;
	//nuevo atributo numJugadores
	private int numJugadores;
	//HACER: getter y el método añadirJugador(sin guardar nombre)
	//y hacer método eliminarjugador
	
	//getter numJugadores
	public int getNumJugadores() {
		return numJugadores;
	}
	//Método: operaciones del objeto
	//=> DEBEN MANTENER DATOS COHERENTES EN EL OBJETO
	
	public boolean isCubierta() {
		return cubierta;
	}
	public int getNumPista() {
		return numPista;
	}
	//GETTER : método que devuelve el valor de un atributo
	public boolean isReservada(){
		return reservada;
	}
	//public getStrJugador() {
		//return 
	//}
	public void setCubierta(boolean cubierta) {
		this.cubierta = cubierta;
	}
	//Operación reservar
	public void reservar(){
		if(!reservada) {
			reservada = true;
		}
	}
	//Operación añadir
	public void añadirJugador(String nombre) throws IllegalArgumentException{
		
		//Que hago si el nombre es vacio?
		if(nombre.trim().length()==0) {
			IllegalArgumentException exc = 
					new IllegalArgumentException("Nombre vacío");
			
			throw exc;
		}
		//TRAZA:
		System.out.printf("Voy a añadir el jugador: %s%n", nombre);
		if(numJugadores< MAX_JUGADORES) {
			jugadores[numJugadores] = nombre;
			numJugadores++;
		}
	}
	//Operaciíon eliminar
	public void eliminarJugador(String nombre){
		//TRAZA:
		System.out.printf("Voy a eliminar el jugador: %s%n", nombre);
		numJugadores--;
	}
	//Operación cancelar
	public void cancelar() {
		if(reservada) {
			reservada = false;
		}
	}
	//CONSTRUCTOR (sin parametros)
	public Pista() { //puedo poner valores por defecto porque no tiene parámetros
		this(NUM_PISTA_DEF ,ES_CUBIERTA_DEF);
	}
	//Constructor con un parámetro
	public Pista ( int numPista) {
		this(NUM_PISTA_DEF, ES_CUBIERTA_DEF);
	}
//constructor con dos parámetros
	/**
	 * constructor para Pista indicando el nº de pista y si está cubierta
	 * @param numPista, numero de pista
	 * @param cubierta, si esta cubierta o no
	 */
	public Pista ( int numPista, boolean cubierta) {
		//Inicializar atributos
		this.numPista = numPista; //Me dan el nº de pista
		this.reservada = false;
		this.cubierta = cubierta; // Me dan si está cubierta
		this.numJugadores = 0;
		
		//Creo estructuras
		this.jugadores = new String [MAX_JUGADORES];
		Arrays.fill(null, reservada);
		
	}
	
	String [] libres = new String [MAX_JUGADORES];

	
	public void añadirJugador1(String nombre) {
		for(int i = 0; i<libres.length;i++) {
			if(this.numJugadores<MAX_JUGADORES) {
				jugadores[i]=nombre;
				System.out.println("Se ha añadido a " +nombre +"en la posición " + i);
			}
			else {
				System.out.println("No hay huecos para añadir jugador");
			}
		}
	}
	
	public void eliminarJugador(int pos) {
		
	}
	
	/*
	 * entra en el exzmen,, el constructor con parametros llama al constructor de la misma clase sin parametros
	 * public Pista(){
	 * this(); tiene que ser si o si la primera linea
	 * }
	 */
}
