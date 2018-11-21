
package Domain;

import java.util.Calendar;


public class Voto {
    
    private Long id;
    private Candidato candidato;
    private Integer valorVoto;
    private Calendar dataVoto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Integer getValorVoto() {
        return valorVoto;
    }

    public void setValorVoto(Integer valorVoto) {
        this.valorVoto = valorVoto;
    }

    public Calendar getDataVoto() {
        return dataVoto;
    }

    public void setDataVoto(Calendar dataVoto) {
        this.dataVoto = dataVoto;
    }   
    
    
}
