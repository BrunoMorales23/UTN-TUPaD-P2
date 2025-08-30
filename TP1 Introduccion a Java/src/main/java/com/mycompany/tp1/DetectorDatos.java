
package com.mycompany.tp1;
import java.util.Scanner;

public class DetectorDatos {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        sc.close();
    }
}
