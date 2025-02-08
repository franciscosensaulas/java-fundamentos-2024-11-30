/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.nossa.empresa.epicsteam.views;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author francisco.sens
 */
public class CategoriaJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CategoriaJFrame
     */
    public CategoriaJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCarregarCategorias = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCategorias = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonApagar = new javax.swing.JButton();
        jTextFieldCategoriaIdApagar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCategoriaIdEditar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCategoriaNomeEditar = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentShown(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCarregarCategorias.setText("Carregar Categorias");
        jButtonCarregarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarregarCategoriasActionPerformed(evt);
            }
        });

        jTextAreaCategorias.setColumns(20);
        jTextAreaCategorias.setRows(5);
        jScrollPane1.setViewportView(jTextAreaCategorias);

        jLabel2.setText("Categorias");

        jLabel3.setText("Categoria ID");

        jButtonApagar.setText("Apagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        jLabel4.setText("Categoria ID");

        jTextFieldCategoriaIdEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCategoriaIdEditarKeyPressed(evt);
            }
        });

        jLabel5.setText("Nome");

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCategoriaIdApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonApagar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCategoriaIdEditar)
                                    .addComponent(jTextFieldCategoriaNomeEditar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEditar)
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCarregarCategorias)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCarregarCategorias)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jButtonApagar)
                            .addComponent(jTextFieldCategoriaIdApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextFieldCategoriaIdEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextFieldCategoriaNomeEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1ComponentShown

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            var url = "jdbc:mysql://localhost:3306/steamdb";
            var usuario = "root";
            var senha = "admin";

            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            var nomeCategoria = jTextFieldNome.getText();
            var query = "INSERT INTO categorias (nome) VALUES (\"" + nomeCategoria + "\")";
            var statement = conexao.createStatement();
            statement.execute(query);
            JOptionPane.showMessageDialog(null, "Categoria criada com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar no banco de dados");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCarregarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarCategoriasActionPerformed
        jTextAreaCategorias.setText("");

        try {
            var url = "jdbc:mysql://localhost:3306/steamdb";
            var usuario = "root";
            var senha = "admin";
            // Abre a conexão com banco de dados
            var connection = DriverManager.getConnection(url, usuario, senha);
            // Statement permite executar query no banco de dados
            var statement = connection.createStatement();
            // query pode ser SELECT, INSERT, UPDATE, DELETE, CREATE
            var query = "SELECT id, nome FROM categorias";
            // Executa a consulta na tabela de categorias
            statement.execute(query);
            // Obter a lista dos registros das categorias
            var resultSet = statement.getResultSet();
            // Percorre cada um dos registros das categorias
            while (resultSet.next()) {
                // Obtém o valor da coluna que foi passado no SELECT
                var id = Integer.parseInt(resultSet.getString("id"));
                var nome = resultSet.getString("nome");

                var texto = "Id: " + id + " \tNome: " + nome + "\n";
                jTextAreaCategorias.append(texto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar no banco de dados");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonCarregarCategoriasActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        var idApagar = Integer.parseInt(jTextFieldCategoriaIdApagar.getText());
        try {
            var url = "jdbc:mysql://localhost:3306/steamdb";
            var usuario = "root";
            var senha = "admin";
            var conexao = DriverManager.getConnection(url, usuario, senha);
            var query = "DELETE FROM categorias WHERE id = " + idApagar;
            var statement = conexao.createStatement();
            statement.execute(query);
            JOptionPane.showMessageDialog(null, "Categoria apagada com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar no banco de dados");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        var idEditar = Integer.parseInt(jTextFieldCategoriaIdEditar.getText());
        var nome = jTextFieldCategoriaNomeEditar.getText();

        try {
            var conexao = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/steamdb", "root", "admin");
            var query = "UPDATE categorias SET nome = \"" + nome + "\" WHERE id = " + idEditar;
            var statement = conexao.createStatement();
            statement.execute(query);
            JOptionPane.showMessageDialog(null, "Categoria alterada com sucesso");

            jTextFieldCategoriaIdEditar.setText("");
            jTextFieldCategoriaNomeEditar.setText("");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar no banco de dados");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTextFieldCategoriaIdEditarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCategoriaIdEditarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                var idEditar = Integer.parseInt(jTextFieldCategoriaIdEditar.getText());
                var conexao = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/steamdb", "root", "admin");
                var query = "SELECT nome FROM categorias WHERE id = " + idEditar;
                var statement = conexao.createStatement();
                statement.execute(query);
                var resultSet = statement.getResultSet();
                if(resultSet.next()){
                    String nome = resultSet.getString("nome");
                    jTextFieldCategoriaNomeEditar.setText(nome);
                }else{
                    jTextFieldCategoriaNomeEditar.setText("");
                    JOptionPane.showMessageDialog(null, "Categoria não encontrada com id: " + 
                            idEditar);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Não foi possível conectar no banco de dados");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jTextFieldCategoriaIdEditarKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(CategoriaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoriaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoriaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoriaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoriaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonCarregarCategorias;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaCategorias;
    private javax.swing.JTextField jTextFieldCategoriaIdApagar;
    private javax.swing.JTextField jTextFieldCategoriaIdEditar;
    private javax.swing.JTextField jTextFieldCategoriaNomeEditar;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
