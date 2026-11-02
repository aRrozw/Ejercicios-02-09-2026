
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        long factorial = 1;

        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        System.out.println(numero + "! = " + factorial);
    }
}
