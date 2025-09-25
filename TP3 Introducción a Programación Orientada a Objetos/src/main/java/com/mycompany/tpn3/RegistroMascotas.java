/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn3;

public class RegistroMascotas {
    private String nombre;
    private String especie;
    private int edad;
    private int edadAnterior;
    
    public RegistroMascotas(String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.edadAnterior = edad;
    }
    
    public void mostrarInfo(){
        System.out.println("La mascota se llama: "+ nombre + " y es un parte de la especie: " + especie);
        System.out.println("La mascota tiene: " + edad + " años.");
    }
    
    public void cumplirAnios(int añosCumplidos){
        edadAnterior = edad;
        edad += añosCumplidos;
        System.out.println("La mascota ahora tiene " + edad + " años al paso de " + añosCumplidos + " años.");
    }
    
    public static void main(String[] args){
        RegistroMascotas mascota1 = new RegistroMascotas("Florencio","Gatos de la calle gordos y peludos",6);
        mascota1.mostrarInfo();
        mascota1.cumplirAnios(4);
        
        RegistroMascotas mascota2 = new RegistroMascotas("Emilio", "Gatos de la calle flaquitos y no tan peludos", 3);
        mascota2.mostrarInfo();
        mascota2.cumplirAnios(7);
    }
}
