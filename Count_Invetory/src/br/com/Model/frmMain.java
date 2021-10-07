package br.com.Model;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**--------------------------------------------------------------------------
 * Count++ Inventory                                                        |
 * Descrição: Trabalho TG                                                   |
 * Sistema de inventario feito como conclusão do curso de Analise           |
 * e desenvolviento de Sistemas na Fatec de Santana de Parnaiba.            |
 O Sistema desenvolvido visa o gerenciamento do estoque, com a sua          | 
 principal caracteristica sendo o controle de inventario.                   |
 ---------------------------------------------------------------------------|
 Nome do Frame: frmMain (Tela Principal com comunicação ao BD MySQL         |
 e demais rotinas elaboradas para o funcionamento do software).             |
 ---------------------------------------------------------------------------|
 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
 * @author Alessandro de Sousa da Silva                                     |
 * Data: 08/03/2020                                                         |
 * Descrição: Desenvolvimento da tela principal e a comunicação com BD      |
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
*///-------------------------------------------------------------------------

public class frmMain extends javax.swing.JFrame {

    // <editor-fold defaultstate="collapsed" desc="public frmMain() & initComponents()">
    public frmMain() {
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

        jMenuItem2 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        lbImagemMain = new javax.swing.JLabel();
        jPanelTelaPrincipalRodape = new javax.swing.JPanel();
        jLData = new javax.swing.JLabel();
        jLHora = new javax.swing.JLabel();
        jLabelDireitosTelaPrincipal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTreeMenuArvore = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuProdutos = new javax.swing.JMenu();
        jMenuItemCategoria = new javax.swing.JMenuItem();
        jMenuItemEndereco = new javax.swing.JMenuItem();
        jMenuItemProdutos = new javax.swing.JMenuItem();
        jMenuItemFornecedor = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuUsuarios = new javax.swing.JMenu();
        jMenuItemUsuario = new javax.swing.JMenuItem();
        jMenuItemSenha = new javax.swing.JMenuItem();
        jMenuInventario = new javax.swing.JMenu();
        jMenuItemIniciarInventario = new javax.swing.JMenuItem();
        jMenuItemInventario = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemExportarArquivos = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItemRelInventario = new javax.swing.JMenuItem();
        jMenuItemRelProduto = new javax.swing.JMenuItem();
        jMenuItemRelUsuario = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemDocumentacao = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSobre = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuItemTrocarUsuario = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Count++ Inventory");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        lbImagemMain.setBackground(new java.awt.Color(153, 153, 255));
        lbImagemMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telaPrincipal++.png"))); // NOI18N
        lbImagemMain.setToolTipText("Area principal do Cont++ Inventory.by2022");
        lbImagemMain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lbImagemMain);
        lbImagemMain.setBounds(210, 0, 1280, 650);

        jPanelTelaPrincipalRodape.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLData.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jPanelTelaPrincipalRodape.add(jLData);

        jLHora.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jPanelTelaPrincipalRodape.add(jLHora);

        jLabelDireitosTelaPrincipal.setFont(new java.awt.Font("Ebrima", 1, 10)); // NOI18N
        jLabelDireitosTelaPrincipal.setText("                              Count++ Inventory versão 2022.0.01 - desenvolvido por alunos do CPS Fatec SdP - ( Alessandro de Sousa da Silva e Davi de Souza Silva ) Trabalho do TG - com a orientação do Professor Aimar Martins Lopes                                 ");
        jPanelTelaPrincipalRodape.add(jLabelDireitosTelaPrincipal);

        getContentPane().add(jPanelTelaPrincipalRodape);
        jPanelTelaPrincipalRodape.setBounds(10, 650, 1340, 20);

