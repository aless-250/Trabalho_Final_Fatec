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

public class frmChangePassword extends javax.swing.JFrame {

    /**
     * Creates new form frmFornecedor
     */
    public frmChangePassword() {
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
        lbCodigo = new javax.swing.JLabel();
        lbTitulodoFrm = new javax.swing.JLabel();
        jpPainelDadosUsuario = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btConsultarNome = new javax.swing.JButton();
        lbDataExipra = new javax.swing.JLabel();
        jpPainelAdministracaoSenha = new javax.swing.JPanel();
        txtSenhaAtual = new javax.swing.JTextField();
        lbSenhaAtual = new javax.swing.JLabel();
        lbNovaSenha = new javax.swing.JLabel();
        txtNovaSenha = new javax.swing.JTextField();
        lbConfirmaSenha = new javax.swing.JLabel();
        txtConfirmaSenha = new javax.swing.JTextField();
        lbTexto01 = new javax.swing.JLabel();
        lbTexto02 = new javax.swing.JLabel();
        lbTexto03 = new javax.swing.JLabel();
        lbTexto4 = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        txtDataExipra = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTabela = new javax.swing.JTable();
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

        lbCodigo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(204, 204, 204));
        lbCodigo.setText("Codigo:");
        jpPaineldeLabels.add(lbCodigo);
        lbCodigo.setBounds(530, 30, 70, 20);

        lbTitulodoFrm.setFont(new java.awt.Font("Liebe finden", 1, 36)); // NOI18N
        lbTitulodoFrm.setForeground(new java.awt.Color(204, 204, 204));
        lbTitulodoFrm.setText("CADASTRO E TROCA DE SENHA");
        jpPaineldeLabels.add(lbTitulodoFrm);
        lbTitulodoFrm.setBounds(10, 0, 530, 57);

        jpPainelDadosUsuario.setBackground(new java.awt.Color(49, 72, 93));
        jpPainelDadosUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jpPainelDadosUsuario.setToolTipText("");
        jpPainelDadosUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDadosUsuario.setLayout(null);

        lbNome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNome.setForeground(new java.awt.Color(204, 204, 204));
        lbNome.setText("Nome*:");
        jpPainelDadosUsuario.add(lbNome);
        lbNome.setBounds(120, 40, 120, 19);

        txtNome.setBackground(new java.awt.Color(49, 65, 91));
        txtNome.setForeground(new java.awt.Color(204, 204, 204));
        txtNome.setToolTipText("Digite aqui o Nome do usuário. (* Campo Obrigatório)");
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDadosUsuario.add(txtNome);
        txtNome.setBounds(180, 30, 450, 30);

