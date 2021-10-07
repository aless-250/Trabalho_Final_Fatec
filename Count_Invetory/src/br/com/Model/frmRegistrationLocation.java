package br.com.Model;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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

public class frmRegistrationLocation extends javax.swing.JFrame {
    
    private static final String conn = "jdbc:mysql://localhost:3306/bdcountinv";
    private static final String usuario = "root";
    private static final String senha = "Fatec2021";
    
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q, i, id, deleteitem;
    
    /**
      * Creates new form frmFornecedor
     */
    public frmRegistrationLocation() {
    
        initComponents();
    
        //Adiciona Icone na barra de titulo
        URL iconeImagem = getClass().getResource("/imagens/icon.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(iconeImagem);
        this.setIconImage(iconeTitulo);
        //Fim - Adiciona Icone na barra de titulo
        
        //Desabilitando Campos e Botões da tela de Cadastro
        desabilitaCamposBotoes();    
    }
    
    //FUNCTION
    public void upDateDB(){ 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(conn,usuario,senha);
            
            try {
                pst = sqlConn.prepareStatement("SELECT * FROM tb_localizacao");
            } 
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir a Localização!!! \nTela Cad.Localização  - erro: "+ex);
            }
            
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            
            q = stData.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)tbTabela.getModel();
            RecordTable.setRowCount(0);
            
