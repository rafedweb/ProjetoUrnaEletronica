/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Domain.Candidato;
import dao.CandidatoDAO;
import view.CadastrarCandidato;

/**
 *
 * @author Rafael
 */
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
       
    public void Salvar(Candidato c){
       candidatoDAO.adicionaCandidato(c);
    }

    public CandidatoDAO getCandidatoDAO() {
        return candidatoDAO;
    }

    public void setCandidatoDAO(CandidatoDAO candidatoDAO) {
        this.candidatoDAO = candidatoDAO;
    }
    
}
