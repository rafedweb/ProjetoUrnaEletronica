
package dao;

import Domain.Candidato;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public class TestaConexao {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Connection connection = 
                new ConnectionFactory().getConnection();
        System.out.println("Conetado, bem vindo ao banco eleições!!");
        
        CandidatoDAO dao = new CandidatoDAO();
        
        //testar inserir 
        //Candidato candidato = new Candidato();
       // candidato.setNome("Giliarde");
       // candidato.setNumero(24);
        //candidato.setCargo("Presidente");      
                
       // dao.adicionaCandidato(candidato);
        
        //System.out.println("Gravadao com sucesso!");
        
        //Testa a Busca
        List<Candidato> lista = dao.GetCandidato();
        
        for(Candidato c : lista){
            System.out.println("Nome:- " + c.getNome());
            System.out.println("Cargo:- " + c.getCargo());
            System.out.println("Numero:- " + c.getNumero());
        }
        
        connection.close();
    }
}
 