package com.mycompany.tpn6;
import java.util.ArrayList;

class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Precio: $" + precio +
                ", Cantidad: " + cantidad + ", Categoría: " + categoria + " (" + categoria.getDescripcion() + ")");
    }
}

class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void eliminarProducto(String id) {
        productos.removeIf(p -> p.getId().equals(id));
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
        }
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        Producto mayor = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayor.getCantidad()) {
                mayor = p;
            }
        }
        return mayor;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + ": " + c.getDescripcion());
        }
    }
}

public class TPn6 {

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Crear productos y agregarlos
        inventario.agregarProducto(new Producto("P001", "Arroz", 1200, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P002", "Televisor", 2500, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P003", "Camisa", 1500, 30, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P004", "Sofá", 3000, 5, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P005", "Leche", 1000, 80, CategoriaProducto.ALIMENTOS));

        System.out.println("=== Listar productos ===");
        inventario.listarProductos();

        System.out.println("\n=== Buscar producto por ID 'P003' ===");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("\n=== Filtrar por categoría ALIMENTOS ===");
        for (Producto p : inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS)) {
            p.mostrarInfo();
        }

        System.out.println("\n=== Eliminar producto 'P004' y listar restantes ===");
        inventario.eliminarProducto("P004");
        inventario.listarProductos();

        System.out.println("\n=== Actualizar stock de 'P002' a 15 ===");
        inventario.actualizarStock("P002", 15);
        inventario.listarProductos();

        System.out.println("\n=== Total de stock ===");
        System.out.println(inventario.obtenerTotalStock());

        System.out.println("\n=== Producto con mayor stock ===");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) mayorStock.mostrarInfo();

        System.out.println("\n=== Filtrar productos con precio entre 1000 y 3000 ===");
        for (Producto p : inventario.filtrarProductosPorPrecio(1000, 3000)) {
            p.mostrarInfo();
        }

        System.out.println("\n=== Categorías disponibles ===");
        inventario.mostrarCategoriasDisponibles();
    }
}
}