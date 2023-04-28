import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Al programa anterior agreguele un parámetro para que la operación pueda ser suma o multiplicación

public class Main {

    public static void main(String[] args) {
        String rutaArchivo = "src\\Numeros.txt";

        Scanner scanner = new Scanner(new File(rutaArchivo)).useDelimiter("[^0-9]+"))

        int suma = 0;
        while (scanner.hasNext()) {
            int numero = scanner.nextInt();
            suma += numero;

            System.out.println("La suma de los números en el archivo es: " + suma);


        }
    }

