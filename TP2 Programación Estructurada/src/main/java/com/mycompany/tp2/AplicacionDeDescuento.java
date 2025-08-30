
package com.mycompany.tp2;
import java.util.Scanner;

public class AplicacionDeDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorDescuento;
        String categoria;
        double valor;
        
        do{
        System.out.print("Ingrese el valor del producto: ");
        valor = scanner.nextDouble();
        
        System.out.print("Ingrese la categoría del producto: ");
        categoria = scanner.next();
        
        valorDescuento = AplicarDescuento(valor, categoria);     

        if (valorDescuento != -99) {
            System.out.println("El precio final es: " + valorDescuento);
            }
        } while (valorDescuento == -99);
          
        scanner.close();
        }
    
    public static double AplicarDescuento(double valor, String categoria) {
            if (categoria.equalsIgnoreCase("A")){
                return (valor -(valor * 10) / 100);
    }
            else if (categoria.equalsIgnoreCase("B")){
                return (valor -(valor * 15) / 100);
    }
            else if (categoria.equalsIgnoreCase("C")){
                return (valor -(valor * 20) / 100);
    }            else{
                System.out.println("Por favor, deposite una categoría válida (A,B,C)");}
                return -99;
}
}
