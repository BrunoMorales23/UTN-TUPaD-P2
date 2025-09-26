/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn5.VehiculoMotorConductor;

public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Diesel", "POO1234567");
        Conductor conductor1 = new Conductor("Morales Nahuel Bruno", "POO987");
        Vehiculo vehiculo1 = new Vehiculo("POO123", "Toyota Morales", motor1);
        vehiculo1.setConductor(conductor1);

        System.out.println("Vehículo: " + vehiculo1.getModelo() + " (Patente: " + vehiculo1.getPatente() + ")");
        System.out.println("Motor: " + vehiculo1.getMotor().getTipo() + " - Nº Serie: " + vehiculo1.getMotor().getNumeroSerie());
        System.out.println("Conductor: " + vehiculo1.getConductor().getNombre() + " (Licencia: " + vehiculo1.getConductor().getLicencia() + ")");
    }
}

class Motor {
    private String tipo;
    private String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }
}

class Vehiculo {
    private String patente;
    private String modelo;
    
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getPatente() { return patente; }
    public void setPatente(String patente) { this.patente = patente; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public Motor getMotor() { return motor; }
    public void setMotor(Motor motor) { this.motor = motor; }

    public Conductor getConductor() { return conductor; }
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        conductor.setVehiculo(this);
    }
}

class Conductor {
    private String nombre;
    private String licencia;

    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getLicencia() { return licencia; }
    public void setLicencia(String licencia) { this.licencia = licencia; }

    public Vehiculo getVehiculo() { return vehiculo; }
    public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }
}