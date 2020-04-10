package caronasnew.modelo;

import java.util.Date;

public class Cartao {
    private String tipoCartao;
    private String nome;
    private Integer numero;
    private Date dataValidade;
    private Integer codigoCeguranca;
    
    
    public Cartao(String tp, String nom, Integer num, Date dta, Integer cod){
        this.tipoCartao= tp;
        this.nome = nom;
        this.numero = num;
        this.dataValidade = dta;
        this.codigoCeguranca = cod;
        
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tc) {
        this.tipoCartao = tc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nom) {
        this.nome = nom;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer num) {
        this.numero = num;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dta) {
        this.dataValidade = dta;
    }

    public Integer getCodigoCeguranca() {
        return codigoCeguranca;
    }

    public void setCodigoCeguranca(Integer cod) {
        this.codigoCeguranca = cod;
    }
    
    public void validarCartao(){
        System.out.println("Tipo cartão: "+getTipoCartao());
        System.out.println("Nome titular do cartão: "+getNome());
        System.out.println("Número do cartão: "+getNumero());
        System.out.println("Data Validade: " +getDataValidade());
        System.out.println("Código Segurançã: "+getCodigoCeguranca());
    }
    
    
}
