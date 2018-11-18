/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Domain.Candidato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class CandidatoDAO {
    
    private Connection conexao;

    public CandidatoDAO(){
        this.conexao = new ConnectionFactory().getConnection();
    }

       public void adicionaCandidato(Candidato candidato){
           
           String sql = "INSERT INTO candidato (nome,numero, cargo) VALUES(?, ?, ?);";
           
           try {
               PreparedStatement pstmt =  conexao.prepareStatement(sql);
               
               pstmt.setString(1, candidato.getNome());
               pstmt.setInt(2, candidato.getNumero());
               pstmt.setString(3, candidato.getCargo());
              // pstmt.setByte(4, candidato.getFoto());
              
              pstmt.execute();
              pstmt.close();
               
           } catch (Exception e) {
               throw new RuntimeException(e);
           }
       }
       
       public List<Candidato> GetCandidato(){           
           
           try {
               PreparedStatement pstmt = conexao.prepareStatement("select * from candidato");
               
               List<Candidato> candidatos = new ArrayList<Candidato>();
               Candidato candidato = null;
               ResultSet rs = pstmt.executeQuery();
               
               while (rs.next()) {
                  
                   Long id = rs.getLong("idCandidato");
                   String nome = rs.getString("nome");
                   Integer numero = rs.getInt("numero");
                   String cargo = rs.getString("cargo");
                   Byte foto = rs.getByte("foto");                   
                   
                   candidato = new Candidato();
                   candidato.setId(id);
                   candidato.setNome(nome);
                   candidato.setNumero(numero);
                   candidato.setCargo(cargo);
                   candidato.setFoto(foto);
                                                     
                   
                   candidatos.add(candidato);                   
               }
               rs.close();
               pstmt.close();
               return candidatos;
               
           } catch (Exception e) {
               throw new RuntimeException(e);
           }
           
       }
   
       public void DeletaTodos(){
             String sql = "DELETE FROM candidato where idCandidato > ?;";
           
           try {
               PreparedStatement pstmt =  conexao.prepareStatement(sql);
                 pstmt.setInt(1, 0);
              
              pstmt.execute();
              pstmt.close();
               
           } catch (Exception e) {
               throw new RuntimeException(e);
           }
       }
       
       public Candidato BuscarCandidato(int numeroCandidato){
               try {
               PreparedStatement pstmt = conexao.prepareStatement("select * from candidato WHERE numero=?");
               
               pstmt.setInt(1, numeroCandidato);
               
               Candidato candidato = null;
               ResultSet rs = pstmt.executeQuery();
               
               if(rs.next()) {
                  
                   Long id = rs.getLong("idCandidato");
                   String nome = rs.getString("nome");
                   Integer numero = rs.getInt("numero");
                   String cargo = rs.getString("cargo");
                   Byte foto = rs.getByte("foto");                   
                   
                   candidato = new Candidato();
                   candidato.setId(id);
                   candidato.setNome(nome);
                   candidato.setNumero(numero);
                   candidato.setCargo(cargo);
                   candidato.setFoto(foto);
                                                     
                   
                                    
               }
               rs.close();
               pstmt.close();
               return candidato;
               
           } catch (Exception e) {
               throw new RuntimeException(e);
           }
       }
}
