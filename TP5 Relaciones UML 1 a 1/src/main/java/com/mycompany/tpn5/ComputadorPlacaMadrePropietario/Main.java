/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn5.ComputadorPlacaMadrePropietario;

public class Main {
    public static void main(String[] args) {
        PlacaMadre placa1 = new PlacaMadre("ASUS MORALES STRIX B550-F", "B550");
        Propietario propietario1 = new Propietario("Bruno Nahuel Morales", "45678912");
        Computadora computadora1 = new Computadora("SANSUN", "SN123456789", placa1);
        computadora1.setPropietario(propietario1);

        // Mostrar información
        System.out.println("Computadora: " + computadora1.getMarca() + " (Serie: " + computadora1.getNumeroSerie() + ")");
        System.out.println("Placa Madre: " + computadora1.getPlacaMadre().getModelo() + " - Chipset: " + computadora1.getPlacaMadre().getChipset());
        System.out.println("Propietario: " + computadora1.getPropietario().getNombre() + " (DNI: " + computadora1.getPropietario().getDni() + ")");
    }
}

class PlacaMadre {
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getChipset() { return chipset; }
    public void setChipset(String chipset) { this.chipset = chipset; }
}

class Computadora {
    private String marca;
    private String numeroSerie;

    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }

    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public void setPlacaMadre(PlacaMadre placaMadre) { this.placaMadre = placaMadre; }

    public Propietario getPropietario() { return propietario; }
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        propietario.setComputadora(this);
    }
}

class Propietario {
    private String nombre;
    private String dni;

    private Computadora computadora;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public Computadora getComputadora() { return computadora; }
    public void setComputadora(Computadora computadora) { this.computadora = computadora; }

}
