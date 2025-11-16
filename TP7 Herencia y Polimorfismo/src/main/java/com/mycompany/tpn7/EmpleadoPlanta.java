package com.mycompany.tpn7;

public class EmpleadoPlanta extends Empleado {
    private double salarioBase;

    public EmpleadoPlanta(String nombre, double salarioBase) {
        super(nombre);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSueldo() {
        return salarioBase;
    }
}