        btConsultarNome.setBackground(new java.awt.Color(51, 51, 51));
        btConsultarNome.setForeground(new java.awt.Color(204, 204, 204));
        btConsultarNome.setMnemonic('c');
        btConsultarNome.setText("Consulta");
        btConsultarNome.setToolTipText("Clique aqui para Consultar o CEP.");
        btConsultarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarNomeActionPerformed(evt);
            }
        });
        jpPainelDadosUsuario.add(btConsultarNome);
        btConsultarNome.setBounds(640, 30, 90, 30);

        jpPaineldeLabels.add(jpPainelDadosUsuario);
        jpPainelDadosUsuario.setBounds(30, 100, 990, 80);

        lbDataExipra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbDataExipra.setForeground(new java.awt.Color(204, 204, 204));
        lbDataExipra.setText(" A Senha expira em*:");
        jpPaineldeLabels.add(lbDataExipra);
        lbDataExipra.setBounds(740, 70, 150, 19);

        jpPainelAdministracaoSenha.setBackground(new java.awt.Color(49, 72, 93));
        jpPainelAdministracaoSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administração de  Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jpPainelAdministracaoSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtSenhaAtual.setBackground(new java.awt.Color(49, 65, 91));
        txtSenhaAtual.setForeground(new java.awt.Color(204, 204, 204));
        txtSenhaAtual.setToolTipText("Digite aqui a Senha Atual.");
        txtSenhaAtual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbSenhaAtual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbSenhaAtual.setForeground(new java.awt.Color(204, 204, 204));
        lbSenhaAtual.setText("Senha Atual:");
        lbSenhaAtual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbNovaSenha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNovaSenha.setForeground(new java.awt.Color(204, 204, 204));
        lbNovaSenha.setText("Nova Senha:");
        lbNovaSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtNovaSenha.setBackground(new java.awt.Color(49, 65, 91));
        txtNovaSenha.setForeground(new java.awt.Color(204, 204, 204));
        txtNovaSenha.setToolTipText("Digite aqui a Nova Senha obrdecendo os critérios de Senha.");
        txtNovaSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNovaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNovaSenhaActionPerformed(evt);
            }
        });

        lbConfirmaSenha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbConfirmaSenha.setForeground(new java.awt.Color(204, 204, 204));
        lbConfirmaSenha.setText("Confirmação de Senha:");

        txtConfirmaSenha.setBackground(new java.awt.Color(49, 65, 91));
        txtConfirmaSenha.setForeground(new java.awt.Color(204, 204, 204));
        txtConfirmaSenha.setToolTipText("Digite aqui a confirmação da Senha");
        txtConfirmaSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbTexto01.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbTexto01.setForeground(new java.awt.Color(204, 204, 204));
        lbTexto01.setText("Dica para criar uma senha forte.");
        lbTexto01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbTexto02.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lbTexto02.setForeground(new java.awt.Color(204, 204, 204));
        lbTexto02.setText("Crie sua senha usando 6 caracteres ou mais.");
        lbTexto02.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbTexto03.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lbTexto03.setForeground(new java.awt.Color(204, 204, 204));
        lbTexto03.setText("Ela deve conter qualquer combinação de");
        lbTexto03.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbTexto4.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lbTexto4.setForeground(new java.awt.Color(204, 204, 204));
        lbTexto4.setText("letras, números e símbolos.");
        lbTexto4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpPainelAdministracaoSenhaLayout = new javax.swing.GroupLayout(jpPainelAdministracaoSenha);
        jpPainelAdministracaoSenha.setLayout(jpPainelAdministracaoSenhaLayout);
        jpPainelAdministracaoSenhaLayout.setHorizontalGroup(
            jpPainelAdministracaoSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelAdministracaoSenhaLayout.createSequentialGroup()
                .addGroup(jpPainelAdministracaoSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPainelAdministracaoSenhaLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lbSenhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbTexto01, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPainelAdministracaoSenhaLayout.createSequentialGroup()
                        .addGroup(jpPainelAdministracaoSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPainelAdministracaoSenhaLayout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(lbNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPainelAdministracaoSenhaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))
                        .addGroup(jpPainelAdministracaoSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNovaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtConfirmaSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpPainelAdministracaoSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTexto02, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTexto03, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTexto4, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jpPainelAdministracaoSenhaLayout.setVerticalGroup(
            jpPainelAdministracaoSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelAdministracaoSenhaLayout.createSequentialGroup()
                .addGroup(jpPainelAdministracaoSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenhaAtual)
                    .addComponent(txtSenhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTexto01))
                .addGroup(jpPainelAdministracaoSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPainelAdministracaoSenhaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jpPainelAdministracaoSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNovaSenha)
                            .addComponent(txtNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpPainelAdministracaoSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbConfirmaSenha)
                            .addComponent(txtConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTexto4)))
                    .addGroup(jpPainelAdministracaoSenhaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbTexto02)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTexto03)))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jpPaineldeLabels.add(jpPainelAdministracaoSenha);
        jpPainelAdministracaoSenha.setBounds(30, 200, 990, 140);

        lbData.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbData.setForeground(new java.awt.Color(204, 204, 204));
        lbData.setText("Data de Cadastro:");
        jpPaineldeLabels.add(lbData);
        lbData.setBounds(760, 30, 140, 20);

        txtCodigo.setBackground(new java.awt.Color(49, 65, 91));
        txtCodigo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(204, 204, 204));
        txtCodigo.setToolTipText("Aqui exibirá o Codigo do usuário.");
        txtCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtCodigo);
        txtCodigo.setBounds(590, 20, 150, 30);

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

        txtDataExipra.setBackground(new java.awt.Color(49, 65, 91));
        txtDataExipra.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txtDataExipra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataExipra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataExipra.setToolTipText("Digite aqui a Data em que irá expirar a senha.");
        txtDataExipra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtDataExipra.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jpPaineldeLabels.add(txtDataExipra);
        txtDataExipra.setBounds(890, 60, 130, 30);

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

        jpPaineldeLabels.add(jScrollPane1);
        jScrollPane1.setBounds(0, 350, 1040, 220);

        getContentPane().add(jpPaineldeLabels);
        jpPaineldeLabels.setBounds(30, 10, 1040, 410);

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

        setBounds(250, 55, 1074, 640);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose(); //fecha somente o jFrame do frmRegistrationUser
         
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btConsultarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarNomeActionPerformed
    
    }//GEN-LAST:event_btConsultarNomeActionPerformed

    private void txtNovaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNovaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNovaSenhaActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        
        limparCampos(); //Chamada do metodo para limpar os campos.
        habilitaCamposBotoes(); //Chamada do metodo para habilitar os campos.
        
    }//GEN-LAST:event_btNovoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limparCampos(); //Chamada do metodo para limpar os campos.
        
        desabilitaCamposBotoes(); //Desabilitando Campos e Botões da tela de Cadastro
        
        txtData.setText(""); //Limpando o campo Data
    }//GEN-LAST:event_btCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmChangePassword().setVisible(true);
            }
        });
    }
    
    // <editor-fold defaultstate="collapsed" desc="Variables declaration - do not modify">                          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConsultarNome;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxSetorCadUsuario1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpPainelAdministracaoSenha;
    private javax.swing.JPanel jpPainelDadosUsuario;
    private javax.swing.JPanel jpPaineldeBotoes;
    private javax.swing.JPanel jpPaineldeLabels;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbConfirmaSenha;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbDataExipra;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNovaSenha;
    private javax.swing.JLabel lbSenhaAtual;
    private javax.swing.JLabel lbTexto01;
    private javax.swing.JLabel lbTexto02;
    private javax.swing.JLabel lbTexto03;
    private javax.swing.JLabel lbTexto4;
    private javax.swing.JLabel lbTitulodoFrm;
    private javax.swing.JTable tbTabela;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtConfirmaSenha;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtDataExipra;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNovaSenha;
    private javax.swing.JTextField txtSenhaAtual;
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
    
        txtCodigo.setText("");
        
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
        txtDataExipra.setText("");
        
        txtNome.setText("");
        
        txtSenhaAtual.setText("");
        txtNovaSenha.setText("");
        txtConfirmaSenha.setText("");
        
    //Habilitando Botões Consultar Cep, Cancelar e Salvar...
    
        btConsultarNome.setEnabled(true);
        btCancelar.setEnabled(true);
        btSalvar.setEnabled(true);
        
    }//final do Metodo para limpar os campos e Habilitar Botões   
    
    public void desabilitaCamposBotoes(){
    /*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
    |* @author Alessandro de Sousa da Silva                                     |
    |* Data: 30/08/2021                                                         |
    |* Descrição: Desenvolvimento do Metodo para desabilitar os campos e os     |
    |* botões da tela de cadastro.                                              |
    |*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/    
        
    //Desabilitando Campos...
    
        txtCodigo.setEnabled(false);
        txtData.setEnabled(false);
        txtDataExipra.setEnabled(false);
        
        txtNome.setEnabled(false);

        txtSenhaAtual.setEnabled(false);
        txtNovaSenha.setEnabled(false);
        txtConfirmaSenha.setEnabled(false);
   
    //Desabilitando Botões...
        
        btConsultarNome.setEnabled(false);
        
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
    
        txtCodigo.setEnabled(true);
        //txtData.setEnabled(true);
        txtDataExipra.setEnabled(true);
        
        txtNome.setEnabled(true);

        txtSenhaAtual.setEnabled(true);
        txtNovaSenha.setEnabled(true);
        txtConfirmaSenha.setEnabled(true);
            
    }//final do Metodo para habilitar os campos
     
}
