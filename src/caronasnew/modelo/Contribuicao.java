package caronasnew.modelo;

import java.util.Date;
import java.util.Objects;


public class Contribuicao extends Cartao {
    

  
    private Double valor;

    public Contribuicao(String tp, String nom, Integer num, Date dta, Integer cod) {
        super(tp, nom, num, dta, cod);
    }
    
    
     public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

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

 
    public String toString() {
        return "Contribuicao{" + "valor=" + valor + '}';
    }
    
}