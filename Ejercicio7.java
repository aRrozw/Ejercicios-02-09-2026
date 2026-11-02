
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N, suma = 0;

        System.out.print("Ingrese un numero: ");
        N = entrada.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
            suma = suma + i;
        }

        System.out.println();

        System.out.println("Cantidad: " + N);
        System.out.println("Suma: " + suma);
    }
}
