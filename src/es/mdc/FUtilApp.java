package es.mdc;

public class FUtilApp {

	public static void main(String[] args) {
	    String[] archivos = {
	            "documento.txt",
	            "imagen.jpg",
	            "noexiste.txt",
	            "" // Cadena vacía para probar la excepción
	        };

	        for (String archivo : archivos) {
	            try {
	                boolean existe = FUtil.existe(archivo);
	                if (existe) {
	                    System.out.println("El archivo " + archivo + " existe.");
	                } else {
	                    System.out.println("El archivo " + archivo + " no existe.");
	                }
	            } catch (IllegalArgumentException e) {
	                System.out.println("Error al comprobar archivo: \"" + archivo + "\" -> " + e);
	            }
	        }
	}

}
