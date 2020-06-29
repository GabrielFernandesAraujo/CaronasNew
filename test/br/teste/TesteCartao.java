/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste;

import java.util.Date;
import modelo.negocio.Cartao;

/**
 *
 * @author miguelcosta
 */
public class TesteCartao {
    public static void main(String[] args) {
       Date date = new Date();
        Cartao cartao = new Cartao("Crédito", "Miguel", 1234561234, date, 123, 12.45);
        cartao.validarCartao();
    }
    
}
