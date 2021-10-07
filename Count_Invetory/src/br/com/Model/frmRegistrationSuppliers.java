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

public class frmRegistrationSuppliers extends javax.swing.JFrame {

    /**
     * Creates new form frmFornecedor
     */
    public frmRegistrationSuppliers() {
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
        lbRazaoSocial = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbBairro = new javax.swing.JLabel();
        lbCep = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        lbTitulodoFrm = new javax.swing.JLabel();
        lbNumero = new javax.swing.JLabel();
        txtNomeFantasia = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jpPainelDocumentos = new javax.swing.JPanel();
        lbCnpj = new javax.swing.JLabel();
        lbIscricaoEstadual = new javax.swing.JLabel();
        lbDataInicioAtividades = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JFormattedTextField();
        txtIscricaoEstadual = new javax.swing.JFormattedTextField();
        txtDataInicioAtividades = new javax.swing.JFormattedTextField();
        lbNomeFantasia = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        jpPainelDados = new javax.swing.JPanel();
        txtTelefone01 = new javax.swing.JTextField();
        lbTelefone01 = new javax.swing.JLabel();
        lbTelefone02 = new javax.swing.JLabel();
        txtTelefone02 = new javax.swing.JTextField();
        lbNomeContato = new javax.swing.JLabel();
        txtNomeContato = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtRedeSocial = new javax.swing.JTextField();
        lbRedeSocial = new javax.swing.JLabel();
        lbSite = new javax.swing.JLabel();
        txtSite = new javax.swing.JTextField();
        lbObservacao = new javax.swing.JLabel();
        txtObservacao = new javax.swing.JTextField();
        btConsultarRazaoSocial = new javax.swing.JButton();
        txtCep = new javax.swing.JFormattedTextField();
        lbEstado1 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        lbData = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTabela = new javax.swing.JTable();
        lbSituacao = new javax.swing.JLabel();
        cbSituacao = new javax.swing.JComboBox<>();
        btConsultarCep = new javax.swing.JButton();
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
        setTitle("Sistema Guaxinim - Cadastro de Fornecedor");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jpPaineldeLabels.setBackground(new java.awt.Color(49, 72, 93));
        jpPaineldeLabels.setToolTipText("Cadastro de Usuário.");
        jpPaineldeLabels.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.setLayout(null);

        lbRazaoSocial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbRazaoSocial.setForeground(new java.awt.Color(204, 204, 204));
        lbRazaoSocial.setText("Razão Social*:");
        jpPaineldeLabels.add(lbRazaoSocial);
        lbRazaoSocial.setBounds(30, 70, 120, 19);

        lbCodigo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(204, 204, 204));
        lbCodigo.setText("Codigo:");
        jpPaineldeLabels.add(lbCodigo);
        lbCodigo.setBounds(560, 30, 70, 20);

        lbEndereco.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbEndereco.setForeground(new java.awt.Color(204, 204, 204));
        lbEndereco.setText(" Endereço*:");
        jpPaineldeLabels.add(lbEndereco);
        lbEndereco.setBounds(280, 190, 90, 19);

        lbBairro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbBairro.setForeground(new java.awt.Color(204, 204, 204));
        lbBairro.setText("Bairro*:");
        lbBairro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(lbBairro);
        lbBairro.setBounds(20, 230, 80, 19);

        lbCep.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCep.setForeground(new java.awt.Color(204, 204, 204));
        lbCep.setText(" CEP*:");
        jpPaineldeLabels.add(lbCep);
        lbCep.setBounds(30, 190, 60, 19);

        lbCidade.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCidade.setForeground(new java.awt.Color(204, 204, 204));
        lbCidade.setText("Cidade*:");
        jpPaineldeLabels.add(lbCidade);
        lbCidade.setBounds(410, 230, 90, 19);

        lbTitulodoFrm.setFont(new java.awt.Font("Liebe finden", 1, 36)); // NOI18N
        lbTitulodoFrm.setForeground(new java.awt.Color(204, 204, 204));
        lbTitulodoFrm.setText("CADASTRO DOS FORNECEDORES");
        jpPaineldeLabels.add(lbTitulodoFrm);
        lbTitulodoFrm.setBounds(10, 0, 530, 57);

