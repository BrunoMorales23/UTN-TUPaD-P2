package com.mycompany.tpn7;
import java.util.ArrayList;

public class TPn7 {

    public class Main {
    public static void main(String[] args) {
        /*
        * Caso 'Vehiculo'
         */
        Auto auto = new Auto("Toyota", "Corolla", 4);
        auto.mostrarInfo();
        
        Figura[] figuras = {
            new Circulo(3),
            new Rectangulo(4, 6)
        };
        
        /*
        * Caso 'Figura'
         */

        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " → Área: " + f.calcularArea());
        }
        
        /*
        * Caso 'Empleado'
        */
       
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Ana", 1200));
        empleados.add(new EmpleadoTemporal("Luis", 80, 10));

        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " → Sueldo: " + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("   Tipo: Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("   Tipo: Temporal");
            }
        }
    }
    
        /*
         * Caso 'Animal'
         */
        {Animal[] animales = {
            new Perro(),
            new Gato(),
            new Vaca(),
        };

        for (Animal a : animales) {
            a.hacerSonido();
        }
}
}
}