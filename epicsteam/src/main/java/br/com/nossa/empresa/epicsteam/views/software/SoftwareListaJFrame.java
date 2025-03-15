package br.com.nossa.empresa.epicsteam.views.software;

import br.com.nossa.empresa.epicsteam.Categoria;
import br.com.nossa.empresa.epicsteam.bean.CategoriaBean;
import br.com.nossa.empresa.epicsteam.dao.CategoriaDao;
import br.com.nossa.empresa.epicsteam.dao.SoftwareDao;
import br.com.nossa.empresa.epicsteam.dao.SoftwareDaoInterface;
import java.util.OptionalInt;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class SoftwareListaJFrame extends javax.swing.JFrame {

    private SoftwareDaoInterface softwareDao;
    private CategoriaDao categoriaDao;
    private int pagina = 0;

    public SoftwareListaJFrame() {
        softwareDao = new SoftwareDao();
        categoriaDao = new CategoriaDao();
        initComponents();
        carregarCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jButtonLimpar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSoftwares = new javax.swing.JTable();
        jButtonProximo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jLabelPaginaAtualTexto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxOrdenar = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxOrdem = new javax.swing.JComboBox<>();
        jComboBoxExibir = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Softwares");

        jLabel2.setText("Nome");

        jLabel3.setText("Categoria");

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTableSoftwares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSoftwares.getTableHeader().setReorderingAllowed(false);
        jTableSoftwares.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jTableSoftwaresComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSoftwares);
        if (jTableSoftwares.getColumnModel().getColumnCount() > 0) {
            jTableSoftwares.getColumnModel().getColumn(0).setResizable(false);
            jTableSoftwares.getColumnModel().getColumn(1).setResizable(false);
            jTableSoftwares.getColumnModel().getColumn(2).setResizable(false);
        }

        jButtonProximo.setText(">");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("<");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jLabelPaginaAtualTexto.setText("jLabelPaginaAtualTexto");

        jLabel5.setText("Ordenar");

        jComboBoxOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria", "Código", "Nome" }));
        jComboBoxOrdenar.setSelectedIndex(2);

        jLabel6.setText("Ordem");

        jComboBoxOrdem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascendente", "Descendente" }));

        jComboBoxExibir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10 Itens por Página", "20 Itens por Página", "40 Itens por Página", "60 Itens por Página" }));

        jLabel7.setText("Exibir");

        jButtonEditar.setText("Editar");

        jButtonApagar.setText("Apagar");

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelPaginaAtualTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonProximo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBoxOrdenar, javax.swing.GroupLayout.Alignment.LEADING, 0, 212, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxOrdem, 0, 197, Short.MAX_VALUE)))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(181, 181, 181)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(175, 175, 175)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonApagar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEditar))
                            .addComponent(jButtonNovo, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLimpar)
                            .addComponent(jButtonNovo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxExibir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonApagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProximo)
                    .addComponent(jButtonAnterior)
                    .addComponent(jLabelPaginaAtualTexto))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableSoftwaresComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableSoftwaresComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableSoftwaresComponentHidden

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        listarSoftwares();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        var form = new SoftwareCadastroJFrame();
        form.setVisible(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldNome.setText("");
        jComboBoxCategoria.setSelectedIndex(-1);
        jComboBoxOrdem.setSelectedIndex(0); // Ascendente
        jComboBoxOrdenar.setSelectedItem(2); // Nome
        jComboBoxExibir.setSelectedIndex(0); // 10 Itens por Página
        pagina = 0;
        listarSoftwares();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        pagina += 1;
        listarSoftwares();
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        if(pagina - 1 < 0)
            return;
        
        pagina -= 1;
        listarSoftwares();
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JComboBox<CategoriaBean> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxExibir;
    private javax.swing.JComboBox<String> jComboBoxOrdem;
    private javax.swing.JComboBox<String> jComboBoxOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelPaginaAtualTexto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSoftwares;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

    private void listarSoftwares() {
        var modeloTabela = (DefaultTableModel) jTableSoftwares.getModel();
        // Limpando a tabela
        modeloTabela.setRowCount(0);

        var pesquisa = jTextFieldNome.getText().trim();

        var categoriaId = OptionalInt.empty();
        if (jComboBoxCategoria.getSelectedIndex() != -1) {

            var categoriaEscolhida = (CategoriaBean) jComboBoxCategoria.getSelectedItem();
            categoriaId = OptionalInt.of(categoriaEscolhida.getId());
        }
        
        var colunaOrdenacao = jComboBoxOrdenar.getSelectedItem().toString().toLowerCase();
        var colunaOrdem = jComboBoxOrdem.getSelectedItem().toString().toLowerCase();
        var quantidade = Integer.parseInt(jComboBoxExibir.getSelectedItem().toString()
                .replace(" Itens por Página", ""));

        var softwares = softwareDao.obterTodos(
                pesquisa, categoriaId, colunaOrdenacao, colunaOrdem, quantidade, pagina);
        // for tradicional
        // for (var i = 0; i < softwares.size(); i++) {;
        //     var software = softwares.get(i);
        // }

        // Este for é chamado de foreach, para que ele serve? Ele percorre 
        // a lista de softwares, preenchendo a variável software com cada elemento
        // Te permite iterar a lista de 
        for (var software : softwares) {
            modeloTabela.addRow(new Object[]{
                software.getId(),
                software.getNome(),
                software.getCategoria().getNome()
            });
        }
    }

    private void carregarCategorias() {
        var categorias = categoriaDao.obterTodas();

        var modeloComboBox = (DefaultComboBoxModel<CategoriaBean>) jComboBoxCategoria.getModel();

        for (var categoria : categorias) {
            modeloComboBox.addElement(categoria);
        }

        jComboBoxCategoria.setSelectedIndex(-1);
    }
}
