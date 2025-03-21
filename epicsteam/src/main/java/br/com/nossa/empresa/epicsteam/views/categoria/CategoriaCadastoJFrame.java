/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.nossa.empresa.epicsteam.views.categoria;

import br.com.nossa.empresa.epicsteam.dao.CategoriaDao;
import br.com.nossa.empresa.epicsteam.database.Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author francisco.sens
 */
public class CategoriaCadastoJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CategoriaCadastoJFrame
     */
    public CategoriaCadastoJFrame() {
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

        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCadastrarNovo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Categoria Cadastro");

        jLabelNome.setText("Nome");

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonCadastrarNovo.setText("Cadastrar e Novo");
        jButtonCadastrarNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarNovoActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCadastrarNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCadastrar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonCadastrarNovo)
                    .addComponent(jButtonCancelar))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        // trim remove os espaços do começo e fim da String
        var nomeCategoria = jTextFieldNome.getText().trim();
        if (nomeCategoria.length() < 3) {
            JOptionPane.showMessageDialog(this, "Nome deve conter no mínimo 3 caracteres");
            return;
        }

        if (nomeCategoria.length() > 200) {
            JOptionPane.showMessageDialog(this, "Nome deve conter no máximo 200 caracteres");
            return;
        }

        var categoriaDao = new CategoriaDao();
        categoriaDao.cadastrar(nomeCategoria);
        JOptionPane.showMessageDialog(null, "Categoria cadastrada com sucesso");
        dispose();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonCadastrarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarNovoActionPerformed
        var nomeCategoria = jTextFieldNome.getText();
        
        var categoriaDao = new CategoriaDao();
        categoriaDao.cadastrar(nomeCategoria);
        
        JOptionPane.showMessageDialog(null, "Categoria criada com sucesso");
        jTextFieldNome.setText("");
        jTextFieldNome.requestFocus();
    }//GEN-LAST:event_jButtonCadastrarNovoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCadastrarNovo;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
