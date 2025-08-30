
package com.mycompany.tp2;
import java.util.Scanner;

public class ClasificaciónEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        CompararEdad(edad);
        scanner.close();
    }
    
    public static void CompararEdad(int edad) {
            if (edad < 12){
                System.out.println("Ud es un niño.");}
            else if (edad >= 12 && edad <= 17){
                System.out.println("Ud es un adolescente.");}
            else if (edad >= 18 && edad <= 59){
                System.out.println("Ud es un adulto.");}
            else{
                System.out.println("Ud es un adulto mayor.");}
}
}

