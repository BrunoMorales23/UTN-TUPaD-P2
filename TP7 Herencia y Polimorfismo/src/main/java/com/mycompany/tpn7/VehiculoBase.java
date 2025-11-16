
package com.mycompany.tpn7;

public class VehiculoBase {
    protected String marca;
    protected String modelo;

    public VehiculoBase(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}

