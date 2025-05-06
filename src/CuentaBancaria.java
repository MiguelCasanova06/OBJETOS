/**
 * 
 */

/**
 * 
 */
public class CuentaBancaria {

	 // Atributos
	public final double SALDO_DEF = 0;
    private String titularNombre;
    private String titularApellido;
    private String identificacion;
    private double saldo;

    // Constructor por defecto
    public CuentaBancaria(String titularNombre, String titularApellido, String identificacion) {
        this(titularNombre, titularApellido, identificacion, 0.0);
    }

    // Constructor con saldo inicial
    public CuentaBancaria(String titularNombre, String titularApellido, String identificacion, double saldoInicial) {
        this.titularNombre = titularNombre;
        this.titularApellido = titularApellido;
        this.identificacion = identificacion;
        
        // Validar que el saldo inicial no sea negativo
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.saldo = saldoInicial;
    }
    
    //MÉTODOS
    
    public void retirar(double cantidad) {
    	if(cantidad > saldo) {
    		throw new IllegalArgumentException("No hay saldo suficiente para retirar");
    	}
    	saldo = saldo - cantidad;
    }
    
    public void ingresar(double cantidad) throws IllegalArgumentException {
    	if ( cantidad < 0) {
    		throw new IllegalArgumentException("No se puede ingresar una cantidad negativa ");
    	}
    	saldo = saldo + cantidad;
    }
    
    public double getSaldo() {
    	return saldo;
    }
    
    //Getter
    public String getTitularNombre() {
    	return titularNombre;
    }
    
    public String getTitularApellido() {
    	return titularApellido;
    }
    
    public String getIdentificacion() {
    	return identificacion;
    }
    

}
