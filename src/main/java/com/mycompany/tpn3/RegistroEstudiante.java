/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn3;

public class RegistroEstudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificación;
    private double calificaciónAnterior;
    
    public RegistroEstudiante(String nombre, String apellido, String curso, double calificación){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificación = calificación;
        this.calificaciónAnterior = calificación;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre y apellido del estudiante: " + nombre + apellido);
        System.out.println("Actualmente cursando en: " + curso);
        System.out.println("Última calificación: " + calificación);
    }
    
    public void subirCalificación(double puntosExtra){
       calificaciónAnterior = calificación;
        calificación += puntosExtra;
        System.out.println("Calificación actualizada: " + calificación + ". Calificación previa: " + calificaciónAnterior);
    }
    
    public void bajarCalificación(double puntosReducidos){
        calificaciónAnterior = calificación;
        calificación -= puntosReducidos;
        System.out.println("Calificación actualizada: " + calificación + ". Calificación anterior: " + calificaciónAnterior);
    }
    
    public static void main(String[] args){
    RegistroEstudiante estudiante1 = new RegistroEstudiante("Bruno","Morales","Programación II",9.9);
    
    estudiante1.mostrarInfo();
    
    estudiante1.subirCalificación(0.1);
    
    estudiante1.bajarCalificación(6);
}
}
