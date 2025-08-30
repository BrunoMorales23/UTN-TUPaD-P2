
package com.mycompany.tp2;
import java.util.Scanner;

public class ValidacionDeNota  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Ingrese una nota (Del 0 al 10): ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente: " + nota);
        scanner.close();
    }
}
