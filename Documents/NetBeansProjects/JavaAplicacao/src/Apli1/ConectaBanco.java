/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Apli1;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Francimar
 */
public class ConectaBanco {
public Statement stm;
    public ResultSet rs; 
    private String driver ="com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://localhost/cf0";
    private String usuario = "root";
    private String senha = "fss3";
    public Connection conn;
public void  conexao (){
 try{
     
    System.setProperty("jdbc.Drivers", driver);
    conn = DriverManager.getConnection(caminho,usuario,senha);
    
    } catch (SQLException ex) {  
  JOptionPane.showMessageDialog(null, " Erro de conexao: \nErro: " + ex.getMessage() );  
}
    
    
}
   
  
public void executaSQL(String sql){
try{
    stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
    rs = stm.executeQuery(sql);
     } catch (SQLException ex) {   
     }
}
    
}
