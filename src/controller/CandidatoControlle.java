
package controller;

import Domain.Candidato;
import dao.CandidatoDAO;
import java.util.List;
import view.CadastrarCandidato;


public class CandidatoControlle {
    
    private CandidatoDAO candidatoDAO;
    public Candidato candidato;

    public CandidatoControlle() {
        this.candidatoDAO = new CandidatoDAO(); 
        this.candidato = new Candidato();
    } 
    
    public Candidato BuscarCandidato(int numero){
        
        Candidato c = new Candidato();
        c = candidatoDAO.BuscarCandidato(numero);
        return c;
    }
    
    public List<Candidato> BuscarTodos(){
        
       List<Candidato> c  = candidatoDAO.GetCandidato();
        return c;
    }
       
    public void Salvar(Candidato c){
       candidatoDAO.adicionaCandidato(c);
    }
    
    public void Limpar(){
        candidatoDAO.DeletaTodos();
    }

    public CandidatoDAO getCandidatoDAO() {
        return candidatoDAO;
    }

    public void setCandidatoDAO(CandidatoDAO candidatoDAO) {
        this.candidatoDAO = candidatoDAO;
    }
    
}
