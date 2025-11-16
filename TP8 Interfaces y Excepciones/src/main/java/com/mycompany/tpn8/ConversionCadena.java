
package com.mycompany.tpn8;
import java.util.Scanner;

public class ConversionCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            String texto = sc.nextLine();

            int numero = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: El texto ingresado no es un número válido.");
        }
    }
}
