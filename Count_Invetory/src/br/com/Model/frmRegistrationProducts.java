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

public class frmRegistrationProducts extends javax.swing.JFrame {

    /**
     * Creates new form frmFornecedor
     */
    public frmRegistrationProducts() {
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
        lbDescricao = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        lbLocalizacao = new javax.swing.JLabel();
        lbPrecoCompra = new javax.swing.JLabel();
        lbTitulodoFrm = new javax.swing.JLabel();
        txtDescricaoReduzida = new javax.swing.JTextField();
        txtLocalizacao = new javax.swing.JTextField();
        jpPainelSobreProduto = new javax.swing.JPanel();
        lbUnidadeMedida = new javax.swing.JLabel();
        lbCategoria = new javax.swing.JLabel();
        lbCodigoFabricante = new javax.swing.JLabel();
        txtCodigoFabricante = new javax.swing.JTextField();
        cbCategoria = new javax.swing.JComboBox<>();
        lbEstoqueMaximo = new javax.swing.JLabel();
        txtEstoqueMaximo = new javax.swing.JTextField();
        lbEstoqueMinimo = new javax.swing.JLabel();
        txtEstoqueMinimo = new javax.swing.JTextField();
        txtUnidadeMedida = new javax.swing.JTextField();
        lbNCM = new javax.swing.JLabel();
        txtNCM = new javax.swing.JTextField();
        lbCodigoFornecedor = new javax.swing.JLabel();
        txtCodigoFornecedor = new javax.swing.JTextField();
        lbFornecedor = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        btConsultarFornecedor = new javax.swing.JButton();
        lbDescricaoReduzida = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtPrecoCompra = new javax.swing.JTextField();
        lbData = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        btCarregarImagemQRCode = new javax.swing.JButton();
        lbMargemLucro = new javax.swing.JLabel();
        txtMargemLucro = new javax.swing.JTextField();
        lbPrecoVenda = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JTextField();
        lbCentroCusto = new javax.swing.JLabel();
        txtImagemQRCode = new javax.swing.JTextField();
        lbStatusProduto = new javax.swing.JLabel();
        cbStatusProduto = new javax.swing.JComboBox<>();
        btCarregarImagemCodigoBarras = new javax.swing.JButton();
        txtCentroCusto = new javax.swing.JTextField();
        txtImagemCodigoBarras = new javax.swing.JTextField();
        lbCodigoBarras = new javax.swing.JLabel();
        txtCodigoBarras = new javax.swing.JTextField();
        txtSaldoEstoque = new javax.swing.JTextField();
        lbSaldoEstoque = new javax.swing.JLabel();
        btConsultarDescricao = new javax.swing.JButton();
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

        lbDescricao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbDescricao.setForeground(new java.awt.Color(204, 204, 204));
        lbDescricao.setText("Descrição*:");
        jpPaineldeLabels.add(lbDescricao);
        lbDescricao.setBounds(30, 70, 120, 19);

        lbCodigo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(204, 204, 204));
        lbCodigo.setText("Codigo:");
        jpPaineldeLabels.add(lbCodigo);
        lbCodigo.setBounds(530, 30, 70, 20);

        lbLocalizacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbLocalizacao.setForeground(new java.awt.Color(204, 204, 204));
        lbLocalizacao.setText(" Localização*:");
        jpPaineldeLabels.add(lbLocalizacao);
        lbLocalizacao.setBounds(60, 260, 110, 19);

        lbPrecoCompra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbPrecoCompra.setForeground(new java.awt.Color(204, 204, 204));
        lbPrecoCompra.setText(" Preço Compra*:");
        lbPrecoCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(lbPrecoCompra);
        lbPrecoCompra.setBounds(40, 290, 130, 30);

        lbTitulodoFrm.setFont(new java.awt.Font("Liebe finden", 1, 36)); // NOI18N
        lbTitulodoFrm.setForeground(new java.awt.Color(204, 204, 204));
        lbTitulodoFrm.setText("CADASTRO DOS PRODUTOS");
        jpPaineldeLabels.add(lbTitulodoFrm);
        lbTitulodoFrm.setBounds(10, 0, 530, 57);

