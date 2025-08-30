
package com.mycompany.tp1;
import java.util.Scanner;

public class OperationesPorInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        int suma = num1 + num2;
        System.out.println("Suma: " + suma);

        int resta = num1 - num2;
        System.out.println("Resta: " + resta);

        int multiplicacion = num1 * num2;
        System.out.println("Multiplicación: " + multiplicacion);

        if(num2 != 0) {
            double division = (double) num1 / num2;
            System.out.println("División: " + division);
        } else {
            System.out.println("División: No se puede dividir por cero");
        }

        sc.close();
    }
}