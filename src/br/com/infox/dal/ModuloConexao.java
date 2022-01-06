package br.com.infox.dal;
import java.sql.*;

/**
 * Conexão com o banco de dados
 * @author Vitor
 */
public class ModuloConexao {
    /**
     * Método responsável por fazer a conexão com o banco 
     * @return conexao
     */
    
    public static Connection conector(){
        Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbinfox?characterEncoding=utf-8";
        String user = "dba";
        String password="12345";
        
        try {
            //Essa chamada faz ser possível a utilização do driver do banco de dados
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
        
        
       
        
    }
}
