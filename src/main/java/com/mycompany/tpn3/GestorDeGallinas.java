/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn3;

public class GestorDeGallinas {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public GestorDeGallinas(int idGallina, int edad, int huevosPuestos){
    this.idGallina = idGallina;
    this.edad = edad;
    this.huevosPuestos = huevosPuestos;
}
    public void ponerHuevo(){
        huevosPuestos ++;
        System.out.println("La gallina: "+ idGallina + " ha puesto un huevo");
    }
    
    public void envejecer(){
        edad ++;
        System.out.println("La gallina: "+ idGallina + " ha envejecido un año");
    }
    
    public void mostrarEstado(){
        System.out.println("La gallina: " + idGallina + " ha puesto un total de: " + huevosPuestos + " y tiene: " + edad + " años.");
    }
    
    public static void main(String[] args){
        GestorDeGallinas gallina1 = new GestorDeGallinas(1,3,6);
        GestorDeGallinas gallina2 = new GestorDeGallinas(2,1,1);
        
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina1.mostrarEstado();
        
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.mostrarEstado();
    }
}
