
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    
    private String url  = "jdbc:mysql://localhost/eleicoes?autoReconnect=true&useSSL=false&useTimezone=true&serverTimezone=UTC";
    private String user = "root";
    private String pass = "";
    
    public Connection getConnection() {
        try {
           // Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
