/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn5.ImpuestoContribuyenteCalculadora;

public class Main {
    public static void main(String[] args) {
        Contribuyente contribuyente1 = new Contribuyente("Bruno Morales 'El Contribuyente'", "20-12345678-9");
        Impuesto impuesto1 = new Impuesto(1500.0, contribuyente1);
        Calculadora calculadora1 = new Calculadora();
        calculadora1.calcular(impuesto1);
    }
}

class Contribuyente {
    private String nombre;
    private String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCuil() { return cuil; }
    public void setCuil(String cuil) { this.cuil = cuil; }
}

class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public Contribuyente getContribuyente() { return contribuyente; }
    public void setContribuyente(Contribuyente contribuyente) { this.contribuyente = contribuyente; }
}

class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de $" + impuesto.getMonto() + " para " + impuesto.getContribuyente().getNombre() + " (CUIL: " + impuesto.getContribuyente().getCuil() + ")");
    }
}
