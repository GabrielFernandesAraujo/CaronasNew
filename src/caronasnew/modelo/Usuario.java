//**
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
    
    //CLASSE INTERNA DE INDEREÇO
        public class Endereco{
        private String rua;
        private Integer cep;
        private String numero;
        private String complemento;
        private String bairro;
        private String cidade;
        private char uf;
        
                public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }
        public Integer getCep() {
            return cep;
        }

        public void setCep(Integer cep) {
            this.cep = cep;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getComplemento() {
            return complemento;
        }

        public void setComplemento(String complemento) {
            this.complemento = complemento;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public char getUf() {
            return uf;
        }

        public void setUf(char uf) {
            this.uf = uf;
        }
        
        //METRO DE equals E hashCode DOS ATRIBUTOS ENDEREÇO 
            @Override
        public int hashCode() {
            int hash = 5;
            hash = 29 * hash + Objects.hashCode(this.rua);
            hash = 29 * hash + Objects.hashCode(this.cep);
            hash = 29 * hash + Objects.hashCode(this.numero);
            hash = 29 * hash + Objects.hashCode(this.complemento);
            hash = 29 * hash + Objects.hashCode(this.bairro);
            hash = 29 * hash + Objects.hashCode(this.cidade);
            hash = 29 * hash + this.uf;
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
            final Endereco other = (Endereco) obj;
            if (!Objects.equals(this.rua, other.rua)) {
                return false;
            }
            if (!Objects.equals(this.cep, other.cep)) {
                return false;
            }
            if (!Objects.equals(this.numero, other.numero)) {
                return false;
            }
            if (!Objects.equals(this.complemento, other.complemento)) {
                return false;
            }
            if (!Objects.equals(this.bairro, other.bairro)) {
                return false;
            }
            if (!Objects.equals(this.cidade, other.cidade)) {
                return false;
            }
            return true;
        }
        
        //METRO DE toString DOS ATRIBUTOS ENDEREÇO
                @Override
        public String toString() {
            return "Endereco{" + "rua=" + rua + ", cep=" + cep + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + '}';
        }

    }
    
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
    
    //METRO DE CADASTRO DE USUÁRIO
      public void cadastrarUsuario(){
        System.out.println("Tipo: " +this.tipoUsuario);
        System.out.println("Nome "+this.nome);
        System.out.println("Idade: "+this.dtaNascimento);
        System.out.println("CPF "+this.cpf);
        System.out.println("Número de telefone: "+this.numTelefone);
        System.out.println("E-mail: "+this.email);
        System.out.println("RA: "+this.ra);
    }
    
}
