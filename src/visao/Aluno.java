
package visao;


import conexao.Connect;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Aluno extends javax.swing.JFrame {

    Connect conec;
    int nav = 0;
    
    public Aluno() {
        initComponents();
    
        conec = new Connect();

        conec.conecta();
        conec.executeSQL("select * from aluno");

        try{           
            conec.rs.first();
            showDados();
        }       
        catch(SQLException e){

            JOptionPane.showMessageDialog
        (null,"A tabela esta vazia " + e);

        }//fim do catch  
        
        this.tableUpdate();
       
    }// final do construtor

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btn_gravar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btn_alterar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btn_apagar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btn_sair = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btn_novo = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        btn_primeiro = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btn_anterior = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btn_proximo = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btn_ultimo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_matricula = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        txt_telefone = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_aluno = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO DE ALUNO");
        setResizable(false);

        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btn_gravar.setText("Gravar");
        btn_gravar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_gravar.setFocusable(false);
        btn_gravar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_gravar.setMaximumSize(new java.awt.Dimension(60, 30));
        btn_gravar.setMinimumSize(new java.awt.Dimension(60, 30));
        btn_gravar.setPreferredSize(new java.awt.Dimension(60, 30));
        btn_gravar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_gravar);
        jToolBar1.add(jSeparator1);

        btn_alterar.setText("Alterar");
        btn_alterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_alterar.setFocusable(false);
        btn_alterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_alterar.setMaximumSize(new java.awt.Dimension(60, 30));
        btn_alterar.setMinimumSize(new java.awt.Dimension(60, 30));
        btn_alterar.setPreferredSize(new java.awt.Dimension(60, 30));
        btn_alterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_alterar);
        jToolBar1.add(jSeparator2);

        btn_apagar.setText("Apagar");
        btn_apagar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_apagar.setFocusable(false);
        btn_apagar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_apagar.setMaximumSize(new java.awt.Dimension(60, 30));
        btn_apagar.setMinimumSize(new java.awt.Dimension(60, 30));
        btn_apagar.setPreferredSize(new java.awt.Dimension(60, 30));
        btn_apagar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apagarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_apagar);
        jToolBar1.add(jSeparator3);

        btn_sair.setText("Sair");
        btn_sair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_sair.setFocusable(false);
        btn_sair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sair.setMaximumSize(new java.awt.Dimension(60, 30));
        btn_sair.setMinimumSize(new java.awt.Dimension(60, 30));
        btn_sair.setPreferredSize(new java.awt.Dimension(60, 30));
        btn_sair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_sair);
        jToolBar1.add(jSeparator4);

        btn_novo.setText("Novo");
        btn_novo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_novo.setFocusable(false);
        btn_novo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_novo.setMaximumSize(new java.awt.Dimension(60, 30));
        btn_novo.setMinimumSize(new java.awt.Dimension(60, 30));
        btn_novo.setPreferredSize(new java.awt.Dimension(60, 30));
        btn_novo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_novo);
        jToolBar1.add(jSeparator5);
        jToolBar1.add(jSeparator6);
        jToolBar1.add(jSeparator10);

        btn_primeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/primeiro.gif"))); // NOI18N
        btn_primeiro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_primeiro.setFocusable(false);
        btn_primeiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_primeiro.setMaximumSize(new java.awt.Dimension(60, 30));
        btn_primeiro.setMinimumSize(new java.awt.Dimension(60, 30));
        btn_primeiro.setPreferredSize(new java.awt.Dimension(60, 30));
        btn_primeiro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeiroActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_primeiro);
        jToolBar1.add(jSeparator7);

        btn_anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/anterior.gif"))); // NOI18N
        btn_anterior.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_anterior.setFocusable(false);
        btn_anterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_anterior.setMaximumSize(new java.awt.Dimension(60, 30));
        btn_anterior.setMinimumSize(new java.awt.Dimension(60, 30));
        btn_anterior.setPreferredSize(new java.awt.Dimension(60, 30));
        btn_anterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_anterior);
        jToolBar1.add(jSeparator8);

        btn_proximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/proximo.gif"))); // NOI18N
        btn_proximo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_proximo.setFocusable(false);
        btn_proximo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_proximo.setMaximumSize(new java.awt.Dimension(60, 30));
        btn_proximo.setMinimumSize(new java.awt.Dimension(60, 30));
        btn_proximo.setPreferredSize(new java.awt.Dimension(60, 30));
        btn_proximo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proximoActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_proximo);
        jToolBar1.add(jSeparator9);

        btn_ultimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ultimo.gif"))); // NOI18N
        btn_ultimo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ultimo.setFocusable(false);
        btn_ultimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ultimo.setMaximumSize(new java.awt.Dimension(60, 30));
        btn_ultimo.setMinimumSize(new java.awt.Dimension(60, 30));
        btn_ultimo.setPreferredSize(new java.awt.Dimension(60, 30));
        btn_ultimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimoActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_ultimo);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Matrícula:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Telefone:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("E-Mail:");

        txt_matricula.setEditable(false);

        tbl_aluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Telefone", "E-Mail"
            }
        ));
        tbl_aluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_alunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_aluno);

        jMenu1.setText("Cadastro");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
   
    try{
            String sqlDeletar = "select * from aluno where matricula = "+txt_matricula.getText();
            conec.executeSQL(sqlDeletar);
            conec.rs.first();

            String nome = "Deletar o aluno: " +conec.rs.getString("nome")+"?";
            int opcaoescolhida = JOptionPane.showConfirmDialog(null, nome, "EXCLUSÃO",JOptionPane.YES_NO_OPTION);

            if (opcaoescolhida == JOptionPane.YES_NO_OPTION){
                sqlDeletar = "DELETE from aluno where matricula=" +txt_matricula.getText();

                int conseguiuexcluir = conec.stmt.executeUpdate(sqlDeletar);

                if (conseguiuexcluir == 1){
                    JOptionPane.showMessageDialog(null,"Exclusão realizada com sucesso");

                    //atualiza ResultSet
                    conec.executeSQL("select * from aluno");
                    conec.rs.first();
                    showDados();
                    this.tableUpdate();
                }
            }
            else{
                return;
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro ao tentar excluir "+e);
        } 
        
        
        
    }//GEN-LAST:event_btn_apagarActionPerformed

    private void btn_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeiroActionPerformed
       
        try{
            conec.rs.first();
            showDados();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Não foi para o primeiro registro" + e);
        }
        
        
    }//GEN-LAST:event_btn_primeiroActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        try{
            conec.rs.previous();
            showDados();
            nav = 1;
            if(conec.rs.isBeforeFirst()){
                conec.rs.next();
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Não foi para o registro anterior "+e);
        }
        
        
        
    }//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proximoActionPerformed
       
          try{
            conec.rs.next();
            showDados();
             this.tableUpdate();
            nav = 2;
            if(conec.rs.isAfterLast()){
                conec.rs.previous();
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Não foi para o próximo registro"+e);
        }
        
        
    }//GEN-LAST:event_btn_proximoActionPerformed

    private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimoActionPerformed
     
        try{
            conec.rs.last();
            showDados();
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null,"Não foi para o último registro"+e);
        }
        
        
        
    }//GEN-LAST:event_btn_ultimoActionPerformed

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed

        
  
        String sqlInsert = "INSERT INTO ALUNO(nome,telefone,email)values('"+txt_nome.getText()+"','"+txt_telefone.getText()+"','"+txt_email.getText()+"')";
        
        try {
            conec.stmt.executeUpdate(sqlInsert);
            JOptionPane.showMessageDialog(null,"Gravação realizada com sucesso");

            conec.executeSQL("Select * from aluno");
            conec.rs.first();
            showDados();
            this.tableUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao tenta gravar"+ex);
        }
        
        
        
    }//GEN-LAST:event_btn_gravarActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
       limparDados();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed

        try {
            String sqlUpdate = "update aluno set " +
                    "nome = '"+txt_nome.getText()+"'," +
                    "telefone = '"+txt_telefone.getText()+"',"+
                    "email = '"+txt_email.getText()+
                    "'where matricula = " + txt_matricula.getText();

                    
            conec.stmt.executeUpdate(sqlUpdate);
            
            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso");
            conec.executeSQL("select * from aluno");
            conec.rs.first();
            showDados(); 
            this.tableUpdate();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro na alteração "+ex);

        }

    }//GEN-LAST:event_btn_alterarActionPerformed

    private void tbl_alunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_alunoMouseClicked
    
        this.mouseClicked();
        
    }//GEN-LAST:event_tbl_alunoMouseClicked

    
    public static void main(String args[]) {
      
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_gravar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_primeiro;
    private javax.swing.JButton btn_proximo;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_ultimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tbl_aluno;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_matricula;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_telefone;
    // End of variables declaration//GEN-END:variables

    private void showDados() {
             try{
                 txt_matricula.setText
                (conec.rs.getString("matricula"));
                 
                txt_nome.setText
                (conec.rs.getString("nome"));
                
                txt_telefone.setText
                (conec.rs.getString("telefone"));
                
                txt_email.setText
                (conec.rs.getString("email"));
             } // FIM DO TRY  
             
             catch(SQLException e){
	     if (nav == 1)
             JOptionPane.showMessageDialog(null,"Primeiro registro ");
	     else if (nav == 2)
             JOptionPane.showMessageDialog(null,"Último registro ");
	     else
             JOptionPane.showMessageDialog(null,"Não mostrou os dados "+e);
             nav =0;
        }// FIM DO CATCH
             
    }

    private void limparDados() {
        txt_matricula.setText("");
        txt_nome.setText("");
        txt_telefone.setText("");
        txt_email.setText("");
        
    }// fim do limpar
    
 
 
        
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
      
 // Popular tabela
    private void tableUpdate(){
        int c;
        
        try{
            conec.ps = conec.conn.prepareStatement("SELECT * FROM ALUNO");
            conec.rs = conec.ps.executeQuery();
            conec.rsmd = conec.rs.getMetaData();
            c = conec.rsmd.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)tbl_aluno.getModel();
            df.setRowCount(0);
            
            while(conec.rs.next()){
                Vector v = new Vector();
                for(int a = 0; a <= c; a++){
                    v.add(conec.rs.getString("matricula"));
                    v.add(conec.rs.getString("nome"));
                    v.add(conec.rs.getString("telefone"));
                    v.add(conec.rs.getString("email"));                   
                }
                df.addRow(v);
                
            }// Fim while
            
            
        }// Fim try
        
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro no SQL" + ex);
        }
        
    }// Fim do metodo tableUpdate

    private void mouseClicked() {
         DefaultTableModel df = (DefaultTableModel)tbl_aluno.getModel();
         int selectedIndex = tbl_aluno.getSelectedRow();
         
         txt_matricula.setText(df.getValueAt(selectedIndex,0).toString());
         txt_nome.setText(df.getValueAt(selectedIndex, 1).toString());
         txt_telefone.setText(df.getValueAt(selectedIndex, 2).toString());
         txt_email.setText(df.getValueAt(selectedIndex, 3).toString());
    }
    
}// final da classe aluno
