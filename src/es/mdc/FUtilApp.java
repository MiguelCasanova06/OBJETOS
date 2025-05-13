package es.mdc;

public class FUtilApp {

	public static void main(String[] args) {

		  String[] archivos = {
		            "documento.txt",
		            "imagen.jpg",
		            "noexiste.txt"
		        };

		   for (String a : archivos) {
	         boolean existe = FUtil.existe(a);
	         if (existe) {
	        	 System.out.println("El archivo " + a + " existe.");
		     } else {
		         System.out.println("El archivo " + a + " no existe.");
		     }
		   
		   }
	}

}
