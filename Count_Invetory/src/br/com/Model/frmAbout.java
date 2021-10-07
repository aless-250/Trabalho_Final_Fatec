package br.com.Model;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**--------------------------------------------------------------------------
 * Count++ Inventory                                                        |
 * Descrição: Trabalho TG                                                   |
 * Sistema de inventario feito como conclusão do curso de Analise           |
 * e desenvolviento de Sistemas na Fatec de Santana de Parnaiba.            |
 O Sistema desenvolvido visa o gerenciamento do estoque, com a sua          | 
 principal caracteristica sendo o controle de inventario.                   |
 ---------------------------------------------------------------------------|
 Nome do Frame: frmAbout (Tela Sobre) - Descrição do software.              |
 ---------------------------------------------------------------------------|
 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
 * @author Alessandro de Sousa da Silva                                     |
 * Data: 27/05/2021                                                         |
 * Descrição: Desenvolvimento da tela sobre.                                |
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
*///-------------------------------------------------------------------------


// <editor-fold defaultstate="collapsed" desc="public frmRegistrationLocation & initComponents()">
public class frmAbout extends javax.swing.JFrame {

    public frmAbout() {
        initComponents();
               
        //Adiciona Icone na barra de titulo
        URL iconeImagem = getClass().getResource("/imagens/icon.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(iconeImagem);
        this.setIconImage(iconeTitulo);
        //fim - Adiciona Icone na barra de titulo
    } // </editor-fold> 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotoes = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        jpTela = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbfont07 = new javax.swing.JLabel();
        lbfont01 = new javax.swing.JLabel();
        lbfont02 = new javax.swing.JLabel();
        lbfont03 = new javax.swing.JLabel();
        lbfont06 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbfont04 = new javax.swing.JLabel();
        lbfont05 = new javax.swing.JLabel();
        jLabel08 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbVersao = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbfont09 = new javax.swing.JLabel();
        lbImagemFundoTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Count++ Inventory - Sobre.");
        setBackground(new java.awt.Color(13, 20, 29));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanelBotoes.setBackground(new java.awt.Color(49, 72, 93));
        jPanelBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnVoltar.setBackground(new java.awt.Color(13, 20, 29));
        btnVoltar.setForeground(new java.awt.Color(204, 204, 204));
        btnVoltar.setMnemonic('v');
        btnVoltar.setText(" Voltar ");
        btnVoltar.setToolTipText("Clique aqui para retornar a tela principal (main).");
        btnVoltar.setBorder(new javax.swing.border.MatteBorder(null));
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setMaximumSize(new java.awt.Dimension(82, 26));
        btnVoltar.setMinimumSize(new java.awt.Dimension(82, 26));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(958, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanelBotoes);
        jPanelBotoes.setBounds(10, 550, 1050, 50);

        jpTela.setBackground(new java.awt.Color(49, 72, 93));
        jpTela.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpTela.setForeground(new java.awt.Color(13, 20, 29));
        jpTela.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(49, 72, 93));
        jPanel1.setLayout(null);

        lbfont07.setBackground(new java.awt.Color(13, 20, 29));
        lbfont07.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbfont07.setForeground(new java.awt.Color(204, 204, 204));
        lbfont07.setText("     Analista de Sistemas");
        jPanel1.add(lbfont07);
        lbfont07.setBounds(100, 220, 410, 16);

        lbfont01.setBackground(new java.awt.Color(13, 20, 29));
        lbfont01.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbfont01.setForeground(new java.awt.Color(204, 204, 204));
        lbfont01.setText("   Desenvolvido por Alunos do Curso de ADS do CPS - Fatec SdP");
        jPanel1.add(lbfont01);
        lbfont01.setBounds(0, 10, 550, 16);

        lbfont02.setBackground(new java.awt.Color(13, 20, 29));
        lbfont02.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbfont02.setForeground(new java.awt.Color(204, 204, 204));
        lbfont02.setText("   com a orientação do Professor Aimar Martins Lopes.");
        jPanel1.add(lbfont02);
        lbfont02.setBounds(0, 30, 550, 20);

