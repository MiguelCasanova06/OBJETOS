/**
 * 
 */

/**
 * 
 */
public class Jugador {

	//Atributos
	
	public String nombre_de_usuario;
	public String correo_electronico;
	public String claveClara;
	private final String CLAVE_CLARA_DEF = " ";
	private final String CORREO_ELECTRONICO_DEF=" ";
	private String clave_cifrada;
	private boolean habilitado;
	
	//getters
	
	public String getNombreUsuario() {
		return nombre_de_usuario;
	}
	public String getCorreoElectronico() {
		return correo_electronico;
	}
	public String getClaveClara() {
		return claveClara;
	}
	
	//constructor
	public Jugador(String nombre_de_usuario) {
		this.nombre_de_usuario = nombre_de_usuario;
		this.correo_electronico = CORREO_ELECTRONICO_DEF;
		this.claveClara = CLAVE_CLARA_DEF;
		this.clave_cifrada = cifrar(claveClara);
	}
	
	public Jugador (String nombre_de_usuario, String claveClara, String correo_electronico) {
		this(nombre_de_usuario);
		this.correo_electronico = correo_electronico;
		this.claveClara= claveClara;

	}
	
	public void habilitar() {
		habilitado = true;
	}
	public void deshabilitar() {
		habilitado = false;
	}
	
	public void autenticar(String claveClara) {
		boolean autenticada;
		clave_cifrada = cifrar(claveClara);
		if(claveClara == clave_cifrada) {
			autenticada = true;
		}else {
			autenticada = false;
		}
	}
	
	private static String cifrar(String claveClara) {
		final char CAR_INICIAL = ' ';
		final char CAR_FINAL = '}';
		
		StringBuffer cifrar = new StringBuffer(claveClara.length());
		for (int i = 0; i<claveClara.length(); i++) {
			char caracterInicial = claveClara.charAt(i);
			char caracterCifrado = (char) (caracterInicial+1);
			cifrar.append(caracterCifrado);
		}
		return cifrar.toString();
	}
	public void main (String [] args) {
		
		Jugador jugador1,jugador2;
		jugador1 = new Jugador(nombre_de_usuario);
		jugador2 = new Jugador(nombre_de_usuario,correo_electronico,claveClara);
		
		
	}
}
