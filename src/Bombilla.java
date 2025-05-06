/*
 * 
 */
public class Bombilla {

	private boolean encendida;
	
	
	//Constructor: por defecto la bombilla queda apagada
	public Bombilla() {
		//inicializar atributos
		this.encendida = false;
		
		//Traza:
		System.out.printf("Bombilla creada (%b)%n", encendida);
	}
	
	public Bombilla(boolean estadoInicial) {
		//inicializar atributos
		this.encendida = estadoInicial;
		
		//Traza:
		System.out.printf("Bombilla creada (%b)%n", encendida);
	}
	
	public void encender() {
		if(!encendida) {
			encendida = true;
		}
	}
	
	public void apagar() {
		if(encendida) {
			encendida = false;
		}
	}
	
	//Getter: devuelve el valor del atributo
	public boolean isEncendida() {
		return encendida;
	}
}
