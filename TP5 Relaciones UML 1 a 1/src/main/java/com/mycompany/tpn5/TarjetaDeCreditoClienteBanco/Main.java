/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn5.TarjetaDeCreditoClienteBanco;

public class Main {
    public static void main(String[] args) {
        Banco banco1 = new Banco("Banco Morgan Morales", "12-12345678-9");
        Cliente cliente1 = new Cliente("Morales Bruno Nahuel", "12345345");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("1234-5678-9012-3456", "12/2027", banco1);
        tarjeta1.setCliente(cliente1);

        System.out.println("Tarjeta Número: " + tarjeta1.getNumero());
        System.out.println("Vencimiento: " + tarjeta1.getFechaVencimiento());
        System.out.println("Cliente: " + tarjeta1.getCliente().getNombre() + " (DNI: " + tarjeta1.getCliente().getDni() + ")");
        System.out.println("Banco: " + tarjeta1.getBanco().getNombre() + " (CUIT: " + tarjeta1.getBanco().getCuit() + ")");
    }
}

class Banco {
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCuit() { return cuit; }
    public void setCuit(String cuit) { this.cuit = cuit; }
}

class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;

    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(String fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    public Banco getBanco() { return banco; }
    public void setBanco(Banco banco) { this.banco = banco; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        cliente.setTarjeta(this);
    }
}

class Cliente {
    private String nombre;
    private String dni;

    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public TarjetaDeCredito getTarjeta() { return tarjeta; }
    public void setTarjeta(TarjetaDeCredito tarjeta) { this.tarjeta = tarjeta; }
}