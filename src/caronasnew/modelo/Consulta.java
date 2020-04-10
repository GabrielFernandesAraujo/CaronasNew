package caronasnew.modelo;

import java.sql.Time;
import java.util.Objects;

public class Consulta {
   private String nomeMotrorista;
   private String dia;
   private Time hora;
   private Double valor;
   private Integer quantidade;
   
   public Consulta(String nomM, String day, Time hour, Double val, Integer qta){
       this.nomeMotrorista = nomM;
       this.dia = day;
       this.hora = hour;
       this.valor = val;
       this.quantidade = qta;
       
   }

     public String toString() {
        return "Consulta{" + "nomeMotrorista=" + nomeMotrorista + ", dia=" + dia + ", hora=" + hora + ", valor=" + valor + ", quantidade=" + quantidade + '}';
    }

    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nomeMotrorista);
        hash = 37 * hash + Objects.hashCode(this.hora);
        hash = 37 * hash + Objects.hashCode(this.valor);
        hash = 37 * hash + Objects.hashCode(this.quantidade);
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
        final Consulta other = (Consulta) obj;
        if (!Objects.equals(this.nomeMotrorista, other.nomeMotrorista)) {
            return false;
        }
        if (!Objects.equals(this.dia, other.dia)) {
            return false;
        }
        if (!Objects.equals(this.hora, other.hora)) {
            return false;
        }
        if (!Objects.equals(this.valor, other.valor)) {
            return false;
        }
        if (!Objects.equals(this.quantidade, other.quantidade)) {
            return false;
        }
        return true;
    }

  
    public String getNomeMotrorista() {
        return nomeMotrorista;
    }

    public void setNomeMotrorista(String nomM) {
        this.nomeMotrorista = nomM;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String day) {
        this.dia = day;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hour) {
        this.hora = hour;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double val) {
        this.valor = val;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer qta) {
        this.quantidade = qta;
    }
   public void consultarCarona(){
       System.out.println("NOme do Motorista: "+getNomeMotrorista());
       System.out.println("Dia: "+getDia());
       System.out.println("Horas: "+getHora());
       System.out.println("Valor gasot "+getValor());
   }
   public void ConsultarExtrato(){
       System.out.println("Quantidade de Corrida: "+getQuantidade());
       System.out.println("Valor gasot "+getValor());
       
   }


}
