
package com.mycompany.tp2;

public class ImpresionRecursivaPrecios {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirPreciosRecursivo(precios, 0);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        imprimirPreciosRecursivo(precios, 0);
    }

    public static void imprimirPreciosRecursivo(double[] array, int indice) {
        if (indice >= array.length) {
            return;
        }

        System.out.println("Precio: $" + array[indice]);

        imprimirPreciosRecursivo(array, indice + 1);
    }
}
