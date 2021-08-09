package br.com.View;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**--------------------------------------------------------------------------
 * Count++ Inventory                                                        |
 * Descrição: Trabalho TG                                                   |
 * Sistema de inventario feito como conclusão do curso de Analise           |
 * e desenvolviento de Sistemas na Fatec de Santana de Parnaiba.            |
 * O Sistema desenvolvido visa o gerenciamento do estoque, com a sua        | 
 * principal caracteristica sendo o controle de inventario.                 |
 * -------------------------------------------------------------------------|
 * Nome do Frame: frmMainScreen (Tela Principal com comunicação ao BD MySQL |
 * e demais rotinas elaboradas para o funcionamento do software).           |
 * -------------------------------------------------------------------------|
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
 * @author Alessandro de Sousa da Silva                                     |
 * @author Davi de Souza Silva                                              |
 * Data: 08/03/2020                                                         |
 * Descrição: Desenvolvimento da tela principal e a comunicação com BD      |
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
*///-------------------------------------------------------------------------


public class frmMainScreen extends javax.swing.JFrame {

    // <editor-fold defaultstate="collapsed" desc="public frmMainScreen() & initComponents()">
    public frmMainScreen() {
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
        jLabelImagemMain = new javax.swing.JLabel();
        jPanelTelaPrincipalRodape = new javax.swing.JPanel();
        jLData = new javax.swing.JLabel();
        jLHora = new javax.swing.JLabel();
        jLabelDireitosTelaPrincipal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTreeMenuArvoreTelaPrincipal = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuProdutos = new javax.swing.JMenu();
        jMenuItemCategoria = new javax.swing.JMenuItem();
        jMenuItemTipoProduto = new javax.swing.JMenuItem();
        jMenuItemEndereco = new javax.swing.JMenuItem();
        jMenuItemProdutos = new javax.swing.JMenuItem();
        jMenuItemFornecedor = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuUsuarios = new javax.swing.JMenu();
        jMenuItemNivelAcesso = new javax.swing.JMenuItem();
        jMenuItemUsuario = new javax.swing.JMenuItem();
        jMenuItemSenha = new javax.swing.JMenuItem();
        jMenuInventario = new javax.swing.JMenu();
        jMenuItemIniciarInventario = new javax.swing.JMenuItem();
        jMenuItemInventario = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemImportarArquivo = new javax.swing.JMenuItem();
        jMenuItemExportarArquivos = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItemRelInventario = new javax.swing.JMenuItem();
        jMenuItemRelProduto = new javax.swing.JMenuItem();
        jMenuItemRelUsuario = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemDocumentacao = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSobre = new javax.swing.JMenuItem();
        jmSuporte = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuItemTrocarUsuario = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Count++ Inventory");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabelImagemMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Dark_areadeTrabalho .png"))); // NOI18N
        jLabelImagemMain.setToolTipText("Area principal do Cont++ Inventory.by2022");
        jLabelImagemMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabelImagemMain);
        jLabelImagemMain.setBounds(230, 0, 1260, 650);

        jLData.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jPanelTelaPrincipalRodape.add(jLData);

        jLHora.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jPanelTelaPrincipalRodape.add(jLHora);

        jLabelDireitosTelaPrincipal.setFont(new java.awt.Font("Ebrima", 1, 10)); // NOI18N
        jLabelDireitosTelaPrincipal.setText("                              Count++ Inventory versão 2022.0.01 - desenvolvido por alunos do CPS Fatec SdP - ( Alessandro de Sousa da Silva e Adilson Luz ) Trabalho do TG - com a orientação do Professor Aimar Martins Lopes                                 ");
        jPanelTelaPrincipalRodape.add(jLabelDireitosTelaPrincipal);

        getContentPane().add(jPanelTelaPrincipalRodape);
        jPanelTelaPrincipalRodape.setBounds(10, 650, 1340, 20);

        jTreeMenuArvoreTelaPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        jTreeMenuArvoreTelaPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jTreeMenuArvoreTelaPrincipal.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jTreeMenuArvoreTelaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Link de Navegação...");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Cadastros");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Produtos");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Categorias");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Tipos de Produtos");
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
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Niveis de Acessos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Usuário");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Senhas");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Inventários");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Iniciar Inventário");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Inventário");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ferramentas");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Importar Arquivos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Exportar Arquivos");
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
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Contato Suporte");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTreeMenuArvoreTelaPrincipal.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTreeMenuArvoreTelaPrincipal.setToolTipText("Selecione a opção desejada no menu.");
        jTreeMenuArvoreTelaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTreeMenuArvoreTelaPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTreeMenuArvoreTelaPrincipalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTreeMenuArvoreTelaPrincipal);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 230, 650);

        jMenuCadastro.setText("Cadastros");

        jMenuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos.png"))); // NOI18N
        jMenuProdutos.setText("Produtos");

        jMenuItemCategoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/categorias.png"))); // NOI18N
        jMenuItemCategoria.setText("Categorias");
        jMenuItemCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCategoriaActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuItemCategoria);

        jMenuItemTipoProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemTipoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tiposproduto.png"))); // NOI18N
        jMenuItemTipoProduto.setText("Tipos dos Produtos");
        jMenuItemTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTipoProdutoActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuItemTipoProduto);

        jMenuItemEndereco.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_localização.png"))); // NOI18N
        jMenuItemEndereco.setText("Localizações");
        jMenuItemEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEnderecoActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuItemEndereco);

        jMenuItemProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos.png"))); // NOI18N
        jMenuItemProdutos.setText("Produtos");
        jMenuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutosActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuItemProdutos);

        jMenuCadastro.add(jMenuProdutos);

        jMenuItemFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItemFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedorico.png"))); // NOI18N
        jMenuItemFornecedor.setText("Fornecedor");
        jMenuItemFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFornecedorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFornecedor);
        jMenuCadastro.add(jSeparator1);

        jMenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Senhas1.png"))); // NOI18N
        jMenuUsuarios.setText("Usuarios");

        jMenuItemNivelAcesso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemNivelAcesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/NivelAcesso.png"))); // NOI18N
        jMenuItemNivelAcesso.setText("Niveis de Acessos");
        jMenuItemNivelAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNivelAcessoActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemNivelAcesso);

        jMenuItemUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Usuarios.jpg"))); // NOI18N
        jMenuItemUsuario.setText("Usuarios");
        jMenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarioActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemUsuario);

        jMenuItemSenha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senhas2.png"))); // NOI18N
        jMenuItemSenha.setText("Senha");
        jMenuItemSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSenhaActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemSenha);

        jMenuCadastro.add(jMenuUsuarios);

        jMenuBar1.add(jMenuCadastro);

        jMenuInventario.setText("Inventário");

        jMenuItemIniciarInventario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemIniciarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconStartInventario.png"))); // NOI18N
        jMenuItemIniciarInventario.setText("Iniciar Inventario");
        jMenuItemIniciarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIniciarInventarioActionPerformed(evt);
            }
        });
        jMenuInventario.add(jMenuItemIniciarInventario);

        jMenuItemInventario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconInventario.png"))); // NOI18N
        jMenuItemInventario.setText("Inventario");
        jMenuItemInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInventarioActionPerformed(evt);
            }
        });
        jMenuInventario.add(jMenuItemInventario);

        jMenuBar1.add(jMenuInventario);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemImportarArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Import.png"))); // NOI18N
        jMenuItemImportarArquivo.setText("Importar Arquivos");
        jMenuFerramentas.add(jMenuItemImportarArquivo);

        jMenuItemExportarArquivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Export.png"))); // NOI18N
        jMenuItemExportarArquivos.setText("Exportar Arquivos");
        jMenuFerramentas.add(jMenuItemExportarArquivos);

        jMenuBar1.add(jMenuFerramentas);

        jMenuRelatorio.setText("Relatorios");

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

        jMenuAjuda.setText("Ajuda");

        jMenuItemDocumentacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItemDocumentacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconDocumento.png"))); // NOI18N
        jMenuItemDocumentacao.setText("Documentação");
        jMenuItemDocumentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDocumentacaoActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemDocumentacao);
        jMenuAjuda.add(jSeparator3);

        jMenuItemSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconsobre2.png"))); // NOI18N
        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemSobre);

        jmSuporte.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmSuporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconSuporte2.png"))); // NOI18N
        jmSuporte.setText("Contato Suporte");
        jmSuporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSuporteActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jmSuporte);

        jMenuBar1.add(jMenuAjuda);

        jMenuSair.setText("Sair");

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MenuSair.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuItemTrocarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemTrocarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logout.png"))); // NOI18N
        jMenuItemTrocarUsuario.setText("Trocar Usuario");
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
        // Chamando tela sobre
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);

    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    // <editor-fold defaultstate="collapsed" desc="private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt)"> 
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
         //   case 2:
         //       System.out.println("botao cancel clicado");
         //       break;
        }
    }//GEN-LAST:event_jMenuItemSairActionPerformed
    // </editor-fold> 
    
    private void jMenuItemTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTrocarUsuarioActionPerformed
        // TODO add your handling code here:
         // Chamando tela principal
        frmLogin telaLogin = new frmLogin();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemTrocarUsuarioActionPerformed

    private void jMenuItemInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInventarioActionPerformed
        // TODO add your handling code here:
        // Chamando tela Inventario
         frmInventario Inventario = new frmInventario();
         Inventario.setVisible(true);
    }//GEN-LAST:event_jMenuItemInventarioActionPerformed

    private void jMenuItemRelProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemRelProdutoActionPerformed

    private void jMenuItemIniciarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIniciarInventarioActionPerformed
        // TODO add your handling code here:
        // Chamando tela Tela Iniciar Inventario
        frmTelaIniciarInventario TelaIniciarInventario = new frmTelaIniciarInventario();
        TelaIniciarInventario.setVisible(true);
    }//GEN-LAST:event_jMenuItemIniciarInventarioActionPerformed

    private void jMenuItemSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSenhaActionPerformed
        // TODO add your handling code here:
        // Chamando tela Cad Categoria
        frmCadTrocaSenha CadTrocaSenha = new frmCadTrocaSenha();
        CadTrocaSenha.setVisible(true);
    }//GEN-LAST:event_jMenuItemSenhaActionPerformed

    private void jMenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarioActionPerformed
        // TODO add your handling code here:
        // Chamando tela Cad Usuario
        frmCadUsuario telaCadUsuario = new frmCadUsuario();
        telaCadUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuarioActionPerformed

    private void jMenuItemNivelAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNivelAcessoActionPerformed
        // TODO add your handling code here:
        // Chamando tela frmTelaNiveldeAcesso
    }//GEN-LAST:event_jMenuItemNivelAcessoActionPerformed

    private void jMenuItemFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFornecedorActionPerformed
        // TODO add your handling code here:
        // Chamando tela Cad Fornecedor
        frmCadFornecedor telaFornec = new frmCadFornecedor();
        telaFornec.setVisible(true);
    }//GEN-LAST:event_jMenuItemFornecedorActionPerformed

    private void jMenuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutosActionPerformed
        // TODO add your handling code here:
        // Chamando tela Cad Produto
        frmCadProduto telaProduto = new frmCadProduto();
        telaProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItemProdutosActionPerformed

    private void jMenuItemEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEnderecoActionPerformed
       // Chamando tela de Localização dos produtos - frmLocationScreen
        frmLocationScreen locationscreen = new frmLocationScreen();
        locationscreen.setVisible(true);
    }//GEN-LAST:event_jMenuItemEnderecoActionPerformed

    private void jMenuItemTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTipoProdutoActionPerformed
        // TODO add your handling code here:
        // Chamando tela Cad Tipo de
        frmTelaTiposdeProduto telaTelaTiposdeProduto = new frmTelaTiposdeProduto();
        telaTelaTiposdeProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItemTipoProdutoActionPerformed

    private void jMenuItemCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCategoriaActionPerformed
        // TODO add your handling code here:
        // Chamando tela Cad Categoria
        frmCadCategoria telaCategoria = new frmCadCategoria();
        telaCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItemCategoriaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 // Programação para exibir data na jframe
        Date dataSistema = new Date (); 
        SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");//SimpleDateFormat é um formato que pega uma data e convert para uma string
        jLData.setText(formato.format(dataSistema));
        
        // Programação para exibir hora na jframe
        Timer timer = new Timer(1000, new hora());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    // <editor-fold defaultstate="collapsed" desc="Menu Arvore - private void jTreeMenuArvoreTelaPrincipalMouseClicked(java.awt.event.MouseEvent evt)"> 
    private void jTreeMenuArvoreTelaPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTreeMenuArvoreTelaPrincipalMouseClicked
       // Metodo de configuração do menu em arvore jTree
        String menu = jTreeMenuArvoreTelaPrincipal.getLastSelectedPathComponent().toString();
       
        if(menu.equals("Categorias")){
            frmCadCategoria CadCategoria = new frmCadCategoria();
            CadCategoria.setVisible(true);
        }//fim do if CadCategoria
         
        if(menu.equals("Tipos de Produtos")){
            frmTelaTiposdeProduto TelaTiposdeProduto = new frmTelaTiposdeProduto();
            TelaTiposdeProduto.setVisible(true);
        }//fim do if TelaTiposdeProduto
        
         if(menu.equals("Localizações")){
            frmLocationScreen CadEnderecos = new frmLocationScreen();
            CadEnderecos.setVisible(true);
        }//fim do if CadEnderecos
        
        if(menu.equals("Produto")){
            frmCadProduto CadProduto = new frmCadProduto();
            CadProduto.setVisible(true);
        }//fim do if CadProduto
        
        if(menu.equals("Fornecedor")){
            frmCadFornecedor CadFornecedor = new frmCadFornecedor();
            CadFornecedor.setVisible(true);
        }//fim do if CadFornecedor
        
        if(menu.equals("Niveis de Acessos")){
           
        }//fim do if TelaNiveldeAcesso
        
        if(menu.equals("Usuário")){
            frmCadUsuario CadUsuario = new frmCadUsuario();
            CadUsuario.setVisible(true);
        }//fim do if CadUsuario
        
        if(menu.equals("Senhas")){
            frmCadTrocaSenha CadTrocaSenha = new frmCadTrocaSenha();
            CadTrocaSenha.setVisible(true);
        }//fim do if CadTrocaSenha        
        
        if(menu.equals("Iniciar Inventário")){
            frmTelaIniciarInventario TelaIniciarInventario = new frmTelaIniciarInventario();
            TelaIniciarInventario.setVisible(true);
        }//fim do if TelaIniciarInventario
        
        if(menu.equals("Inventário")){
            frmInventario Inventario = new frmInventario();
            Inventario.setVisible(true);
        }//fim do if Inventario
        
        if(menu.equals("Contato Suporte")){
            frmSupportContact supportContact = new frmSupportContact();
            supportContact.setVisible(true);
        }//fim do if Contato Suporte
   
        /*   if(menu.equals("Exportar Arquivos")){
            //Falta criar a tela
        }//fim do if Exportar Arquivos        
        if(menu.equals("Documentação")){
            //Falta criar a tela
        }//fim do if Documentação
  */    
        if(menu.equals("Sobre")){
            TelaSobre telaSobre = new TelaSobre();
            telaSobre.setVisible(true);
        }//fim do if Inventario        
                
    }//GEN-LAST:event_jTreeMenuArvoreTelaPrincipalMouseClicked
    // </editor-fold> 
    
    private void jmSuporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSuporteActionPerformed
       // Chamando tela frmSupportContact
       frmSupportContact supportContact = new frmSupportContact();
       supportContact.setVisible(true);
    }//GEN-LAST:event_jmSuporteActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMainScreen().setVisible(true);
            }
        });
    }
    
    // <editor-fold defaultstate="collapsed" desc="Variables declaration - do not modify">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLHora;
    private javax.swing.JLabel jLabelDireitosTelaPrincipal;
    private javax.swing.JLabel jLabelImagemMain;
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
    private javax.swing.JMenuItem jMenuItemImportarArquivo;
    private javax.swing.JMenuItem jMenuItemIniciarInventario;
    private javax.swing.JMenuItem jMenuItemInventario;
    private javax.swing.JMenuItem jMenuItemNivelAcesso;
    private javax.swing.JMenuItem jMenuItemProdutos;
    private javax.swing.JMenuItem jMenuItemRelInventario;
    private javax.swing.JMenuItem jMenuItemRelProduto;
    private javax.swing.JMenuItem jMenuItemRelUsuario;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSenha;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenuItem jMenuItemTipoProduto;
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
    private javax.swing.JTree jTreeMenuArvoreTelaPrincipal;
    private javax.swing.JMenuItem jmSuporte;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="class hora implements ActionListener">
    class hora implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            Calendar now = Calendar.getInstance();
            jLHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }//fim da actionPerformed
    }//fim da class  // </editor-fold> 

} //fim do main
