package br.com.Model;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import static java.time.Instant.now;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;

/**--------------------------------------------------------------------------
 * Count++ Inventory                                                        |
 * Descrição: Trabalho TG                                                   |
 * Sistema de inventario feito como conclusão do curso de Analise           |
 * e desenvolviento de Sistemas na Fatec de Santana de Parnaiba.            |
 O Sistema desenvolvido visa o gerenciamento do estoque, com a sua        | 
 principal caracteristica sendo o controle de inventario.                 |
 ---------------------------------------------------------------------------|
 Nome do Frame: frmInventory (Tela de cadastro dos usuários        |
 com a comunicação ao BD MySQL.                                           |
                                                                          |
 ---------------------------------------------------------------------------|
 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
 * @author Alessandro de Sousa da Silva                                     |
 * Data: 02/08/2021                                                         |
 * Descrição: Desenvolvimento da tela de cadastro dos usuários e a          |
 * comunicação com BD, e rotinas automáticas de preenchimentos.             |
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
*///-------------------------------------------------------------------------

public class frmInventory extends javax.swing.JFrame {

    /**
     * Creates new form frmFornecedor
     */
    public frmInventory() {
        initComponents();
        //Adiciona Icone na barra de titulo
        URL iconeImagem = getClass().getResource("/imagens/icon.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(iconeImagem);
        this.setIconImage(iconeTitulo);
        //Fim - Adiciona Icone na barra de titulo
        
        //Desabilitando Campos e Botões da tela de Cadastro
        desabilitaCamposBotoes();
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBoxSetorCadUsuario1 = new javax.swing.JComboBox<>();
        jpPaineldeLabels = new javax.swing.JPanel();
        lbCodigoInventario = new javax.swing.JLabel();
        lbObservacao = new javax.swing.JLabel();
        lbTitulodoFrm = new javax.swing.JLabel();
        lbInventariadoPor = new javax.swing.JLabel();
        txtObservacao = new javax.swing.JTextField();
        jpPainelDetalheInventario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTabela = new javax.swing.JTable();
        txtCodigoInventario = new javax.swing.JTextField();
        btConsultarCodigoInventario = new javax.swing.JButton();
        lbDataOperacao = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        txtDataOperacao = new javax.swing.JFormattedTextField();
        cbInventariadoPor = new javax.swing.JComboBox<>();
        lbHorario = new javax.swing.JLabel();
        txtHorario = new javax.swing.JFormattedTextField();
        txtData = new javax.swing.JFormattedTextField();
        jpPaineldeBotoes = new javax.swing.JPanel();
        btVoltar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        lbImagem = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxSetorCadUsuario1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a Opção...", "Administração", "Faturamento", "Financeiro", "Professores", "Recursos Humanos", "Segurança", "Serviços Terceiros" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Guaxinim - Cadastro de Usuario");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jpPaineldeLabels.setBackground(new java.awt.Color(49, 72, 93));
        jpPaineldeLabels.setToolTipText("Cadastro de Usuário.");
        jpPaineldeLabels.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.setLayout(null);

        lbCodigoInventario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCodigoInventario.setForeground(new java.awt.Color(204, 204, 204));
        lbCodigoInventario.setText("Codigo do Inventário*:");
        jpPaineldeLabels.add(lbCodigoInventario);
        lbCodigoInventario.setBounds(30, 70, 170, 19);

        lbObservacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbObservacao.setForeground(new java.awt.Color(204, 204, 204));
        lbObservacao.setText("Observações:");
        jpPaineldeLabels.add(lbObservacao);
        lbObservacao.setBounds(60, 489, 120, 30);

        lbTitulodoFrm.setFont(new java.awt.Font("Liebe finden", 1, 36)); // NOI18N
        lbTitulodoFrm.setForeground(new java.awt.Color(204, 204, 204));
        lbTitulodoFrm.setText("GERENCIAMENTO DO INVENTÁRIO");
        jpPaineldeLabels.add(lbTitulodoFrm);
        lbTitulodoFrm.setBounds(10, 0, 570, 57);

        lbInventariadoPor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbInventariadoPor.setForeground(new java.awt.Color(204, 204, 204));
        lbInventariadoPor.setText("Inventáriado por*:");
        jpPaineldeLabels.add(lbInventariadoPor);
        lbInventariadoPor.setBounds(30, 530, 150, 30);

        txtObservacao.setBackground(new java.awt.Color(49, 65, 91));
        txtObservacao.setForeground(new java.awt.Color(204, 204, 204));
        txtObservacao.setToolTipText("Digite aqui o Endereço. (* Campo Obrigatório)");
        txtObservacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtObservacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObservacaoActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtObservacao);
        txtObservacao.setBounds(160, 490, 390, 30);

