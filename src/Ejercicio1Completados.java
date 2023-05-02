import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio1Completados {
// EJERCICIO 1.A
/*
Haga un main, donde por parámetro ponga 3 números y una letra que
represente ascendente o descendente y los muestre ordenados por tal criterio.

    public static void main(String[] args) {

        int num1 = 3; int num2 = 1; int num3 = 2; String letra = "A";
        int[] numeros = {num1 , num2, num3};

        if (letra.equals("A")) {
            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = 0; j < numeros.length - i - 1; j++) {
                    if (numeros[j] > numeros[j+1]) {
                        int temp = numeros[j];
                        numeros[j] = numeros[j+1];
                        numeros[j+1] = temp;
                    }
                }
            }
        } else if (letra.equals("D")) {
            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = 0; j < numeros.length - i - 1; j++) {
                    if (numeros[j] < numeros[j+1]) {
                        int temp = numeros[j];
                        numeros[j] = numeros[j+1];
                        numeros[j+1] = temp;
                    }
                }
            }
        }

        System.out.print("Los números ordenados son: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
*/

// EJERCICIO 1.B
/*
// Haga lo mismo, pero solicitando los parámetros de a uno por consola

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el primer número: ");
            int num1;
            try {
                num1 = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: " + e.getMessage());
                scanner.close();
                return;
            }

            System.out.print("Ingrese el segundo número: ");
            int num2;
            try {
                num2 = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: " + e.getMessage());
                scanner.close();
                return;
            }

            System.out.print("Ingrese el tercer número: ");
            int num3;
            try {
                num3 = scanner.nextInt();
            } catch (Exception e) {

                System.out.println("Ha ocurrido un error: " + e.getMessage());
                scanner.close();
                return;
            }
            System.out.print("Ingrese 'A' para orden ascendente o 'D' para orden descendente: ");
            String letra = scanner.next();
            scanner.close();

            int[] numeros = {num1 , num2, num3};

            if (letra.equalsIgnoreCase("A")) {
                for (int i = 0; i < numeros.length - 1; i++) {
                    for (int j = 0; j < numeros.length - i - 1; j++) {
                        if (numeros[j] > numeros[j+1]) {
                            int temp = numeros[j];
                            numeros[j] = numeros[j+1];
                            numeros[j+1] = temp;
                        }
                    }
                }
            } else if (letra.equalsIgnoreCase("D")) {
                for (int i = 0; i < numeros.length - 1; i++) {
                    for (int j = 0; j < numeros.length - i - 1; j++) {
                        if (numeros[j] < numeros[j+1]) {
                            int temp = numeros[j];
                            numeros[j] = numeros[j+1];
                            numeros[j+1] = temp;
                        }
                    }
                }
            } else {
                System.out.println("La letra ingresada no es válida. Por favor ingrese A o D.");
            }

            System.out.print("Los números ordenados son: ");
            for (int num : numeros) {
                System.out.print(num + " ");
            }
        }
*/

// EJERCICIO 1.C
/*
    import org.jetbrains.annotations.NotNull;
    import java.util.Scanner;
    public class Main {
        static boolean falla = true;
        public static void main(String[] args) {
            int num1 = 3;
            int num2 = 2;
            int num3 = 43;
            String letra1 = "l";
            int[] Valores = {num1,num2,num3};

                ValoresPreIngresados(Valores[0], Valores[1], Valores[2], letra1);
                if (falla != false) {
                    System.out.println("Codigo Ejecutado Exitosamente");
                }else if (falla != true){
                    ValoresPorConsola(new Scanner(System.in));
                }
        }

        public static void ValoresPreIngresados(int num1, int num2, int num3, @NotNull String letra) {

            try {
                int[] numeros = {num1, num2, num3};
                if (letra.equalsIgnoreCase("A")) {
                    for (int i = 0; i < numeros.length - 1; i++) {
                        for (int j = 0; j < numeros.length - i - 1; j++) {
                            if (numeros[j] > numeros[j + 1]) {
                                int temp = numeros[j];
                                numeros[j] = numeros[j + 1];
                                numeros[j + 1] = temp;
                            }
                        }
                    }

                    System.out.print("Los números ordenados son: ");
                    for (int num : numeros) {
                        System.out.print(num + " ");
                    }
                } else if (letra.equalsIgnoreCase("D")) {
                    for (int i = 0; i < numeros.length - 1; i++) {
                        for (int j = 0; j < numeros.length - i - 1; j++) {
                            if (numeros[j] < numeros[j + 1]) {
                                int temp = numeros[j];
                                numeros[j] = numeros[j + 1];
                                numeros[j + 1] = temp;
                            }
                        }
                    }
                    System.out.print("Los números ordenados son: ");
                    for (int num : numeros) {
                        System.out.print(num + " ");
                    }

                }  else{
                    System.out.println("La Letra Ingresada es inválida");
                    boolean falla = true;
                }
            } catch (Exception e){
                boolean falla = true;
                System.out.println("Ha ocurrido un error: " + e.getMessage());
            }
        }


        public static void ValoresPorConsola (Scanner scanner){
                System.out.print("Ingrese el 1er número: ");
                int nro1;
                    nro1 = scanner.nextInt();

                System.out.print("Ingrese el 2do número: ");
                int nro2;
                    nro2 = scanner.nextInt();

                System.out.print("Ingrese el 3er número: ");
                int nro3;
                    nro3 = scanner.nextInt();

                System.out.print("Ingrese 'A' para orden ascendente o 'D' para orden descendente: ");
                String letra = scanner.next();

                int[] nros = {nro1, nro2, nro3};

                if (letra.equalsIgnoreCase("A")) {
                    for (int i = 0; i < nros.length - 1; i++) {
                        for (int j = 0; j < nros.length - i - 1; j++) {
                            if (nros[j] > nros[j + 1]) {
                                int temp = nros[j];
                                nros[j] = nros[j + 1];
                                nros[j + 1] = temp;
                            }
                        }
                    }
                } else if (letra.equalsIgnoreCase("D")) {
                    for (int i = 0; i < nros.length - 1; i++) {
                        for (int j = 0; j < nros.length - i - 1; j++) {
                            if (nros[j] < nros[j + 1]) {
                                int temp = nros[j];
                                nros[j] = nros[j + 1];
                                nros[j + 1] = temp;
                            }
                        }
                    }
                } else {
                    System.out.println("La letra ingresada no es válida. Por favor ingrese A o D.");
                }

                System.out.print("Los números ordenados son: ");
                for (int num : nros) {
                    System.out.print(num + " ");
                }
            }
    }

 */



}