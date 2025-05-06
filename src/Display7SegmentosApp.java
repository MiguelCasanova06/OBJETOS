/**
 * 
 */

/**
 * 
 */
public class Display7SegmentosApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Creo dos displays
		Display7Segmentos display1 = new Display7Segmentos();
		Display7Segmentos display2 = new Display7Segmentos();
		
		//Muestra un 0
		display1.setNumber(0);
		display1.status();
		display1.print();
		
		//Muestra un 2
		display2.setNumber(2);
		display2.status();
		display2.print();


	}

}
