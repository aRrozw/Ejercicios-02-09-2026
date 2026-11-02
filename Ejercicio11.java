
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double sueldo;
        double suma = 0;
        double mayor = 0;
        double menor = 999999;
        int trabajadores = 0;

        for (int i = 1; i <= 25; i++) {
            System.out.print("Ingrese el sueldo del trabajador " + i + ": ");
            sueldo = entrada.nextDouble();

            suma = suma + sueldo;

            if (sueldo > mayor) {
                mayor = sueldo;
            }

            if (sueldo < menor) {
                menor = sueldo;
            }

            if (sueldo > 2500) {
                trabajadores++;
            }
        }

        double promedio = suma / 25;

        System.out.println("Planilla total: S/ " + suma);
        System.out.println("Promedio: S/ " + promedio);
        System.out.println("Mayor sueldo: S/ " + mayor);
        System.out.println("Menor sueldo: S/ " + menor);
        System.out.println("Trabajadores con sueldo > S/2500: " + trabajadores);
    }
}
