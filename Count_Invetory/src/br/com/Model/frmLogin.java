package br.com.Model;

import br.com.Class.UsuarioDAO;
import br.com.Class.UsuarioDTO;
import java.net.URL;
import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**--------------------------------------------------------------------------
 * Count++ Inventory                                                        |
 * Descrição: Trabalho TG                                                   |
 * Sistema de inventario feito como conclusão do curso de Analise           |
 * e desenvolviento de Sistemas na Fatec de Santana de Parnaiba.            |
 * O Sistema desenvolvido visa o gerenciamento do estoque, com a sua        | 
 * principal caracteristica sendo o controle de inventario.                 |
 * -------------------------------------------------------------------------|
 * Nome do Frame: frmLogin (Tela de Login com comunicação ao BD MySQL).     |
 * -------------------------------------------------------------------------|
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
 * @author Alessandro de Sousa da Silva                                     |
 * Data: 08/03/2020                                                         |
 * Descrição: Desenvolvimento da tela de Login com a validação com o BD.    |
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
*///-------------------------------------------------------------------------

public class frmLogin extends javax.swing.JFrame {

    // <editor-fold defaultstate="collapsed" desc="public frmLogin()">
    public frmLogin() {
                
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        // <editor-fold defaultstate="collapsed" desc="CONSTRUTOR ICONE">
        //Adiciona Icone na barra de titulo
        URL iconeImagem = getClass().getResource("/imagens/icon.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(iconeImagem);
        this.setIconImage(iconeTitulo);
        //Fim - Adiciona Icone na barra de titulo
        // </editor-fold> 
    } // </editor-fold>
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLogin = new javax.swing.JPanel();
        jpAreaLogin = new javax.swing.JPanel();
        lbSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnLogar = new javax.swing.JButton();
        btnAjuda = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        lbUsuario = new javax.swing.JLabel();
        cbAmbiente = new javax.swing.JComboBox<>();
        btnSair = new javax.swing.JButton();
        jpbarraProgresso = new javax.swing.JProgressBar();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Count++ Iventory");
        setUndecorated(true);

        jpLogin.setLayout(null);

        jpAreaLogin.setBackground(new java.awt.Color(51, 51, 51));
        jpAreaLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Faça aqui o seu Login", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Doppio One", 0, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jpAreaLogin.setInheritsPopupMenu(true);
        jpAreaLogin.setLayout(null);

        lbSenha.setFont(new java.awt.Font("Doppio One", 0, 12)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(204, 204, 204));
        lbSenha.setText("Senha.");
        jpAreaLogin.add(lbSenha);
        lbSenha.setBounds(30, 110, 60, 20);

        txtSenha.setBackground(new java.awt.Color(102, 102, 102));
        txtSenha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setToolTipText("Digite aqui a sua senha  para acessar o sistema.");
        txtSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpAreaLogin.add(txtSenha);
        txtSenha.setBounds(30, 130, 260, 30);

        btnLogar.setBackground(new java.awt.Color(0, 0, 0));
        btnLogar.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 16)); // NOI18N
        btnLogar.setForeground(new java.awt.Color(255, 255, 255));
        btnLogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botão_Login.png"))); // NOI18N
        btnLogar.setToolTipText("Clique aqui para logar no sistema.");
        btnLogar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });
        jpAreaLogin.add(btnLogar);
        btnLogar.setBounds(30, 210, 260, 30);

        btnAjuda.setBackground(new java.awt.Color(0, 0, 0));
        btnAjuda.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 12)); // NOI18N
        btnAjuda.setForeground(new java.awt.Color(255, 255, 255));
        btnAjuda.setText("Ajuda.");
        btnAjuda.setToolTipText("Clique caso necessite de ajuda ou entre em contato com o Administrador +55(11) 9 5555-4421..");
        btnAjuda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });
        jpAreaLogin.add(btnAjuda);
        btnAjuda.setBounds(230, 280, 60, 20);

        txtUsuario.setBackground(new java.awt.Color(102, 102, 102));
        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setToolTipText("Digite aqui o seu usuário para acessar o sistema.");
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpAreaLogin.add(txtUsuario);
        txtUsuario.setBounds(30, 70, 260, 30);

        lbUsuario.setFont(new java.awt.Font("Doppio One", 0, 12)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(204, 204, 204));
        lbUsuario.setText("Usuário.");
        jpAreaLogin.add(lbUsuario);
        lbUsuario.setBounds(30, 50, 70, 20);

        cbAmbiente.setBackground(new java.awt.Color(102, 102, 102));
        cbAmbiente.setFont(new java.awt.Font("Doppio One", 0, 12)); // NOI18N
        cbAmbiente.setForeground(new java.awt.Color(255, 255, 255));
        cbAmbiente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Ambiente...", "Padrão (Todos os modúlos)", "Moderado(Sistema s/Input | Output)", "Light (Somente Input | Output)", "Configurador(Parametros | Permissões)", "Dark - Padrão (Todos os modúlos)", "Dark - Moderado(Sistema s/Input | Output)", "Dark - Light (Somente Input | Output)", "Dark - Configurador(Parametros | Permissões)" }));
        cbAmbiente.setToolTipText("Selecione aqui o ambiente para logar no sistema.");
        cbAmbiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbAmbiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAmbienteActionPerformed(evt);
            }
        });
        jpAreaLogin.add(cbAmbiente);
        cbAmbiente.setBounds(30, 170, 260, 26);

        btnSair.setBackground(new java.awt.Color(0, 0, 0));
        btnSair.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setToolTipText("Clique aqui para sair do sistema.");
        btnSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jpAreaLogin.add(btnSair);
        btnSair.setBounds(30, 250, 260, 20);
        jpAreaLogin.add(jpbarraProgresso);
        jpbarraProgresso.setBounds(30, 310, 260, 10);

        jpLogin.add(jpAreaLogin);
        jpAreaLogin.setBounds(680, 80, 320, 330);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telaLogin++.png"))); // NOI18N
        jpLogin.add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 0, 1160, 670);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1153, 605));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // <editor-fold defaultstate="collapsed" desc="btnLogar">
    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        // chamando o Metodo de Login login()
        login();

    }//GEN-LAST:event_btnLogarActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt)">
    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed
      //Chamada da tela frmSupportContaact
      frmSupportContact supportcontact = new frmSupportContact();
      supportcontact.setVisible(true);
      dispose();
    }//GEN-LAST:event_btnAjudaActionPerformed
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="btnAjuda">
    private void cbAmbienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAmbienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAmbienteActionPerformed
// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="btnSair">
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // Metodo para, Sair do Sistema
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="public static void main(String args[])"> 
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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }   // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Variables Private declaration - do not modify"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnLogar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbAmbiente;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JPanel jpAreaLogin;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JProgressBar jpbarraProgresso;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
// </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="login() & jpbarraProgresso">
    private void login(){
        
        try{ 

            String nomeUsuario;
            String senhaUsuario;
            
            nomeUsuario = txtUsuario.getText();                
            senhaUsuario = txtSenha.getText();
        
            UsuarioDTO objusuarioDTO = new UsuarioDTO();
            objusuarioDTO.setNome(nomeUsuario);
            objusuarioDTO.setSenha(senhaUsuario);
            
            UsuarioDAO obUsuarioDAO = new UsuarioDAO();
            ResultSet rsusuarioDAO = obUsuarioDAO.autenticacaoUsuario(objusuarioDTO); //Passando o obj esperado do ResultSet
            
            if(rsusuarioDAO.first()) { //Recebe caso haja algum resultado
                new Thread(){
                    @Override
                    public void run(){
                        for(int i = 0; i < 101; i++){
                        try {
                            sleep(35);
                            jpbarraProgresso.setValue(i);

                            } catch (InterruptedException ex) {

                                Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        //Chamando a tela principal frmMainScreem
                        frmMainScreen telaPrincipal = new frmMainScreen();
                        telaPrincipal.setVisible(true);
                        dispose(); // fecha a tela de login - frmLogin
                    }
                }.start();
                                
            } else {
                     // Envia mensagem de erro de usuário ou senha
                    JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorreto! \nTente novamente ou clique em AJUDA.","Erro no Login",2);
                    limpaCampos();                    
                       
                    }
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "frmLogin:" +e);
            
        }
            
    } // fim do Metodo Logar() // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="limpaCampos()">
    private void limpaCampos() {
        
        txtUsuario.setText("");
        txtSenha.setText("");
        
    } // final limpaCampos() // </editor-fold>
            
} // fim da classe