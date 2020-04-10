
package caronasnew.modelo;

import java.util.Calendar;

public class Usuario {
    private String tipoUsuario;
    private String nome;
    private Calendar dtaNascimento;
    private String cpf;
    private char numTelefone;
    private String email;
    private Integer ra;
    
     public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tU) {
        this.tipoUsuario = tU;
    }
      public String getNome() {
        return nome;
    }

    public void setNome(String nom) {
        this.nome = nom;
    }
    
      public Calendar getDtaNascimento() {
        return dtaNascimento;
    }

    public void setDtaIdade(Calendar dta) {
        this.dtaNascimento = dta;
    }

  

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String CPF) {
        this.cpf = CPF;
    }

    public char getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(char numT) {
        this.numTelefone = numT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String em) {
        this.email = em;
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer RA) {
        this.ra = RA;
    }
    
}
