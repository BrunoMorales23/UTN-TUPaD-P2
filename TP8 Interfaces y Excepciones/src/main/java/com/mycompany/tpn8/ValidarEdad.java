
package com.mycompany.tpn8;
import java.util.Scanner;

public class ValidarEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();

            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad fuera de rango permitido.");
            }

            System.out.println("Edad válida.");

        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
