/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Domain.Candidato;
import Domain.Voto;
import dao.CandidatoDAO;
import dao.VotoDAO;

/**
 *
 * @author Rafael
 */
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
}