                while(rs.next()){
                    Vector columData = new Vector(); //populando a table
                        for(i = 1; i <= q; i++){
                            columData.add(rs.getString("id"));          //lendo string a string 
                            columData.add(rs.getString("dt_cadastro"));
                            columData.add(rs.getString("nome"));
                            columData.add(rs.getString("apelido"));
                            columData.add(rs.getString("endereco"));
                            columData.add(rs.getString("posicao"));
                            columData.add(rs.getString("telefone"));
                            columData.add(rs.getString("ramal"));
                            columData.add(rs.getString("celular"));
                            columData.add(rs.getString("setorid"));
                            columData.add(rs.getString("observacao"));
                            columData.add(rs.getString("email"));
                        }                                                
                        RecordTable.addRow(columData);
                }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Tela Cad.Localização - Erro: " +e);
        }
    } 
    //END-FUNCTION
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBoxSetorCadUsuario1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTabela = new javax.swing.JTable();
        jpPaineldeLabels = new javax.swing.JPanel();
        lbObservacao = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        lbTitulodoFrm = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        txtApelido = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jpPainelLocalizacao = new javax.swing.JPanel();
        lbPosicao = new javax.swing.JLabel();
        lbEnderecoLocalizacao = new javax.swing.JLabel();
        txtPosicao = new javax.swing.JTextField();
        txtEnderecoLocalizacao = new javax.swing.JTextField();
        lbApelido = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jpPainelDadosResponsavel = new javax.swing.JPanel();
        cbSetor = new javax.swing.JComboBox<>();
        lbRamal = new javax.swing.JLabel();
        lbSetor = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lbTelefone = new javax.swing.JLabel();
        txtRamal = new javax.swing.JTextField();
        lbCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        lbData = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        txtObservacao = new javax.swing.JTextField();
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
        setTitle("Sistema Guaxinim - Cadastro da Localização.");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        tbTabela.setBackground(new java.awt.Color(49, 72, 93));
        tbTabela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbTabela.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        tbTabela.setForeground(new java.awt.Color(204, 204, 204));
        tbTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Data", "Nome", "Apelido", "Localização", "Posição", "Telefone", "Ramal", "Celular", "Setor", "Observação", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTabela.setToolTipText("Aqui a está sendo exibido a lista dos itens cadastrados.");
        tbTabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbTabela.setGridColor(new java.awt.Color(49, 83, 88));
        tbTabela.setSelectionForeground(new java.awt.Color(102, 102, 102));
        tbTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTabela);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 340, 1040, 240);

        jpPaineldeLabels.setBackground(new java.awt.Color(49, 72, 93));
        jpPaineldeLabels.setToolTipText("Cadastro da Localização.");
        jpPaineldeLabels.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.setLayout(null);

        lbObservacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbObservacao.setForeground(new java.awt.Color(204, 204, 204));
        lbObservacao.setText("Observação:");
        jpPaineldeLabels.add(lbObservacao);
        lbObservacao.setBounds(20, 290, 110, 19);

        lbNome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNome.setForeground(new java.awt.Color(204, 204, 204));
        lbNome.setText("Nome*:");
        jpPaineldeLabels.add(lbNome);
        lbNome.setBounds(30, 90, 120, 19);

        lbCodigo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(204, 204, 204));
        lbCodigo.setText("Codigo:");
        jpPaineldeLabels.add(lbCodigo);
        lbCodigo.setBounds(560, 30, 70, 20);

        lbTitulodoFrm.setFont(new java.awt.Font("Liebe finden", 1, 36)); // NOI18N
        lbTitulodoFrm.setForeground(new java.awt.Color(204, 204, 204));
        lbTitulodoFrm.setText("CADASTRO DAS LOCALIZAÇÕES");
        jpPaineldeLabels.add(lbTitulodoFrm);
        lbTitulodoFrm.setBounds(10, 0, 530, 57);

        lbEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(204, 204, 204));
        lbEmail.setText(" E-Mail:");
        jpPaineldeLabels.add(lbEmail);
        lbEmail.setBounds(610, 290, 60, 19);

        txtApelido.setBackground(new java.awt.Color(49, 65, 91));
        txtApelido.setForeground(new java.awt.Color(204, 204, 204));
        txtApelido.setToolTipText("Digite aqui o Nome / Apelido da Localização. (* Campo Obrigatório)");
        txtApelido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtApelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApelidoActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtApelido);
        txtApelido.setBounds(740, 80, 280, 30);

        txtEmail.setBackground(new java.awt.Color(49, 65, 91));
        txtEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtEmail.setToolTipText("Digite aqui o E-mail.");
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(txtEmail);
        txtEmail.setBounds(670, 280, 350, 30);

        jpPainelLocalizacao.setBackground(new java.awt.Color(49, 72, 93));
        jpPainelLocalizacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço \\ Localização", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jpPainelLocalizacao.setToolTipText("");
        jpPainelLocalizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelLocalizacao.setLayout(null);

        lbPosicao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbPosicao.setForeground(new java.awt.Color(204, 204, 204));
        lbPosicao.setText("  Posição*:");
        jpPainelLocalizacao.add(lbPosicao);
        lbPosicao.setBounds(630, 30, 140, 19);

        lbEnderecoLocalizacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbEnderecoLocalizacao.setForeground(new java.awt.Color(204, 204, 204));
        lbEnderecoLocalizacao.setText("Endereco \\ Localizacao*:");
        jpPainelLocalizacao.add(lbEnderecoLocalizacao);
        lbEnderecoLocalizacao.setBounds(190, 30, 180, 19);

        txtPosicao.setBackground(new java.awt.Color(49, 65, 91));
        txtPosicao.setForeground(new java.awt.Color(204, 204, 204));
        txtPosicao.setToolTipText("Digite aqui a Posição da Localização. (* Campo Obrigatório)");
        txtPosicao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPosicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosicaoActionPerformed(evt);
            }
        });
        jpPainelLocalizacao.add(txtPosicao);
        txtPosicao.setBounds(710, 20, 130, 30);

        txtEnderecoLocalizacao.setBackground(new java.awt.Color(49, 65, 91));
        txtEnderecoLocalizacao.setForeground(new java.awt.Color(204, 204, 204));
        txtEnderecoLocalizacao.setToolTipText("Digite aqui o Endereço \\ Localização. (* Campo Obrigatório)");
        txtEnderecoLocalizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEnderecoLocalizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoLocalizacaoActionPerformed(evt);
            }
        });
        jpPainelLocalizacao.add(txtEnderecoLocalizacao);
        txtEnderecoLocalizacao.setBounds(370, 20, 190, 30);

        jpPaineldeLabels.add(jpPainelLocalizacao);
        jpPainelLocalizacao.setBounds(30, 120, 990, 70);

        lbApelido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbApelido.setForeground(new java.awt.Color(204, 204, 204));
        lbApelido.setText("Apelido*:");
        jpPaineldeLabels.add(lbApelido);
        lbApelido.setBounds(670, 90, 120, 19);

        txtNome.setBackground(new java.awt.Color(49, 65, 91));
        txtNome.setForeground(new java.awt.Color(204, 204, 204));
        txtNome.setToolTipText("Digite aqui o Nome da Localização. (* Campo Obrigatório)");
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(txtNome);
        txtNome.setBounds(90, 80, 500, 30);

        jpPainelDadosResponsavel.setBackground(new java.awt.Color(49, 72, 93));
        jpPainelDadosResponsavel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Responsável", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jpPainelDadosResponsavel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbSetor.setBackground(new java.awt.Color(49, 65, 91));
        cbSetor.setForeground(new java.awt.Color(204, 204, 204));
        cbSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a Opção...", "Administrativo", "Contabil", "Diretoria", "Expedição", "Financeiro", "Produção", "Segurança", "TI - HelpDesk" }));
        cbSetor.setToolTipText("Selecione aqui o setor Responsavel pela Localização.");
        cbSetor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSetorActionPerformed(evt);
            }
        });

        lbRamal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbRamal.setForeground(new java.awt.Color(204, 204, 204));
        lbRamal.setText("Ramal:");

        lbSetor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbSetor.setForeground(new java.awt.Color(204, 204, 204));
        lbSetor.setText(" Setor:");

        txtTelefone.setBackground(new java.awt.Color(49, 65, 91));
        txtTelefone.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefone.setToolTipText("Digite aqui o Telefone do Responsavel pela Localização.");
        txtTelefone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTelefone.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        lbTelefone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbTelefone.setForeground(new java.awt.Color(204, 204, 204));
        lbTelefone.setText("Telefone:");

        txtRamal.setBackground(new java.awt.Color(49, 65, 91));
        txtRamal.setForeground(new java.awt.Color(204, 204, 204));
        txtRamal.setToolTipText("Digite aqui o Ramal do Responsavel pela Localização.");
        txtRamal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtRamal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRamalActionPerformed(evt);
            }
        });

        lbCelular.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCelular.setForeground(new java.awt.Color(204, 204, 204));
        lbCelular.setText("Celular:");

        txtCelular.setBackground(new java.awt.Color(49, 65, 91));
        txtCelular.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCelular.setToolTipText("Digite aqui o Celular do Responsavel pela Localização.");
        txtCelular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCelular.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        javax.swing.GroupLayout jpPainelDadosResponsavelLayout = new javax.swing.GroupLayout(jpPainelDadosResponsavel);
        jpPainelDadosResponsavel.setLayout(jpPainelDadosResponsavelLayout);
        jpPainelDadosResponsavelLayout.setHorizontalGroup(
            jpPainelDadosResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelDadosResponsavelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRamal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRamal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(lbCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(lbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jpPainelDadosResponsavelLayout.setVerticalGroup(
            jpPainelDadosResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelDadosResponsavelLayout.createSequentialGroup()
                .addGroup(jpPainelDadosResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPainelDadosResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPainelDadosResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCelular))
                    .addGroup(jpPainelDadosResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbRamal)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTelefone)
                        .addComponent(txtRamal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jpPaineldeLabels.add(jpPainelDadosResponsavel);
        jpPainelDadosResponsavel.setBounds(30, 200, 990, 70);

        lbData.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbData.setForeground(new java.awt.Color(204, 204, 204));
        lbData.setText("Data Cadastro:");
        jpPaineldeLabels.add(lbData);
        lbData.setBounds(780, 30, 140, 20);

        txtCodigo.setBackground(new java.awt.Color(49, 65, 91));
        txtCodigo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(204, 204, 204));
        txtCodigo.setToolTipText("Aqui exibirá o Codigo da Localização.");
        txtCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtCodigo);
        txtCodigo.setBounds(620, 20, 150, 30);

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

        txtObservacao.setBackground(new java.awt.Color(49, 65, 91));
        txtObservacao.setForeground(new java.awt.Color(204, 204, 204));
        txtObservacao.setToolTipText("Digite aqui uma Observação.");
        txtObservacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtObservacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObservacaoActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtObservacao);
        txtObservacao.setBounds(120, 280, 450, 30);

        getContentPane().add(jpPaineldeLabels);
        jpPaineldeLabels.setBounds(30, 10, 1040, 570);

        jpPaineldeBotoes.setBackground(new java.awt.Color(49, 72, 93));
        jpPaineldeBotoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btVoltar.setBackground(new java.awt.Color(51, 51, 51));
        btVoltar.setForeground(new java.awt.Color(204, 204, 204));
        btVoltar.setMnemonic('v');
        btVoltar.setText("Voltar");
        btVoltar.setToolTipText("Clique aqui para Tela Principal.");
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
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

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
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSalvar.setBackground(new java.awt.Color(51, 51, 51));
        btSalvar.setForeground(new java.awt.Color(204, 204, 204));
        btSalvar.setMnemonic('s');
        btSalvar.setText("Salvar");
        btSalvar.setToolTipText("Clique aqui  para Salvar este item.");
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setMaximumSize(new java.awt.Dimension(82, 26));
        btSalvar.setMinimumSize(new java.awt.Dimension(82, 26));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

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

        setBounds(250, 55, 1072, 640);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose(); //fecha somente o jFrame do frmRegistrationUser
         
    }//GEN-LAST:event_btVoltarActionPerformed

    private void txtPosicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosicaoActionPerformed

    private void txtRamalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRamalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRamalActionPerformed

    private void cbSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSetorActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        
        limparCampos(); //Chamada do metodo para limpar os campos.
        habilitaCamposBotoes(); //Chamada do metodo para habilitar os campos. 
        btNovo.setEnabled(false);
        btAlterar.setEnabled(false);
        btExcluir.setEnabled(false);
        btVoltar.setEnabled(false);        
    }//GEN-LAST:event_btNovoActionPerformed

    private void txtApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApelidoActionPerformed

    private void txtEnderecoLocalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoLocalizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoLocalizacaoActionPerformed

    private void txtObservacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObservacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacaoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limparCampos(); //Chamada do metodo para limpar os campos.
        upDateDB(); 
        desabilitaCamposBotoes(); //Desabilitando Campos e Botões da tela de Cadastro
        txtData.setText(""); //Limpando o campo Data
        
        //Ação dos botões
        btVoltar.setEnabled(true);
        btNovo.setEnabled(true);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(conn,usuario,senha);
            
            try {                                                       
                pst = sqlConn.prepareStatement("INSERT INTO tb_localizacao(id," +
                                                                          "dt_cadastro," +
                                                                          "nome," +
                                                                          "apelido," +
                                                                          "endereco," +
                                                                          "posicao," +
                                                                          "telefone," +
                                                                          "ramal," +
                                                                          "celular," +
                                                                          "setorid," +
                                                                          "observacao," +
                                                                          "email) value(?,?,?,?,?,?,?,?,?,?,?,?)");
            } 
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir a Localização!!! \nTelaLocalização - erro: "+ex);
            }
            
            pst.setString(1, txtCodigo.getText());
            pst.setString(2, txtData.getText());
            pst.setString(3, txtNome.getText());
            pst.setString(4, txtApelido.getText());
            pst.setString(5, txtEnderecoLocalizacao.getText());
            pst.setString(6, txtPosicao.getText());
            pst.setString(7, txtTelefone.getText());
            pst.setString(8, txtRamal.getText());
            pst.setString(9, txtCelular.getText());
            pst.setString(10, (String) cbSetor.getSelectedItem());
            pst.setString(11, txtObservacao.getText());
            pst.setString(12, txtEmail.getText());
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Localização Adicionada com Sucesso!!!");
            upDateDB();
        
            } 
            catch (ClassNotFoundException e) {
                java.util.logging.Logger.getLogger(frmRegistrationCategory.class.getName()).log(
                java.util.logging.Level.SEVERE, null, e);
            } 
            catch (SQLException e) {
                java.util.logging.Logger.getLogger(frmRegistrationCategory.class.getName()).log(
                java.util.logging.Level.SEVERE, null, e);
            }         
        desabilitaCamposBotoes();

    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
    // Botão Apagar
    DefaultTableModel RecordTable = (DefaultTableModel)tbTabela.getModel();
    int SelectedRows = tbTabela.getSelectedRow();
        
        try {
            id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
            deleteitem = JOptionPane.showConfirmDialog(null, "Deseja apagar esta Localização?",
                                                        "Warning",JOptionPane.YES_NO_OPTION);
            
            if(deleteitem == JOptionPane.YES_NO_OPTION){
                Class.forName("com.mysql.jdbc.Driver");

                sqlConn = DriverManager.getConnection(conn, usuario, senha);

                pst = sqlConn.prepareStatement("DELETE FROM tb_localizacao WHERE id = ?");
                pst.setInt(1, id);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Localização apagada com Sucesso!!!");
                upDateDB();

                limparCampos();

                txtCodigo.requestFocus();
            }            
        }
        catch (ClassNotFoundException e) {
            java.util.logging.Logger.getLogger(frmRegistrationCategory.class.getName()).log(
            java.util.logging.Level.SEVERE, null, e);
        } 
        catch (SQLException e) {
            java.util.logging.Logger.getLogger(frmRegistrationCategory.class.getName()).log(
            java.util.logging.Level.SEVERE, null, e);
        }

    }//GEN-LAST:event_btExcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        upDateDB();  //Carregar a table
    }//GEN-LAST:event_formWindowActivated

    private void tbTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTabelaMouseClicked
        
        DefaultTableModel RecordTable = (DefaultTableModel)tbTabela.getModel();
        int SelectedRows = tbTabela.getSelectedRow();
        
        txtCodigo.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        txtData.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        txtNome.setText(RecordTable.getValueAt(SelectedRows, 2).toString()); 
        txtApelido.setText(RecordTable.getValueAt(SelectedRows, 3).toString()); 
        txtEnderecoLocalizacao.setText(RecordTable.getValueAt(SelectedRows, 4).toString()); 
        txtPosicao.setText(RecordTable.getValueAt(SelectedRows, 5).toString()); 
        txtTelefone.setText(RecordTable.getValueAt(SelectedRows, 6).toString()); 
        txtRamal.setText(RecordTable.getValueAt(SelectedRows, 7).toString()); 
        txtCelular.setText(RecordTable.getValueAt(SelectedRows, 8).toString()); 
        cbSetor.setSelectedItem(RecordTable.getValueAt(SelectedRows, 9).toString());
        txtObservacao.setText(RecordTable.getValueAt(SelectedRows, 10).toString()); 
        txtEmail.setText(RecordTable.getValueAt(SelectedRows, 11).toString()); 
        
        txtCodigo.setEnabled(true);
        txtData.setEnabled(true);
        txtNome.setEnabled(true);
        txtApelido.setEnabled(true);
        txtEnderecoLocalizacao.setEnabled(true);
        txtPosicao.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtRamal.setEnabled(true);
        txtCelular.setEnabled(true);
        cbSetor.setEnabled(true);
        txtObservacao.setEnabled(true);
        txtEmail.setEnabled(true);
        btNovo.setEnabled(false);
        btExcluir.setEnabled(true);
        btAlterar.setEnabled(true);
        btCancelar.setEnabled(true);
    }//GEN-LAST:event_tbTabelaMouseClicked

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
                //Botão Alterar
                Class.forName("com.mysql.jdbc.Driver");
                sqlConn = DriverManager.getConnection(conn,usuario,senha);

                pst = sqlConn.prepareStatement("UPDATE tb_localizacao SET dt_cadastro=?," +
                                                                          "nome=?," +
                                                                          "apelido=?," +
                                                                          "endereco=?," +
                                                                          "posicao=?," +
                                                                          "telefone=?," +
                                                                          "ramal=?," +
                                                                          "celular=?," +
                                                                          "setorid=?," +
                                                                          "observacao=?," +
                                                                          "email=? WHERE id=?");   
                
                pst.setString(1, txtData.getText());
                pst.setString(2, txtNome.getText());
                pst.setString(3, txtApelido.getText());
                pst.setString(4, txtEnderecoLocalizacao.getText());
                pst.setString(5, txtPosicao.getText());
                pst.setString(6, txtTelefone.getText());
                pst.setString(7, txtRamal.getText());
                pst.setString(8, txtCelular.getText());
                pst.setString(9, (String) cbSetor.getSelectedItem());
                pst.setString(10, txtObservacao.getText());
                pst.setString(11, txtEmail.getText());
                pst.setString(12, txtCodigo.getText());
                
                System.out.println(pst);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Endereço/Localização, alterada com Sucesso.");

                upDateDB();

                limparCampos();
                desabilitaCamposBotoes();
                btNovo.setEnabled(true);
                
            }
            catch (ClassNotFoundException e) {
                java.util.logging.Logger.getLogger(frmRegistrationCategory.class.getName()).log(
                java.util.logging.Level.SEVERE, null, e);
            } 
            catch (SQLException e) {
                java.util.logging.Logger.getLogger(frmRegistrationCategory.class.getName()).log(
                java.util.logging.Level.SEVERE, null, e);
            }        

    }//GEN-LAST:event_btAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistrationLocation().setVisible(true);
            }
        });
    }
    
    // <editor-fold defaultstate="collapsed" desc="Variables declaration - do not modify">                          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbSetor;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxSetorCadUsuario1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpPainelDadosResponsavel;
    private javax.swing.JPanel jpPainelLocalizacao;
    private javax.swing.JPanel jpPaineldeBotoes;
    private javax.swing.JPanel jpPaineldeLabels;
    private javax.swing.JLabel lbApelido;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEnderecoLocalizacao;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbObservacao;
    private javax.swing.JLabel lbPosicao;
    private javax.swing.JLabel lbRamal;
    private javax.swing.JLabel lbSetor;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTitulodoFrm;
    private javax.swing.JTable tbTabela;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnderecoLocalizacao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtObservacao;
    private javax.swing.JTextField txtPosicao;
    private javax.swing.JTextField txtRamal;
    private javax.swing.JFormattedTextField txtTelefone;
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
    
        txtCodigo.setText("");
        
        //Rotina para inserir a Data Atual
        Date data = new Date();
        String dia = ""+data.getDate();
        String mes = ""+String.valueOf(data.getMonth()+1);
        String ano = ""+(1900 + data.getYear());
            if(Integer.parseInt(mes)<=9)
                mes="0"+mes;
            if(Integer.parseInt(dia)<=9)
                dia="0"+dia;
            txtData.setText(dia+mes+ano);
        //Final da rotina de inserir a Data Atual
        txtTelefone.setEnabled(false);
        
        txtNome.setText("");
        txtApelido.setText("");
        txtEnderecoLocalizacao.setText("");

        txtPosicao.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        cbSetor.setSelectedIndex(0);
        txtObservacao.setText("");

        txtEmail.setText("");
        txtRamal.setText("");
    
    //Habilitando Botões Consultar Cep, Cancelar e Salvar...
    
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
    
        txtCodigo.setEnabled(false);
        txtTelefone.setEnabled(false);
                
        txtNome.setEnabled(false);
        txtApelido.setEnabled(false);

        txtEnderecoLocalizacao.setEnabled(false);
        txtPosicao.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtCelular.setEnabled(false);

        cbSetor.setEnabled(false);
        txtObservacao.setEnabled(false);
        txtEmail.setEnabled(false);
        txtRamal.setEnabled(false);
    
    //Desabilitando Botões...
        
        btAlterar.setEnabled(false);
        btCancelar.setEnabled(false);
        btExcluir.setEnabled(false);
        btSalvar.setEnabled(false);

    }//final do Metodo para desabilitar os campos e botões
    
    public void habilitaCamposBotoes(){
    /*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
    |* @author Alessandro de Sousa da Silva                                     |
    |* Data: 02/08/2021                                                         |
    |* Descrição: Desenvolvimento do Metodo para habilitar os campos da tela    |
    |* de cadastro.                                                             |
    |*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/    
        
    //Habilitando Campos...
    
        txtCodigo.setEnabled(true);
        txtTelefone.setEnabled(true);
                
        txtNome.setEnabled(true);
        txtApelido.setEnabled(true);

        txtEnderecoLocalizacao.setEnabled(true);
        txtPosicao.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtCelular.setEnabled(true);

        cbSetor.setEnabled(true);
        txtObservacao.setEnabled(true);
        txtEmail.setEnabled(true);
        txtRamal.setEnabled(true);
    
    }//final do Metodo para habilita os campos
}
