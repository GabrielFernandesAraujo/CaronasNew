/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteTeste;

import br.caronasNew.relacionamentoUsuario.Usuario;
import java.util.Date;

/**
 *
 * @author miguelcosta
 */
public class Testeusuario {
     public static void main(String[] args) {
        Date x = new Date();
        Usuario usuario = new Usuario("Aluno", "Miguel", x , "144.255.369-56","(31)9.92095465", "miguel.ncmg@hotmail.com", 12105987,30570600, "Rua Henrique Badaró Portugal",
                "51", "Casa", "Palmeiras", "Belo Horizonte", "MG");
        usuario.cadastrarUsuario();
        
     }
    
}
