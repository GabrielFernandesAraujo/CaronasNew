
package caronasnew.modelo;

import java.util.Calendar;
import java.util.Objects;

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
    
        //ESSE É METRO DE ATRIBUTOS QUE JUGUEI SER IMPORTANTE PARA DIFERENCIAR UM USUARIO DO OUTRO
      @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Objects.hashCode(this.cpf);
        hash = 17 * hash + Objects.hashCode(this.email);
        hash = 17 * hash + Objects.hashCode(this.ra);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.ra, other.ra)) {
            return false;
        }
        return true;
    }
    
        //o metro toString do que juguei importante mostrar
    @Override
    public String toString() {
        return "Usuario{" + "tipoUsuario=" + tipoUsuario + ", nome=" + nome + ", email=" + email + ", ra=" + ra + '}';
    }
    
}
