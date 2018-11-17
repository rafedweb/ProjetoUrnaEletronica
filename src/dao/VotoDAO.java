/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Domain.Voto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Rafael
 */
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
               pstmt.setLong(2, 2);             
               
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
                  
                   //Long id = rs.getLong("id");
                   String nome = rs.getString("nome");
                   Integer numero = rs.getInt("numero");
                   String cargo = rs.getString("cargo");
                   Byte foto = rs.getByte("foto");                   
                   
                   voto = new Voto();
                   //voto.setId(id);                   
                                                     
                   
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
