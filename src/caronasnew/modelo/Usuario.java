
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
    
    //CLASSE INTERNA DE ENDEREÇO PARA EVITAR QUE USUÁRIO REGISTRA UM ENDEREÇO ANTE DE FAZER O CADASTROS DE USUÁRIO
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
