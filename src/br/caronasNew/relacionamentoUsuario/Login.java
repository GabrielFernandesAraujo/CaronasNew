package br.caronasNew.relacionamentoUsuario;

/** Essa classe é de Login, foi criado os atributos, emcapsulamento 
 dos atributos e metro construstor.
 *
 * @author miguelcosta
 * 
 */
public class Login {
    private String nomeUsuario;
    private String senha;
    
     /** 
        METRO CONSTRUTOR
      
      */

    public Login(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }
   
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
