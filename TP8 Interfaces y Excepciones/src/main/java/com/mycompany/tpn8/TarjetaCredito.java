
package com.mycompany.tpn8;

public class TarjetaCredito implements Pago, PagoConDescuento {

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.95; // 5% de descuento
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando con tarjeta de crédito: $" + monto);
    }
}
