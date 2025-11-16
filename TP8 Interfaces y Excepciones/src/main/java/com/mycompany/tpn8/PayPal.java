
package com.mycompany.tpn8;

public class PayPal implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago realizado con PayPal por: $" + monto);
    }
}
