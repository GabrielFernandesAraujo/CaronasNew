package caronasnew.modelo;

import java.sql.Time;

public class Consulta {
   protected String nomeMotrorista;
   protected String dia;
   protected Time hora;
   protected Double valor;
   protected Integer quantidade;
   
   public Consulta(String nomM, String day, Time hour, Double val, Integer qta){
       this.nomeMotrorista = nomM;
       this.dia = day;
       this.hora = hour;
       this.valor = val;
       this.quantidade = qta;
       
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
