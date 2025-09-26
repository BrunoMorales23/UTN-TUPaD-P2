/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn5.PasaporteFotoTitular;

public class Main {
    public static void main(String[] args) {
        Foto foto1 = new Foto("fotoPeroEnJava.jpg", "jpg");
        Pasaporte pasaporte1 = new Pasaporte("123456", "25-09-2025", foto1);
        Titular titular1 = new Titular("Bruno N", "Morales");

        pasaporte1.setTitular(titular1);

        System.out.println("El Titular es: " + pasaporte1.getTitular().getNombre());
        System.out.println("Foto: " + pasaporte1.getFoto().getImagen());
    }
}


class Foto {
    private String imagen;
    private String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }

    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }
}

class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(String fechaEmision) { this.fechaEmision = fechaEmision; }

    public Foto getFoto() { return foto; }
    public void setFoto(Foto foto) { this.foto = foto; }

    public Titular getTitular() { return titular; }
    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setPasaporte(this);
    }
}

class Titular {
    private String nombre;
    private String apellido;
    private Pasaporte pasaporte;

    public Titular(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public Pasaporte getPasaporte() { return pasaporte; }
    public void setPasaporte(Pasaporte pasaporte) { this.pasaporte = pasaporte; }
}