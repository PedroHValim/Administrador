package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
        
/**
 *
 * @author valim
 * @author uniflduarte
 */
public class Conexao {
    public Connection getConnection() throws SQLException{
    try{    
        Connection conexao = DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/ProjetoJava",
        "postgres", "808fpedro");
        System.out.println("Conexao sucedida!");
        return conexao;
    }catch(SQLException e){
        System.out.println(e);
        return null;
    }
  } 
}
