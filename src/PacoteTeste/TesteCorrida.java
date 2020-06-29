/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteTeste;

import br.caronasNew.relacionamentoUsuario.Corrida;
import java.util.Date;

/**
 *
 * @author miguelcosta
 */
public class TesteCorrida {
       public static void main(String[] args) {
       Date y = new Date();
       
       Corrida corrida = new Corrida("Rua A", "Rua Paulo Rezende", y);
       corrida.corrida();
    }
    
}
