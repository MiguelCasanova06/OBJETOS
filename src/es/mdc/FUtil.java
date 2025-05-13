package es.mdc;
import java.io.File;
/**
 * @author Miguel
 */
public class FUtil {
/**
 * Comprueba si un fichero existe o no
 * @param fichero a comprobar
 * @return true si el fichero existe, false si no existe
 */
    public static boolean existe(String filename) {
        if (filename == null || filename.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del archivo está vacío o contiene solo espacios.");
        }

        File file = new File(filename);
        return file.exists();
    }
}
