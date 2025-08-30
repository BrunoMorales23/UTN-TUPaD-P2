
package com.mycompany.tp2;
import java.util.Scanner;

public class DescuentoEspecial {

    static double descuentoGlobal = 0.10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        calcularDescuentoEspecial(precio);

        scanner.close();
    }

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuentoGlobal;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}
