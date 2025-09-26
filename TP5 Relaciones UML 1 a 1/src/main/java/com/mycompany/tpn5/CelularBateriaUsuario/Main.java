/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn5.CelularBateriaUsuario;

public class Main {
    public static void main(String[] args) {
        Bateria bateria1 = new Bateria("Li-Ion 5000moraLES", 5000);
        Usuario usuario1 = new Usuario("Bruno Morales", "12345678");
        Celular celular1 = new Celular("4631641655321", "Aifon", "Galaxy S99", bateria1);

        celular1.setUsuario(usuario1);

        System.out.println("Celular: " + celular1.getMarca() + " " + celular1.getModelo());
        System.out.println("IMEI: " + celular1.getImei());
        System.out.println("Batería: " + celular1.getBateria().getModelo() + " - " + celular1.getBateria().getCapacidad() + " mAh");
        System.out.println("Usuario: " + celular1.getUsuario().getNombre() + " (DNI: " + celular1.getUsuario().getDni() + ")");
    }
}

class Bateria {
    private String modelo;
    private int capacidad;

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
}

class Celular {
    private String imei;
    private String marca;
    private String modelo;

    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    public String getImei() { return imei; }
    public void setImei(String imei) { this.imei = imei; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public Bateria getBateria() { return bateria; }
    public void setBateria(Bateria bateria) { this.bateria = bateria; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        usuario.setCelular(this);
    }
}

class Usuario {
    private String nombre;
    private String dni;

    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public Celular getCelular() { return celular; }
    public void setCelular(Celular celular) { this.celular = celular; }
}