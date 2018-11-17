/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Domain.Candidato;
import dao.CandidatoDAO;

/**
 *
 * @author Rafael
 */
public class CandidatoControlle {
    
    private CandidatoDAO candidatoDAO;
    private Candidato candidato;

    public CandidatoControlle() throws ClassNotFoundException {
        this.candidatoDAO = new CandidatoDAO();
        this.candidato = new Candidato();
    }  

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
       
    public void Salvar(){
       candidatoDAO.adicionaCandidato(candidato);
    }

    public CandidatoDAO getCandidatoDAO() {
        return candidatoDAO;
    }

    public void setCandidatoDAO(CandidatoDAO candidatoDAO) {
        this.candidatoDAO = candidatoDAO;
    }
    
}
