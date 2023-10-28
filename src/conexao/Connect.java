
package conexao;

import java.sql.*;
import javax.swing.*;

public class Connect{
    
    //Conexão H2

    final private String driver = "org.h2.Driver";
 
    public Connection conn;
    public Statement stmt;
    public ResultSet rs;
    public PreparedStatement ps;
    public ResultSetMetaData rsmd;
 
    public boolean conecta(){
    
    
        boolean result = true;
    
        try{

        Class.forName(driver);

        conn = DriverManager.getConnection("jdbc:h2:.//banco//bd_aluno","sa","");
        
    
        }
        
        catch(ClassNotFoundException e){

        JOptionPane.showMessageDialog(null,"Driver não localizado " + e);

        result = false;
        }
        
        catch(SQLException e){

        JOptionPane.showMessageDialog(null,"Erro na Connect         com a fonte " + e);

        result = false;
        }
         
        return result;
       
   } // fecha metodo conecta
   
   public void desconecta(){
       
    boolean result = true;
    
        try{
            
            rs.close();
        
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"rs não             fechou "+e);
            result = false;
        }
        
        try{
            stmt.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"stmt não             fechou "+e);
            result = false;
        }
        
        try{
            conn.close();
        }
        catch(SQLException e){ 
                JOptionPane.showMessageDialog(null,"conn                 não fechou "+e);
                result = false;
        }

    }//desconecta
   
           public void executeSQL(String sql){
               
            try{
                stmt = conn.createStatement(
                  //ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.TYPE_FORWARD_ONLY);  
                
                
                ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                rs = stmt.executeQuery(sql);
            }
            
            catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Não executou o sql" + e + " - " + sql); 
        }
            
   }// executeSQL

    public Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           
}// classe
    
    
    
    
    
    
    
    
    
    

