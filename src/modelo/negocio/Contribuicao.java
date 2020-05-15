package modelo.negocio;

import java.util.Date;
import java.util.Objects;
  /* 
   * @author Gabriel
   */
  
public class Contribuicao{
    
 private Double valor;
 
 public Contribuicao(double val){
     this.valor= val;
     }
     /*
      * @author METADO DE get e set para classe Contribuicao
      */

  
   public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
     /*
      * @author METADO DE equals E hashCode Da classe Contribuicao
      */

    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.valor);
        return hash;
    }

 
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
        final Contribuicao other = (Contribuicao) obj;
        if (!Objects.equals(this.valor, other.valor)) {
            return false;
        }
        return true;
    }
 /*
  * @author METADO DE toString na classe Contribuicao
  */

    public String toString() {
        return "Contribuicao{" + "valor=" + valor + '}';
    }
    
}