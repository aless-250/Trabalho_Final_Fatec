/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.View;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;


/**--------------------------------------------------------------------------
 * Sistema Guaxinim                                                         |
 * Descrição: Trabalho TG                                                   |
 * Sistema de inventario feito como conclusão do curso de ADS               |
 * na Fatec de Santana de Parnaiba.                                         |
 * @author Alessandro de Sousa da Silva                                     |
 * @author Davi de Souza Silva                                              |
 * Data: 08/03/2020                                                         |
/----------------------------------------------------------------------------
 */

public class frmCadUsuario extends javax.swing.JFrame {

    /**
     * Creates new form frmFornecedor
     */
    public frmCadUsuario() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldNomeComplCadUsuario = new javax.swing.JTextField();
        jTextFieldCodigoCadUsuario = new javax.swing.JTextField();
        jTextFieldNumRegistroCadUsuario = new javax.swing.JTextField();
        jTextFieldCartTrabalhoCadUsuario = new javax.swing.JTextField();
        jTextFieldRGCadUsuario = new javax.swing.JTextField();
        jTextFieldTelefoneCadUsuario = new javax.swing.JTextField();
        jTextFieldCPFCadUsuario = new javax.swing.JTextField();
        jTextFieldEnderecoCadUsuario = new javax.swing.JTextField();
        jTextFieldObservacaoCadUsuario = new javax.swing.JTextField();
        jTextFieldEmailCadUsuario = new javax.swing.JTextField();
        jTextFieldRedeSocialCadUsuario = new javax.swing.JTextField();
        jTextFieldCelularCadUsuario = new javax.swing.JTextField();
        jTextFieldBairroCadUsuario = new javax.swing.JTextField();
        jTextFieldMunicipioCadUsuario = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldCEPCadUsuario = new javax.swing.JTextField();
        jComboBoxSetorCadUsuario = new javax.swing.JComboBox<>();
        jComboBoxSetorCadUsuario1 = new javax.swing.JComboBox<>();
        jLabelCadFornecedor = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButtonSairCadUsuario = new javax.swing.JButton();
        jButtonAnteriorCadUsuario = new javax.swing.JButton();
        jButtonNovoCadUsuario = new javax.swing.JButton();
        jButtonAlterarCadUsuario = new javax.swing.JButton();
        jButtonCancelarCadUsuario = new javax.swing.JButton();
        jButtonExcluirCadUsuario = new javax.swing.JButton();
        jButtonProximoCadUsuario = new javax.swing.JButton();
        jButtonSalvlarCadUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Guaxinim - Cadastro de Usuario");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText(" Observação:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 350, 100, 20);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("  Telefone:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 230, 90, 17);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Celular:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(400, 230, 80, 20);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Nivel de Acesso:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(440, 390, 120, 17);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("CPF:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(420, 190, 60, 20);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Setor:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(500, 110, 50, 17);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Rede Social:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 430, 110, 17);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Cart. Trabalho:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 190, 140, 17);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Num. Registro:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 150, 110, 17);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Cargo:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(90, 110, 120, 17);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Nome Completo:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 70, 120, 17);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("RG:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(430, 150, 28, 17);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Codigo do Usuário:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(460, 30, 140, 20);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Endereço:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(290, 270, 90, 17);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText(" Bairro:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(80, 310, 80, 17);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("CEP:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(100, 270, 58, 17);

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText(" E-Mail:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(80, 390, 60, 17);
        jPanel1.add(jTextFieldNomeComplCadUsuario);
        jTextFieldNomeComplCadUsuario.setBounds(150, 60, 600, 30);

        jTextFieldCodigoCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoCadUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCodigoCadUsuario);
        jTextFieldCodigoCadUsuario.setBounds(600, 20, 150, 30);

        jTextFieldNumRegistroCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumRegistroCadUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNumRegistroCadUsuario);
        jTextFieldNumRegistroCadUsuario.setBounds(150, 140, 200, 30);

        jTextFieldCartTrabalhoCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCartTrabalhoCadUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCartTrabalhoCadUsuario);
        jTextFieldCartTrabalhoCadUsuario.setBounds(150, 180, 200, 30);

        jTextFieldRGCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRGCadUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldRGCadUsuario);
        jTextFieldRGCadUsuario.setBounds(460, 140, 290, 30);

        jTextFieldTelefoneCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneCadUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldTelefoneCadUsuario);
        jTextFieldTelefoneCadUsuario.setBounds(150, 220, 240, 30);

        jTextFieldCPFCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFCadUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCPFCadUsuario);
        jTextFieldCPFCadUsuario.setBounds(460, 180, 290, 30);

        jTextFieldEnderecoCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoCadUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldEnderecoCadUsuario);
        jTextFieldEnderecoCadUsuario.setBounds(370, 260, 380, 30);

        jTextFieldObservacaoCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldObservacaoCadUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldObservacaoCadUsuario);
        jTextFieldObservacaoCadUsuario.setBounds(150, 340, 600, 30);

        jTextFieldEmailCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailCadUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldEmailCadUsuario);
        jTextFieldEmailCadUsuario.setBounds(150, 380, 280, 30);

        jTextFieldRedeSocialCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRedeSocialCadUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldRedeSocialCadUsuario);
        jTextFieldRedeSocialCadUsuario.setBounds(150, 420, 600, 30);

        jTextFieldCelularCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCelularCadUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCelularCadUsuario);
        jTextFieldCelularCadUsuario.setBounds(460, 220, 290, 30);
        jPanel1.add(jTextFieldBairroCadUsuario);
        jTextFieldBairroCadUsuario.setBounds(150, 300, 240, 30);
        jPanel1.add(jTextFieldMunicipioCadUsuario);
        jTextFieldMunicipioCadUsuario.setBounds(500, 300, 250, 30);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Municipio:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(420, 310, 90, 17);
        jPanel1.add(jTextFieldCEPCadUsuario);
        jTextFieldCEPCadUsuario.setBounds(150, 260, 130, 30);

        jComboBoxSetorCadUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a Opção...", "N1", "N2", "N3", "Administrador", " " }));
        jPanel1.add(jComboBoxSetorCadUsuario);
        jComboBoxSetorCadUsuario.setBounds(560, 380, 190, 30);

        jComboBoxSetorCadUsuario1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a Opção...", "Administração", "Faturamento", "Financeiro", "Professores", "Recursos Humanos", "Segurança", "Serviços Terceiros" }));
        jComboBoxSetorCadUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSetorCadUsuario1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxSetorCadUsuario1);
        jComboBoxSetorCadUsuario1.setBounds(550, 100, 200, 30);

        jLabelCadFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cadastros.jpg"))); // NOI18N
        jPanel1.add(jLabelCadFornecedor);
        jLabelCadFornecedor.setBounds(0, 0, 780, 480);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(150, 100, 310, 23);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Usuários");

        jButtonSairCadUsuario.setText("Voltar");
        jButtonSairCadUsuario.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonSairCadUsuario.setMinimumSize(new java.awt.Dimension(82, 26));
        jButtonSairCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairCadUsuarioActionPerformed(evt);
            }
        });

        jButtonAnteriorCadUsuario.setText("Anterior");
        jButtonAnteriorCadUsuario.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonAnteriorCadUsuario.setMinimumSize(new java.awt.Dimension(82, 26));

        jButtonNovoCadUsuario.setText("Novo");
        jButtonNovoCadUsuario.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonNovoCadUsuario.setMinimumSize(new java.awt.Dimension(82, 26));

        jButtonAlterarCadUsuario.setText("Alterar");
        jButtonAlterarCadUsuario.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonAlterarCadUsuario.setMinimumSize(new java.awt.Dimension(82, 26));

        jButtonCancelarCadUsuario.setText("Cancelar");
        jButtonCancelarCadUsuario.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonCancelarCadUsuario.setMinimumSize(new java.awt.Dimension(82, 26));

        jButtonExcluirCadUsuario.setText("Excluir");
        jButtonExcluirCadUsuario.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonExcluirCadUsuario.setMinimumSize(new java.awt.Dimension(82, 26));

        jButtonProximoCadUsuario.setText("Proximo");

        jButtonSalvlarCadUsuario.setText("Salvar");
        jButtonSalvlarCadUsuario.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonSalvlarCadUsuario.setMinimumSize(new java.awt.Dimension(82, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButtonAnteriorCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNovoCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterarCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvlarCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelarCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluirCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProximoCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(jButtonSairCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSairCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAnteriorCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovoCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterarCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelarCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluirCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProximoCadUsuario)
                    .addComponent(jButtonSalvlarCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(805, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoCadUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoCadUsuarioActionPerformed

    private void jTextFieldNumRegistroCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumRegistroCadUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumRegistroCadUsuarioActionPerformed

    private void jTextFieldEnderecoCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoCadUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoCadUsuarioActionPerformed

    private void jTextFieldCartTrabalhoCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCartTrabalhoCadUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCartTrabalhoCadUsuarioActionPerformed

    private void jTextFieldCPFCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFCadUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCPFCadUsuarioActionPerformed

    private void jTextFieldRGCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRGCadUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRGCadUsuarioActionPerformed

    private void jTextFieldEmailCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailCadUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailCadUsuarioActionPerformed

    private void jTextFieldRedeSocialCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRedeSocialCadUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRedeSocialCadUsuarioActionPerformed

    private void jTextFieldObservacaoCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldObservacaoCadUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldObservacaoCadUsuarioActionPerformed

    private void jTextFieldTelefoneCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneCadUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneCadUsuarioActionPerformed

    private void jButtonSairCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairCadUsuarioActionPerformed
        // TODO add your handling code here:
        this.dispose(); //fecha somente o jFrame do frmCadUsuario
         
    }//GEN-LAST:event_jButtonSairCadUsuarioActionPerformed

    private void jTextFieldCelularCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCelularCadUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCelularCadUsuarioActionPerformed

    private void jComboBoxSetorCadUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSetorCadUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSetorCadUsuario1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarCadUsuario;
    private javax.swing.JButton jButtonAnteriorCadUsuario;
    private javax.swing.JButton jButtonCancelarCadUsuario;
    private javax.swing.JButton jButtonExcluirCadUsuario;
    private javax.swing.JButton jButtonNovoCadUsuario;
    private javax.swing.JButton jButtonProximoCadUsuario;
    private javax.swing.JButton jButtonSairCadUsuario;
    private javax.swing.JButton jButtonSalvlarCadUsuario;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxSetorCadUsuario;
    private javax.swing.JComboBox<String> jComboBoxSetorCadUsuario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCadFornecedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBairroCadUsuario;
    private javax.swing.JTextField jTextFieldCEPCadUsuario;
    private javax.swing.JTextField jTextFieldCPFCadUsuario;
    private javax.swing.JTextField jTextFieldCartTrabalhoCadUsuario;
    private javax.swing.JTextField jTextFieldCelularCadUsuario;
    private javax.swing.JTextField jTextFieldCodigoCadUsuario;
    private javax.swing.JTextField jTextFieldEmailCadUsuario;
    private javax.swing.JTextField jTextFieldEnderecoCadUsuario;
    private javax.swing.JTextField jTextFieldMunicipioCadUsuario;
    private javax.swing.JTextField jTextFieldNomeComplCadUsuario;
    private javax.swing.JTextField jTextFieldNumRegistroCadUsuario;
    private javax.swing.JTextField jTextFieldObservacaoCadUsuario;
    private javax.swing.JTextField jTextFieldRGCadUsuario;
    private javax.swing.JTextField jTextFieldRedeSocialCadUsuario;
    private javax.swing.JTextField jTextFieldTelefoneCadUsuario;
    // End of variables declaration//GEN-END:variables
}