        jTreeMenuArvore.setBackground(new java.awt.Color(204, 204, 204));
        jTreeMenuArvore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jTreeMenuArvore.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 14)); // NOI18N
        jTreeMenuArvore.setForeground(new java.awt.Color(51, 51, 51));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Link de Navegação...");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Cadastros");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Produtos");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Categoria");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Localização");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Produto");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Fornecedores");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Fornecedor");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Usuários");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Usuário");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Senha");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Inventários");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Iniciar Inventário");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Inventário");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ferramentas");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Input / Output");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Relatórios");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Inventario");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Produtos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Usuários");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ajuda");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Documentação");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Sobre");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTreeMenuArvore.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTreeMenuArvore.setToolTipText("Selecione a opção desejada no menu.");
        jTreeMenuArvore.setAlignmentX(2.5F);
        jTreeMenuArvore.setAlignmentY(2.5F);
        jTreeMenuArvore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTreeMenuArvore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTreeMenuArvoreMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTreeMenuArvore);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 210, 650);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuCadastro.setMnemonic('c');
        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setToolTipText("Clique aqui para efetuar casdastros.");

        jMenuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos.png"))); // NOI18N
        jMenuProdutos.setMnemonic('P');
        jMenuProdutos.setText("Produto");
        jMenuProdutos.setToolTipText("Clique aqui para fazer cadastros relacionado ao Produto.");

        jMenuItemCategoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/categorias.png"))); // NOI18N
        jMenuItemCategoria.setMnemonic('c');
        jMenuItemCategoria.setText("Categoria");
        jMenuItemCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCategoriaActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuItemCategoria);

        jMenuItemEndereco.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_localização.png"))); // NOI18N
        jMenuItemEndereco.setMnemonic('l');
        jMenuItemEndereco.setText("Localização");
        jMenuItemEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEnderecoActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuItemEndereco);

        jMenuItemProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos.png"))); // NOI18N
        jMenuItemProdutos.setMnemonic('r');
        jMenuItemProdutos.setText("Produto");
        jMenuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutosActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuItemProdutos);

        jMenuCadastro.add(jMenuProdutos);

        jMenuItemFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedorico.png"))); // NOI18N
        jMenuItemFornecedor.setMnemonic('f');
        jMenuItemFornecedor.setText("Fornecedor");
        jMenuItemFornecedor.setToolTipText("Clique aqui para fazer cadastros relacionado ao Fornecedor.");
        jMenuItemFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFornecedorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFornecedor);
        jMenuCadastro.add(jSeparator1);

        jMenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Senhas1.png"))); // NOI18N
        jMenuUsuarios.setMnemonic('u');
        jMenuUsuarios.setText("Usuario");
        jMenuUsuarios.setToolTipText("Clique aqui para fazer cadastros relacionado ao Usuário.");

        jMenuItemUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Usuarios.jpg"))); // NOI18N
        jMenuItemUsuario.setMnemonic('r');
        jMenuItemUsuario.setText("Usuario");
        jMenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarioActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemUsuario);

        jMenuItemSenha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senhas2.png"))); // NOI18N
        jMenuItemSenha.setMnemonic('s');
        jMenuItemSenha.setText("Senha");
        jMenuItemSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSenhaActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemSenha);

        jMenuCadastro.add(jMenuUsuarios);

        jMenuBar1.add(jMenuCadastro);

        jMenuInventario.setMnemonic('i');
        jMenuInventario.setText("Inventário");
        jMenuInventario.setToolTipText("Clique aqui para fazer o gerenciamento do Inventário.");

        jMenuItemIniciarInventario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemIniciarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconStartInventario.png"))); // NOI18N
        jMenuItemIniciarInventario.setMnemonic('s');
        jMenuItemIniciarInventario.setText("Start-Inventario");
        jMenuItemIniciarInventario.setToolTipText("Clique aqui para Iniciar o Inventário (Start).");
        jMenuItemIniciarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIniciarInventarioActionPerformed(evt);
            }
        });
        jMenuInventario.add(jMenuItemIniciarInventario);

        jMenuItemInventario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconInventario.png"))); // NOI18N
        jMenuItemInventario.setMnemonic('i');
        jMenuItemInventario.setText("Inventário");
        jMenuItemInventario.setToolTipText("Clique aqui para gerenciar o Inventário.");
        jMenuItemInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInventarioActionPerformed(evt);
            }
        });
        jMenuInventario.add(jMenuItemInventario);

        jMenuBar1.add(jMenuInventario);

        jMenuFerramentas.setText("Ferramentas");
        jMenuFerramentas.setToolTipText("Clique aqui para fazer o Input / Output de dados a partir de uma tabela (xls, xlsx, txt).");
        jMenuFerramentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItemExportarArquivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Export.png"))); // NOI18N
        jMenuItemExportarArquivos.setText("Input/Output Arquivos");
        jMenuItemExportarArquivos.setToolTipText("Clique aqui para fazer o Input / Output de dados a partir de uma tabela (xls, xlsx, txt).");
        jMenuItemExportarArquivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExportarArquivosActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemExportarArquivos);

        jMenuBar1.add(jMenuFerramentas);

        jMenuRelatorio.setText("Relátorios");

        jMenuItemRelInventario.setText("Inventario");
        jMenuRelatorio.add(jMenuItemRelInventario);

        jMenuItemRelProduto.setText("Produtos");
        jMenuItemRelProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelProdutoActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemRelProduto);

        jMenuItemRelUsuario.setText("Usuarios");
        jMenuRelatorio.add(jMenuItemRelUsuario);

        jMenuBar1.add(jMenuRelatorio);

        jMenuAjuda.setMnemonic('a');
        jMenuAjuda.setText("Ajuda");
        jMenuAjuda.setToolTipText("Clique aqui para acessar a Ajuda do Sistema.");

        jMenuItemDocumentacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemDocumentacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconDocumento.png"))); // NOI18N
        jMenuItemDocumentacao.setMnemonic('d');
        jMenuItemDocumentacao.setText("Documentação");
        jMenuItemDocumentacao.setToolTipText("Clique aqui para acessar a Documentação do sistema.");
        jMenuItemDocumentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDocumentacaoActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemDocumentacao);
        jMenuAjuda.add(jSeparator3);

        jMenuItemSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconsobre2.png"))); // NOI18N
        jMenuItemSobre.setMnemonic('s');
        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.setToolTipText("Clique aqui para ter acesso as informações do sistema.");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBar1.add(jMenuAjuda);

        jMenuSair.setMnemonic('s');
        jMenuSair.setText("Sair");
        jMenuSair.setToolTipText("Clique aqui para Sair so Sietema.");
        jMenuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MenuSair.png"))); // NOI18N
        jMenuItemSair.setMnemonic('s');
        jMenuItemSair.setText("Sair");
        jMenuItemSair.setToolTipText("Clique aqui para Sair so Sietema.");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuItemTrocarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemTrocarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logout.png"))); // NOI18N
        jMenuItemTrocarUsuario.setMnemonic('t');
        jMenuItemTrocarUsuario.setText("Trocar Usuario");
        jMenuItemTrocarUsuario.setToolTipText("Clique aqui para fazer a Troca de Usuário.");
        jMenuItemTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTrocarUsuarioActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemTrocarUsuario);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 1363, 743);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jMenuItemDocumentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDocumentacaoActionPerformed
                   
    }//GEN-LAST:event_jMenuItemDocumentacaoActionPerformed

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        // Metodo para chamar a tela sobre
        frmAbout sobre = new frmAbout();
        sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // TODO add your handling code here:
        //Programação do botão Sair
        switch (JOptionPane.showConfirmDialog(null,
                "Deseja realmente Sair?",
                "Saindo do Sistema Count++ Inventory...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE )) {
            case 0:
                System.out.println("Saindo do Sistema Count++ Inventory...");
                System.exit(0);
                break;
            case 1:
                System.out.println("Voltando para o Sistema Count++ Inventory...");
                break;
        }
    }//GEN-LAST:event_jMenuItemSairActionPerformed
    
    private void jMenuItemTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTrocarUsuarioActionPerformed
        // Metodo para chamar a tela principal
        frmLogin telaLogin = new frmLogin();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemTrocarUsuarioActionPerformed

    private void jMenuItemInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInventarioActionPerformed
        // Metodo para chamar a tela Inventario
         frmInventory Inventario = new frmInventory();
         Inventario.setVisible(true);
    }//GEN-LAST:event_jMenuItemInventarioActionPerformed

    private void jMenuItemRelProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemRelProdutoActionPerformed

    private void jMenuItemIniciarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIniciarInventarioActionPerformed
        // Metodo para chamar a tela Tela Iniciar Inventario
        frmStartInventory TelaIniciarInventario = new frmStartInventory();
        TelaIniciarInventario.setVisible(true);
    }//GEN-LAST:event_jMenuItemIniciarInventarioActionPerformed

    private void jMenuItemSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSenhaActionPerformed
        // Metodo para chamar a tela Cad Categoria
        frmChangePassword CadTrocaSenha = new frmChangePassword();
        CadTrocaSenha.setVisible(true);
    }//GEN-LAST:event_jMenuItemSenhaActionPerformed

    private void jMenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarioActionPerformed
        // Metodo para chamar a tela Cad Usuario
        frmRegistrationUser telaCadUsuario = new frmRegistrationUser();
        telaCadUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuarioActionPerformed

    private void jMenuItemFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFornecedorActionPerformed
        // Metodo para chamar a tela Cad Fornecedor
        frmRegistrationSuppliers telaFornec = new frmRegistrationSuppliers();
        telaFornec.setVisible(true);
    }//GEN-LAST:event_jMenuItemFornecedorActionPerformed

    private void jMenuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutosActionPerformed
        // Metodo para chamar a tela Cad Produto
        frmRegistrationProducts telaProduto = new frmRegistrationProducts();
        telaProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItemProdutosActionPerformed

    private void jMenuItemEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEnderecoActionPerformed
       // Metodo para chamar a tela de Localização dos produtos
        frmRegistrationLocation locationscreen = new frmRegistrationLocation();
        locationscreen.setVisible(true);
    }//GEN-LAST:event_jMenuItemEnderecoActionPerformed

    private void jMenuItemCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCategoriaActionPerformed
        // Metodo para chamar a tela Cadastro Categoria
        frmRegistrationCategory telaCategoria = new frmRegistrationCategory();
        telaCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItemCategoriaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    // Metodo para exibir data e hora na jframe
        Date dataSistema = new Date (); 
        SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");//SimpleDateFormat é um formato que pega uma data e convert para uma string
        jLData.setText(formato.format(dataSistema));
        
        // Programação para exibir hora na jframe
        Timer timer = new Timer(1000, new hora());
        timer.start();
    }//GEN-LAST:event_formWindowOpened
    
