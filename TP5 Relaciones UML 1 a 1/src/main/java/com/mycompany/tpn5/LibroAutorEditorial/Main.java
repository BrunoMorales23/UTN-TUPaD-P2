/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn5.LibroAutorEditorial;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Morales Bruno Nahuel", "Javaland");
        Editorial editorial1 = new Editorial("JavaEdiciones", "Buenos Aires, Argentina");
        Libro libro1 = new Libro("Una guía fácil para el desarrollo de Objetos en Java", "333-777-1234", autor1, editorial1);

        System.out.println("El libro es: " + libro1.getTitulo());
        System.out.println("El ISBN es: " + libro1.getIsbn());
        System.out.println("El Autor es: " + libro1.getAutor().getNombre() + " (" + libro1.getAutor().getNacionalidad() + ")");
        System.out.println("La Editorial es: " + libro1.getEditorial().getNombre() + ", " + libro1.getEditorial().getDireccion());
    }
}

class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }
}

class Editorial {
    private String nombre;
    private String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
}

class Libro {
    private String titulo;
    private String isbn;

    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) { this.autor = autor; }

    public Editorial getEditorial() { return editorial; }
    public void setEditorial(Editorial editorial) { this.editorial = editorial; }
}