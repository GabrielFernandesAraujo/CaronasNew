package br.teste;

import modelo.negocio.Paypal;

/**
 *
 * @author Gabriel
 */
public class TestePayPal {
    public static void main(String[] args) {
        Paypal paypal = new Paypal("@Costa", "@|Sabio",12.36);
        paypal.validarPaypal();
    }
    
}
