package modelo.negocio;

import java.util.Objects;


 /* 
  * @author Gabriel
  */
  
public class Paypal extends Contribuicao{
   private String email;
   private String senha;
   private Double valor;

    public Paypal(double val) {
        super(val);
    }
   
   
 /*
  * @author METADO DE equals E hashCode Da classe Paypal
  */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.email);
        hash = 97 * hash + Objects.hashCode(this.senha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paypal other = (Paypal) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }
    
     /*
      * @author METADO DE toString na classe Paypal
      */


    
    public String toString() {
        return "Paypal{" + "email=" + email + '}';
    }

    
        public String getEmail() {
        return email;
    }

      /*
      * @author METADO DE get e set para classe Paypal
      */
  
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
