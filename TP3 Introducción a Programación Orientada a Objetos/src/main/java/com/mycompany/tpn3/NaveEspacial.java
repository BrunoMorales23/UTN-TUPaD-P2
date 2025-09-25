/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn3;

public class NaveEspacial {
   private String nombre;
   private double combustible;
   
   public NaveEspacial(String nombre, double combustible){
       this.nombre = nombre;
       this.combustible = combustible;
   }
   
   public void despegar(){
       System.out.println("La nave ha despegado!");
   }

   public void avanzar(double distancia){
       combustible = combustible - (distancia / 2);
       if (combustible > 0){
           System.out.println("Se puede seguir avanzando!. Quedan: " + combustible + " unidades de combustible.");
       } else{
           distancia = distancia - (distancia / 2);
           System.out.println("La nave ya no tiene combustible, solo se pudo viajar " + distancia + " unidades.");
       }
   }
   
   public void recargarCombustible(int combustible){
       this.combustible = combustible;
       System.out.println("Se cargó combustible! La nave ahora tiene: " + combustible + " unidades de combustible.");
   }
   
   public void mostrarEstado(){
       System.out.println("La nave " + nombre + " tiene un total de " + combustible + " unidades de combustible.");
   }
   
   public static void main(String[] args){
       NaveEspacial nave1 = new NaveEspacial("Nave de Incursión Minera Intergalactica Morales S.A",50);
       nave1.avanzar(75);
       nave1.avanzar(100);
       nave1.recargarCombustible(50);
       nave1.avanzar(20);
       nave1.mostrarEstado();
   }
}
