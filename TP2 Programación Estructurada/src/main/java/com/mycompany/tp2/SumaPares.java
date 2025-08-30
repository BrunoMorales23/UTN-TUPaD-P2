
package com.mycompany.tp2;
import java.util.Scanner;

public class SumaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int sumaPares = 0;

        System.out.print("Ingrese un número (0 para terminar): ");
        numero = scanner.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                sumaPares += numero;
            }

            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
        }

        System.out.println("El total de los pares es: " + sumaPares);
        scanner.close();
    }
}
