
package com.mycompany.tp2;
import java.util.Scanner;

public class MayorDe3Numeros {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese un segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese un tercer numero: ");
        int num3 = scanner.nextInt();
    
        int mayor = Comparar(num1, num2);
        mayor = Comparar(num3, mayor);
        System.out.println(mayor + " es el número más grande.");
        
        scanner.close();
    }
        public static int Comparar(int num1, int num2) {
            if (num1 > num2){
                    return num1;
                }
            else return num2;
        }
}
