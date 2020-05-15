/** Essa classe é de ussuário, foi criado os atributos, emcapsulamento 
 dos atributos, metro construtor, equals E hashCode, toString. Além disso foi
 criado um metro de cadastroUsuario.
 Lembrando que foi criado uma classe interna de endereco, isso foi feito para que
 o usuário não consiga cadastrar um endereço sem antes fazer o cadastro de ussuário.
*/
package br.caronasNew.relacionamentoUsuario;

import caronasnew.modelo.Contribuicao;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class Usuario {
    private String tipoUsuario;
    private String nome;
    private Calendar dtaNascimento;
    private String cpf;
    private Integer numTelefone;
    private String email;
    private Integer ra;
    private Endereco end;
    private List<Contribuicao>contribuicao = new ArrayList<>();
     /** 
        METRO CONSTRUTOR
      
      */
       public Usuario(String tU, String nom,Calendar dta,String CPF,Integer numT,String em,Integer RA, Integer cep, String rua,
               String numero,String complemento, String bairro, String cidade,char uf ){
        this.tipoUsuario = tU;
        this.nome = nom;
        this.dtaNascimento = dta;
        this.cpf = CPF;
        this.numTelefone = numT;
        this.email = em;
        this.ra = RA;
        this.end. cep = cep;
        this.end.rua = rua;
        this.end.numero = numero;
        this.end.complemento = complemento;
        this.end.bairro= bairro;
        this.end.cidade = cidade;
        this.end.uf = uf;
    }
       
    /** 
      CLASSE INTERNA DE INDEREÇO COM METROS GET E SET
     */
       
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
    
        /**
            * @author miguelcosta 
         METRO DE toString DOS ATRIBUTOS ENDEREÇO
        */
                @Override
        public String toString() {
            return "Endereco{" + "rua=" + rua + ", cep=" + cep + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + '}';
        }
    }
        
        
    /**@author miguelcosta
          METRO GET E SET DA CLASSE USUARIO
     */
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

    public Integer getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(Integer numT) {
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
    
        /**
         * @author miguelcosta ESSE É METRO DE ATRIBUTOS QUE JUGUEI SER IMPORTANTE PARA DIFERENCIAR UM USUARIO DO OUTRO
         * */
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
     /**@author miguelcosta
        METRO DE toString DOS ATRIBUTOS USUÁRIO
     **/
    @Override
    public String toString() {
        return "Usuario{" + "tipoUsuario=" + tipoUsuario + ", nome=" + nome + ", email=" + email + ", ra=" + ra + '}';
    }
    
    /**@author miguelcosta
     * @author METRO DE CADASTRO DE USUÁRIO
     * */
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
