
package com.mycompany.tp1;
import java.util.Scanner;

public class Divisiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        if (num2 != 0) {
            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        sc.close();
    }
}

