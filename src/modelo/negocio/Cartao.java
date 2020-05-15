package modelo.negocio;

import java.util.Date;
import java.util.Objects;

public class Cartao extends Contribuicao{
    private String tipoCartao;
    private String nome;
    private Integer numero;
    private Date dataValidade;
    private Integer codigoCeguranca;

    public Cartao(double val) {
        super(val);
    }
  
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.tipoCartao);
        hash = 53 * hash + Objects.hashCode(this.nome);
        hash = 53 * hash + Objects.hashCode(this.numero);
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
        final Cartao other = (Cartao) obj;
        if (!Objects.equals(this.tipoCartao, other.tipoCartao)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }
  
    public String toString() {
        return "Cartao{" + "tipoCartao=" + tipoCartao + ", nome=" + nome + '}';
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
