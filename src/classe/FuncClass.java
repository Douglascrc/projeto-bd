
package classe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class FuncClass {
    
      Connect connec = null;
      // String imagePath = System.getProperty("user.dir");
       
       String caminhoimg = "//fotos//";
       String imagePath = System.getProperty("user.dir") + caminhoimg;
    
    
      public void displayImage(int width, int height, byte[] imagebyte, String imagePath, JLabel label){
        
        
       //get the image
          ImageIcon imgIco;
          
          if(imagebyte != null){
              imgIco = new ImageIcon(imagebyte);
          }
          else{ // get image using path
              try{
                  
              
               imgIco = new ImageIcon(getClass().getResource(imagePath)); //pegar a imagem
          
              }
              catch(Exception e){
                imgIco = new ImageIcon(imagePath);
              }
          }
        
        Image image = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH); // fazer a imagem redimensionar
        
           
        label.setIcon(new ImageIcon(image));// inserir a imagem no label  
        

    }//Fim método displayImage
      
      
      // create to customize JTable
      public void customTable(JTable table){
          
        table.setSelectionBackground(new Color(249,105,14));
        table.setSelectionForeground(Color.white);
        table.setRowHeight(40);
        table.setShowGrid(false);
        table.setBackground(new Color(248,248,248));
        table.setShowHorizontalLines(true);
        table.setGridColor(Color.ORANGE);
          
      }
      
      // create to customize JTable Header
      public void customTableHeader(JTable table, Color back_color, Integer fontSize){
          
        table.getTableHeader().setBackground(back_color);
        table.getTableHeader().setForeground(Color.white);
        table.getTableHeader().setFont(new Font("Verdana",Font.BOLD, fontSize));
        table.getTableHeader().setOpaque(true);
          
      }
      
      
      // Create a function to return a resultSet
      // we will use this function to reduce the code when populating the arraylist
      
      public ResultSet getData(String selectQuery){
 
            try {
                 //JOptionPane.showMessageDialog(null, " "+ selectQuery + " " ); // teste se apresenta SQL - esta chegando
                 
                 connec.ps = connec.getConnection().prepareStatement(selectQuery);  
                 connec.rs = connec.ps.executeQuery();  
                 
                 //JOptionPane.showMessageDialog(null, " conectou " + connec.rs);   // teste se conectou - nao esta conectando
            }
            catch (SQLException ex) {
                Logger.getLogger(FuncClass.class.getName()).log(Level.SEVERE, null, ex);
            }
            return connec.rs;
           
            
      }// fim do resultSet
      
      // Metodo para inserir imagem
      
        public String selectImagem(){
            
                // select picture from the computer
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Select Profile Picture");

                //fileChooser.setCurrentDirectory(new File("c:\\images"));  // Pegar diretorio 
                fileChooser.setCurrentDirectory(new File(imagePath)); // Pegar diretorio

                FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Image","png","jpg", "jpeg");
                fileChooser.addChoosableFileFilter(extensionFilter);

                int fileState = fileChooser.showSaveDialog(null);
                String path = "";

                if(fileState == JFileChooser.APPROVE_OPTION){

                    path = fileChooser.getSelectedFile().getAbsolutePath();

                }
                return path;
            
            
        }// Fim do método selectImagem
        
   
   
}// Fim da Classe
