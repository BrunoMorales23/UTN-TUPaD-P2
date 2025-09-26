package com.mycompany.tpn5.CitaMedicaPacienteProfesional;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Nahuel Bruno Morales", "OSDE");
        Profesional profesional1 = new Profesional("Dra. Morales NoBru", "Especialista en Rodillas y Escoliosis");
        CitaMedica cita1 = new CitaMedica("30-09-2025", "09:30", paciente1, profesional1);

        System.out.println("Cita Médica:");
        System.out.println("Fecha: " + cita1.getFecha() + ", Hora: " + cita1.getHora());
        System.out.println("Paciente: " + cita1.getPaciente().getNombre() + " (Obra Social: " + cita1.getPaciente().getObraSocial() + ")");
        System.out.println("Profesional: " + cita1.getProfesional().getNombre() + " (Especialidad: " + cita1.getProfesional().getEspecialidad() + ")");
    }
}

class Paciente {
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getObraSocial() { return obraSocial; }
    public void setObraSocial(String obraSocial) { this.obraSocial = obraSocial; }
}

class Profesional {
    private String nombre;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
}

class CitaMedica {
    private String fecha;
    private String hora;

    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public Profesional getProfesional() { return profesional; }
    public void setProfesional(Profesional profesional) { this.profesional = profesional; }
}