// <editor-fold defaultstate="collapsed" desc="Menu Arvore - private void jTreeMenuArvoreTelaPrincipalMouseClicked(java.awt.event.MouseEvent evt)"> 
    private void jTreeMenuArvoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTreeMenuArvoreMouseClicked
       // Metodo de configuração do menu em arvore jTree
        String menu = jTreeMenuArvore.getLastSelectedPathComponent().toString();
        
        if(menu.equals("Categoria")){
            //fechaTelas();
            frmRegistrationCategory CadCategoria = new frmRegistrationCategory();
            CadCategoria.setVisible(true);
        }//fim do if CadCategoria
         
        if(menu.equals("Localização")){
            frmRegistrationLocation telaCadLocalizacao = new frmRegistrationLocation();
            telaCadLocalizacao.setVisible(true);
        }//fim do if CadEnderecos
        
        if(menu.equals("Produto")){
          frmRegistrationProducts CadProduto = new frmRegistrationProducts();
          CadProduto.setVisible(true);
        }//fim do if CadProduto
        
        if(menu.equals("Fornecedor")){
            frmRegistrationSuppliers CadFornecedor = new frmRegistrationSuppliers();
            CadFornecedor.setVisible(true);
        }//fim do if CadFornecedor
                      
        if(menu.equals("Usuário")){
            frmRegistrationUser CadUsuario = new frmRegistrationUser();
            CadUsuario.setVisible(true);
        }//fim do if CadUsuario
        
        if(menu.equals("Senha")){
            frmChangePassword CadTrocaSenha = new frmChangePassword();
            CadTrocaSenha.setVisible(true);
        }//fim do if CadTrocaSenha        
        
        if(menu.equals("Iniciar Inventário")){
            frmStartInventory TelaIniciarInventario = new frmStartInventory();
            TelaIniciarInventario.setVisible(true);
        }//fim do if TelaIniciarInventario
        
        if(menu.equals("Inventário")){
            frmInventory Inventario = new frmInventory();
            Inventario.setVisible(true);
        }//fim do if Inventario
        
        if(menu.equals("Input / Output")){
            frmInputOutput TelaIO = new frmInputOutput();
            TelaIO.setVisible(true);
        }//fim do if Exportar Arquivos        
        
        if(menu.equals("Documentação")){
            //Falta criar a tela
        }//fim do if Documentação
                  
        if(menu.equals("Sobre")){
            frmAbout telaSobre = new frmAbout();
            telaSobre.setVisible(true);
        }//fim do if Inventario
                
    }//GEN-LAST:event_jTreeMenuArvoreMouseClicked
    // </editor-fold> 
    
    private void jMenuItemExportarArquivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExportarArquivosActionPerformed
        frmInputOutput TelaIO = new frmInputOutput();
        TelaIO.setVisible(true);
    }//GEN-LAST:event_jMenuItemExportarArquivosActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Variables declaration - do not modify">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLHora;
    private javax.swing.JLabel jLabelDireitosTelaPrincipal;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenu jMenuInventario;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemCategoria;
    private javax.swing.JMenuItem jMenuItemDocumentacao;
    private javax.swing.JMenuItem jMenuItemEndereco;
    private javax.swing.JMenuItem jMenuItemExportarArquivos;
    private javax.swing.JMenuItem jMenuItemFornecedor;
    private javax.swing.JMenuItem jMenuItemIniciarInventario;
    private javax.swing.JMenuItem jMenuItemInventario;
    private javax.swing.JMenuItem jMenuItemProdutos;
    private javax.swing.JMenuItem jMenuItemRelInventario;
    private javax.swing.JMenuItem jMenuItemRelProduto;
    private javax.swing.JMenuItem jMenuItemRelUsuario;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSenha;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenuItem jMenuItemTrocarUsuario;
    private javax.swing.JMenuItem jMenuItemUsuario;
    private javax.swing.JMenu jMenuProdutos;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuUsuarios;
    private javax.swing.JPanel jPanelTelaPrincipalRodape;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTree jTreeMenuArvore;
    private javax.swing.JLabel lbImagemMain;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Class Hora Implements ActionListener">
    class hora implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            Calendar now = Calendar.getInstance();
            jLHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }//fim da actionPerformed
    }//fim da class  // </editor-fold> 

    public void fechaTelas(){
    /*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
    |* @author Alessandro de Sousa da Silva                                     |
    |* Data: 11/09/2021                                                         |
    |* Descrição: Desenvolvimento do Metodo para fechar as janelas de           |
    |* navegação.                                                               |
    |*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/    
    
    setDefaultCloseOperation(frmAbout.EXIT_ON_CLOSE);
    
    
    
    }//final do metodo fechar janelas
    
} //fim do main
