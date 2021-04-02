package visao;

/**
 *Sistema de Cadastro - Tela Cad Pessoa Fisica
 *Aula de Linguagem de Programação III
 *@author Alessandro de Sousa da Silva
 *@since Criada em 25/03/2021 as 10:00
 */

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class FramePessoaJuridica extends javax.swing.JFrame {
//Cria um objeto do tipo Cliente sem nenhum dado atribuido / Uso do contrutor vazio
ClientePJ clientePJ = new ClientePJ();    
SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); //Cria um objeto formatador para a Data de Nascimento
 
/**
 *Sistema de Cadastro - Tela Inicial
 *Aula de Linguagem de Programação III
 *@author Alessandro de Sousa da Silva
 *@since Criada em 25/03/2021 as 10:00
 */
    
    public FramePessoaJuridica() {
        initComponents();
        //Adiciona Icone na barra de titulo
        URL iconeImagem = getClass().getResource("/imagem/iconePrincipal.png");
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

        buttonGroupoSexoCadPJ = new javax.swing.ButtonGroup();
        jLabelImagemFundoBordaPaineisCadPJ = new javax.swing.JLabel();
        jPanelTelaCadastroPj = new javax.swing.JPanel();
        lbEnderecoCadPJ = new javax.swing.JLabel();
        txNomeCadPJ = new javax.swing.JTextField();
        txEnderecoCadPJ = new javax.swing.JTextField();
        lbRazaoSocialCadPJ = new javax.swing.JLabel();
        lbDtInauguracaoCadPJ = new javax.swing.JLabel();
        lbSexoCadPJ = new javax.swing.JLabel();
        txNomeCidadeCadPJ = new javax.swing.JTextField();
        lbEstadoCadCadPJ = new javax.swing.JLabel();
        cbEstadoCadPJ = new javax.swing.JComboBox<>();
        lbCidadeCadPJ = new javax.swing.JLabel();
        jRadioButtonMasculinoCadPJ = new javax.swing.JRadioButton();
        jRadioButtonFemininoCadPJ = new javax.swing.JRadioButton();
        jLNumeroCadPJ = new javax.swing.JLabel();
        txNumeroCadPJ = new javax.swing.JTextField();
        jFormattedTextFieldDtINascimentoCadPJ = new javax.swing.JFormattedTextField();
        jLCNPJCadPJ = new javax.swing.JLabel();
        jFCNPJCadPJ = new javax.swing.JFormattedTextField();
        jlCapitalGiroCadPJ = new javax.swing.JLabel();
        jtRendaCadPJ = new javax.swing.JTextField();
        jPanelCadastroPJ2 = new javax.swing.JPanel();
        jCheckBoxLeituraCadPJ = new javax.swing.JCheckBox();
        jCheckBoxFutebolCadPJ = new javax.swing.JCheckBox();
        jCheckBoxPescariaCadPJ = new javax.swing.JCheckBox();
        jCheckBoxDancaCadPJ = new javax.swing.JCheckBox();
        jCheckBoxGamesCadPJ = new javax.swing.JCheckBox();
        jCheckBoxCorrerCadPJ = new javax.swing.JCheckBox();
        jCheckBoxCozinharCadPJ = new javax.swing.JCheckBox();
        jCheckBoxMusicaCadPJ = new javax.swing.JCheckBox();
        jbTituloCadPJ = new javax.swing.JLabel();
        jPanelBotoesCadPJ = new javax.swing.JPanel();
        btSalvarCadPJ = new javax.swing.JButton();
        btConsultarCadPJ = new javax.swing.JButton();
        btEditarCadPJ = new javax.swing.JButton();
        btExcluirCadPJ = new javax.swing.JButton();
        btSairCadPJ = new javax.swing.JButton();
        jLImgFundoCadPJ = new javax.swing.JLabel();

        jLabelImagemFundoBordaPaineisCadPJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/TalaFundoCadPaineis.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FATEC Linguagem de Programação III  - Sistema de Cadastro");
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanelTelaCadastroPj.setBackground(new java.awt.Color(222, 222, 210));
        jPanelTelaCadastroPj.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lbEnderecoCadPJ.setText("Endereço:.");

        txNomeCadPJ.setToolTipText("Digite aqui a Razão Social da empresa.");
        txNomeCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNomeCadPJActionPerformed(evt);
            }
        });

        txEnderecoCadPJ.setToolTipText("Digite aqui o Endereço da empresa.");
        txEnderecoCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEnderecoCadPJActionPerformed(evt);
            }
        });

        lbRazaoSocialCadPJ.setText("Razão Social:.");

        lbDtInauguracaoCadPJ.setText("Dt. Inauguração:.");

        lbSexoCadPJ.setText("Sexo:.");

        txNomeCidadeCadPJ.setToolTipText("Digite aqui a Cidade da empresa.");
        txNomeCidadeCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNomeCidadeCadPJActionPerformed(evt);
            }
        });

        lbEstadoCadCadPJ.setText("Estado:.");

        cbEstadoCadPJ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "AC - Acre", "AL - Alagoas", "AP - Amapá", "AM - Amazonas", "BA - Bahia ", "CE - Ceará", "DF - Distrito Federal", "ES - Espírito Santo", "GO - Goiás", "MA - Maranhão", "MT - Mato Grosso", "MS - Mato Grosso do Sul", "MG - Minas Gerais", "PA - Pará", "PB - Paraíba", "PR - Paraná", "PE - Pernambuco", "PI - Piauí", "RR - Roraima", "RO - Rondônia", "RJ - Rio de Janeiro", "RN - Rio Grande do Norte", "RS - Rio Grande do Sul", "SC - Santa Catarina", "SP - São Paulo", "SE - Sergipe", "TO - Tocantins" }));
        cbEstadoCadPJ.setToolTipText("Selecione aqui o Estado da empresa.");

        lbCidadeCadPJ.setText("Cidade:.");

        buttonGroupoSexoCadPJ.add(jRadioButtonMasculinoCadPJ);
        jRadioButtonMasculinoCadPJ.setText("Masculino");
        jRadioButtonMasculinoCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMasculinoCadPJActionPerformed(evt);
            }
        });

        buttonGroupoSexoCadPJ.add(jRadioButtonFemininoCadPJ);
        jRadioButtonFemininoCadPJ.setText("Feminino");
        jRadioButtonFemininoCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemininoCadPJActionPerformed(evt);
            }
        });

        jLNumeroCadPJ.setText("Numero:.");

        txNumeroCadPJ.setToolTipText("Digite aqui o Numero do endereço da empresa.");
        txNumeroCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNumeroCadPJActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldDtINascimentoCadPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDtINascimentoCadPJ.setToolTipText("Digite aqui a Data de Inauguração da empresa.");

        jLCNPJCadPJ.setText("CNPJ:.");

        try {
            jFCNPJCadPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCNPJCadPJ.setText("  .   .   /    - ");
        jFCNPJCadPJ.setToolTipText("Digite aqui o CNPJ da empresa.");

        jlCapitalGiroCadPJ.setText("Renda:.");

        jtRendaCadPJ.setToolTipText("Digite aqui a Renda Mensal da empresa.");

        javax.swing.GroupLayout jPanelTelaCadastroPjLayout = new javax.swing.GroupLayout(jPanelTelaCadastroPj);
        jPanelTelaCadastroPj.setLayout(jPanelTelaCadastroPjLayout);
        jPanelTelaCadastroPjLayout.setHorizontalGroup(
            jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lbSexoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonMasculinoCadPJ)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonFemininoCadPJ)
                        .addGap(18, 18, 18)
                        .addComponent(jlCapitalGiroCadPJ)
                        .addGap(8, 8, 8)
                        .addComponent(jtRendaCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jLCNPJCadPJ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFCNPJCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                        .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCidadeCadPJ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbEnderecoCadPJ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaCadastroPjLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbRazaoSocialCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txNomeCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txEnderecoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNomeCidadeCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbEstadoCadCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLNumeroCadPJ)))
                            .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbDtInauguracaoCadPJ)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txNumeroCadPJ, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldDtINascimentoCadPJ, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbEstadoCadPJ, 0, 173, Short.MAX_VALUE))))
                .addGap(42, 42, Short.MAX_VALUE))
        );
        jPanelTelaCadastroPjLayout.setVerticalGroup(
            jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldDtINascimentoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNumeroCadPJ)
                            .addComponent(txNumeroCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEstadoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEstadoCadCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                        .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txNomeCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbRazaoSocialCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDtInauguracaoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txEnderecoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEnderecoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txNomeCidadeCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCidadeCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFCNPJCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCNPJCadPJ)))
                    .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtRendaCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCapitalGiroCadPJ)
                            .addComponent(jRadioButtonFemininoCadPJ)
                            .addComponent(jRadioButtonMasculinoCadPJ)
                            .addComponent(lbSexoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanelTelaCadastroPj);
        jPanelTelaCadastroPj.setBounds(0, 40, 830, 190);

        jPanelCadastroPJ2.setBackground(new java.awt.Color(222, 222, 210));
        jPanelCadastroPJ2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hobbies do Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jCheckBoxLeituraCadPJ.setText("Leitura");

        jCheckBoxFutebolCadPJ.setText("Futebol");

        jCheckBoxPescariaCadPJ.setText("Pescaria");

        jCheckBoxDancaCadPJ.setText("Dança");

        jCheckBoxGamesCadPJ.setText("Games");

        jCheckBoxCorrerCadPJ.setText("Correr");

        jCheckBoxCozinharCadPJ.setText("Cozinhar");

        jCheckBoxMusicaCadPJ.setText("Musica");

        javax.swing.GroupLayout jPanelCadastroPJ2Layout = new javax.swing.GroupLayout(jPanelCadastroPJ2);
        jPanelCadastroPJ2.setLayout(jPanelCadastroPJ2Layout);
        jPanelCadastroPJ2Layout.setHorizontalGroup(
            jPanelCadastroPJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroPJ2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelCadastroPJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxLeituraCadPJ)
                    .addComponent(jCheckBoxGamesCadPJ))
                .addGap(163, 163, 163)
                .addGroup(jPanelCadastroPJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxFutebolCadPJ)
                    .addComponent(jCheckBoxCorrerCadPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(jPanelCadastroPJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxPescariaCadPJ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBoxCozinharCadPJ, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(166, 166, 166)
                .addGroup(jPanelCadastroPJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxDancaCadPJ)
                    .addComponent(jCheckBoxMusicaCadPJ))
                .addGap(27, 27, 27))
        );
        jPanelCadastroPJ2Layout.setVerticalGroup(
            jPanelCadastroPJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroPJ2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroPJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxDancaCadPJ)
                    .addComponent(jCheckBoxPescariaCadPJ)
                    .addComponent(jCheckBoxFutebolCadPJ)
                    .addComponent(jCheckBoxLeituraCadPJ))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroPJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxGamesCadPJ)
                    .addComponent(jCheckBoxCorrerCadPJ)
                    .addComponent(jCheckBoxCozinharCadPJ)
                    .addComponent(jCheckBoxMusicaCadPJ))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCadastroPJ2);
        jPanelCadastroPJ2.setBounds(0, 240, 831, 100);

        jbTituloCadPJ.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbTituloCadPJ.setText("Tela de Cadastro de Clientes Pessoa Juridica ");
        getContentPane().add(jbTituloCadPJ);
        jbTituloCadPJ.setBounds(31, 12, 410, 24);

        jPanelBotoesCadPJ.setBackground(new java.awt.Color(222, 222, 210));
        jPanelBotoesCadPJ.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btSalvarCadPJ.setText("Salvar");
        btSalvarCadPJ.setToolTipText("Use para Salvar o dado em memoria.");
        btSalvarCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarCadPJActionPerformed(evt);
            }
        });

        btConsultarCadPJ.setText("Consultar");
        btConsultarCadPJ.setToolTipText("Use para Editar o dado em memoria.");
        btConsultarCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarCadPJActionPerformed(evt);
            }
        });

        btEditarCadPJ.setText("Editar");
        btEditarCadPJ.setToolTipText("Use para Editar o dado em memoria.");
        btEditarCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarCadPJActionPerformed(evt);
            }
        });

        btExcluirCadPJ.setText("Excluir");
        btExcluirCadPJ.setToolTipText("Use para Excluir o dado em memoria.");
        btExcluirCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirCadPJActionPerformed(evt);
            }
        });

        btSairCadPJ.setText("Voltar");
        btSairCadPJ.setToolTipText("Use para Voltar para a Tela Principal.");
        btSairCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairCadPJActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesCadPJLayout = new javax.swing.GroupLayout(jPanelBotoesCadPJ);
        jPanelBotoesCadPJ.setLayout(jPanelBotoesCadPJLayout);
        jPanelBotoesCadPJLayout.setHorizontalGroup(
            jPanelBotoesCadPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesCadPJLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btSalvarCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btConsultarCadPJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEditarCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluirCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(btSairCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBotoesCadPJLayout.setVerticalGroup(
            jPanelBotoesCadPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesCadPJLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotoesCadPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultarCadPJ)
                    .addComponent(btExcluirCadPJ)
                    .addComponent(btEditarCadPJ)
                    .addComponent(btSalvarCadPJ)
                    .addComponent(btSairCadPJ))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBotoesCadPJ);
        jPanelBotoesCadPJ.setBounds(0, 340, 831, 50);

        jLImgFundoCadPJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/TalaFundoCad.jpg"))); // NOI18N
        getContentPane().add(jLImgFundoCadPJ);
        jLImgFundoCadPJ.setBounds(0, 0, 840, 530);

        setSize(new java.awt.Dimension(836, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarCadPJActionPerformed
        //Codigo do botão Salva em memoria
        clientePJ.setRazaosocial(txNomeCadPJ.getText());
    try {
        clientePJ.setInauguracao(formato.parse(jFormattedTextFieldDtINascimentoCadPJ.getText()));
        } 
        catch (ParseException ex) {
            Logger.getLogger(FramePessoaJuridica.class.getName()).log(Level.SEVERE, null, ex);
        }
        clientePJ.setEndereço(txEnderecoCadPJ.getText());
        clientePJ.setNumeroEndereço(Integer.parseInt(txNumeroCadPJ.getText())); //Use o Parse para fazer a conversão para Inteiro
        clientePJ.setCidade(txNomeCidadeCadPJ.getText());
        clientePJ.setUf((String) cbEstadoCadPJ.getSelectedItem()); //Pega o item selecionado da Combo Box
        clientePJ.setCnpj(jFCNPJCadPJ.getText());
        clientePJ.setSexo(jRadioButtonMasculinoCadPJ.isSelected() == true?"Masculino":"Feminino"); //Tratamento do RadioButton
        clientePJ.setRenda(Float.parseFloat(jtRendaCadPJ.getText()));
        clientePJ.setLeitura(jCheckBoxLeituraCadPJ.isSelected());
        clientePJ.setFutebol(jCheckBoxFutebolCadPJ.isSelected());
        clientePJ.setPescaria(jCheckBoxPescariaCadPJ.isSelected());
        clientePJ.setDanca(jCheckBoxDancaCadPJ.isSelected());
        clientePJ.setMusica(jCheckBoxMusicaCadPJ.isSelected());
        clientePJ.setVedeogame(jCheckBoxGamesCadPJ.isSelected());
        clientePJ.setCorrida(jCheckBoxCorrerCadPJ.isSelected());
        clientePJ.setCozinhar(jCheckBoxCozinharCadPJ.isSelected());
        
        JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso no objeto que está sendo instanciado na memória.");
        
        limparCampos();//Metodo para limpar todos os campos do frame
    }//GEN-LAST:event_btSalvarCadPJActionPerformed

    private void txNomeCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomeCadPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomeCadPJActionPerformed

    private void txEnderecoCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEnderecoCadPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txEnderecoCadPJActionPerformed

    private void txNomeCidadeCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomeCidadeCadPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomeCidadeCadPJActionPerformed

    private void jRadioButtonFemininoCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemininoCadPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFemininoCadPJActionPerformed

    private void txNumeroCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNumeroCadPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNumeroCadPJActionPerformed

    private void btConsultarCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarCadPJActionPerformed
        // Metodo para recuperar o dado em memoria
        txNomeCadPJ.setText(clientePJ.getRazaosocial());
        txNomeCadPJ.setEnabled(false);//Trava o campo - Não Editavel
        
        jFormattedTextFieldDtINascimentoCadPJ.setText(formato.format(clientePJ.getInauguracao()));
        jFormattedTextFieldDtINascimentoCadPJ.setEnabled(false);//Trava o campo - Não Editavel
        
        txEnderecoCadPJ.setText(clientePJ.getEndereço());
        txEnderecoCadPJ.setEnabled(false);//Trava o campo - Não Editavel
        
        txNumeroCadPJ.setText(String.valueOf(clientePJ.getNumeroEndereço()));
        txNumeroCadPJ.setEnabled(false);//Trava o campo - Não Editavel
                
        txNomeCidadeCadPJ.setText(clientePJ.getCidade());
        txNomeCidadeCadPJ.setEnabled(false);//Trava o campo - Não Editavel
                
        cbEstadoCadPJ.setSelectedItem(clientePJ.getUf());
        cbEstadoCadPJ.setEnabled(false);//Trava o campo - Não Editavel
                
        jFCNPJCadPJ.setText(clientePJ.getCnpj());
        jFCNPJCadPJ.setEnabled(false);//Trava o campo - Não Editavel
                
        jRadioButtonMasculinoCadPJ.setSelected("Masculino".equals(clientePJ.getSexo()));
        jRadioButtonMasculinoCadPJ.setEnabled(false);//Trava o campo - Não Editavel
                
        jRadioButtonFemininoCadPJ.setSelected("Feminino".equals(clientePJ.getSexo()));
        jRadioButtonFemininoCadPJ.setEnabled(false);//Trava o campo - Não Editavel
                
        jtRendaCadPJ.setText(String.valueOf(clientePJ.getRenda()));
        jtRendaCadPJ.setEnabled(false);//Trava o campo - Não Editavel
                
        jCheckBoxLeituraCadPJ.setSelected(clientePJ.isLeitura());
        jCheckBoxLeituraCadPJ.setEnabled(false);//Trava o campo - Não Editavel
                
        jCheckBoxFutebolCadPJ.setSelected(clientePJ.isFutebol());
        jCheckBoxFutebolCadPJ.setEnabled(false);//Trava o campo - Não Editavel
                
        jCheckBoxPescariaCadPJ.setSelected(clientePJ.isPescaria());
        jCheckBoxPescariaCadPJ.setEnabled(false);//Trava o campo - Não Editavel
                
        jCheckBoxDancaCadPJ.setSelected(clientePJ.isDanca());
        jCheckBoxDancaCadPJ.setEnabled(false);//Trava o campo - Não Editavel
                
        jCheckBoxMusicaCadPJ.setSelected(clientePJ.isMusica());
        jCheckBoxMusicaCadPJ.setEnabled(false);//Trava o campo - Não Editavel
                
        jCheckBoxGamesCadPJ.setSelected(clientePJ.isVedeogame());
        jCheckBoxGamesCadPJ.setEnabled(false);//Trava o campo - Não Editavel
                
        jCheckBoxCorrerCadPJ.setSelected(clientePJ.isCorrida());
        jCheckBoxCorrerCadPJ.setEnabled(false);//Trava o campo - Não Editavel
                
        jCheckBoxCozinharCadPJ.setSelected(clientePJ.isCozinhar());
        jCheckBoxCozinharCadPJ.setEnabled(false);//Trava o campo - Não Editavel 
        
    }//GEN-LAST:event_btConsultarCadPJActionPerformed

    private void btEditarCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarCadPJActionPerformed
        // Habilita a Edição dos campos
        txNomeCadPJ.setEnabled(true);
        jFormattedTextFieldDtINascimentoCadPJ.setEnabled(true);
        txEnderecoCadPJ.setEnabled(true);
        txNumeroCadPJ.setEnabled(true);
        txNomeCidadeCadPJ.setEnabled(true);
        cbEstadoCadPJ.setEnabled(true);
        jFCNPJCadPJ.setEnabled(true);
        jRadioButtonMasculinoCadPJ.setEnabled(true);
        jRadioButtonFemininoCadPJ.setEnabled(true);
        jtRendaCadPJ.setEnabled(true);
        jCheckBoxLeituraCadPJ.setEnabled(true);
        jCheckBoxFutebolCadPJ.setEnabled(true);
        jCheckBoxPescariaCadPJ.setEnabled(true);
        jCheckBoxDancaCadPJ.setEnabled(true);
        jCheckBoxMusicaCadPJ.setEnabled(true);
        jCheckBoxGamesCadPJ.setEnabled(true);
        jCheckBoxCorrerCadPJ.setEnabled(true);
        jCheckBoxCozinharCadPJ.setEnabled(true);        
    }//GEN-LAST:event_btEditarCadPJActionPerformed

    private void btExcluirCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirCadPJActionPerformed
        // Exclui o objeto da memoria
        JOptionPane.showMessageDialog(null, "Deseja excluir esse cliente da memoria? ", "Exclusão do cliente", -1);
        limparCampos();
        clientePJ = null; //apaga o cliente da memoria
        JOptionPane.showMessageDialog(null,"Cliente excluido com sucesso!!!.");         
    }//GEN-LAST:event_btExcluirCadPJActionPerformed

    private void btSairCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairCadPJActionPerformed
        // TODO add your handling code here:
       this.dispose();
        
    }//GEN-LAST:event_btSairCadPJActionPerformed

    private void jRadioButtonMasculinoCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMasculinoCadPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMasculinoCadPJActionPerformed

    //Metodo para limpar campos do frame
    public void limparCampos(){
        txNomeCadPJ.setText("");
        jFormattedTextFieldDtINascimentoCadPJ.setText("");
        txEnderecoCadPJ.setText("");
        txNumeroCadPJ.setText("");
        txNomeCidadeCadPJ.setText("");
        cbEstadoCadPJ.setSelectedIndex(0);
        jFCNPJCadPJ.setText("");
        buttonGroupoSexoCadPJ.clearSelection();
        jtRendaCadPJ.setText("");
        jCheckBoxLeituraCadPJ.setSelected(false);
        jCheckBoxFutebolCadPJ.setSelected(false);
        jCheckBoxPescariaCadPJ.setSelected(false);
        jCheckBoxDancaCadPJ.setSelected(false);
        jCheckBoxMusicaCadPJ.setSelected(false);
        jCheckBoxGamesCadPJ.setSelected(false);
        jCheckBoxCorrerCadPJ.setSelected(false);
        jCheckBoxCozinharCadPJ.setSelected(false);
    }
    
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
            java.util.logging.Logger.getLogger(FramePessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FramePessoaJuridica().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultarCadPJ;
    private javax.swing.JButton btEditarCadPJ;
    private javax.swing.JButton btExcluirCadPJ;
    private javax.swing.JButton btSairCadPJ;
    private javax.swing.JButton btSalvarCadPJ;
    private javax.swing.ButtonGroup buttonGroupoSexoCadPJ;
    private javax.swing.JComboBox<String> cbEstadoCadPJ;
    private javax.swing.JCheckBox jCheckBoxCorrerCadPJ;
    private javax.swing.JCheckBox jCheckBoxCozinharCadPJ;
    private javax.swing.JCheckBox jCheckBoxDancaCadPJ;
    private javax.swing.JCheckBox jCheckBoxFutebolCadPJ;
    private javax.swing.JCheckBox jCheckBoxGamesCadPJ;
    private javax.swing.JCheckBox jCheckBoxLeituraCadPJ;
    private javax.swing.JCheckBox jCheckBoxMusicaCadPJ;
    private javax.swing.JCheckBox jCheckBoxPescariaCadPJ;
    private javax.swing.JFormattedTextField jFCNPJCadPJ;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtINascimentoCadPJ;
    private javax.swing.JLabel jLCNPJCadPJ;
    private javax.swing.JLabel jLImgFundoCadPJ;
    private javax.swing.JLabel jLNumeroCadPJ;
    private javax.swing.JLabel jLabelImagemFundoBordaPaineisCadPJ;
    private javax.swing.JPanel jPanelBotoesCadPJ;
    private javax.swing.JPanel jPanelCadastroPJ2;
    private javax.swing.JPanel jPanelTelaCadastroPj;
    private javax.swing.JRadioButton jRadioButtonFemininoCadPJ;
    private javax.swing.JRadioButton jRadioButtonMasculinoCadPJ;
    private javax.swing.JLabel jbTituloCadPJ;
    private javax.swing.JLabel jlCapitalGiroCadPJ;
    private javax.swing.JTextField jtRendaCadPJ;
    private javax.swing.JLabel lbCidadeCadPJ;
    private javax.swing.JLabel lbDtInauguracaoCadPJ;
    private javax.swing.JLabel lbEnderecoCadPJ;
    private javax.swing.JLabel lbEstadoCadCadPJ;
    private javax.swing.JLabel lbRazaoSocialCadPJ;
    private javax.swing.JLabel lbSexoCadPJ;
    private javax.swing.JTextField txEnderecoCadPJ;
    private javax.swing.JTextField txNomeCadPJ;
    private javax.swing.JTextField txNomeCidadeCadPJ;
    private javax.swing.JTextField txNumeroCadPJ;
    // End of variables declaration//GEN-END:variables
}
