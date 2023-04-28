import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Haga un main donde por parámetro envíe la ruta de un archivo. Ese archivo debe contener
//números. El programa debe escribir por consola la suma de esos números.
public class Main {
    public static void main(String[] args) {
        String rutaArchivo = "src\\Numeros.txt";

        try (Scanner scanner = new Scanner(new File(rutaArchivo)).useDelimiter("[^0-9]+")) {
            int suma = 0;
            while (scanner.hasNext()) {
                int numero = scanner.nextInt();
                suma += numero;
            }
            System.out.println("La suma de los números en el archivo es: " + suma);
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + rutaArchivo);
            System.exit(1);
        }
    }
}

     //   D:\Users\Irene\Desktop\Java\Trabajo Integrador\Clase5-ProgramasyArchivos
     //   D:\Users\Irene\Desktop\Java\Trabajo Integrador\Clase5-ProgramasyArchivos\src
