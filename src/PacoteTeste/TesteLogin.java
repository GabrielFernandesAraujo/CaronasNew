/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteTeste;

import br.caronasNew.relacionamentoUsuario.Login;

/**
 *
 * @author miguelcosta
 */
public class TesteLogin {
     public static void main(String[] args) {
         Login login = new Login("@Miguel", "bana02");
        login.confimarLogin();
    
    }
     
    
}
