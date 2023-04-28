import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Al programa anterior agreguele un parámetro para que la operación pueda ser suma o multiplicación
public class Main {
    public static void main(String[] args) {
        int parametro = 6; // el parametro 1 suma, cualquier otro multiplica.
        String rutaArchivo = "src\\Numeros.txt";

        try{
            Scanner scanner = new Scanner(new File(rutaArchivo)).useDelimiter("[^0-9]+");
            if(parametro == 1) {
                int suma = 0;
                while (scanner.hasNext()) {
                    int numero = scanner.nextInt();
                    suma += numero;
                }
                System.out.println("La suma de los números en el archivo es: " + suma);
            }else{
                int multi = 1;
                while (scanner.hasNext()) {
                    int numero = scanner.nextInt();
                    multi *= numero;
                }
                System.out.println("El producto de los números en el archivo es: " + multi);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + rutaArchivo);
            System.exit(1);
        }
    }
}



