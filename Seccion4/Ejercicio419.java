
import java.util.Scanner;

public class Ejercicio419 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String Name;
        int NmArti, salar = 200, opci;
        // variable del salario extra
        double Extrasala;

        System.out.println("Name del Empleado: ");
        Name = entrada.next();

        do {
            System.out.println("Numero del Articulo Vendido: ");
            NmArti = entrada.nextInt();

            if (NmArti == 1) {
                Extrasala = 239.99 * 0.09;
                System.out.printf("%s supago es: %.2f%n", Name, salar + Extrasala);
            }
            if (NmArti == 2) {
                Extrasala = 129.75 * 0.09;
                System.out.printf("%s supago es: %.2f%n", Name, salar + Extrasala);
            }
            if (NmArti == 3) {
                Extrasala = 99.95 * 0.09;
                System.out.printf("%s supago es: %.2f%n", Name, salar + Extrasala);
            }
            if (NmArti == 4) {
                Extrasala = 350.89 * 0.09;
                System.out.printf("%s supago es: %.2f%n", Name, salar + Extrasala);
            }

            System.out.printf("Desea ingresar otro articulo 1)Si o 2)No\n");
            opci = entrada.nextInt();

        } while (opci == 1);

    }
}
