// Haga lo mismo, pero solicitando los parámetros de a uno por consola
import java.util.Scanner;
public class Main {
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
}
