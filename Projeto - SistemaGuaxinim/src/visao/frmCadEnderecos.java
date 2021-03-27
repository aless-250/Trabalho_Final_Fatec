/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;


/**--------------------------------------------------------------------------
 * Sistema Guaxinim                                                         |
 * Descrição: Trabalho TG                                                   |
 * Sistema de inventario feito como conclusão do curso de ADS               |
 * na Fatec de Santana de Parnaiba.                                         |
 * @author Alessandro de Sousa da Silva                                     |
 * Data: 08/03/2020                                                         |
/----------------------------------------------------------------------------
 */

public class frmCadEnderecos extends javax.swing.JFrame {

    /**
     * Creates new form frmFornecedor
     */
    public frmCadEnderecos() {
        initComponents();
        //Adiciona Icone na barra de titulo
        URL iconeImagem = getClass().getResource("/imagens/63d15fc0193fd496d2484a161652f676.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(iconeImagem);
        this.setIconImage(iconeTitulo);
        //Fim - Adiciona Icone na barra de titulo
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButtonLupaCadEdereco = new javax.swing.JButton();
        jTextFieldNomeComplCadEndereco = new javax.swing.JTextField();
        jTextFieldCodigoCadEndereco = new javax.swing.JTextField();
        jTextFieldSetorCadEndereco = new javax.swing.JTextField();
        jTextFieldPosicaoCadEndereco = new javax.swing.JTextField();
        jTextFieldTelefoneCadEndereco = new javax.swing.JTextField();
        jTextFieldRamalCadEndereco = new javax.swing.JTextField();
        jTextFieldEnderecoCadEndereco = new javax.swing.JTextField();
        jTextFieldObservacaoCadEndereco = new javax.swing.JTextField();
        jComboBoxSetorCadEndereco = new javax.swing.JComboBox<>();
        jLabelCadFornecedor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonSairCadEndereco = new javax.swing.JButton();
        jButtonAnteriorCadEndereco = new javax.swing.JButton();
        jButtonNovoCadEndereco = new javax.swing.JButton();
        jButtonAlterarCadEndereco = new javax.swing.JButton();
        jButtonSalvarCadEndereco = new javax.swing.JButton();
        jButtonExcluirCadEndereco = new javax.swing.JButton();
        jButtonProximoCadEndereco = new javax.swing.JButton();
        jButtonCancelarCadEndereco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Guaxinim - Cadastro de Usuario");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Observação:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 240, 100, 20);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Telefone:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 150, 66, 19);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Ramal:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(490, 150, 60, 20);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Setor:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(490, 110, 50, 19);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Posição:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(540, 200, 110, 19);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Apelido:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 110, 120, 19);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Nome :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(50, 70, 120, 19);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Codigo do Endereço:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(420, 30, 160, 20);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText(" Endereço:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(20, 200, 90, 20);

        jButtonLupaCadEdereco.setBackground(new java.awt.Color(0, 0, 0));
        jButtonLupaCadEdereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButtonLupaCadEdereco.setToolTipText("Clique aqui para fazer a consulta da Categoria.");
        jButtonLupaCadEdereco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jButtonLupaCadEdereco);
        jButtonLupaCadEdereco.setBounds(700, 60, 30, 30);
        jPanel1.add(jTextFieldNomeComplCadEndereco);
        jTextFieldNomeComplCadEndereco.setBounds(110, 60, 590, 30);

        jTextFieldCodigoCadEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoCadEnderecoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCodigoCadEndereco);
        jTextFieldCodigoCadEndereco.setBounds(580, 20, 150, 30);

        jTextFieldSetorCadEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSetorCadEnderecoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldSetorCadEndereco);
        jTextFieldSetorCadEndereco.setBounds(110, 100, 360, 30);

        jTextFieldPosicaoCadEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPosicaoCadEnderecoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPosicaoCadEndereco);
        jTextFieldPosicaoCadEndereco.setBounds(610, 190, 120, 30);

        jTextFieldTelefoneCadEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneCadEnderecoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldTelefoneCadEndereco);
        jTextFieldTelefoneCadEndereco.setBounds(110, 140, 360, 30);

        jTextFieldRamalCadEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRamalCadEnderecoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldRamalCadEndereco);
        jTextFieldRamalCadEndereco.setBounds(540, 140, 70, 30);

        jTextFieldEnderecoCadEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoCadEnderecoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldEnderecoCadEndereco);
        jTextFieldEnderecoCadEndereco.setBounds(110, 190, 410, 30);

        jTextFieldObservacaoCadEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldObservacaoCadEnderecoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldObservacaoCadEndereco);
        jTextFieldObservacaoCadEndereco.setBounds(110, 230, 620, 30);

        jComboBoxSetorCadEndereco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a Opção...", "Administração", "Faturamento", "Financeiro", "Professores", "Recursos Humanos", "Segurança", "Serviços Terceiros" }));
        jPanel1.add(jComboBoxSetorCadEndereco);
        jComboBoxSetorCadEndereco.setBounds(540, 100, 190, 30);

        jLabelCadFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cadastros.jpg"))); // NOI18N
        jPanel1.add(jLabelCadFornecedor);
        jLabelCadFornecedor.setBounds(0, 10, 760, 260);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Endereços \\ Localização");

        jButtonSairCadEndereco.setText("Voltar");
        jButtonSairCadEndereco.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonSairCadEndereco.setMinimumSize(new java.awt.Dimension(82, 26));
        jButtonSairCadEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairCadEnderecoActionPerformed(evt);
            }
        });

        jButtonAnteriorCadEndereco.setText("Anterior");
        jButtonAnteriorCadEndereco.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonAnteriorCadEndereco.setMinimumSize(new java.awt.Dimension(82, 26));

        jButtonNovoCadEndereco.setText("Novo");
        jButtonNovoCadEndereco.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonNovoCadEndereco.setMinimumSize(new java.awt.Dimension(82, 26));

        jButtonAlterarCadEndereco.setText("Alterar");
        jButtonAlterarCadEndereco.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonAlterarCadEndereco.setMinimumSize(new java.awt.Dimension(82, 26));

        jButtonSalvarCadEndereco.setText("Salvar");
        jButtonSalvarCadEndereco.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonSalvarCadEndereco.setMinimumSize(new java.awt.Dimension(82, 26));

        jButtonExcluirCadEndereco.setText("Excluir");
        jButtonExcluirCadEndereco.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonExcluirCadEndereco.setMinimumSize(new java.awt.Dimension(82, 26));

        jButtonProximoCadEndereco.setText("Proximo");

        jButtonCancelarCadEndereco.setText("Cancelar");
        jButtonCancelarCadEndereco.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonCancelarCadEndereco.setMinimumSize(new java.awt.Dimension(82, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButtonAnteriorCadEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonNovoCadEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAlterarCadEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSalvarCadEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelarCadEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExcluirCadEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonProximoCadEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(jButtonSairCadEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSairCadEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAnteriorCadEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovoCadEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterarCadEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvarCadEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluirCadEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProximoCadEndereco)
                    .addComponent(jButtonCancelarCadEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(201, 201, 201))
        );

        setSize(new java.awt.Dimension(796, 376));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoCadEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoCadEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoCadEnderecoActionPerformed

    private void jTextFieldPosicaoCadEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPosicaoCadEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPosicaoCadEnderecoActionPerformed

    private void jTextFieldEnderecoCadEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoCadEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoCadEnderecoActionPerformed

    private void jTextFieldSetorCadEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSetorCadEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSetorCadEnderecoActionPerformed

    private void jTextFieldRamalCadEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRamalCadEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRamalCadEnderecoActionPerformed

    private void jTextFieldObservacaoCadEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldObservacaoCadEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldObservacaoCadEnderecoActionPerformed

    private void jTextFieldTelefoneCadEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneCadEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneCadEnderecoActionPerformed

    private void jButtonSairCadEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairCadEnderecoActionPerformed
        // TODO add your handling code here:
        this.dispose(); //fecha somente o jFrame do frmCadEndereco
         
    }//GEN-LAST:event_jButtonSairCadEnderecoActionPerformed

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
            java.util.logging.Logger.getLogger(frmCadEnderecos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadEnderecos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadEnderecos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadEnderecos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadEnderecos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarCadEndereco;
    private javax.swing.JButton jButtonAnteriorCadEndereco;
    private javax.swing.JButton jButtonCancelarCadEndereco;
    private javax.swing.JButton jButtonExcluirCadEndereco;
    private javax.swing.JButton jButtonLupaCadEdereco;
    private javax.swing.JButton jButtonNovoCadEndereco;
    private javax.swing.JButton jButtonProximoCadEndereco;
    private javax.swing.JButton jButtonSairCadEndereco;
    private javax.swing.JButton jButtonSalvarCadEndereco;
    private javax.swing.JComboBox<String> jComboBoxSetorCadEndereco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCadFornecedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCodigoCadEndereco;
    private javax.swing.JTextField jTextFieldEnderecoCadEndereco;
    private javax.swing.JTextField jTextFieldNomeComplCadEndereco;
    private javax.swing.JTextField jTextFieldObservacaoCadEndereco;
    private javax.swing.JTextField jTextFieldPosicaoCadEndereco;
    private javax.swing.JTextField jTextFieldRamalCadEndereco;
    private javax.swing.JTextField jTextFieldSetorCadEndereco;
    private javax.swing.JTextField jTextFieldTelefoneCadEndereco;
    // End of variables declaration//GEN-END:variables
}
