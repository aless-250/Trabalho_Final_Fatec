package br.com.Model;

import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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

public class frmRegistrationUser extends javax.swing.JFrame {

    /**
     * Creates new form frmFornecedor
     */
    public frmRegistrationUser() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTabela = new javax.swing.JTable();
        jpPaineldeLabels = new javax.swing.JPanel();
        lbRedeSocial = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbBairro = new javax.swing.JLabel();
        lbCep = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        lbTitulodoFrm = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbNumero = new javax.swing.JLabel();
        txtNomeSocial = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jpPainelDocumentos = new javax.swing.JPanel();
        lbCpf = new javax.swing.JLabel();
        lbCartTrabalho = new javax.swing.JLabel();
        lbRg = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbNumRegistro = new javax.swing.JLabel();
        lbCelular = new javax.swing.JLabel();
        txtNumRegistro = new javax.swing.JTextField();
        txtCartTrabalho = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        txtRg = new javax.swing.JFormattedTextField();
        lbNomeSocial = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        jpPainelDadosAdmissao = new javax.swing.JPanel();
        cbNivelAcesso = new javax.swing.JComboBox<>();
        cbStatus = new javax.swing.JComboBox<>();
        txtCargo = new javax.swing.JTextField();
        lbCargo = new javax.swing.JLabel();
        lbNivelAcesso = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        txtRedeSocial = new javax.swing.JTextField();
        btConsultarCep = new javax.swing.JButton();
        txtCep = new javax.swing.JFormattedTextField();
        lbEstado1 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        lbData = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
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

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 430, 1040, 140);

        jpPaineldeLabels.setBackground(new java.awt.Color(49, 72, 93));
        jpPaineldeLabels.setToolTipText("Cadastro de Usuário.");
        jpPaineldeLabels.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.setLayout(null);

        lbRedeSocial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbRedeSocial.setForeground(new java.awt.Color(204, 204, 204));
        lbRedeSocial.setText("Rede Social:");
        lbRedeSocial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(lbRedeSocial);
        lbRedeSocial.setBounds(20, 390, 110, 19);

        lbNome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNome.setForeground(new java.awt.Color(204, 204, 204));
        lbNome.setText("Nome*:");
        jpPaineldeLabels.add(lbNome);
        lbNome.setBounds(30, 70, 120, 19);

        lbCodigo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(204, 204, 204));
        lbCodigo.setText("Codigo:");
        jpPaineldeLabels.add(lbCodigo);
        lbCodigo.setBounds(530, 30, 70, 20);

        lbEndereco.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbEndereco.setForeground(new java.awt.Color(204, 204, 204));
        lbEndereco.setText(" Endereço*:");
        jpPaineldeLabels.add(lbEndereco);
        lbEndereco.setBounds(280, 220, 90, 19);

        lbBairro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbBairro.setForeground(new java.awt.Color(204, 204, 204));
        lbBairro.setText("Bairro*:");
        lbBairro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(lbBairro);
        lbBairro.setBounds(20, 260, 80, 19);

        lbCep.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCep.setForeground(new java.awt.Color(204, 204, 204));
        lbCep.setText(" CEP*:");
        jpPaineldeLabels.add(lbCep);
        lbCep.setBounds(28, 220, 60, 19);

        lbCidade.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCidade.setForeground(new java.awt.Color(204, 204, 204));
        lbCidade.setText("Cidade*:");
        jpPaineldeLabels.add(lbCidade);
        lbCidade.setBounds(300, 260, 90, 19);

        lbTitulodoFrm.setFont(new java.awt.Font("Liebe finden", 1, 36)); // NOI18N
        lbTitulodoFrm.setForeground(new java.awt.Color(204, 204, 204));
        lbTitulodoFrm.setText("CADASTRO DOS USUÁRIOS");
        jpPaineldeLabels.add(lbTitulodoFrm);
        lbTitulodoFrm.setBounds(10, 0, 530, 57);

        lbEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(204, 204, 204));
        lbEmail.setText(" E-Mail:");
        jpPaineldeLabels.add(lbEmail);
        lbEmail.setBounds(630, 390, 60, 19);

        lbNumero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNumero.setForeground(new java.awt.Color(204, 204, 204));
        lbNumero.setText("Número*:");
        jpPaineldeLabels.add(lbNumero);
        lbNumero.setBounds(720, 220, 80, 20);

        txtNomeSocial.setBackground(new java.awt.Color(49, 65, 91));
        txtNomeSocial.setForeground(new java.awt.Color(204, 204, 204));
        txtNomeSocial.setToolTipText("Digite aqui o Nome / Apelido que deseja ser chamado. (* Campo Obrigatório)");
        txtNomeSocial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNomeSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeSocialActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtNomeSocial);
        txtNomeSocial.setBounds(740, 60, 280, 30);

        txtEndereco.setBackground(new java.awt.Color(49, 65, 91));
        txtEndereco.setForeground(new java.awt.Color(204, 204, 204));
        txtEndereco.setToolTipText("Digite aqui o Endereço. (* Campo Obrigatório)");
        txtEndereco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtEndereco);
        txtEndereco.setBounds(370, 210, 340, 30);

        txtCidade.setBackground(new java.awt.Color(49, 65, 91));
        txtCidade.setForeground(new java.awt.Color(204, 204, 204));
        txtCidade.setToolTipText("Digite aqui a Cidade. (* Campo Obrigatório)");
        txtCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(txtCidade);
        txtCidade.setBounds(370, 250, 340, 30);

        txtNumero.setBackground(new java.awt.Color(49, 65, 91));
        txtNumero.setForeground(new java.awt.Color(204, 204, 204));
        txtNumero.setToolTipText("Digite aqui o Numero do endereço. (* Campo Obrigatório)");
        txtNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(txtNumero);
        txtNumero.setBounds(790, 210, 60, 30);

        txtEmail.setBackground(new java.awt.Color(49, 65, 91));
        txtEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtEmail.setToolTipText("Digite aqui o E-mail.");
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(txtEmail);
        txtEmail.setBounds(700, 380, 320, 30);

        jpPainelDocumentos.setBackground(new java.awt.Color(49, 72, 93));
        jpPainelDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Documentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jpPainelDocumentos.setToolTipText("");
        jpPainelDocumentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDocumentos.setLayout(null);

        lbCpf.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCpf.setForeground(new java.awt.Color(204, 204, 204));
        lbCpf.setText("CPF*:");
        lbCpf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDocumentos.add(lbCpf);
        lbCpf.setBounds(150, 70, 60, 20);

        lbCartTrabalho.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCartTrabalho.setForeground(new java.awt.Color(204, 204, 204));
        lbCartTrabalho.setText("Cart. Trabalho*:");
        lbCartTrabalho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDocumentos.add(lbCartTrabalho);
        lbCartTrabalho.setBounds(380, 30, 140, 19);

        lbRg.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbRg.setForeground(new java.awt.Color(204, 204, 204));
        lbRg.setText("RG*:");
        lbRg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDocumentos.add(lbRg);
        lbRg.setBounds(720, 30, 50, 19);

        lbTelefone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbTelefone.setForeground(new java.awt.Color(204, 204, 204));
        lbTelefone.setText("  Telefone:");
        lbTelefone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDocumentos.add(lbTelefone);
        lbTelefone.setBounds(410, 70, 90, 19);

        lbNumRegistro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNumRegistro.setForeground(new java.awt.Color(204, 204, 204));
        lbNumRegistro.setText("Num. Registro*:");
        lbNumRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDocumentos.add(lbNumRegistro);
        lbNumRegistro.setBounds(80, 30, 110, 19);

        lbCelular.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCelular.setForeground(new java.awt.Color(204, 204, 204));
        lbCelular.setText("Celular:");
        lbCelular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDocumentos.add(lbCelular);
        lbCelular.setBounds(700, 70, 80, 20);

        txtNumRegistro.setBackground(new java.awt.Color(49, 65, 91));
        txtNumRegistro.setForeground(new java.awt.Color(204, 204, 204));
        txtNumRegistro.setToolTipText("Digite aqui o Número de Registro. (* Campo Obrigatório)");
        txtNumRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNumRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumRegistroActionPerformed(evt);
            }
        });
        jpPainelDocumentos.add(txtNumRegistro);
        txtNumRegistro.setBounds(200, 20, 130, 30);

        txtCartTrabalho.setBackground(new java.awt.Color(49, 65, 91));
        txtCartTrabalho.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txtCartTrabalho.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.### - #####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCartTrabalho.setToolTipText("Digite aqui o Número da Carteira de Trabalho. (* Campo Obrigatório)");
        txtCartTrabalho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDocumentos.add(txtCartTrabalho);
        txtCartTrabalho.setBounds(500, 20, 130, 30);

        txtCpf.setBackground(new java.awt.Color(49, 65, 91));
        txtCpf.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setToolTipText("Digite aqui o Número do CPF. (* Campo Obrigatório)");
        txtCpf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDocumentos.add(txtCpf);
        txtCpf.setBounds(200, 60, 130, 30);

        txtTelefone.setBackground(new java.awt.Color(49, 65, 91));
        txtTelefone.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setToolTipText("Digite aqui o número de Telefone.");
        txtTelefone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDocumentos.add(txtTelefone);
        txtTelefone.setBounds(500, 60, 130, 30);

        txtCelular.setBackground(new java.awt.Color(49, 65, 91));
        txtCelular.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setToolTipText("Digite aqui o número do telefone Celular.");
        txtCelular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });
        jpPainelDocumentos.add(txtCelular);
        txtCelular.setBounds(760, 60, 130, 30);

        txtRg.setBackground(new java.awt.Color(49, 65, 91));
        txtRg.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRg.setToolTipText("Digite aqui o Número do RG. (* Campo Obrigatório)");
        txtRg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDocumentos.add(txtRg);
        txtRg.setBounds(760, 20, 130, 30);

        jpPaineldeLabels.add(jpPainelDocumentos);
        jpPainelDocumentos.setBounds(30, 100, 990, 100);

        lbNomeSocial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNomeSocial.setForeground(new java.awt.Color(204, 204, 204));
        lbNomeSocial.setText("Nome Social*:");
        jpPaineldeLabels.add(lbNomeSocial);
        lbNomeSocial.setBounds(640, 70, 120, 19);

        txtNome.setBackground(new java.awt.Color(49, 65, 91));
        txtNome.setForeground(new java.awt.Color(204, 204, 204));
        txtNome.setToolTipText("Digite aqui o Nome do usuário. (* Campo Obrigatório)");
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(txtNome);
        txtNome.setBounds(90, 60, 500, 30);

        txtBairro.setBackground(new java.awt.Color(49, 65, 91));
        txtBairro.setForeground(new java.awt.Color(204, 204, 204));
        txtBairro.setToolTipText("Digite aqui o Bairro.  (* Campo Obrigatório)");
        txtBairro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtBairro);
        txtBairro.setBounds(80, 250, 210, 30);

        jpPainelDadosAdmissao.setBackground(new java.awt.Color(49, 72, 93));
        jpPainelDadosAdmissao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da Admissão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jpPainelDadosAdmissao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbNivelAcesso.setBackground(new java.awt.Color(49, 65, 91));
        cbNivelAcesso.setForeground(new java.awt.Color(204, 204, 204));
        cbNivelAcesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a Opção...", "Usuário - N1", "Usuário Avançado", "Administrador", " " }));
        cbNivelAcesso.setToolTipText("Selecione aqui o Nivel de Acesso do usuário.");
        cbNivelAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNivelAcessoActionPerformed(evt);
            }
        });

        cbStatus.setBackground(new java.awt.Color(49, 65, 91));
        cbStatus.setForeground(new java.awt.Color(204, 204, 204));
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a Opção...", "Ativo", "Bloqueado", "Inativo", " " }));
        cbStatus.setToolTipText("Selecione aqui o Status da conta do usuário.");
        cbStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

        txtCargo.setBackground(new java.awt.Color(49, 65, 91));
        txtCargo.setForeground(new java.awt.Color(204, 204, 204));
        txtCargo.setToolTipText("Digite aqui o Cargo.");
        txtCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbCargo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCargo.setForeground(new java.awt.Color(204, 204, 204));
        lbCargo.setText("Cargo:");
        lbCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbNivelAcesso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNivelAcesso.setForeground(new java.awt.Color(204, 204, 204));
        lbNivelAcesso.setText("Nivel de Acesso:");
        lbNivelAcesso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbStatus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(204, 204, 204));
        lbStatus.setText("Status:");

        javax.swing.GroupLayout jpPainelDadosAdmissaoLayout = new javax.swing.GroupLayout(jpPainelDadosAdmissao);
        jpPainelDadosAdmissao.setLayout(jpPainelDadosAdmissaoLayout);
        jpPainelDadosAdmissaoLayout.setHorizontalGroup(
            jpPainelDadosAdmissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelDadosAdmissaoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lbNivelAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbNivelAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jpPainelDadosAdmissaoLayout.setVerticalGroup(
            jpPainelDadosAdmissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelDadosAdmissaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPainelDadosAdmissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpPainelDadosAdmissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNivelAcesso)
                        .addComponent(cbNivelAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbCargo))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jpPaineldeLabels.add(jpPainelDadosAdmissao);
        jpPainelDadosAdmissao.setBounds(30, 290, 990, 80);

        txtRedeSocial.setBackground(new java.awt.Color(49, 65, 91));
        txtRedeSocial.setForeground(new java.awt.Color(204, 204, 204));
        txtRedeSocial.setToolTipText("Digite aqui a Rede Social (Facebook, Instagram, Linkdin...).");
        txtRedeSocial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtRedeSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRedeSocialActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtRedeSocial);
        txtRedeSocial.setBounds(110, 380, 410, 30);

        btConsultarCep.setBackground(new java.awt.Color(51, 51, 51));
        btConsultarCep.setForeground(new java.awt.Color(204, 204, 204));
        btConsultarCep.setMnemonic('c');
        btConsultarCep.setText("Consulta");
        btConsultarCep.setToolTipText("Clique aqui para Consultar o CEP.");
        btConsultarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarCepActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(btConsultarCep);
        btConsultarCep.setBounds(170, 210, 90, 30);

        txtCep.setBackground(new java.awt.Color(49, 65, 91));
        txtCep.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setToolTipText("Digite aqui o número do CEP e clique no botão de pesquisa para consultar. (* Campo Obrigatório)");
        txtCep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtCep);
        txtCep.setBounds(80, 210, 90, 30);

        lbEstado1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbEstado1.setForeground(new java.awt.Color(204, 204, 204));
        lbEstado1.setText("Estado*:");
        jpPaineldeLabels.add(lbEstado1);
        lbEstado1.setBounds(890, 220, 80, 20);

        txtEstado.setBackground(new java.awt.Color(49, 65, 91));
        txtEstado.setForeground(new java.awt.Color(204, 204, 204));
        txtEstado.setToolTipText("Digite aqui o Estado.  (* Campo Obrigatório)");
        txtEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(txtEstado);
        txtEstado.setBounds(950, 210, 70, 30);

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
        this.dispose(); //fecha somente o jFrame do frmRegistrationUser
         
    }//GEN-LAST:event_btVoltarActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtNumRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumRegistroActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void btConsultarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarCepActionPerformed
    /*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
    |* @author Alessandro de Sousa da Silva                                     |
    |* Data: 02/08/2021                                                         |
    |* Descrição: Desenvolvimento do Metodo para buscar o endereço atraves da   |
     * consulta do web service da ViaCep.                                       |
    |* de cadastro dos usuários.                                                |
    |*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/    

        ViaCEP viaCep = new ViaCEP();

        try {
           viaCep.buscar(txtCep.getText());
           txtEndereco.setText(viaCep.getLogradouro());
           txtBairro.setText(viaCep.getBairro());
           txtCidade.setText(viaCep.getLocalidade());
           txtEstado.setText(viaCep.getUf());
                 
           
       } catch (ViaCEPException ex) {
               Logger.getLogger(frmRegistrationUser.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null, "Cep informado não encontrado!!! \n Tente novamente.");
               limparCampos();
        }

    }//GEN-LAST:event_btConsultarCepActionPerformed

    private void txtRedeSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRedeSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRedeSocialActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusActionPerformed

    private void cbNivelAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNivelAcessoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNivelAcessoActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        
        limparCampos(); //Chamada do metodo para limpar os campos.
        habilitaCamposBotoes(); //Chamada do metodo para habilitar os campos.
        
    }//GEN-LAST:event_btNovoActionPerformed

    private void txtNomeSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeSocialActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistrationUser().setVisible(true);
            }
        });
    }
    
    // <editor-fold defaultstate="collapsed" desc="Variables declaration - do not modify">                          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConsultarCep;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbNivelAcesso;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxSetorCadUsuario1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpPainelDadosAdmissao;
    private javax.swing.JPanel jpPainelDocumentos;
    private javax.swing.JPanel jpPaineldeBotoes;
    private javax.swing.JPanel jpPaineldeLabels;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbCartTrabalho;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbEstado1;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbNivelAcesso;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNomeSocial;
    private javax.swing.JLabel lbNumRegistro;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbRedeSocial;
    private javax.swing.JLabel lbRg;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTitulodoFrm;
    private javax.swing.JTable tbTabela;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JFormattedTextField txtCartTrabalho;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeSocial;
    private javax.swing.JTextField txtNumRegistro;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRedeSocial;
    private javax.swing.JFormattedTextField txtRg;
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
            txtData.setText(dia+mes+ano);
        //Final da rotina de inserir a Data Atual
        txtData.setEnabled(false);
        
        txtNome.setText("");
        txtNomeSocial.setText("");

        txtNumRegistro.setText("");
        txtRg.setText("");
        txtCpf.setText("");
        txtCartTrabalho.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");

        txtCep.setText("");
        txtEndereco.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtNumero.setText("");
        txtEstado.setText("");

        txtCargo.setText("");
        cbNivelAcesso.setSelectedIndex(0);
        cbStatus.setSelectedIndex(0);

        txtEmail.setText("");
        txtRedeSocial.setText("");
    
    //Habilitando Botões Consultar Cep, Cancelar e Salvar...
    
        btConsultarCep.setEnabled(true);
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
        txtData.setEnabled(false);
                
        txtNome.setEnabled(false);
        txtNomeSocial.setEnabled(false);

        txtNumRegistro.setEnabled(false);
        txtRg.setEnabled(false);
        txtCpf.setEnabled(false);
        txtCartTrabalho.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtCelular.setEnabled(false);

        txtCep.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNumero.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCidade.setEnabled(false);
        txtNumero.setEnabled(false);
        txtEstado.setEnabled(false);

        txtCargo.setEnabled(false);
        cbNivelAcesso.setEnabled(false);
        cbStatus.setEnabled(false);

        txtEmail.setEnabled(false);
        txtRedeSocial.setEnabled(false);
    
    //Desabilitando Botões...
        
        btConsultarCep.setEnabled(false);
        
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
        txtData.setEnabled(true);
                
        txtNome.setEnabled(true);
        txtNomeSocial.setEnabled(true);

        txtNumRegistro.setEnabled(true);
        txtRg.setEnabled(true);
        txtCpf.setEnabled(true);
        txtCartTrabalho.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtCelular.setEnabled(true);

        txtCep.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtNumero.setEnabled(true);
        txtBairro.setEnabled(true);
        txtCidade.setEnabled(true);
        txtNumero.setEnabled(true);
        txtEstado.setEnabled(true);

        txtCargo.setEnabled(true);
        cbNivelAcesso.setEnabled(true);
        cbStatus.setEnabled(true);

        txtEmail.setEnabled(true);
        txtRedeSocial.setEnabled(true);
    
    }//final do Metodo para habilitar os campos
     
}
