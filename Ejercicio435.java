//Ejercicio 4.35

import java.util.Scanner;

public class Ejercicio435 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opci, contador = 1;

        while (contador <= 10) {
            System.out.print("Ingrese un numero diferente de 1 y 2 para mostrando el mensaje en ciclo: ");
            opci = entrada.nextInt();

            if (opci >= 3) {
                System.out.println("Hola, Bienvenido a java");
            }

            if (opci == 1 || opci == 2) {
                System.out.println("Programa Terminado...");
                break;
            }

        }
    }
}
