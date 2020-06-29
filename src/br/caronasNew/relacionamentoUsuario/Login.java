package br.caronasNew.relacionamentoUsuario;

import java.util.Objects;

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
     /**
         * @author miguelcosta  METRO DE hashCode equals
         * */

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nomeUsuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Login other = (Login) obj;
        if (!Objects.equals(this.nomeUsuario, other.nomeUsuario)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }
    public void confimarLogin(){
        System.out.println("Nome: "+this.nomeUsuario);
        System.out.println("Senha: "+this.senha);
    }
    
    
    
}
