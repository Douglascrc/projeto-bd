
package classe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Connect {
    
    
    private final String DRIVER = "org.h2.Driver";
    private final String URL = "jdbc:h2:.//banco//db_library";
    private final String USER = "sa";
    private final String PASS = "";
    
    public Connection conn;
    public PreparedStatement ps;
    public Statement st;
    public ResultSet rs;
   
    public Connection getConnection(){

        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL,USER,PASS);

        } 
        catch (ClassNotFoundException | SQLException ex) {
            
           
            throw new RuntimeException("Erro na conexão ", ex);
        }
   
        
        
    }//fecha getConnection
    
    
                
    
    public static void closeConnection(Connection con){
        
       
            try {
                 if(con != null){
                  con.close();
                 }
            }  
            catch (SQLException ex) {
                     
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }// fecha closeConnection
    
    
        public static void closeConnection(Connection con, PreparedStatement stmt){
        
            closeConnection(con);
       
            try {
                 if(stmt != null){
                   stmt.close();
                 }
            }  
            catch (SQLException ex) {
                     
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }// fecha closeConnection
        
          public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
            closeConnection(con,stmt);
       
            try {
                 if(rs != null){
                   rs.close();
                 }
            }  
            catch (SQLException ex) {
                     
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }// fecha closeConnection
          
        /*
          public void executeSQL(String sql){
               
            try{
                    st = conn.createStatement(
                        ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                    rs = st.executeQuery(sql);
                }
            
            catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Não executou o sql" + e + " - " + sql); 
                }
            
        }// executeSQL
    
    */
}//fecha classe
