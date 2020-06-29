
package br.caronasNew.relacionamentoUsuario;

import br.caronasNew.relacionamentoUsuario.Usuario;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Motorista extends Usuario{
     private String nomeTitular;
     private String renavam;
     private Integer exercico;
     private Integer via;
     private String rntrc;
     private String cpfTitular;
     private String placa; 
     private String placaAntUf;
     private String chassi;
     private String especieTipo;
     private String marcaModelo;
     private Integer anoModelo;
     private Integer anoFabricacao;
     private String cap;
     private String cartegria;
     private String cor;
     private String ipva;
     private String dpvat;
     private String local;
     private Integer dataEmissao;
     private Integer cnhMotorista;

    public Motorista(String tU, String nom, Date dta, String CPF, String numT, String em, Integer RA, Integer cep, String rua, String numero, String complemento, String bairro, String cidade, String uf) {
        super(tU, nom, dta, CPF, numT, em, RA, cep, rua, numero, complemento, bairro, cidade, uf);
    }
    

    
    /** 
      * @author METRO CONSTRUSTOR DA classe Motorista com a superclasse Usuario
      **/   
    
  
     
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public Integer getExercico() {
        return exercico;
    }

    public void setExercico(Integer exercico) {
        this.exercico = exercico;
    }

    public Integer getVia() {
        return via;
    }

    public void setVia(Integer via) {
        this.via = via;
    }

    public String getRntrc() {
        return rntrc;
    }

    public void setRntrc(String rntrc) {
        this.rntrc = rntrc;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlacaAntUf() {
        return placaAntUf;
    }

    public void setPlacaAntUf(String placaAntUf) {
        this.placaAntUf = placaAntUf;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getEspecieTipo() {
        return especieTipo;
    }

    public void setEspecieTipo(String especieTipo) {
        this.especieTipo = especieTipo;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCartegria() {
        return cartegria;
    }

    public void setCartegria(String cartegria) {
        this.cartegria = cartegria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getIpva() {
        return ipva;
    }

    public void setIpva(String ipva) {
        this.ipva = ipva;
    }

    public String getDpvat() {
        return dpvat;
    }

    public void setDpvat(String dpvat) {
        this.dpvat = dpvat;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Integer dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Integer getCnhMotorista() {
        return cnhMotorista;
    }

    public void setCnhMotorista(Integer cnhMotorista) {
        this.cnhMotorista = cnhMotorista;
    }
        /** 
        * @author METRO DE equals E hashCode DOS Motorista
        **/
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.nomeTitular);
        hash = 61 * hash + Objects.hashCode(this.renavam);
        hash = 61 * hash + Objects.hashCode(this.exercico);
        hash = 61 * hash + Objects.hashCode(this.cpfTitular);
        hash = 61 * hash + Objects.hashCode(this.placa);
        hash = 61 * hash + Objects.hashCode(this.placaAntUf);
        hash = 61 * hash + Objects.hashCode(this.chassi);
        hash = 61 * hash + Objects.hashCode(this.marcaModelo);
        hash = 61 * hash + Objects.hashCode(this.anoFabricacao);
        hash = 61 * hash + Objects.hashCode(this.cap);
        hash = 61 * hash + Objects.hashCode(this.local);
        hash = 61 * hash + Objects.hashCode(this.dataEmissao);
        hash = 61 * hash + Objects.hashCode(this.cnhMotorista);
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
        final Motorista other = (Motorista) obj;
        if (!Objects.equals(this.nomeTitular, other.nomeTitular)) {
            return false;
        }
        if (!Objects.equals(this.renavam, other.renavam)) {
            return false;
        }
        if (!Objects.equals(this.exercico, other.exercico)) {
            return false;
        }
        if (!Objects.equals(this.cpfTitular, other.cpfTitular)) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.placaAntUf, other.placaAntUf)) {
            return false;
        }
        if (!Objects.equals(this.chassi, other.chassi)) {
            return false;
        }
        if (!Objects.equals(this.marcaModelo, other.marcaModelo)) {
            return false;
        }
        if (!Objects.equals(this.anoFabricacao, other.anoFabricacao)) {
            return false;
        }
        if (!Objects.equals(this.cap, other.cap)) {
            return false;
        }
        if (!Objects.equals(this.local, other.local)) {
            return false;
        }
        if (!Objects.equals(this.dataEmissao, other.dataEmissao)) {
            return false;
        }
        if (!Objects.equals(this.cnhMotorista, other.cnhMotorista)) {
            return false;
        }
        return true;
    }
     
        /** 
        * @author METRO toString da classe Motorista
        **/
    @Override
    public String toString() {
        return "Motorista{" + "nomeTitular=" + nomeTitular + ", placa=" + placa + ", marcaModelo=" + marcaModelo + ", cor=" + cor + ", dataEmissao=" + dataEmissao + '}';
    }
    
}
