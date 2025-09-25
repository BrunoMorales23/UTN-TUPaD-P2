/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn3;

public class EncapsulamientoLibro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    public EncapsulamientoLibro(String titulo, String autor, int añoPublicacion){
    this.titulo = titulo;
    this.autor = autor;
    setAñoPublicacion(añoPublicacion);
}
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAñoPublicacion(){
        return añoPublicacion;
    }
    
    public void setAñoPublicacion(int año){
    if (año > 0 && año <= 2025){
        this.añoPublicacion = año;
    } else {
        System.out.println("El año es inválido. No se pudo actualizar el registro.");
    }
    }
    
    public void mostrarInfo(){
        System.out.println("Título del libro: " + titulo);
        System.out.println("Autor del libro: " + autor);
        System.out.println("Año de publicación del libro: " + añoPublicacion);
    }
    
    public static void main(String[] args){
        EncapsulamientoLibro libro1 = new EncapsulamientoLibro("Las Aventuras de Programación II", "Bruno Morales", 2025);
        libro1.setAñoPublicacion(9999);
        libro1.setAñoPublicacion(2025);
        
        libro1.mostrarInfo();
    }
}
