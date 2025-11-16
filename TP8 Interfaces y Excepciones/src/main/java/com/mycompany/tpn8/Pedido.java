
package com.mycompany.tpn8;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos = new ArrayList<>();
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estado = "Creado";
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
        cliente.notificar("Se agregó el producto: " + p);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El estado del pedido cambió a: " + nuevoEstado);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
}
