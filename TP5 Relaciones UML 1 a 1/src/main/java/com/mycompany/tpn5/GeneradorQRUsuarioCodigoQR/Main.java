/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn5.GeneradorQRUsuarioCodigoQR;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Morales Bruno", "moralesbruno2303@email.com");
        GeneradorQR generador1 = new GeneradorQR();
        generador1.generar("https://www.MoralesBNahuel2303.com", usuario1);
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

class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() { return valor; }
    public void setValor(String valor) { this.valor = valor; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}

class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("Generado QR con valor: " + qr.getValor() + " para usuario: " + qr.getUsuario().getNombre());
    }
}