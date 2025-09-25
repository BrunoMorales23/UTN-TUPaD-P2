/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn4;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados ++;
    }
    
    public Empleado(String nombre, String puesto){
        totalEmpleados ++;
        this.id = totalEmpleados;
        this.salario = 1500000.00;
        this.nombre = nombre;
        this.puesto = puesto;
    }
    
    public void actualizarSalario(double porcentaje){
        salario = salario + (salario * (porcentaje / 100));
        System.out.println("Se ha actualizado el salario correctamente, aplicando un " + porcentaje + "% de aumento");
        System.out.println("Sueldo final es: " + salario);
    }
    
    public void actualizarSalario(int aumento){
        salario = salario + aumento;
        System.out.println("Se ha actualizado el salario correctamente, aplicando un total de " + aumento + " de aumento");
        System.out.println("Sueldo final es: " + salario);
    }
    
    @Override
    public String toString() {
        return "Empleado[id: " + id + ", nombre:" + nombre + ", puesto:" + puesto + ", salario: " + salario + "]";
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    public void setsalario(int salario){
        if (salario > 0){
            this.salario = salario;
        } else {
            System.out.println("Por favor, deposite un valor de salario mayor a 0.");
        }
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public String getpuesto(){
        return puesto;
    }
    
    public int getid(){
        return id;
    }
    
    public static void main(String[] args){
        Empleado empleado1 = new Empleado(1, "Bruno Morales", "Desarrollador Java", 1000000.00);
        Empleado empleado2 = new Empleado("Morales Bruno", "Java Desarrollador");
        Empleado empleado3 = new Empleado(3, "Nahuel Morales", "Desarrollador Jaba", 1500000.00);
        Empleado empleado4 = new Empleado("Morales Nahuel", "Desarrollador JAVAscript");
        Empleado empleado5 = new Empleado("Bruno Nahuel Morales" , "Desarrollador scriptJAVA");
        
        empleado3.actualizarSalario(3.5);
        empleado5.actualizarSalario(50000);
        empleado1.actualizarSalario(4.75);
        empleado3.actualizarSalario(100000);
        
        empleado1.toString();
        empleado2.toString();
        empleado3.toString();
        empleado4.toString();
        empleado5.toString();
        
        int totalEmpleados = Empleado.mostrarTotalEmpleados();
        System.out.println("Total de Empleados: " + totalEmpleados);
    }
}
