import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main (String[]args){
/*    Tome el ejercicio B de la clase 2 y que por parámetro se pueda elegir si es una codificación o
        decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y otro para la salida. Que
        por pantalla (consola) solo indique si terminó o no correctamente, los resultados deben estar en el
        archivo de salida
*/

        String rutaArchivoIngreso = "src\\Numeros.txt"; //Ruta Archivo ingreso de datos.
        String rutaArchivoSalida =  "src\\Resultado.txt"; //Ruta Archivo salida de datos.
        Path rutaPathSalida = Paths.get(rutaArchivoSalida);

        // Ingreso Parametro Suma o Multiplicación.
        Scanner sc = new Scanner(System.in);
        int operacion;
        while (true) {
            System.out.print("PARA SUMAR: Ingrese un Numero Impar. PARA MULTIPLICAR: Ingrese un Numero Par:  ");
            if (sc.hasNextInt()) {
                operacion = sc.nextInt();
                break;
            } else {
                System.out.println("El valor ingresado debe ser un número.");
                sc.next(); // Limpia el valor inválido del buffer
            }
        }

        // Se elije una operación Codificada O Decodificada
        Scanner to = new Scanner(System.in);
        String tipoOperacion;
            while (true) {
            System.out.print("Elija una opción: 'C' para codificación o 'D' para decodificación: ");
            tipoOperacion = to.nextLine().toUpperCase();
            if (tipoOperacion.equals("C") || tipoOperacion.equals("D")) {
                break;
            } else {
                System.out.println("Opción inválida. Por favor ingrese 'C' o 'D'.");
            }
        }



        if(tipoOperacion.equalsIgnoreCase("C")){
            Scanner sd = new Scanner(System.in);
            int cifrado;
            while (true) {
                System.out.print("Elija un parametro de desplazamiento: ");
                if (sd.hasNextInt()) {
                    cifrado = sd.nextInt();
                    sc.nextLine(); // Consume la nueva línea pendiente
                    break;
                } else {
                    System.out.println("El valor ingresado debe ser un número.");
                    sc.nextLine(); // Limpia el valor inválido del buffer
                }
            }


            try{
                Scanner scanner = new Scanner(new File(rutaArchivoIngreso)).useDelimiter("[^0-9]+");
                if(operacion % 2 != 0) {
                    int resultado = 0;
                    while (scanner.hasNext()) {
                        int numero = scanner.nextInt() + cifrado;
                        resultado += numero;
                    }
                    System.out.println("Codigo Ejecutado con Exito: Suma con Codificación");
                    String escribir = Integer.toString(resultado);
                    try{
                        if (Files.exists(rutaPathSalida)) {
                            Files.writeString(rutaPathSalida, escribir, StandardOpenOption.TRUNCATE_EXISTING);
                        } else {
                            Files.writeString(rutaPathSalida, escribir);
                        }
                    }catch (IOException e) {
                        System.err.println("Ha ocurrido un error al crear el archivo: " + e.getMessage());
                    }
                }else{
                    int resultado = 1;
                    while (scanner.hasNext()) {
                        int numero = scanner.nextInt() + cifrado;
                        resultado *= numero;

                    }
                    System.out.println("Codigo Ejecutado con Exito: Multiplicación con Codificación");
                    String escribir = Integer.toString(resultado);

                    try{
                        if (Files.exists(rutaPathSalida)) {
                            Files.writeString(rutaPathSalida, escribir, StandardOpenOption.TRUNCATE_EXISTING);
                        } else {
                            Files.writeString(rutaPathSalida, escribir);
                        }
                    }catch (IOException e) {
                        System.err.println("Ha ocurrido un error al crear el archivo: " + e.getMessage());
                    }
                }
                scanner.close();

            } catch (FileNotFoundException e) {
                System.err.println("Archivo no encontrado: " + rutaArchivoIngreso);
                System.exit(1);
            }
        }if(tipoOperacion.equalsIgnoreCase("D")){
            try{
                Scanner scanner = new Scanner(new File(rutaArchivoIngreso)).useDelimiter("[^0-9]+");
                if(operacion % 2 != 0) {
                    int resultado = 0;
                    while (scanner.hasNext()) {
                        int numero = scanner.nextInt();
                        resultado += numero;
                    }
                    System.out.println("Codigo Ejecutado con Exito: Suma Decodificada");
                    String escribir = Integer.toString(resultado);
                    try{
                        if (Files.exists(rutaPathSalida)) {
                            Files.writeString(rutaPathSalida, escribir, StandardOpenOption.TRUNCATE_EXISTING);
                        } else {
                            Files.writeString(rutaPathSalida, escribir);
                        }
                    }catch (IOException e) {
                        System.err.println("Ha ocurrido un error al crear el archivo: " + e.getMessage());
                    }
                }else{
                    int resultado = 1;
                    while (scanner.hasNext()) {
                        int numero = scanner.nextInt();
                        resultado *= numero;

                    }
                    System.out.println("Codigo Ejecutado con Exito: Multiplicación Decodificada");
                    String escribir = Integer.toString(resultado);

                    try{
                        if (Files.exists(rutaPathSalida)) {
                            Files.writeString(rutaPathSalida, escribir, StandardOpenOption.TRUNCATE_EXISTING);
                        } else {
                            Files.writeString(rutaPathSalida, escribir);
                        }
                    }catch (IOException e) {
                        System.err.println("Ha ocurrido un error al crear el archivo: " + e.getMessage());
                    }
                }
                scanner.close();

            } catch (FileNotFoundException e) {
                System.err.println("Archivo no encontrado: " + rutaArchivoSalida);
                System.exit(1);
            }
        }

    }
}