/** Essa classe é de Corrida, foi criado os atributos, emcapsulamento 
 dos atributos, metro construtor e toString.
*/
package br.caronasNew.relacionamentoUsuario;

/**
 *
 * @author miguelcosta
 */
import java.sql.Time;
import java.util.Calendar;

public class Corrida {
    private String origem;
    private String destino;
    private Calendar data;
    private Time horas;

    /**
    * @author miguelcosta 
    * METRO CONSTRUTOR
    */
    public Corrida(String origem, String destino, Calendar data, Time horas) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.horas = horas;
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

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Time getHoras() {
        return horas;
    }

    public void setHoras(Time horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Corrida{" + "origem=" + origem + ", destino=" + destino + ", data=" + data + ", horas=" + horas + '}';
    }
    
   
}