        lbNumero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNumero.setForeground(new java.awt.Color(204, 204, 204));
        lbNumero.setText("Número*:");
        jpPaineldeLabels.add(lbNumero);
        lbNumero.setBounds(720, 190, 80, 20);

        txtNomeFantasia.setBackground(new java.awt.Color(49, 65, 91));
        txtNomeFantasia.setForeground(new java.awt.Color(204, 204, 204));
        txtNomeFantasia.setToolTipText("Digite aqui o Nome Fantasia. (* Campo Obrigatório)");
        txtNomeFantasia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFantasiaActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtNomeFantasia);
        txtNomeFantasia.setBounds(740, 60, 280, 30);

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
        txtEndereco.setBounds(370, 180, 340, 30);

        txtCidade.setBackground(new java.awt.Color(49, 65, 91));
        txtCidade.setForeground(new java.awt.Color(204, 204, 204));
        txtCidade.setToolTipText("Digite aqui a Cidade. (* Campo Obrigatório)");
        txtCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(txtCidade);
        txtCidade.setBounds(480, 220, 230, 30);

        txtNumero.setBackground(new java.awt.Color(49, 65, 91));
        txtNumero.setForeground(new java.awt.Color(204, 204, 204));
        txtNumero.setToolTipText("Digite aqui o Numero do endereço. (* Campo Obrigatório)");
        txtNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(txtNumero);
        txtNumero.setBounds(790, 180, 60, 30);

        jpPainelDocumentos.setBackground(new java.awt.Color(49, 72, 93));
        jpPainelDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Documentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jpPainelDocumentos.setToolTipText("");
        jpPainelDocumentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDocumentos.setLayout(null);

        lbCnpj.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCnpj.setForeground(new java.awt.Color(204, 204, 204));
        lbCnpj.setText("CNPJ*:");
        lbCnpj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDocumentos.add(lbCnpj);
        lbCnpj.setBounds(120, 30, 70, 20);

        lbIscricaoEstadual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbIscricaoEstadual.setForeground(new java.awt.Color(204, 204, 204));
        lbIscricaoEstadual.setText("Inscr.Estadual*:");
        lbIscricaoEstadual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDocumentos.add(lbIscricaoEstadual);
        lbIscricaoEstadual.setBounds(340, 30, 120, 19);

        lbDataInicioAtividades.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbDataInicioAtividades.setForeground(new java.awt.Color(204, 204, 204));
        lbDataInicioAtividades.setText("Data de inicio das Atividades*:");
        lbDataInicioAtividades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDocumentos.add(lbDataInicioAtividades);
        lbDataInicioAtividades.setBounds(620, 30, 220, 20);

        txtCnpj.setBackground(new java.awt.Color(49, 65, 91));
        txtCnpj.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpj.setToolTipText("Digite aqui o Número do CNPJ. (* Campo Obrigatório)");
        txtCnpj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDocumentos.add(txtCnpj);
        txtCnpj.setBounds(180, 20, 130, 30);

        txtIscricaoEstadual.setBackground(new java.awt.Color(49, 65, 91));
        txtIscricaoEstadual.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txtIscricaoEstadual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIscricaoEstadual.setToolTipText("Digite aqui o número da Inscrição Estadual.");
        txtIscricaoEstadual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelDocumentos.add(txtIscricaoEstadual);
        txtIscricaoEstadual.setBounds(460, 20, 130, 30);

        txtDataInicioAtividades.setBackground(new java.awt.Color(49, 65, 91));
        txtDataInicioAtividades.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txtDataInicioAtividades.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataInicioAtividades.setToolTipText("Digite aqui a Data de Inicio das Atividades da empresa.");
        txtDataInicioAtividades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtDataInicioAtividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataInicioAtividadesActionPerformed(evt);
            }
        });
        jpPainelDocumentos.add(txtDataInicioAtividades);
        txtDataInicioAtividades.setBounds(840, 20, 130, 30);

        jpPaineldeLabels.add(jpPainelDocumentos);
        jpPainelDocumentos.setBounds(30, 100, 990, 70);

        lbNomeFantasia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNomeFantasia.setForeground(new java.awt.Color(204, 204, 204));
        lbNomeFantasia.setText("Nome Fantasia*:");
        jpPaineldeLabels.add(lbNomeFantasia);
        lbNomeFantasia.setBounds(620, 70, 140, 19);

        txtRazaoSocial.setBackground(new java.awt.Color(49, 65, 91));
        txtRazaoSocial.setForeground(new java.awt.Color(204, 204, 204));
        txtRazaoSocial.setToolTipText("Digite aqui a Razão Social. (* Campo Obrigatório)");
        txtRazaoSocial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(txtRazaoSocial);
        txtRazaoSocial.setBounds(130, 60, 370, 30);

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
        txtBairro.setBounds(80, 220, 300, 30);

        jpPainelDados.setBackground(new java.awt.Color(49, 72, 93));
        jpPainelDados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados de Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jpPainelDados.setToolTipText("Aqui você irá digitar os dados para contato.");
        jpPainelDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtTelefone01.setBackground(new java.awt.Color(49, 65, 91));
        txtTelefone01.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefone01.setToolTipText("Digite aqui o Telefone01.");
        txtTelefone01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbTelefone01.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbTelefone01.setForeground(new java.awt.Color(204, 204, 204));
        lbTelefone01.setText("Telefone01*:");
        lbTelefone01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbTelefone02.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbTelefone02.setForeground(new java.awt.Color(204, 204, 204));
        lbTelefone02.setText("Telefone02*:");
        lbTelefone02.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtTelefone02.setBackground(new java.awt.Color(49, 65, 91));
        txtTelefone02.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefone02.setToolTipText("Digite aqui o Telefone02.");
        txtTelefone02.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTelefone02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefone02ActionPerformed(evt);
            }
        });

        lbNomeContato.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNomeContato.setForeground(new java.awt.Color(204, 204, 204));
        lbNomeContato.setText("Nome do Contato*:");
        lbNomeContato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtNomeContato.setBackground(new java.awt.Color(49, 65, 91));
        txtNomeContato.setForeground(new java.awt.Color(204, 204, 204));
        txtNomeContato.setToolTipText("Digite aqui o Nome do Contato com a Empresa.");
        txtNomeContato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtEmail.setBackground(new java.awt.Color(49, 65, 91));
        txtEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtEmail.setToolTipText("Digite aqui o E-mail.");
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(204, 204, 204));
        lbEmail.setText(" E-Mail:");

        txtRedeSocial.setBackground(new java.awt.Color(49, 65, 91));
        txtRedeSocial.setForeground(new java.awt.Color(204, 204, 204));
        txtRedeSocial.setToolTipText("Digite aqui a Rede Social da Empresa (Facebook, Instagram, Linkdin...).");
        txtRedeSocial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtRedeSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRedeSocialActionPerformed(evt);
            }
        });

        lbRedeSocial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbRedeSocial.setForeground(new java.awt.Color(204, 204, 204));
        lbRedeSocial.setText("    Rede Social:");
        lbRedeSocial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbSite.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbSite.setForeground(new java.awt.Color(204, 204, 204));
        lbSite.setText("     Site:");

        txtSite.setBackground(new java.awt.Color(49, 65, 91));
        txtSite.setForeground(new java.awt.Color(204, 204, 204));
        txtSite.setToolTipText("Digite aqui o E-mail.");
        txtSite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbObservacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbObservacao.setForeground(new java.awt.Color(204, 204, 204));
        lbObservacao.setText("   Observação:");
        lbObservacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtObservacao.setBackground(new java.awt.Color(49, 65, 91));
        txtObservacao.setForeground(new java.awt.Color(204, 204, 204));
        txtObservacao.setToolTipText("Digite aqui uma Observação.");
        txtObservacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtObservacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObservacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPainelDadosLayout = new javax.swing.GroupLayout(jpPainelDados);
        jpPainelDados.setLayout(jpPainelDadosLayout);
        jpPainelDadosLayout.setHorizontalGroup(
            jpPainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPainelDadosLayout.createSequentialGroup()
                .addGroup(jpPainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPainelDadosLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lbSite, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSite, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lbObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtObservacao))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPainelDadosLayout.createSequentialGroup()
                        .addGroup(jpPainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPainelDadosLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(lbTelefone01, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpPainelDadosLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPainelDadosLayout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(lbRedeSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRedeSocial))
                            .addGroup(jpPainelDadosLayout.createSequentialGroup()
                                .addComponent(txtTelefone01, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(lbTelefone02, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone02, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(lbNomeContato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        jpPainelDadosLayout.setVerticalGroup(
            jpPainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelDadosLayout.createSequentialGroup()
                .addGroup(jpPainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefone02)
                    .addComponent(txtTelefone01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefone01)
                    .addComponent(lbNomeContato))
                .addGap(17, 17, 17)
                .addGroup(jpPainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbEmail)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbRedeSocial)
                        .addComponent(txtRedeSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jpPainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbSite)
                        .addComponent(txtSite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbObservacao)
                        .addComponent(txtObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jpPaineldeLabels.add(jpPainelDados);
        jpPainelDados.setBounds(30, 260, 990, 160);

        btConsultarRazaoSocial.setBackground(new java.awt.Color(51, 51, 51));
        btConsultarRazaoSocial.setForeground(new java.awt.Color(204, 204, 204));
        btConsultarRazaoSocial.setMnemonic('n');
        btConsultarRazaoSocial.setText("Consulta");
        btConsultarRazaoSocial.setToolTipText("Clique aqui para Consultar a Razão Social.");
        btConsultarRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarRazaoSocialActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(btConsultarRazaoSocial);
        btConsultarRazaoSocial.setBounds(510, 60, 90, 30);

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
        txtCep.setBounds(80, 180, 90, 30);

        lbEstado1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbEstado1.setForeground(new java.awt.Color(204, 204, 204));
        lbEstado1.setText("Estado*:");
        jpPaineldeLabels.add(lbEstado1);
        lbEstado1.setBounds(890, 190, 80, 20);

        txtEstado.setBackground(new java.awt.Color(49, 65, 91));
        txtEstado.setForeground(new java.awt.Color(204, 204, 204));
        txtEstado.setToolTipText("Digite aqui o Estado.  (* Campo Obrigatório)");
        txtEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(txtEstado);
        txtEstado.setBounds(950, 180, 70, 30);

        lbData.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbData.setForeground(new java.awt.Color(204, 204, 204));
        lbData.setText("Data Cadastro:");
        jpPaineldeLabels.add(lbData);
        lbData.setBounds(780, 30, 140, 20);

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
        jScrollPane1.setBounds(0, 470, 1020, 90);

        lbSituacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbSituacao.setForeground(new java.awt.Color(204, 204, 204));
        lbSituacao.setText("Situação*:");
        lbSituacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(lbSituacao);
        lbSituacao.setBounds(730, 430, 120, 30);

        cbSituacao.setBackground(new java.awt.Color(49, 65, 91));
        cbSituacao.setForeground(new java.awt.Color(204, 204, 204));
        cbSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a Opção...", "Ativo", "Inativo", "Inativo - Inadimplente", "Inativo - com Restrição", " " }));
        cbSituacao.setToolTipText("Selecione aqui a Situação da Empresa como Fornecedor.");
        cbSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSituacaoActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(cbSituacao);
        cbSituacao.setBounds(810, 430, 210, 30);

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
        btConsultarCep.setBounds(170, 180, 90, 30);

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

        setBounds(250, 55, 1070, 640);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose(); //fecha somente o jFrame do frmRegistrationUser
         
    }//GEN-LAST:event_btVoltarActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtDataInicioAtividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataInicioAtividadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataInicioAtividadesActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void btConsultarRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarRazaoSocialActionPerformed
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
               Logger.getLogger(frmRegistrationSuppliers.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null, "Cep informado não encontrado!!! \n Tente novamente.");
               limparCampos();
        }

    }//GEN-LAST:event_btConsultarRazaoSocialActionPerformed

    private void txtRedeSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRedeSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRedeSocialActionPerformed

    private void cbSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSituacaoActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        
        limparCampos(); //Chamada do metodo para limpar os campos.
        habilitaCamposBotoes(); //Chamada do metodo para habilitar os campos.
        
    }//GEN-LAST:event_btNovoActionPerformed

    private void txtNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFantasiaActionPerformed

    private void txtObservacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObservacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacaoActionPerformed

    private void btConsultarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btConsultarCepActionPerformed

    private void txtTelefone02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefone02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone02ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistrationSuppliers().setVisible(true);
            }
        });
    }
    
    // <editor-fold defaultstate="collapsed" desc="Variables declaration - do not modify">                          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConsultarCep;
    private javax.swing.JButton btConsultarRazaoSocial;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbSituacao;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxSetorCadUsuario1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpPainelDados;
    private javax.swing.JPanel jpPainelDocumentos;
    private javax.swing.JPanel jpPaineldeBotoes;
    private javax.swing.JPanel jpPaineldeLabels;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCnpj;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbDataInicioAtividades;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbEstado1;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbIscricaoEstadual;
    private javax.swing.JLabel lbNomeContato;
    private javax.swing.JLabel lbNomeFantasia;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbObservacao;
    private javax.swing.JLabel lbRazaoSocial;
    private javax.swing.JLabel lbRedeSocial;
    private javax.swing.JLabel lbSite;
    private javax.swing.JLabel lbSituacao;
    private javax.swing.JLabel lbTelefone01;
    private javax.swing.JLabel lbTelefone02;
    private javax.swing.JLabel lbTitulodoFrm;
    private javax.swing.JTable tbTabela;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtDataInicioAtividades;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JFormattedTextField txtIscricaoEstadual;
    private javax.swing.JTextField txtNomeContato;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtObservacao;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtRedeSocial;
    private javax.swing.JTextField txtSite;
    private javax.swing.JTextField txtTelefone01;
    private javax.swing.JTextField txtTelefone02;
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
        
        txtRazaoSocial.setText("");
        txtNomeFantasia.setText("");

        txtCnpj.setText("");
        txtIscricaoEstadual.setText("");
        txtDataInicioAtividades.setText("");

        txtCep.setText("");
        txtEndereco.setText("");
        txtNumero.setText("");
        txtCidade.setText("");
        txtNumero.setText("");
        txtEstado.setText("");

        txtTelefone01.setText("");
        txtTelefone02.setText("");
        txtNomeContato.setText("");
        txtEmail.setText("");
        txtRedeSocial.setText("");
        txtSite.setText("");
        txtObservacao.setText("");
        
        cbSituacao.setSelectedIndex(0);
        
    //Habilitando Botões Consultar Cep, Cancelar e Salvar...
    
        btConsultarRazaoSocial.setEnabled(true);
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
                
        txtRazaoSocial.setEnabled(false);
        txtNomeFantasia.setEnabled(false);

        txtCnpj.setEnabled(false);
        txtIscricaoEstadual.setEnabled(false);
        txtDataInicioAtividades.setEnabled(false);

        txtCep.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNumero.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCidade.setEnabled(false);
        txtNumero.setEnabled(false);
        txtEstado.setEnabled(false);

        txtTelefone01.setEnabled(false);
        txtTelefone02.setEnabled(false);
        txtNomeContato.setEnabled(false);
        txtEmail.setEnabled(false);
        txtRedeSocial.setEnabled(false);
        txtSite.setEnabled(false);
        txtObservacao.setEnabled(false);
        
        cbSituacao.setEnabled(false);
   
    //Desabilitando Botões...
        
        btConsultarRazaoSocial.setEnabled(false);
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
                
        txtRazaoSocial.setEnabled(true);
        txtNomeFantasia.setEnabled(true);

        txtCnpj.setEnabled(true);
        txtIscricaoEstadual.setEnabled(true);
        txtDataInicioAtividades.setEnabled(true);

        txtCep.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtNumero.setEnabled(true);
        txtBairro.setEnabled(true);
        txtCidade.setEnabled(true);
        txtNumero.setEnabled(true);
        txtEstado.setEnabled(true);

        txtTelefone01.setEnabled(true);
        txtTelefone02.setEnabled(true);
        txtEmail.setEnabled(true);
        txtRedeSocial.setEnabled(true);
        txtSite.setEnabled(true);
        txtObservacao.setEnabled(true);
        
        cbSituacao.setEnabled(true);
            
    }//final do Metodo para habilitar os campos
     
}