        txtDescricaoReduzida.setBackground(new java.awt.Color(49, 65, 91));
        txtDescricaoReduzida.setForeground(new java.awt.Color(204, 204, 204));
        txtDescricaoReduzida.setToolTipText("Digite aqui o Nome / Apelido que deseja ser chamado. (* Campo Obrigatório)");
        txtDescricaoReduzida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtDescricaoReduzida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoReduzidaActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtDescricaoReduzida);
        txtDescricaoReduzida.setBounds(740, 60, 280, 30);

        txtLocalizacao.setBackground(new java.awt.Color(49, 65, 91));
        txtLocalizacao.setForeground(new java.awt.Color(204, 204, 204));
        txtLocalizacao.setToolTipText("Digite aqui o Endereço. (* Campo Obrigatório)");
        txtLocalizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtLocalizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalizacaoActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtLocalizacao);
        txtLocalizacao.setBounds(170, 250, 350, 30);

        jpPainelSobreProduto.setBackground(new java.awt.Color(49, 72, 93));
        jpPainelSobreProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sobre o Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jpPainelSobreProduto.setToolTipText("");
        jpPainelSobreProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelSobreProduto.setLayout(null);

        lbUnidadeMedida.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbUnidadeMedida.setForeground(new java.awt.Color(204, 204, 204));
        lbUnidadeMedida.setText("UM*:");
        lbUnidadeMedida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelSobreProduto.add(lbUnidadeMedida);
        lbUnidadeMedida.setBounds(530, 30, 60, 19);

        lbCategoria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCategoria.setForeground(new java.awt.Color(204, 204, 204));
        lbCategoria.setText("Categoria*:");
        lbCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelSobreProduto.add(lbCategoria);
        lbCategoria.setBounds(650, 19, 100, 30);

        lbCodigoFabricante.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCodigoFabricante.setForeground(new java.awt.Color(204, 204, 204));
        lbCodigoFabricante.setText("Cod Fabricante*:");
        lbCodigoFabricante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelSobreProduto.add(lbCodigoFabricante);
        lbCodigoFabricante.setBounds(10, 30, 130, 19);

        txtCodigoFabricante.setBackground(new java.awt.Color(49, 65, 91));
        txtCodigoFabricante.setForeground(new java.awt.Color(204, 204, 204));
        txtCodigoFabricante.setToolTipText("Digite aqui o Número de Registro. (* Campo Obrigatório)");
        txtCodigoFabricante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCodigoFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoFabricanteActionPerformed(evt);
            }
        });
        jpPainelSobreProduto.add(txtCodigoFabricante);
        txtCodigoFabricante.setBounds(140, 20, 150, 30);

        cbCategoria.setBackground(new java.awt.Color(49, 65, 91));
        cbCategoria.setForeground(new java.awt.Color(204, 204, 204));
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a Opção...", "Ativo", "Bloqueado", "Inativo", " " }));
        cbCategoria.setToolTipText("Selecione aqui o Status da conta do usuário.");
        cbCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });
        jpPainelSobreProduto.add(cbCategoria);
        cbCategoria.setBounds(740, 20, 240, 30);

        lbEstoqueMaximo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbEstoqueMaximo.setForeground(new java.awt.Color(204, 204, 204));
        lbEstoqueMaximo.setText("Estq. Max:");
        lbEstoqueMaximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelSobreProduto.add(lbEstoqueMaximo);
        lbEstoqueMaximo.setBounds(690, 70, 100, 19);

        txtEstoqueMaximo.setBackground(new java.awt.Color(49, 65, 91));
        txtEstoqueMaximo.setForeground(new java.awt.Color(204, 204, 204));
        txtEstoqueMaximo.setToolTipText("Digite aqui o Numero do endereço. (* Campo Obrigatório)");
        txtEstoqueMaximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelSobreProduto.add(txtEstoqueMaximo);
        txtEstoqueMaximo.setBounds(770, 60, 70, 30);

        lbEstoqueMinimo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbEstoqueMinimo.setForeground(new java.awt.Color(204, 204, 204));
        lbEstoqueMinimo.setText("Estq. Min:");
        lbEstoqueMinimo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelSobreProduto.add(lbEstoqueMinimo);
        lbEstoqueMinimo.setBounds(850, 70, 100, 19);

        txtEstoqueMinimo.setBackground(new java.awt.Color(49, 65, 91));
        txtEstoqueMinimo.setForeground(new java.awt.Color(204, 204, 204));
        txtEstoqueMinimo.setToolTipText("Digite aqui o Numero do endereço. (* Campo Obrigatório)");
        txtEstoqueMinimo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelSobreProduto.add(txtEstoqueMinimo);
        txtEstoqueMinimo.setBounds(920, 60, 60, 30);

        txtUnidadeMedida.setBackground(new java.awt.Color(49, 65, 91));
        txtUnidadeMedida.setForeground(new java.awt.Color(204, 204, 204));
        txtUnidadeMedida.setToolTipText("Digite aqui o Estado.  (* Campo Obrigatório)");
        txtUnidadeMedida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelSobreProduto.add(txtUnidadeMedida);
        txtUnidadeMedida.setBounds(570, 20, 50, 30);

        lbNCM.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNCM.setForeground(new java.awt.Color(204, 204, 204));
        lbNCM.setText("NCM*:");
        lbNCM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelSobreProduto.add(lbNCM);
        lbNCM.setBounds(310, 30, 60, 19);

        txtNCM.setBackground(new java.awt.Color(49, 65, 91));
        txtNCM.setForeground(new java.awt.Color(204, 204, 204));
        txtNCM.setToolTipText("Digite aqui o Estado.  (* Campo Obrigatório)");
        txtNCM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelSobreProduto.add(txtNCM);
        txtNCM.setBounds(360, 20, 140, 30);

        lbCodigoFornecedor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCodigoFornecedor.setForeground(new java.awt.Color(204, 204, 204));
        lbCodigoFornecedor.setText("Cod Fornecedor*:");
        lbCodigoFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelSobreProduto.add(lbCodigoFornecedor);
        lbCodigoFornecedor.setBounds(10, 70, 130, 19);

        txtCodigoFornecedor.setBackground(new java.awt.Color(49, 65, 91));
        txtCodigoFornecedor.setForeground(new java.awt.Color(204, 204, 204));
        txtCodigoFornecedor.setToolTipText("Digite aqui o Número de Registro. (* Campo Obrigatório)");
        txtCodigoFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCodigoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoFornecedorActionPerformed(evt);
            }
        });
        jpPainelSobreProduto.add(txtCodigoFornecedor);
        txtCodigoFornecedor.setBounds(140, 60, 80, 30);

        lbFornecedor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbFornecedor.setForeground(new java.awt.Color(204, 204, 204));
        lbFornecedor.setText("Fornec.*:");
        lbFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPainelSobreProduto.add(lbFornecedor);
        lbFornecedor.setBounds(240, 70, 130, 19);

        txtFornecedor.setBackground(new java.awt.Color(49, 65, 91));
        txtFornecedor.setForeground(new java.awt.Color(204, 204, 204));
        txtFornecedor.setToolTipText("Digite aqui o Número de Registro. (* Campo Obrigatório)");
        txtFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFornecedorActionPerformed(evt);
            }
        });
        jpPainelSobreProduto.add(txtFornecedor);
        txtFornecedor.setBounds(310, 60, 280, 30);

        btConsultarFornecedor.setBackground(new java.awt.Color(51, 51, 51));
        btConsultarFornecedor.setForeground(new java.awt.Color(204, 204, 204));
        btConsultarFornecedor.setMnemonic('c');
        btConsultarFornecedor.setText("Consulta");
        btConsultarFornecedor.setToolTipText("Clique aqui para Consultar o CEP.");
        btConsultarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarFornecedorActionPerformed(evt);
            }
        });
        jpPainelSobreProduto.add(btConsultarFornecedor);
        btConsultarFornecedor.setBounds(590, 60, 90, 30);

        jpPaineldeLabels.add(jpPainelSobreProduto);
        jpPainelSobreProduto.setBounds(30, 100, 990, 100);

        lbDescricaoReduzida.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbDescricaoReduzida.setForeground(new java.awt.Color(204, 204, 204));
        lbDescricaoReduzida.setText("Desc. Reduzida*:");
        jpPaineldeLabels.add(lbDescricaoReduzida);
        lbDescricaoReduzida.setBounds(620, 70, 140, 19);

        txtDescricao.setBackground(new java.awt.Color(49, 65, 91));
        txtDescricao.setForeground(new java.awt.Color(204, 204, 204));
        txtDescricao.setToolTipText("Digite aqui o Nome do usuário. (* Campo Obrigatório)");
        txtDescricao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(txtDescricao);
        txtDescricao.setBounds(120, 60, 390, 30);

        txtPrecoCompra.setBackground(new java.awt.Color(49, 65, 91));
        txtPrecoCompra.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecoCompra.setToolTipText("Digite aqui o Bairro.  (* Campo Obrigatório)");
        txtPrecoCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPrecoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoCompraActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtPrecoCompra);
        txtPrecoCompra.setBounds(170, 290, 110, 30);

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

        btCarregarImagemQRCode.setBackground(new java.awt.Color(51, 51, 51));
        btCarregarImagemQRCode.setForeground(new java.awt.Color(204, 204, 204));
        btCarregarImagemQRCode.setMnemonic('c');
        btCarregarImagemQRCode.setText("Carregar QRCode");
        btCarregarImagemQRCode.setToolTipText("Clique aqui para Consultar o CEP.");
        btCarregarImagemQRCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarregarImagemQRCodeActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(btCarregarImagemQRCode);
        btCarregarImagemQRCode.setBounds(790, 370, 230, 30);

        lbMargemLucro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbMargemLucro.setForeground(new java.awt.Color(204, 204, 204));
        lbMargemLucro.setText(" Margem Lucro*:");
        lbMargemLucro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(lbMargemLucro);
        lbMargemLucro.setBounds(300, 290, 130, 30);

        txtMargemLucro.setBackground(new java.awt.Color(49, 65, 91));
        txtMargemLucro.setForeground(new java.awt.Color(204, 204, 204));
        txtMargemLucro.setToolTipText("Digite aqui o Bairro.  (* Campo Obrigatório)");
        txtMargemLucro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtMargemLucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMargemLucroActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtMargemLucro);
        txtMargemLucro.setBounds(420, 290, 100, 30);

        lbPrecoVenda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbPrecoVenda.setForeground(new java.awt.Color(204, 204, 204));
        lbPrecoVenda.setText("   Preço Venda*:");
        lbPrecoVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(lbPrecoVenda);
        lbPrecoVenda.setBounds(40, 330, 130, 30);

        txtPrecoVenda.setBackground(new java.awt.Color(49, 65, 91));
        txtPrecoVenda.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecoVenda.setToolTipText("Digite aqui o Bairro.  (* Campo Obrigatório)");
        txtPrecoVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPrecoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoVendaActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtPrecoVenda);
        txtPrecoVenda.setBounds(170, 330, 110, 30);

        lbCentroCusto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCentroCusto.setForeground(new java.awt.Color(204, 204, 204));
        lbCentroCusto.setText("Centro de Custo*:");
        lbCentroCusto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(lbCentroCusto);
        lbCentroCusto.setBounds(290, 330, 130, 30);

        txtImagemQRCode.setBackground(new java.awt.Color(49, 65, 91));
        txtImagemQRCode.setForeground(new java.awt.Color(204, 204, 204));
        txtImagemQRCode.setToolTipText("Digite aqui o Bairro.  (* Campo Obrigatório)");
        txtImagemQRCode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtImagemQRCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImagemQRCodeActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtImagemQRCode);
        txtImagemQRCode.setBounds(790, 210, 230, 150);

        lbStatusProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbStatusProduto.setForeground(new java.awt.Color(204, 204, 204));
        lbStatusProduto.setText("Status do Produto:");
        jpPaineldeLabels.add(lbStatusProduto);
        lbStatusProduto.setBounds(20, 370, 130, 20);

        cbStatusProduto.setBackground(new java.awt.Color(49, 65, 91));
        cbStatusProduto.setForeground(new java.awt.Color(204, 204, 204));
        cbStatusProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a Opção...", "Ativo", "Bloqueado", "Inativo", " " }));
        cbStatusProduto.setToolTipText("Selecione aqui o Status da conta do usuário.");
        cbStatusProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbStatusProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusProdutoActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(cbStatusProduto);
        cbStatusProduto.setBounds(170, 370, 150, 30);

        btCarregarImagemCodigoBarras.setBackground(new java.awt.Color(51, 51, 51));
        btCarregarImagemCodigoBarras.setForeground(new java.awt.Color(204, 204, 204));
        btCarregarImagemCodigoBarras.setMnemonic('c');
        btCarregarImagemCodigoBarras.setText("Carregar Imagem");
        btCarregarImagemCodigoBarras.setToolTipText("Clique aqui para Consultar o CEP.");
        btCarregarImagemCodigoBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarregarImagemCodigoBarrasActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(btCarregarImagemCodigoBarras);
        btCarregarImagemCodigoBarras.setBounds(550, 370, 230, 30);

        txtCentroCusto.setBackground(new java.awt.Color(49, 65, 91));
        txtCentroCusto.setForeground(new java.awt.Color(204, 204, 204));
        txtCentroCusto.setToolTipText("Digite aqui o Bairro.  (* Campo Obrigatório)");
        txtCentroCusto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCentroCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCentroCustoActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtCentroCusto);
        txtCentroCusto.setBounds(420, 330, 100, 30);

        txtImagemCodigoBarras.setBackground(new java.awt.Color(49, 65, 91));
        txtImagemCodigoBarras.setForeground(new java.awt.Color(204, 204, 204));
        txtImagemCodigoBarras.setToolTipText("Digite aqui o Bairro.  (* Campo Obrigatório)");
        txtImagemCodigoBarras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtImagemCodigoBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImagemCodigoBarrasActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(txtImagemCodigoBarras);
        txtImagemCodigoBarras.setBounds(550, 210, 230, 150);

        lbCodigoBarras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCodigoBarras.setForeground(new java.awt.Color(204, 204, 204));
        lbCodigoBarras.setText("Codigo de Barras: ");
        lbCodigoBarras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(lbCodigoBarras);
        lbCodigoBarras.setBounds(40, 220, 140, 20);

        txtCodigoBarras.setBackground(new java.awt.Color(49, 65, 91));
        txtCodigoBarras.setForeground(new java.awt.Color(204, 204, 204));
        txtCodigoBarras.setToolTipText("Digite aqui o Numero do endereço. (* Campo Obrigatório)");
        txtCodigoBarras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(txtCodigoBarras);
        txtCodigoBarras.setBounds(170, 210, 350, 30);

        txtSaldoEstoque.setBackground(new java.awt.Color(49, 65, 91));
        txtSaldoEstoque.setForeground(new java.awt.Color(204, 204, 204));
        txtSaldoEstoque.setToolTipText("Digite aqui o Numero do endereço. (* Campo Obrigatório)");
        txtSaldoEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(txtSaldoEstoque);
        txtSaldoEstoque.setBounds(420, 370, 100, 30);

        lbSaldoEstoque.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbSaldoEstoque.setForeground(new java.awt.Color(204, 204, 204));
        lbSaldoEstoque.setText("Sld Estoque:");
        lbSaldoEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPaineldeLabels.add(lbSaldoEstoque);
        lbSaldoEstoque.setBounds(330, 380, 110, 19);

        btConsultarDescricao.setBackground(new java.awt.Color(51, 51, 51));
        btConsultarDescricao.setForeground(new java.awt.Color(204, 204, 204));
        btConsultarDescricao.setMnemonic('c');
        btConsultarDescricao.setText("Consulta");
        btConsultarDescricao.setToolTipText("Clique aqui para Consultar o CEP.");
        btConsultarDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarDescricaoActionPerformed(evt);
            }
        });
        jpPaineldeLabels.add(btConsultarDescricao);
        btConsultarDescricao.setBounds(510, 60, 90, 30);

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
        jScrollPane1.setBounds(0, 410, 1040, 160);

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

    private void txtPrecoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoCompraActionPerformed

    private void txtCodigoFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoFabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoFabricanteActionPerformed

    private void txtLocalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalizacaoActionPerformed

    private void btConsultarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarFornecedorActionPerformed
        

    }//GEN-LAST:event_btConsultarFornecedorActionPerformed

    private void cbStatusProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusProdutoActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        
        limparCampos(); //Chamada do metodo para limpar os campos.
        habilitaCamposBotoes(); //Chamada do metodo para habilitar os campos.
        
    }//GEN-LAST:event_btNovoActionPerformed

    private void txtDescricaoReduzidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoReduzidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoReduzidaActionPerformed

    private void btCarregarImagemQRCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarregarImagemQRCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCarregarImagemQRCodeActionPerformed

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void txtMargemLucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMargemLucroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMargemLucroActionPerformed

    private void txtPrecoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoVendaActionPerformed

    private void txtImagemQRCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImagemQRCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImagemQRCodeActionPerformed

    private void btCarregarImagemCodigoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarregarImagemCodigoBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCarregarImagemCodigoBarrasActionPerformed

    private void txtCentroCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCentroCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCentroCustoActionPerformed

    private void txtImagemCodigoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImagemCodigoBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImagemCodigoBarrasActionPerformed

    private void txtCodigoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoFornecedorActionPerformed

    private void txtFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFornecedorActionPerformed

    private void btConsultarDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btConsultarDescricaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistrationProducts().setVisible(true);
            }
        });
    }
    
    // <editor-fold defaultstate="collapsed" desc="Variables declaration - do not modify">                          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCarregarImagemCodigoBarras;
    private javax.swing.JButton btCarregarImagemQRCode;
    private javax.swing.JButton btConsultarDescricao;
    private javax.swing.JButton btConsultarFornecedor;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbStatusProduto;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxSetorCadUsuario1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpPainelSobreProduto;
    private javax.swing.JPanel jpPaineldeBotoes;
    private javax.swing.JPanel jpPaineldeLabels;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbCentroCusto;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbCodigoBarras;
    private javax.swing.JLabel lbCodigoFabricante;
    private javax.swing.JLabel lbCodigoFornecedor;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbDescricaoReduzida;
    private javax.swing.JLabel lbEstoqueMaximo;
    private javax.swing.JLabel lbEstoqueMinimo;
    private javax.swing.JLabel lbFornecedor;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbLocalizacao;
    private javax.swing.JLabel lbMargemLucro;
    private javax.swing.JLabel lbNCM;
    private javax.swing.JLabel lbPrecoCompra;
    private javax.swing.JLabel lbPrecoVenda;
    private javax.swing.JLabel lbSaldoEstoque;
    private javax.swing.JLabel lbStatusProduto;
    private javax.swing.JLabel lbTitulodoFrm;
    private javax.swing.JLabel lbUnidadeMedida;
    private javax.swing.JTable tbTabela;
    private javax.swing.JTextField txtCentroCusto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoBarras;
    private javax.swing.JTextField txtCodigoFabricante;
    private javax.swing.JTextField txtCodigoFornecedor;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDescricaoReduzida;
    private javax.swing.JTextField txtEstoqueMaximo;
    private javax.swing.JTextField txtEstoqueMinimo;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtImagemCodigoBarras;
    private javax.swing.JTextField txtImagemQRCode;
    private javax.swing.JTextField txtLocalizacao;
    private javax.swing.JTextField txtMargemLucro;
    private javax.swing.JTextField txtNCM;
    private javax.swing.JTextField txtPrecoCompra;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtSaldoEstoque;
    private javax.swing.JTextField txtUnidadeMedida;
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
        
        txtDescricao.setText("");
        txtDescricaoReduzida.setText("");

        txtCodigoFabricante.setText("");
        txtUnidadeMedida.setText("");
        txtNCM.setText("");
        cbCategoria.setSelectedIndex(0);
        
        txtCodigoFornecedor.setText("");
        txtFornecedor.setText("");
        txtEstoqueMaximo.setText("");
        txtEstoqueMinimo.setText("");
        
        txtCodigoBarras.setText("");
        txtLocalizacao.setText("");
        txtPrecoCompra.setText("");
        txtMargemLucro.setText("");
        txtPrecoVenda.setText("");
        txtCentroCusto.setText("");
        txtSaldoEstoque.setText("");
        cbStatusProduto.setSelectedIndex(0);
        
        txtImagemCodigoBarras.setText("");
        txtImagemQRCode.setText("");
                   
    //Habilitando Botões Consultar Cep, Cancelar e Salvar...
    
        btConsultarFornecedor.setEnabled(true);
        btConsultarFornecedor.setEnabled(true);
        btCarregarImagemCodigoBarras.setEnabled(true);
        btCarregarImagemQRCode.setEnabled(true);
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
    
        txtDescricao.setEnabled(false);
        txtDescricaoReduzida.setEnabled(false);

        txtCodigoFabricante.setEnabled(false);
        txtUnidadeMedida.setEnabled(false);
        txtNCM.setEnabled(false);
        cbCategoria.setEnabled(false);
        
        txtCodigoFornecedor.setEnabled(false);
        txtFornecedor.setEnabled(false);
        txtEstoqueMaximo.setEnabled(false);
        txtEstoqueMinimo.setEnabled(false);
        
        txtCodigoBarras.setEnabled(false);
        txtLocalizacao.setEnabled(false);
        txtPrecoCompra.setEnabled(false);
        txtMargemLucro.setEnabled(false);
        txtPrecoVenda.setEnabled(false);
        txtCentroCusto.setEnabled(false);
        txtSaldoEstoque.setEnabled(false);
        cbStatusProduto.setEnabled(false);
        
        txtImagemCodigoBarras.setEnabled(false);
        txtImagemQRCode.setEnabled(false);
            
    //Desabilitando Botões...
        
        btConsultarFornecedor.setEnabled(false);
        btConsultarDescricao.setEnabled(false);
        btCarregarImagemCodigoBarras.setEnabled(false);
        btCarregarImagemQRCode.setEnabled(false);
        
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
                
        txtDescricao.setEnabled(true);
        txtDescricaoReduzida.setEnabled(true);

        txtCodigoFabricante.setEnabled(true);
        txtUnidadeMedida.setEnabled(true);
        txtNCM.setEnabled(true);
        cbCategoria.setEnabled(true);
        
        txtCodigoFornecedor.setEnabled(true);
        txtFornecedor.setEnabled(true);
        txtEstoqueMaximo.setEnabled(true);
        txtEstoqueMinimo.setEnabled(true);
        
        txtCodigoBarras.setEnabled(true);
        txtLocalizacao.setEnabled(true);
        txtPrecoCompra.setEnabled(true);
        txtMargemLucro.setEnabled(true);
        txtPrecoVenda.setEnabled(true);
        txtCentroCusto.setEnabled(true);
        txtSaldoEstoque.setEnabled(true);
        cbStatusProduto.setEnabled(true);
        
        txtImagemCodigoBarras.setEnabled(true);
        txtImagemQRCode.setEnabled(true);
        
    }//final do Metodo para habilitar os campos
     
}
