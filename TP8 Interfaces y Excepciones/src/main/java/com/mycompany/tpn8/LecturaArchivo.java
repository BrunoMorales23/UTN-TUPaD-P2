
package com.mycompany.tpn8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) {
        try {
            File archivo = new File("texto.txt");
            Scanner sc = new Scanner(archivo);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
        }
    }
}
