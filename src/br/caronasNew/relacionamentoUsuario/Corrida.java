/** Essa classe é de Corrida, foi criado os atributos, emcapsulamento 
 dos atributos, metro construtor e toString.
*/
package br.caronasNew.relacionamentoUsuario;

/**
 *
 * @author miguelcosta
 */
import java.util.Date;

public class Corrida {
    private String origem;
    private String destino;
    private Date data;

    /**
    * @author miguelcosta 
    * METRO CONSTRUTOR
    */
    public Corrida(String origem, String destino, Date data) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        
    }
    
    
    
    /** 
      CLASSE INTERNA DE CORRIDA COM METROS GET E SET
     */

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

   

    @Override
    public String toString() {
        return "Corrida{" + "origem=" + origem + ", destino=" + destino + ", data=" + data +  '}';
     
    }
     public void corrida(){
        System.out.println("Origem: "+this.origem);
        System.out.println("Destino: "+this.destino);
        System.out.println("Data: "+this.data);
    }
    
   
}
