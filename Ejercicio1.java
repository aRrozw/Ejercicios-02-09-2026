
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N, suma = 0;

        System.out.print("Ingrese un numero: ");
        N = entrada.nextInt();

        for (int i = 1; i <= N; i++) {
            suma = suma + i;
        }

        System.out.println("La suma de los numeros es: " + suma);
    }
}
