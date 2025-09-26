/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn5.CuentaBancariaClaveSeguridadTitular;

public class Main {
    public static void main(String[] args) {
        Titular titular1 = new Titular("Morales Bruno", "12345678");
        ClaveSeguridad clave1 = new ClaveSeguridad("POO123OOP", "25-09-2025");
        CuentaBancaria cuenta1 = new CuentaBancaria("000123456789", 15000.0, clave1);
        cuenta1.setTitular(titular1);

        System.out.println("Cuenta Bancaria: " + cuenta1.getCbu() + " - Saldo: $" + cuenta1.getSaldo());
        System.out.println("Titular: " + cuenta1.getTitular().getNombre() + " (DNI: " + cuenta1.getTitular().getDni() + ")");
        System.out.println("Clave de Seguridad: " + cuenta1.getClave().getCodigo() + " (Última Modificación: " + cuenta1.getClave().getUltimaModificacion() + ")");
    }
}

class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getUltimaModificacion() { return ultimaModificacion; }
    public void setUltimaModificacion(String ultimaModificacion) { this.ultimaModificacion = ultimaModificacion; }
}

class CuentaBancaria {
    private String cbu;
    private double saldo;

    private ClaveSeguridad clave;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
    }

    public String getCbu() { return cbu; }
    public void setCbu(String cbu) { this.cbu = cbu; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public ClaveSeguridad getClave() { return clave; }
    public void setClave(ClaveSeguridad clave) { this.clave = clave; }

    public Titular getTitular() { return titular; }
    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setCuenta(this);
    }
}

class Titular {
    private String nombre;
    private String dni;

    private CuentaBancaria cuenta;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public CuentaBancaria getCuenta() { return cuenta; }
    public void setCuenta(CuentaBancaria cuenta) { this.cuenta = cuenta; }
}
