
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N;

        System.out.print("Ingrese un numero: ");
        N = entrada.nextInt();

        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
