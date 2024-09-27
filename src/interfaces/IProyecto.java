package interfaces;
import java.util.Scanner;
/**
 *
 * @author ffeli
 * 
 * Interfaz para crear una constante de la clase Scanner para que todo el proyecto la use
 */
public interface IProyecto {
    public final Scanner leer = new Scanner(System.in);
}
