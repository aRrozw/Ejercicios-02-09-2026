
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double venta, total = 0;
        double mayor = 0;
        int diaMayor = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingrese la venta del dia " + i + ": ");
            venta = entrada.nextDouble();

            total = total + venta;

            if (venta > mayor) {
                mayor = venta;
                diaMayor = i;
            }
        }

        double promedio = total / 7;

        System.out.println("Venta total: S/ " + total);
        System.out.printf("Promedio: S/ %.2f%n", promedio);
        System.out.println("Mayor venta: Dia " + diaMayor);
    }
}