        lbfont03.setBackground(new java.awt.Color(49, 72, 93));
        lbfont03.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbfont03.setForeground(new java.awt.Color(204, 204, 204));
        lbfont03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbfont03.setText("  Autores do sistema:");
        jPanel1.add(lbfont03);
        lbfont03.setBounds(-10, 70, 540, 30);

        lbfont06.setBackground(new java.awt.Color(13, 20, 29));
        lbfont06.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbfont06.setForeground(new java.awt.Color(204, 204, 204));
        lbfont06.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbfont06.setText("    Davi de Souza Silva                      RA:  2830481921006");
        jPanel1.add(lbfont06);
        lbfont06.setBounds(100, 200, 410, 16);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img_Alessandro.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 100, 90, 70);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img_Davi.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 170, 100, 80);

        lbfont04.setBackground(new java.awt.Color(13, 20, 29));
        lbfont04.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbfont04.setForeground(new java.awt.Color(204, 204, 204));
        lbfont04.setText("    Alessandro Sousa da Silva           RA:  2830481921037");
        jPanel1.add(lbfont04);
        lbfont04.setBounds(100, 120, 410, 16);

        lbfont05.setBackground(new java.awt.Color(13, 20, 29));
        lbfont05.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbfont05.setForeground(new java.awt.Color(204, 204, 204));
        lbfont05.setText("     Analista de Sistemas");
        jPanel1.add(lbfont05);
        lbfont05.setBounds(100, 140, 410, 16);

        jLabel08.setBackground(new java.awt.Color(13, 20, 29));
        jLabel08.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel08.setForeground(new java.awt.Color(204, 204, 204));
        jLabel08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel08.setText("Ou Acione o nosso suporte @countinventory.com");
        jPanel1.add(jLabel08);
        jLabel08.setBounds(-10, 276, 390, 30);

        jLabel10.setBackground(new java.awt.Color(13, 20, 29));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Em caso de dúvida, acesse a documentação do sistema no Menu / Ajuda.");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(-10, 260, 540, 16);

        jpTela.add(jPanel1);
        jPanel1.setBounds(10, 130, 530, 300);

        lbVersao.setBackground(new java.awt.Color(0, 0, 0));
        lbVersao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbVersao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVersao.setText("                                                                                     versão 2022.01.01");
        jpTela.add(lbVersao);
        lbVersao.setBounds(0, 100, 540, 17);

        lbTitulo.setBackground(new java.awt.Color(49, 72, 93));
        lbTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img_logoCountInv.jpg"))); // NOI18N
        jpTela.add(lbTitulo);
        lbTitulo.setBounds(10, 0, 540, 120);

        lbfont09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cps50-gov.png"))); // NOI18N
        jpTela.add(lbfont09);
        lbfont09.setBounds(10, 430, 520, 100);

        getContentPane().add(jpTela);
        jpTela.setBounds(520, 10, 540, 530);

        lbImagemFundoTela.setBackground(new java.awt.Color(13, 20, 29));
        lbImagemFundoTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SobreImg.jpg"))); // NOI18N
        getContentPane().add(lbImagemFundoTela);
        lbImagemFundoTela.setBounds(0, 0, 1066, 610);

        setBounds(250, 75, 1066, 611);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose(); //fecha somente o jFrame do frmCadUsuario
         
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAbout().setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Variables declaration - do not modify">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel08;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jpTela;
    private javax.swing.JLabel lbImagemFundoTela;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbVersao;
    private javax.swing.JLabel lbfont01;
    private javax.swing.JLabel lbfont02;
    private javax.swing.JLabel lbfont03;
    private javax.swing.JLabel lbfont04;
    private javax.swing.JLabel lbfont05;
    private javax.swing.JLabel lbfont06;
    private javax.swing.JLabel lbfont07;
    private javax.swing.JLabel lbfont09;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
