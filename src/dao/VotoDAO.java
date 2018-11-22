
package dao;

import Domain.Voto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class VotoDAO {
    private Connection conexao;

    public VotoDAO(){
        this.conexao = new ConnectionFactory().getConnection();
    }
    
    public void AdicionarVoto(Voto voto){
         String sql = "INSERT INTO voto ( valorVoto, idCandidato, dataVoto ) VALUES(?, ?, ?);";
           
           try {
               PreparedStatement pstmt =  conexao.prepareStatement(sql);
               
               pstmt.setInt(1, voto.getValorVoto());
               pstmt.setLong(2, 0);             
               
               pstmt.setDate(3, new Date(voto.getDataVoto().getTimeInMillis()));
              
              pstmt.execute();
              pstmt.close();
               
           } catch (Exception e) {
               throw new RuntimeException(e);
           }
    }
    
    public List<Voto> GetVotos(){
        try {
               PreparedStatement pstmt = conexao.prepareStatement("select * from voto");
               
               List<Voto> votos = new ArrayList<Voto>();
               Voto voto = null;
               ResultSet rs = pstmt.executeQuery();
               
               while (rs.next()) {
                  
                   Long id = rs.getLong("idVoto");
                   Integer numero = rs.getInt("valorVoto");
                   Date dataVoto = rs.getDate("dataVoto");
                                    
                   voto = new Voto();
                   voto.setId(id);
                   //voto.setDataVoto(dataVoto);
                   voto.setValorVoto(numero);
                                                     
                   
                   votos.add(voto);                   
               }
               rs.close();
               pstmt.close();
               return votos;
               
           } catch (Exception e) {
               throw new RuntimeException(e);
           }
    }
    
    public void DeleteTodos(){
         String sql = "Delete from voto where idVoto > ?;";
           
           try {
               PreparedStatement pstmt =  conexao.prepareStatement(sql); 
               
               pstmt.setInt(1, 0);
               
              pstmt.execute();
              pstmt.close();
               
           } catch (Exception e) {
               throw new RuntimeException(e);
           } 
    }

}
