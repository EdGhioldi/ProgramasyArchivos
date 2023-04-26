
public class Main {
    public static void main(String[] args) {

        /*
        Haga un main, donde por parámetro ponga 3 números y una letra que
        represente ascendente o descendente y los muestre ordenados por tal criterio.

        */
        int num1 = 3;
        int num2 = 1;
        int num3 = 2;
        String letra = "A";

        int[] numeros = {num1, num2, num3};

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
}