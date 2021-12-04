package br.com.infox.dal;
import java.sql.*;

public class ModuloConexao {
    
    //Método responsável por fazer a conexão com o banco 
    public static Connection conector(){
        Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
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
