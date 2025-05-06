/**
 * 
 */

/**
 * 
 */
public class CuentaBancariaApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Creación de dos cuentas bancarias
		//Primera tiene saldo 0 y segunda tiene saldo 1200.80
		CuentaBancaria cuenta1 = new CuentaBancaria("Juan","Romero","ES9121000418450200051332",0.0);
		CuentaBancaria cuenta2 = new CuentaBancaria("Manuel","Martínez","ES9121000418450200051335",1200.80);

		//Muestro el saldo de cada cuenta en consola
		System.out.println("Saldo de cuenta1: " + cuenta1.getSaldo());
		System.out.println("Saldo de cuenta2: " + cuenta2.getSaldo());

		//Ingreso 100 € en la cuenta con saldo=0, y retiro 100 € 
		//de la otra cuenta.
		cuenta1.ingresar(100);
		cuenta2.retirar(100);
		//Observo el nuevo saldo de ambas cuentas
		System.out.println("Saldo de cuenta1: " + cuenta1.getSaldo());
		System.out.println("Saldo de cuenta2: " + cuenta2.getSaldo());

	
		
	}

}
