package br.com.Model;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Date;

/**--------------------------------------------------------------------------
 * Count++ Inventory                                                        |
 * Descrição: Trabalho TG                                                   |
 * Sistema de inventario feito como conclusão do curso de Analise           |
 * e desenvolviento de Sistemas na Fatec de Santana de Parnaiba.            |
 * O Sistema desenvolvido visa o gerenciamento do estoque, com a sua        | 
 * principal caracteristica sendo o controle de inventario.                 |
 ---------------------------------------------------------------------------|
 * Nome do Frame: frmRegistrationUser (Tela de cadastro dos usuários        |
 * com a comunicação ao BD MySQL.                                           |
 *                                                                          |
 ---------------------------------------------------------------------------|
 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
 * @author Alessandro de Sousa da Silva                                     |
 * Data: 02/08/2021                                                         |
 * Descrição: Desenvolvimento da tela de cadastro dos usuários e a          |
 * comunicação com BD, e rotinas automáticas de preenchimentos.             |
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
*///-------------------------------------------------------------------------

public class frmInputOutput extends javax.swing.JFrame {

    /**
     * Creates new form frmFornecedor
     */
    public frmInputOutput() {
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
        lbTitulodoFrm = new javax.swing.JLabel();
        jpPainelInputTabelas = new javax.swing.JPanel();
        lbTexto01 = new javax.swing.JLabel();
        btLocalizarArquivo = new javax.swing.JButton();
        txtLocalizarArquivo = new javax.swing.JTextField();
        lbData = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        jpPainelOutputTabelas = new javax.swing.JPanel();
        lbTexto2 = new javax.swing.JLabel();
        btSalvarEm = new javax.swing.JButton();
        txtSalvarEm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTabela = new javax.swing.JTable();
        txtCodigoTabela = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        lbTexto03 = new javax.swing.JLabel();
        lbCodigoTabela = new javax.swing.JLabel();
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
        setTitle("Sistema Guaxinim - Start Inventário.");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jpPaineldeLabels.setBackground(new java.awt.Color(49, 72, 93));
        jpPaineldeLabels.setToolTipText("Cadastro de Usuário.");
        jpPaineldeLabels.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.setLayout(null);

        lbTitulodoFrm.setFont(new java.awt.Font("Liebe finden", 1, 36)); // NOI18N
        lbTitulodoFrm.setForeground(new java.awt.Color(204, 204, 204));
        lbTitulodoFrm.setText("INTPUT / OUTPUT - DE TABELA");
        jpPaineldeLabels.add(lbTitulodoFrm);
        lbTitulodoFrm.setBounds(10, 0, 530, 57);

        jpPainelInputTabelas.setBackground(new java.awt.Color(49, 72, 93));
        jpPainelInputTabelas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input de Tabelas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jpPainelInputTabelas.setToolTipText("");
        jpPainelInputTabelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbTexto01.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbTexto01.setForeground(new java.awt.Color(204, 204, 204));
        lbTexto01.setText("Selecione o arquivo da Tabela de Produtos ( xls, xlsx, txt ).");
        lbTexto01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btLocalizarArquivo.setBackground(new java.awt.Color(51, 51, 51));
        btLocalizarArquivo.setForeground(new java.awt.Color(204, 204, 204));
        btLocalizarArquivo.setMnemonic('e');
        btLocalizarArquivo.setText("Localizar");
        btLocalizarArquivo.setToolTipText("Clique aqui para Excluir este item.");
        btLocalizarArquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLocalizarArquivo.setMaximumSize(new java.awt.Dimension(82, 26));
        btLocalizarArquivo.setMinimumSize(new java.awt.Dimension(82, 26));
        btLocalizarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocalizarArquivoActionPerformed(evt);
            }
        });

        txtLocalizarArquivo.setBackground(new java.awt.Color(49, 65, 91));
        txtLocalizarArquivo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtLocalizarArquivo.setForeground(new java.awt.Color(204, 204, 204));
        txtLocalizarArquivo.setToolTipText("Aqui exibirá o Codigo do Start do Inventário..");
        txtLocalizarArquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtLocalizarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalizarArquivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPainelInputTabelasLayout = new javax.swing.GroupLayout(jpPainelInputTabelas);
        jpPainelInputTabelas.setLayout(jpPainelInputTabelasLayout);
        jpPainelInputTabelasLayout.setHorizontalGroup(
            jpPainelInputTabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelInputTabelasLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(jpPainelInputTabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPainelInputTabelasLayout.createSequentialGroup()
                        .addComponent(txtLocalizarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLocalizarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbTexto01, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(341, Short.MAX_VALUE))
        );
        jpPainelInputTabelasLayout.setVerticalGroup(
            jpPainelInputTabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelInputTabelasLayout.createSequentialGroup()
                .addComponent(lbTexto01)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPainelInputTabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocalizarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLocalizarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jpPaineldeLabels.add(jpPainelInputTabelas);
        jpPainelInputTabelas.setBounds(30, 70, 990, 110);

        lbData.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbData.setForeground(new java.awt.Color(204, 204, 204));
        lbData.setText("Data:");
        jpPaineldeLabels.add(lbData);
        lbData.setBounds(850, 30, 40, 20);

        txtData.setBackground(new java.awt.Color(49, 65, 91));
        txtData.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtData.setToolTipText("Data do Start do Inventário.");
        txtData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtData.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jpPaineldeLabels.add(txtData);
        txtData.setBounds(890, 20, 130, 30);

        jpPainelOutputTabelas.setBackground(new java.awt.Color(49, 72, 93));
        jpPainelOutputTabelas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Output de Tabelas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jpPainelOutputTabelas.setToolTipText("");
        jpPainelOutputTabelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbTexto2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbTexto2.setForeground(new java.awt.Color(204, 204, 204));
        lbTexto2.setText("Selecione o local onde irá salvar o arquivo.");
        lbTexto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btSalvarEm.setBackground(new java.awt.Color(51, 51, 51));
        btSalvarEm.setForeground(new java.awt.Color(204, 204, 204));
        btSalvarEm.setMnemonic('e');
        btSalvarEm.setText("Salvar em");
        btSalvarEm.setToolTipText("Clique aqui para Excluir este item.");
        btSalvarEm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvarEm.setMaximumSize(new java.awt.Dimension(82, 26));
        btSalvarEm.setMinimumSize(new java.awt.Dimension(82, 26));
        btSalvarEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarEmActionPerformed(evt);
            }
        });

        txtSalvarEm.setBackground(new java.awt.Color(49, 65, 91));
        txtSalvarEm.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtSalvarEm.setForeground(new java.awt.Color(204, 204, 204));
        txtSalvarEm.setToolTipText("Aqui exibirá o Codigo do Start do Inventário..");
        txtSalvarEm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSalvarEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalvarEmActionPerformed(evt);
            }
        });

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

        txtCodigoTabela.setBackground(new java.awt.Color(49, 65, 91));
        txtCodigoTabela.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtCodigoTabela.setForeground(new java.awt.Color(204, 204, 204));
        txtCodigoTabela.setToolTipText("Aqui exibirá o Codigo do Start do Inventário..");
        txtCodigoTabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCodigoTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoTabelaActionPerformed(evt);
            }
        });

        btConsultar.setBackground(new java.awt.Color(51, 51, 51));
        btConsultar.setForeground(new java.awt.Color(204, 204, 204));
        btConsultar.setMnemonic('e');
        btConsultar.setText("Consultar");
        btConsultar.setToolTipText("Clique aqui para Excluir este item.");
        btConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btConsultar.setMaximumSize(new java.awt.Dimension(82, 26));
        btConsultar.setMinimumSize(new java.awt.Dimension(82, 26));
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        lbTexto03.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbTexto03.setForeground(new java.awt.Color(204, 204, 204));
        lbTexto03.setText("Localize a Tabela que deseja exportar.");
        lbTexto03.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbCodigoTabela.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCodigoTabela.setForeground(new java.awt.Color(204, 204, 204));
        lbCodigoTabela.setText("Codigo da Tabela:");
        lbCodigoTabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpPainelOutputTabelasLayout = new javax.swing.GroupLayout(jpPainelOutputTabelas);
        jpPainelOutputTabelas.setLayout(jpPainelOutputTabelasLayout);
        jpPainelOutputTabelasLayout.setHorizontalGroup(
            jpPainelOutputTabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelOutputTabelasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpPainelOutputTabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpPainelOutputTabelasLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(jpPainelOutputTabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpPainelOutputTabelasLayout.createSequentialGroup()
                                .addComponent(txtSalvarEm, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvarEm, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpPainelOutputTabelasLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbCodigoTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPainelOutputTabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTexto03, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpPainelOutputTabelasLayout.createSequentialGroup()
                                .addComponent(txtCodigoTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jpPainelOutputTabelasLayout.setVerticalGroup(
            jpPainelOutputTabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelOutputTabelasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTexto2)
                .addGap(5, 5, 5)
                .addGroup(jpPainelOutputTabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSalvarEm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvarEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTexto03)
                .addGap(4, 4, 4)
                .addGroup(jpPainelOutputTabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigoTabela)
                    .addComponent(txtCodigoTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jpPaineldeLabels.add(jpPainelOutputTabelas);
        jpPainelOutputTabelas.setBounds(30, 200, 990, 360);

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
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

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

        setBounds(250, 55, 1073, 640);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose(); //fecha somente o jFrame do frmRegistrationUser
         
    }//GEN-LAST:event_btVoltarActionPerformed

    private void txtLocalizarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalizarArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalizarArquivoActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        
        limparCampos(); //Chamada do metodo para limpar os campos.
        habilitaCamposBotoes(); //Chamada do metodo para habilitar os campos.
        
    }//GEN-LAST:event_btNovoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limparCampos(); //Chamada do metodo para limpar os campos.
        
        desabilitaCamposBotoes(); //Desabilitando Campos e Botões da tela de Cadastro
        
        txtData.setText(""); //Limpando o campo Data
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btLocalizarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocalizarArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btLocalizarArquivoActionPerformed

    private void btSalvarEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarEmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarEmActionPerformed

    private void txtSalvarEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalvarEmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalvarEmActionPerformed

    private void txtCodigoTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoTabelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoTabelaActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btConsultarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInputOutput().setVisible(true);
            }
        });
    }
    
    // <editor-fold defaultstate="collapsed" desc="Variables declaration - do not modify">                          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLocalizarArquivo;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSalvarEm;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxSetorCadUsuario1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpPainelInputTabelas;
    private javax.swing.JPanel jpPainelOutputTabelas;
    private javax.swing.JPanel jpPaineldeBotoes;
    private javax.swing.JPanel jpPaineldeLabels;
    private javax.swing.JLabel lbCodigoTabela;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbTexto01;
    private javax.swing.JLabel lbTexto03;
    private javax.swing.JLabel lbTexto2;
    private javax.swing.JLabel lbTitulodoFrm;
    private javax.swing.JTable tbTabela;
    private javax.swing.JTextField txtCodigoTabela;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtLocalizarArquivo;
    private javax.swing.JTextField txtSalvarEm;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
    
    public void limparCampos(){
    /*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
    |* @author Alessandro de Sousa da Silva                                     |
    |* Data: 31/08/2021                                                         |
    |* Descrição: Desenvolvimento do Metodo para limpar os campos da tela do    |
    |* cadastro.                                                                |
    |*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/    
    
    //Limpando os Campos e Inserindo Data Atual...
    
        txtLocalizarArquivo.setText("");
        
        //Rotina para inserir a Data Atual
        Date data = new Date();
        String dia = ""+data.getDate();
        String mes = ""+String.valueOf(data.getMonth()+1);
        String ano = ""+(1900 + data.getYear());
            if(Integer.parseInt(mes)<=9)
                mes="0"+mes;
            txtData.setText(dia+mes+ano);
        //Final da rotina de inserir a Data Atual
        txtData.setEnabled(false);
        
        txtCodigoTabela.setText("");
        txtLocalizarArquivo.setText("");
        txtSalvarEm.setText("");
                                
    //Habilitando Botões Consultar Cep, Cancelar e Salvar...
    
        btLocalizarArquivo.setEnabled(true);
        btSalvarEm.setEnabled(true);
        btConsultar.setEnabled(true);
         
    }//final do Metodo para limpar os campos e Habilitar Botões   
    
    public void desabilitaCamposBotoes(){
    /*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
    |* @author Alessandro de Sousa da Silva                                     |
    |* Data: 30/08/2021                                                         |
    |* Descrição: Desenvolvimento do Metodo para desabilitar os campos e os     |
    |* botões da tela de cadastro.                                              |
    |*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/    
        
    //Desabilitando Campos...
    
        txtData.setEnabled(false);
        txtCodigoTabela.setEnabled(false);
        txtLocalizarArquivo.setEnabled(false);
        txtSalvarEm.setEnabled(false);
                        
    //Desabilitando Botões...
        
        btLocalizarArquivo.setEnabled(false);
        btSalvarEm.setEnabled(false);
        btConsultar.setEnabled(false);
    
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
        
        txtCodigoTabela.setEnabled(true);
        txtLocalizarArquivo.setEnabled(true);
        txtSalvarEm.setEnabled(true);
                        
    //Desabilitando Botões...
        
        btLocalizarArquivo.setEnabled(true);
        btSalvarEm.setEnabled(true);
        btConsultar.setEnabled(true);
    
        btAlterar.setEnabled(true);
        btCancelar.setEnabled(true);
        btExcluir.setEnabled(true);
        btSalvar.setEnabled(true);
                    
    }//final do Metodo para habilitar os campos
     
}