        jpPainelDetalheInventario.setBackground(new java.awt.Color(49, 72, 93));
        jpPainelDetalheInventario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhe do Inventário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jpPainelDetalheInventario.setToolTipText("");
        jpPainelDetalheInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDetalheInventario.setLayout(null);

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tbTabela.setBackground(new java.awt.Color(49, 72, 93));
        tbTabela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbTabela.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tbTabela.setForeground(new java.awt.Color(204, 204, 204));
        tbTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbTabela.setToolTipText("Aqui a está sendo exibido a lista dos itens cadastrados.");
        tbTabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbTabela.setGridColor(new java.awt.Color(49, 83, 88));
        tbTabela.setSelectionForeground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(tbTabela);

        jpPainelDetalheInventario.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 970, 340);

        jpPaineldeLabels.add(jpPainelDetalheInventario);
        jpPainelDetalheInventario.setBounds(30, 100, 990, 380);

        txtCodigoInventario.setBackground(new java.awt.Color(49, 65, 91));
        txtCodigoInventario.setForeground(new java.awt.Color(204, 204, 204));
        txtCodigoInventario.setToolTipText("Digite aqui o Nome do usuário. (* Campo Obrigatório)");
        txtCodigoInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(txtCodigoInventario);
        txtCodigoInventario.setBounds(190, 60, 130, 30);

        btConsultarCodigoInventario.setBackground(new java.awt.Color(51, 51, 51));
        btConsultarCodigoInventario.setForeground(new java.awt.Color(204, 204, 204));
        btConsultarCodigoInventario.setMnemonic('c');
        btConsultarCodigoInventario.setText("Consulta");
        btConsultarCodigoInventario.setToolTipText("Clique aqui para Consultar o CEP.");
        btConsultarCodigoInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarCodigoInventarioActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(btConsultarCodigoInventario);
        btConsultarCodigoInventario.setBounds(320, 60, 90, 30);

        lbDataOperacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbDataOperacao.setForeground(new java.awt.Color(204, 204, 204));
        lbDataOperacao.setText("Data da Operação*:");
        jpPaineldeLabels.add(lbDataOperacao);
        lbDataOperacao.setBounds(610, 530, 140, 30);

        lbData.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbData.setForeground(new java.awt.Color(204, 204, 204));
        lbData.setText("Data de Cadastro:");
        jpPaineldeLabels.add(lbData);
        lbData.setBounds(760, 30, 140, 20);

        txtDataOperacao.setBackground(new java.awt.Color(49, 65, 91));
        txtDataOperacao.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txtDataOperacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataOperacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataOperacao.setToolTipText("Digite aqui a Data do Cadastro.");
        txtDataOperacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtDataOperacao.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtDataOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataOperacaoActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtDataOperacao);
        txtDataOperacao.setBounds(750, 530, 110, 30);

        cbInventariadoPor.setBackground(new java.awt.Color(49, 65, 91));
        cbInventariadoPor.setForeground(new java.awt.Color(204, 204, 204));
        cbInventariadoPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Funcionário...", " " }));
        cbInventariadoPor.setToolTipText("Selecione aqui o Status da conta do usuário.");
        cbInventariadoPor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbInventariadoPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInventariadoPorActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(cbInventariadoPor);
        cbInventariadoPor.setBounds(160, 530, 390, 30);

        lbHorario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbHorario.setForeground(new java.awt.Color(204, 204, 204));
        lbHorario.setText(" Horário*:");
        lbHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(lbHorario);
        lbHorario.setBounds(870, 530, 80, 30);

        txtHorario.setBackground(new java.awt.Color(49, 65, 91));
        txtHorario.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txtHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHorario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHorario.setToolTipText("Digite aqui o número do telefone Celular.");
        txtHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtHorario);
        txtHorario.setBounds(940, 530, 80, 30);

        txtData.setBackground(new java.awt.Color(49, 65, 91));
        txtData.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtData.setToolTipText("Digite aqui a Data do Cadastro.");
        txtData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtData.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jpPaineldeLabels.add(txtData);
        txtData.setBounds(890, 20, 130, 30);

        getContentPane().add(jpPaineldeLabels);
        jpPaineldeLabels.setBounds(30, 10, 1040, 570);

        jpPaineldeBotoes.setBackground(new java.awt.Color(49, 72, 93));
        jpPaineldeBotoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btVoltar.setBackground(new java.awt.Color(51, 51, 51));
        btVoltar.setForeground(new java.awt.Color(204, 204, 204));
        btVoltar.setMnemonic('v');
        btVoltar.setText("Voltar");
        btVoltar.setToolTipText("Clique aqui para Tela Principal.");
        btVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltar.setMaximumSize(new java.awt.Dimension(82, 26));
        btVoltar.setMinimumSize(new java.awt.Dimension(82, 26));
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btNovo.setBackground(new java.awt.Color(51, 51, 51));
        btNovo.setForeground(new java.awt.Color(204, 204, 204));
        btNovo.setMnemonic('n');
        btNovo.setText("Novo");
        btNovo.setToolTipText("Clique aqui para cadastrar um Novo item.");
        btNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNovo.setMaximumSize(new java.awt.Dimension(82, 26));
        btNovo.setMinimumSize(new java.awt.Dimension(82, 26));
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btAlterar.setBackground(new java.awt.Color(51, 51, 51));
        btAlterar.setForeground(new java.awt.Color(204, 204, 204));
        btAlterar.setMnemonic('a');
        btAlterar.setText("Alterar");
        btAlterar.setToolTipText("Clique aqui para Alterar este item.");
        btAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAlterar.setMaximumSize(new java.awt.Dimension(82, 26));
        btAlterar.setMinimumSize(new java.awt.Dimension(82, 26));

        btCancelar.setBackground(new java.awt.Color(51, 51, 51));
        btCancelar.setForeground(new java.awt.Color(204, 204, 204));
        btCancelar.setMnemonic('c');
        btCancelar.setText("Cancelar");
        btCancelar.setToolTipText("Clique aqui para Cancelar este item.");
        btCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCancelar.setMaximumSize(new java.awt.Dimension(82, 26));
        btCancelar.setMinimumSize(new java.awt.Dimension(82, 26));

        btExcluir.setBackground(new java.awt.Color(51, 51, 51));
        btExcluir.setForeground(new java.awt.Color(204, 204, 204));
        btExcluir.setMnemonic('e');
        btExcluir.setText("Excluir");
        btExcluir.setToolTipText("Clique aqui para Excluir este item.");
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcluir.setMaximumSize(new java.awt.Dimension(82, 26));
        btExcluir.setMinimumSize(new java.awt.Dimension(82, 26));

        btSalvar.setBackground(new java.awt.Color(51, 51, 51));
        btSalvar.setForeground(new java.awt.Color(204, 204, 204));
        btSalvar.setMnemonic('s');
        btSalvar.setText("Salvar");
        btSalvar.setToolTipText("Clique aqui  para Salvar este item.");
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setMaximumSize(new java.awt.Dimension(82, 26));
        btSalvar.setMinimumSize(new java.awt.Dimension(82, 26));

        javax.swing.GroupLayout jpPaineldeBotoesLayout = new javax.swing.GroupLayout(jpPaineldeBotoes);
        jpPaineldeBotoes.setLayout(jpPaineldeBotoesLayout);
        jpPaineldeBotoesLayout.setHorizontalGroup(
            jpPaineldeBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPaineldeBotoesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jpPaineldeBotoesLayout.setVerticalGroup(
            jpPaineldeBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPaineldeBotoesLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jpPaineldeBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        getContentPane().add(jpPaineldeBotoes);
        jpPaineldeBotoes.setBounds(30, 590, 1040, 50);

        lbImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telaPrincipal++.png"))); // NOI18N
        lbImagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lbImagem);
        lbImagem.setBounds(0, 0, 1070, 660);

        setBounds(250, 55, 1074, 640);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose(); //fecha somente o jFrame do frmInventory
         
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        
        limparCampos(); //Chamada do metodo para limpar os campos.
        habilitaCamposBotoes(); //Chamada do metodo para habilitar os campos.
        
    }//GEN-LAST:event_btNovoActionPerformed

    private void btConsultarCodigoInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarCodigoInventarioActionPerformed
        /*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
        |* @author Alessandro de Sousa da Silva                                     |
        |* Data: 02/08/2021                                                         |
        |* Descrição: Desenvolvimento do Metodo para buscar o endereço atraves da   |
        * consulta do web service da ViaCep.                                       |
        |* de cadastro dos usuários.                                                |
        |*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
 
    }//GEN-LAST:event_btConsultarCodigoInventarioActionPerformed

    private void txtHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioActionPerformed

    private void txtObservacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObservacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacaoActionPerformed

    private void cbInventariadoPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInventariadoPorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbInventariadoPorActionPerformed

    private void txtDataOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataOperacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataOperacaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInventory().setVisible(true);
            }
        });
    }
    
    // <editor-fold defaultstate="collapsed" desc="Variables declaration - do not modify">                          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConsultarCodigoInventario;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbInventariadoPor;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxSetorCadUsuario1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpPainelDetalheInventario;
    private javax.swing.JPanel jpPaineldeBotoes;
    private javax.swing.JPanel jpPaineldeLabels;
    private javax.swing.JLabel lbCodigoInventario;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbDataOperacao;
    private javax.swing.JLabel lbHorario;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbInventariadoPor;
    private javax.swing.JLabel lbObservacao;
    private javax.swing.JLabel lbTitulodoFrm;
    private javax.swing.JTable tbTabela;
    private javax.swing.JTextField txtCodigoInventario;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtDataOperacao;
    private javax.swing.JFormattedTextField txtHorario;
    private javax.swing.JTextField txtObservacao;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
    
    public void limparCampos(){
    /*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
    |* @author Alessandro de Sousa da Silva                                     |
    |* Data: 02/08/2021                                                         |
    |* Descrição: Desenvolvimento do Metodo para limpar os campos da tela do    |
    |* cadastro.                                                                |
    |*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/    
    
    //Limpando os Campos e Inserindo Data Atual...
    
        txtCodigoInventario.setText("");
        
        //Rotina para inserir a Data Atual
        Date data = new Date();
        String dia = ""+data.getDate();
        String mes = ""+String.valueOf(data.getMonth()+1);
        String ano = ""+(1900 + data.getYear());
            if(Integer.parseInt(mes)<=9)
                mes="0"+mes;
            txtData.setText(dia+mes+ano);
            txtDataOperacao.setText(dia+mes+ano);
        //Final da rotina de inserir a Data Atual
        
        //Rotina para inserir a Hora do Sistema
        Timer timer = new Timer(1000, new frmInventory.hora());
        timer.start();      
        //Fim da Rotina para inserir a Hora do Sistema
        
        txtData.setEnabled(false);
        txtHorario.setEnabled(false);
        
        txtDataOperacao.setEnabled(false);
        
        txtCodigoInventario.setText("");
        
        txtObservacao.setText("");
        
        cbInventariadoPor.setSelectedIndex(0);
        
        //Habilitando Botões Consultar Cep, Cancelar e Salvar...
    
        btConsultarCodigoInventario.setEnabled(true);
        btCancelar.setEnabled(true);
        btSalvar.setEnabled(true);
        
    }//final do Metodo para limpar os campos e Habilitar Botões   
    
    public void desabilitaCamposBotoes(){
    /*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
    |* @author Alessandro de Sousa da Silva                                     |
    |* Data: 02/08/2021                                                         |
    |* Descrição: Desenvolvimento do Metodo para desabilitar os campos e os     |
    |* botões da tela de cadastro.                                              |
    |*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/    
        
    //Desabilitando Campos...
    
        txtData.setEnabled(false);
        txtCodigoInventario.setEnabled(false);
        
        txtObservacao.setEnabled(false);
        txtDataOperacao.setEnabled(false);
        txtHorario.setEnabled(false);

        cbInventariadoPor.setEnabled(false);
   
    //Desabilitando Botões...
        
        btConsultarCodigoInventario.setEnabled(false);
        btAlterar.setEnabled(false);
        btCancelar.setEnabled(false);
        btExcluir.setEnabled(false);
        btSalvar.setEnabled(false);

    }//final do Metodo para desabilitar os campos e botões
    
      public void habilitaCamposBotoes(){
    /*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
    |* @author Alessandro de Sousa da Silva                                     |
    |* Data: 02/08/2021                                                         |
    |* Descrição: Desenvolvimento do Metodo para habilitar os campos            |
    |* da tela de cadastro.                                                     |
    |*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/    
        
    //Habilitando Campos...
    
        txtData.setEnabled(true);
                
        txtCodigoInventario.setEnabled(true);
        txtObservacao.setEnabled(true);
        txtDataOperacao.setEnabled(true);
        txtHorario.setEnabled(true);

        cbInventariadoPor.setEnabled(true);
        
        //Habilitando Botões...
        
        btConsultarCodigoInventario.setEnabled(true);
        
        btAlterar.setEnabled(true);
        btCancelar.setEnabled(true);
        btExcluir.setEnabled(true);
        btSalvar.setEnabled(true);
    
    }//final do Metodo para habilitar os campos
         
    // <editor-fold defaultstate="collapsed" desc="Metodo - class hora implements ActionListener">    
    /*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
    |* @author Alessandro de Sousa da Silva                                     |
    |* Data: 11/09/2021                                                         |
    |* Descrição: Desenvolvimento do Metodo Class-Hora Implements ActionListener|
    |* para salvar a hora no cadastro.                                          |
    |*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/        
      class hora implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e){
                Calendar now = Calendar.getInstance();
                txtHorario.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }//fim da actionPerformed
    }//fim da class  // </editor-fold> 
          
}
