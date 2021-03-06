/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Insinuante
 */
public class InformacaoJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AlunosJFrame
     */
    public InformacaoJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBack = new javax.swing.JPanel();
        jPanelBlue = new javax.swing.JPanel();
        jLabeFuncionario = new javax.swing.JLabel();
        jLabeSair = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Ajuda = new javax.swing.JPanel();
        jLabelInformacao = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelRg = new javax.swing.JLabel();
        jLabelLogradouro = new javax.swing.JLabel();
        jLabeGym = new javax.swing.JLabel();
        jPaneVersão = new javax.swing.JPanel();
        jLabeGym2 = new javax.swing.JLabel();
        jLabelVerSis = new javax.swing.JLabel();
        jLabelVerAtual = new javax.swing.JLabel();
        jTextFieldVersaoAtual = new javax.swing.JTextField();
        jTextFieldVersaoSistema = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informações do sistema");
        setUndecorated(true);

        jPanelBack.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanelBlue.setBackground(new java.awt.Color(45, 118, 232));

        jLabeFuncionario.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabeFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jLabeFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/about_White.png"))); // NOI18N
        jLabeFuncionario.setText(" Informações");

        jLabeSair.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabeSair.setForeground(new java.awt.Color(255, 255, 255));
        jLabeSair.setText("  X");
        jLabeSair.setToolTipText("Fechar");
        jLabeSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabeSairMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBlueLayout = new javax.swing.GroupLayout(jPanelBlue);
        jPanelBlue.setLayout(jPanelBlueLayout);
        jPanelBlueLayout.setHorizontalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBlueLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabeFuncionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBlueLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabeSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelBlueLayout.setVerticalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBlueLayout.createSequentialGroup()
                .addComponent(jLabeSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabeFuncionario)
                .addGap(26, 26, 26))
        );

        jTabbedPane1.setBackground(new java.awt.Color(45, 118, 232));
        jTabbedPane1.setToolTipText("Ajuda");

        Ajuda.setBackground(new java.awt.Color(255, 255, 255));

        jLabelInformacao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelInformacao.setForeground(new java.awt.Color(45, 118, 232));
        jLabelInformacao.setText("Precisando de ajuda, entre em contato conosco:");

        jLabelNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(45, 118, 232));
        jLabelNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/email@_blue.png"))); // NOI18N
        jLabelNome.setText(" E-mail  ");

        jLabelCpf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCpf.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Phone_blue.png"))); // NOI18N
        jLabelCpf.setText(" Telefone  ");

        jLabelRg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelRg.setText("williany.veras@gmail.com / elvis.nogueira150@gmail.com");

        jLabelLogradouro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelLogradouro.setText("(87) 99965-2602 / (87) 99612-2609");

        jLabeGym.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 55)); // NOI18N
        jLabeGym.setForeground(new java.awt.Color(45, 118, 232));
        jLabeGym.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo1.png"))); // NOI18N
        jLabeGym.setText(" GYM  ");

        javax.swing.GroupLayout AjudaLayout = new javax.swing.GroupLayout(Ajuda);
        Ajuda.setLayout(AjudaLayout);
        AjudaLayout.setHorizontalGroup(
            AjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjudaLayout.createSequentialGroup()
                .addGroup(AjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AjudaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(AjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInformacao)
                            .addGroup(AjudaLayout.createSequentialGroup()
                                .addGroup(AjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(AjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelRg)
                                    .addComponent(jLabelLogradouro)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AjudaLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabeGym)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        AjudaLayout.setVerticalGroup(
            AjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjudaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabeGym)
                .addGap(35, 35, 35)
                .addComponent(jLabelInformacao)
                .addGap(30, 30, 30)
                .addGroup(AjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelRg))
                .addGap(30, 30, 30)
                .addGroup(AjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpf)
                    .addComponent(jLabelLogradouro))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ajuda", Ajuda);

        jPaneVersão.setBackground(new java.awt.Color(255, 255, 255));
        jPaneVersão.setToolTipText("Versão");

        jLabeGym2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 55)); // NOI18N
        jLabeGym2.setForeground(new java.awt.Color(45, 118, 232));
        jLabeGym2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo1.png"))); // NOI18N
        jLabeGym2.setText(" GYM  ");

        jLabelVerSis.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelVerSis.setForeground(new java.awt.Color(45, 118, 232));
        jLabelVerSis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Software_Installer_30px.png"))); // NOI18N
        jLabelVerSis.setText("Versão do seu sistema:");

        jLabelVerAtual.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelVerAtual.setForeground(new java.awt.Color(45, 118, 232));
        jLabelVerAtual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Software_Installer_30px.png"))); // NOI18N
        jLabelVerAtual.setText("Versão atual do sistema:");

        jTextFieldVersaoAtual.setEditable(false);
        jTextFieldVersaoAtual.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldVersaoAtual.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldVersaoAtual.setText("1.0");
        jTextFieldVersaoAtual.setToolTipText("Digite texto para pesquisa");
        jTextFieldVersaoAtual.setBorder(null);
        jTextFieldVersaoAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVersaoAtualActionPerformed(evt);
            }
        });

        jTextFieldVersaoSistema.setEditable(false);
        jTextFieldVersaoSistema.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldVersaoSistema.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldVersaoSistema.setText("1.0");
        jTextFieldVersaoSistema.setToolTipText("Digite texto para pesquisa");
        jTextFieldVersaoSistema.setBorder(null);
        jTextFieldVersaoSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVersaoSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaneVersãoLayout = new javax.swing.GroupLayout(jPaneVersão);
        jPaneVersão.setLayout(jPaneVersãoLayout);
        jPaneVersãoLayout.setHorizontalGroup(
            jPaneVersãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneVersãoLayout.createSequentialGroup()
                .addGroup(jPaneVersãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneVersãoLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabeGym2))
                    .addGroup(jPaneVersãoLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPaneVersãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelVerAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelVerSis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPaneVersãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPaneVersãoLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jTextFieldVersaoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldVersaoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPaneVersãoLayout.setVerticalGroup(
            jPaneVersãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneVersãoLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabeGym2)
                .addGap(49, 49, 49)
                .addGroup(jPaneVersãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVerSis)
                    .addComponent(jTextFieldVersaoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPaneVersãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVerAtual)
                    .addComponent(jTextFieldVersaoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Versão", jPaneVersão);

        jButtonCancelar.setBackground(new java.awt.Color(45, 118, 232));
        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Fechar");
        jButtonCancelar.setToolTipText("Fechar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackLayout = new javax.swing.GroupLayout(jPanelBack);
        jPanelBack.setLayout(jPanelBackLayout);
        jPanelBackLayout.setHorizontalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanelBackLayout.setVerticalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackLayout.createSequentialGroup()
                .addComponent(jPanelBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(600, 536));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldVersaoAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVersaoAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVersaoAtualActionPerformed

    private void jTextFieldVersaoSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVersaoSistemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVersaoSistemaActionPerformed

    private void jLabeSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeSairMousePressed
         dispose();
    }//GEN-LAST:event_jLabeSairMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ajuda;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabeFuncionario;
    private javax.swing.JLabel jLabeGym;
    private javax.swing.JLabel jLabeGym2;
    private javax.swing.JLabel jLabeSair;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelInformacao;
    private javax.swing.JLabel jLabelLogradouro;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelVerAtual;
    private javax.swing.JLabel jLabelVerSis;
    private javax.swing.JPanel jPaneVersão;
    private javax.swing.JPanel jPanelBack;
    private javax.swing.JPanel jPanelBlue;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldVersaoAtual;
    private javax.swing.JTextField jTextFieldVersaoSistema;
    // End of variables declaration//GEN-END:variables
}
