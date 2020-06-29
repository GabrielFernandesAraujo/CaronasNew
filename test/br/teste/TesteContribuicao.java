/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste;

import modelo.negocio.Contribuicao;

/**
 *
 * @author miguelcosta
 */
public class TesteContribuicao {
    public static void main(String[] args) {
        Contribuicao contribuicao = new Contribuicao(12.20);
        contribuicao.pagarContribuicao();
    }
    
}
