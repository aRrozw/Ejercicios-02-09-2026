
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int voto;
        int excelente = 0, bueno = 0;
        int regular = 0, malo = 0;

        for (int i = 1; i <= 30; i++) {
            System.out.println("Estudiante " + i);
            System.out.println("1 = Excelente");
            System.out.println("2 = Bueno");
            System.out.println("3 = Regular");
            System.out.println("4 = Malo");

            System.out.print("Ingrese su voto: ");
            voto = entrada.nextInt();

            if (voto == 1) {
                excelente++;
            } else if (voto == 2) {
                bueno++;
            } else if (voto == 3) {
                regular++;
            } else if (voto == 4) {
                malo++;
            }
        }

        System.out.println("Excelente: " + excelente);
        System.out.println("Bueno: " + bueno);
        System.out.println("Regular: " + regular);
        System.out.println("Malo: " + malo);

        int mayor = excelente;
        String opcion = "Excelente";

        if (bueno > mayor) {
            mayor = bueno;
            opcion = "Bueno";
        }

        if (regular > mayor) {
            mayor = regular;
            opcion = "Regular";
        }

        if (malo > mayor) {
            mayor = malo;
            opcion = "Malo";
        }

        System.out.println("Opcion mas votada: " + opcion);
    }
}
