
package controller;

import Domain.Candidato;
import Domain.Voto;
import dao.CandidatoDAO;
import dao.VotoDAO;


public class VotoControlle {
    
    private VotoDAO votoDAO;
    private CandidatoDAO candidatoDAO;
    public Candidato candidato;
    public Voto voto;

    public VotoControlle() {
        this.voto = new Voto();
        this.votoDAO = new VotoDAO();
        this.candidatoDAO = new CandidatoDAO();
        this.candidato = new Candidato();
    }
    
    public void Votar(){
        votoDAO.AdicionarVoto(voto);
    }
    
    public Candidato BuscarCandidato(int numero){
        Candidato c = new Candidato();
        c =  candidatoDAO.BuscarCandidato(numero);       
        return c;
    }
    
    public void Limpar(){
        votoDAO.DeleteTodos();
    }
}
