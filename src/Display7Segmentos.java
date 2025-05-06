/**
 * 
 */

/**
 * 
 */
public class Display7Segmentos {


	 // Atributos
    private boolean[] segmentos; // Representa los 7 segmentos (A, B, C, D, E, F, G)
    private final static int NUM_SEGMENTOS = 7;

    // Constructor
    public Display7Segmentos() {
        segmentos = new boolean[NUM_SEGMENTOS];
        clear(); // Inicializa todos los segmentos apagados
    }

    // Métodos públicos
    //No ilumina ningún segmento
    public void clear() {
        for (int i = 0; i < NUM_SEGMENTOS; i++) {
            segmentos[i] = false;
        }
    }
    //Ilumina todos los segmentos
    public void setAll() {
        for (int i = 0; i < NUM_SEGMENTOS; i++) {
            segmentos[i] = true;
        }
    }
    //Muestra en consola el estado de cada segmento
    public void status() {
    	for(int i = 0; i<NUM_SEGMENTOS;i++) {
    		System.out.println("Segmento "+ (char) ('A'+i)+":"+(segmentos[i] ? "ON" : "OFF"));
    	}
    }
    //Ilumina los segmentos correspondientes para que el número
    //dado se visualice
    public void setNumber(int num) {
        if (num < 0 || num > 9) {
            throw new IllegalArgumentException("Número debe estar entre 0 y 9");
        }
    
        clear(); // Apaga todos los segmentos antes de configurar el número

        switch (num) {
            case 0:
                segmentos[0] = true; // A
                segmentos[1] = true; // B
                segmentos[2] = true; // C
                segmentos[3] = true; // D
                segmentos[4] = true; // E
                segmentos[5] = true; // F
                break;
            case 1:
                segmentos[1] = true; // B
                segmentos[2] = true; // C
                break;
            case 2:
                segmentos[0] = true; // A
                segmentos[1] = true; // B
                segmentos[3] = true; // D
                segmentos[4] = true; // E
                segmentos[6] = true; // G
                break;
            case 3:
                segmentos[0] = true; // A
                segmentos[1] = true; // B
                segmentos[2] = true; // C
                segmentos[3] = true; // D
                segmentos[6] = true; // G
                break;
            case 4:
                segmentos[1] = true; // B
                segmentos[2] = true; // C
                segmentos[5] = true; // F
                segmentos[6] = true; // G
                break;
            case 5:
                segmentos[0] = true; // A
                segmentos[2] = true; // C
                segmentos[3] = true; // D
                segmentos[5] = true; // F
                segmentos[6] = true; // G
                break;
            case 6:
                segmentos[0] = true; // A
                segmentos[2] = true; // C
                segmentos[3] = true; // D
                segmentos[4] = true; // E
                segmentos[5] = true; // F
                segmentos[6] = true; // G
                break;
            case 7:
                segmentos[0] = true; // A
                segmentos[1] = true; // B
                segmentos[2] = true; // C
                break;
            case 8:
                setAll(); // Todos los segmentos encendidos
                break;
            case 9:
                segmentos[0] = true; // A
                segmentos[1] = true; // B
                segmentos[2] = true; // C
                segmentos[3] = true; // D
                segmentos[5] = true; // F
                segmentos[6] = true; // G
                break;
        }
    }
    
    public void print() {

    }
}
