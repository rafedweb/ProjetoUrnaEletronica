/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rafael
 */
public class ConnectionFactory {
    
    private String url  = "jdbc:mysql://localhost/eleicoes?autoReconnect=true&useSSL=false&useTimezone=true&serverTimezone=UTC";
    private String user = "root";
    private String pass = "1234";
    
    public Connection getConnection() throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
