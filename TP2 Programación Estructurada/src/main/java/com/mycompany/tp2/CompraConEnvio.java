
package com.mycompany.tp2;

import java.util.Scanner;

public class CompraConEnvio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.nextLine();

        double costoEnvio = calcularCostoEnvio(peso, zona);

        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);

        scanner.close();
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10.0;
        } else {
            System.out.println("Zona inválida. Se asumirá envío Nacional.");
            return peso * 5.0;
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
