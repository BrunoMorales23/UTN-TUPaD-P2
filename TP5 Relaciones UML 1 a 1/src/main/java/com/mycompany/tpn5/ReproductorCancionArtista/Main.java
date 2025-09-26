/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn5.ReproductorCancionArtista;

public class Main {
    public static void main(String[] args) {
        Artista artista1 = new Artista("Mr Morales", "Vocal Ligera");
        Cancion cancion1 = new Cancion("My way", artista1);
        Reproductor reproductor1 = new Reproductor();
        reproductor1.reproducir(cancion1);
    }
}

class Artista {
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
}

class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Artista getArtista() { return artista; }
    public void setArtista(Artista artista) { this.artista = artista; }
}

class Reproductor {
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() + " de " + cancion.getArtista().getNombre() + " (" + cancion.getArtista().getGenero() + ")");
    }
}