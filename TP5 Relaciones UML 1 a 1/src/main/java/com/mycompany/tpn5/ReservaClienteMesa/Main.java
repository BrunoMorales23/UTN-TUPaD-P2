/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn5.ReservaClienteMesa;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Bruno MoralesSsS", "11223344");
        Mesa mesa1 = new Mesa(5, 4);
        Reserva reserva1 = new Reserva("10-10-2025", "20:00", cliente1, mesa1);

        System.out.println("Reserva:");
        System.out.println("Fecha: " + reserva1.getFecha() + ", Hora: " + reserva1.getHora());
        System.out.println("Cliente: " + reserva1.getCliente().getNombre() + " (Tel: " + reserva1.getCliente().getTelefono() + ")");
        System.out.println("Mesa: " + reserva1.getMesa().getNumero() + " (Capacidad: " + reserva1.getMesa().getCapacidad() + ")");
    }
}

class Cliente {
    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}

class Mesa {
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
}

class Reserva {
    private String fecha;
    private String hora;

    private Cliente cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Mesa getMesa() { return mesa; }
    public void setMesa(Mesa mesa) { this.mesa = mesa; }
}
