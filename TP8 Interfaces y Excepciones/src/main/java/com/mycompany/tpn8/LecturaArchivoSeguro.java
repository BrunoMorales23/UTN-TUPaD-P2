
package com.mycompany.tpn8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivoSeguro {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("texto.txt"))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
