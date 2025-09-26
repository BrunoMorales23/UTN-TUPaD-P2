/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn5.DocumentoFirmaDigitalUsuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Bruno Morales", "xXMoralesXx@email.com");
        FirmaDigital firma1 = new FirmaDigital("ABC123DEF456", "25-09-2025", usuario1);
        Documento documento1 = new Documento("Contrato de Arriendo de Equipo de Trabajo", "Contenido del contrato...", firma1);

        System.out.println("Documento: " + documento1.getTitulo());
        System.out.println("Contenido: " + documento1.getContenido());
        System.out.println("Firma Digital: " + documento1.getFirma().getCodigoHash() + " (Fecha: " + documento1.getFirma().getFecha() + ")");
        System.out.println("Usuario: " + documento1.getFirma().getUsuario().getNombre() + " (Email: " + documento1.getFirma().getUsuario().getEmail() + ")");
    }
}

class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

class FirmaDigital {
    private String codigoHash;
    private String fecha;

    private Usuario usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigoHash() { return codigoHash; }
    public void setCodigoHash(String codigoHash) { this.codigoHash = codigoHash; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}

class Documento {
    private String titulo;
    private String contenido;

    private FirmaDigital firma;

    public Documento(String titulo, String contenido, FirmaDigital firma) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = firma;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }

    public FirmaDigital getFirma() { return firma; }
    public void setFirma(FirmaDigital firma) { this.firma = firma; }
}