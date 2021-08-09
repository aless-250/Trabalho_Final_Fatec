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
// <editor-fold defaultstate="collapsed" desc="public frmLocationScreen & initComponents()">
public class frmLocationScreen extends javax.swing.JFrame {

    public frmLocationScreen() {
        initComponents();
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
       
        //Adiciona Icone na barra de titulo
        URL iconeImagem = getClass().getResource("/imagens/icon.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(iconeImagem);
        this.setIconImage(iconeTitulo);
        //Fim - Adiciona Icone na barra de titulo
        //setResizable(false);
    } // </editor-fold> 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotoes = new javax.swing.JPanel();
        jButtonSairCadCategoria = new javax.swing.JButton();
        jButtonExcluirCadCategoria = new javax.swing.JButton();
        jButtonSalvarCadCategoria = new javax.swing.JButton();
        jButtonAlterarCadCategoria = new javax.swing.JButton();
        jButtonNovoCadCategoria = new javax.swing.JButton();
        jpTela = new javax.swing.JPanel();
        txtEndereco = new javax.swing.JTextField();
        txtRamal = new javax.swing.JTextField();
        txtApelido = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtPosicao = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        txtCodigo = new javax.swing.JTextField();
        txtObservacao = new javax.swing.JTextField();
        btPesquisa = new javax.swing.JButton();
        cbStatus = new javax.swing.JComboBox<>();
        cbSetor = new javax.swing.JComboBox<>();
        jlApelido = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jlStatus = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlPosicao = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jltitulo = new javax.swing.JLabel();
        jlTelefone1 = new javax.swing.JLabel();
        jlRamal = new javax.swing.JLabel();
        jlObservacao = new javax.swing.JLabel();
        jlSetor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbImagemFundoTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Count++ Inventory - Cadastro Localização");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanelBotoes.setBackground(new java.awt.Color(51, 51, 51));
        jPanelBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonSairCadCategoria.setBackground(new java.awt.Color(153, 153, 153));
        jButtonSairCadCategoria.setForeground(new java.awt.Color(51, 51, 51));
        jButtonSairCadCategoria.setText("Voltar");
        jButtonSairCadCategoria.setToolTipText("Clique aqui para retornar a tela principal (main).");
        jButtonSairCadCategoria.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonSairCadCategoria.setMinimumSize(new java.awt.Dimension(82, 26));
        jButtonSairCadCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairCadCategoriaActionPerformed(evt);
            }
        });

        jButtonExcluirCadCategoria.setBackground(new java.awt.Color(153, 153, 153));
        jButtonExcluirCadCategoria.setForeground(new java.awt.Color(51, 51, 51));
        jButtonExcluirCadCategoria.setText("Excluir");
        jButtonExcluirCadCategoria.setToolTipText("Clique aqui para excluir a localização selecionada.");
        jButtonExcluirCadCategoria.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonExcluirCadCategoria.setMinimumSize(new java.awt.Dimension(82, 26));

        jButtonSalvarCadCategoria.setBackground(new java.awt.Color(153, 153, 153));
        jButtonSalvarCadCategoria.setForeground(new java.awt.Color(51, 51, 51));
        jButtonSalvarCadCategoria.setText("Salvar");
        jButtonSalvarCadCategoria.setToolTipText("Clique aqui para salvar a localização cadastrada.");
        jButtonSalvarCadCategoria.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonSalvarCadCategoria.setMinimumSize(new java.awt.Dimension(82, 26));

        jButtonAlterarCadCategoria.setBackground(new java.awt.Color(153, 153, 153));
        jButtonAlterarCadCategoria.setForeground(new java.awt.Color(51, 51, 51));
        jButtonAlterarCadCategoria.setText("Alterar");
        jButtonAlterarCadCategoria.setToolTipText("Clique aqui para alterar localização.");
        jButtonAlterarCadCategoria.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonAlterarCadCategoria.setMinimumSize(new java.awt.Dimension(82, 26));

        jButtonNovoCadCategoria.setBackground(new java.awt.Color(153, 153, 153));
        jButtonNovoCadCategoria.setForeground(new java.awt.Color(51, 51, 51));
        jButtonNovoCadCategoria.setText("Novo");
        jButtonNovoCadCategoria.setToolTipText("Clique aqui para inserir uma nova localização.");
        jButtonNovoCadCategoria.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonNovoCadCategoria.setMinimumSize(new java.awt.Dimension(82, 26));
        jButtonNovoCadCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoCadCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButtonNovoCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAlterarCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvarCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButtonExcluirCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 543, Short.MAX_VALUE)
                .addComponent(jButtonSairCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAlterarCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonNovoCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSalvarCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonExcluirCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSairCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanelBotoes);
        jPanelBotoes.setBounds(10, 550, 1070, 50);

        jpTela.setBackground(new java.awt.Color(51, 51, 51));
        jpTela.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpTela.setLayout(null);

        txtEndereco.setForeground(new java.awt.Color(0, 0, 0));
        txtEndereco.setToolTipText("Digite aqui o endereço da localização.");
        jpTela.add(txtEndereco);
        txtEndereco.setBounds(110, 170, 580, 30);

        txtRamal.setForeground(new java.awt.Color(0, 0, 0));
        txtRamal.setToolTipText("Digite aqui o numero do ramal do telefone do responsável da localização.");
        txtRamal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRamalActionPerformed(evt);
            }
        });
        jpTela.add(txtRamal);
        txtRamal.setBounds(330, 210, 120, 30);

        txtApelido.setForeground(new java.awt.Color(0, 0, 0));
        txtApelido.setToolTipText("Digite aqui o apelido dado para essa localização.");
        txtApelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApelidoActionPerformed(evt);
            }
        });
        jpTela.add(txtApelido);
        txtApelido.setBounds(830, 130, 210, 30);

        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setToolTipText("Digite aqui o nome da localização.");
        jpTela.add(txtNome);
        txtNome.setBounds(110, 130, 540, 30);

        txtPosicao.setForeground(new java.awt.Color(0, 0, 0));
        txtPosicao.setToolTipText("Digite aqui a posição seja do produto ou mesmo da localização.");
        txtPosicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosicaoActionPerformed(evt);
            }
        });
        jpTela.add(txtPosicao);
        txtPosicao.setBounds(830, 170, 210, 30);

        txtTelefone.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setToolTipText("Digite aqui o numero do telefone do responsável da localização.");
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        jpTela.add(txtTelefone);
        txtTelefone.setBounds(110, 210, 120, 30);

        txtCelular.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setToolTipText("Digite aqui o numero do celular do responsável da localização.");
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });
        jpTela.add(txtCelular);
        txtCelular.setBounds(570, 210, 120, 30);

        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigo.setToolTipText("Exibe aqui o codigo da localização.");
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jpTela.add(txtCodigo);
        txtCodigo.setBounds(110, 90, 120, 30);

        txtObservacao.setForeground(new java.awt.Color(0, 0, 0));
        txtObservacao.setToolTipText("Digite aqui as observações pertinente a localização.");
        jpTela.add(txtObservacao);
        txtObservacao.setBounds(110, 250, 930, 30);

        btPesquisa.setBackground(new java.awt.Color(0, 0, 0));
        btPesquisa.setForeground(new java.awt.Color(222, 223, 233));
        btPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa_pesquisa.png"))); // NOI18N
        btPesquisa.setToolTipText("Clique aqui para fazer a consulta da localização.");
        btPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaActionPerformed(evt);
            }
        });
        jpTela.add(btPesquisa);
        btPesquisa.setBounds(660, 130, 30, 30);

        cbStatus.setForeground(new java.awt.Color(0, 0, 0));
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a Opção...", "Ativo", "Inativo", "Pausado" }));
        cbStatus.setToolTipText("Selecione aqui o status da localização.");
        jpTela.add(cbStatus);
        cbStatus.setBounds(830, 90, 210, 30);

        cbSetor.setForeground(new java.awt.Color(0, 0, 0));
        cbSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a Opção...", "Administrativo", "Atendimento ao cliente", "Auditorio", "Comercial", "Comunicação", "Contabilidade", "Controladoria", "Desenvolvimento de negócios", "Estratégia", "Exportação", "Financeiro", "Fiscal", "Importação", "Logística", "Manutenção", "Marketing", "Operações", "Planejamento", "Planejamento Financeiro", "Processos", "Produção", "Projetos", "Qualidade", "Recursos Humanos", "Tesouraria", "TI – Tecnologia da Informação", "Treinamento e Desenvolvimento", "Varejo", "Vendas" }));
        cbSetor.setToolTipText("Digite aqui o setor responsavel pela localização.");
        jpTela.add(cbSetor);
        cbSetor.setBounds(830, 210, 210, 30);

        jlApelido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlApelido.setForeground(new java.awt.Color(255, 255, 255));
        jlApelido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlApelido.setText("Apelido:");
        jpTela.add(jlApelido);
        jlApelido.setBounds(720, 130, 110, 30);

        jlCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jlCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCodigo.setText("Código:");
        jpTela.add(jlCodigo);
        jlCodigo.setBounds(0, 90, 110, 30);

        jlEndereco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jlEndereco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEndereco.setText("Endereço:");
        jpTela.add(jlEndereco);
        jlEndereco.setBounds(0, 170, 110, 30);

        jlStatus.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlStatus.setForeground(new java.awt.Color(255, 255, 255));
        jlStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlStatus.setText("Status:");
        jpTela.add(jlStatus);
        jlStatus.setBounds(720, 90, 110, 30);

        jlNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlNome.setForeground(new java.awt.Color(255, 255, 255));
        jlNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNome.setText("Nome:");
        jpTela.add(jlNome);
        jlNome.setBounds(0, 130, 110, 30);

        jlPosicao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlPosicao.setForeground(new java.awt.Color(255, 255, 255));
        jlPosicao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPosicao.setText("Posição:");
        jpTela.add(jlPosicao);
        jlPosicao.setBounds(720, 170, 110, 30);

        jlTelefone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jlTelefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTelefone.setText("Telefone:");
        jpTela.add(jlTelefone);
        jlTelefone.setBounds(0, 210, 110, 30);

        jltitulo.setFont(new java.awt.Font("Cabin Sketch", 1, 36)); // NOI18N
        jltitulo.setForeground(new java.awt.Color(255, 255, 255));
        jltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jltitulo.setText("Cadastro de Localização");
        jpTela.add(jltitulo);
        jltitulo.setBounds(0, 10, 1060, 50);

        jlTelefone1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlTelefone1.setForeground(new java.awt.Color(255, 255, 255));
        jlTelefone1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTelefone1.setText("Celular:");
        jpTela.add(jlTelefone1);
        jlTelefone1.setBounds(460, 210, 110, 30);

        jlRamal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlRamal.setForeground(new java.awt.Color(255, 255, 255));
        jlRamal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlRamal.setText("Ramal:");
        jpTela.add(jlRamal);
        jlRamal.setBounds(230, 210, 110, 30);

        jlObservacao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlObservacao.setForeground(new java.awt.Color(255, 255, 255));
        jlObservacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlObservacao.setText("Observação:");
        jpTela.add(jlObservacao);
        jlObservacao.setBounds(0, 250, 110, 30);

        jlSetor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlSetor.setForeground(new java.awt.Color(255, 255, 255));
        jlSetor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSetor.setText("Setor:");
        jpTela.add(jlSetor);
        jlSetor.setBounds(720, 210, 110, 30);

        getContentPane().add(jpTela);
        jpTela.setBounds(20, 10, 1060, 300);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Imagem_ModPesquisa.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 320, 1060, 210);

        lbImagemFundoTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ImagemFundoEscuro.jpg"))); // NOI18N
        getContentPane().add(lbImagemFundoTela);
        lbImagemFundoTela.setBounds(0, 0, 1100, 620);

        setBounds(250, 75, 1090, 611);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRamalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRamalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRamalActionPerformed

    private void txtApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApelidoActionPerformed

    private void jButtonSairCadCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairCadCategoriaActionPerformed
        // TODO add your handling code here:
        this.dispose(); //fecha somente o jFrame do frmCadUsuario
         
    }//GEN-LAST:event_jButtonSairCadCategoriaActionPerformed

    private void jButtonNovoCadCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoCadCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovoCadCategoriaActionPerformed

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btPesquisaActionPerformed

    private void txtPosicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosicaoActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(frmLocationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLocationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLocationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLocationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new frmLocationScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisa;
    private javax.swing.JComboBox<String> cbSetor;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JButton jButtonAlterarCadCategoria;
    private javax.swing.JButton jButtonExcluirCadCategoria;
    private javax.swing.JButton jButtonNovoCadCategoria;
    private javax.swing.JButton jButtonSairCadCategoria;
    private javax.swing.JButton jButtonSalvarCadCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JLabel jlApelido;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlObservacao;
    private javax.swing.JLabel jlPosicao;
    private javax.swing.JLabel jlRamal;
    private javax.swing.JLabel jlSetor;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JLabel jlTelefone1;
    private javax.swing.JLabel jltitulo;
    private javax.swing.JPanel jpTela;
    private javax.swing.JLabel lbImagemFundoTela;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtObservacao;
    private javax.swing.JTextField txtPosicao;
    private javax.swing.JTextField txtRamal;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
