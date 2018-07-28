/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import app.Projeto_GYM;
import app.Util;
import java.sql.Date;
import model.Aluno;
import model.ControleFinanceiro;
import model.Funcionario;
import model.Pagamento;

/**
 *
 * @author Insinuante
 */
public class AlunosLancarFaturaJFrame extends javax.swing.JFrame {
    private Pagamento p;
    private Aluno aluno;
    private ControleFinanceiro c;
    /**
     * Creates new form NewJFrameLogin
     */
    public AlunosLancarFaturaJFrame(Pagamento p, Aluno aluno) {
        this.p = p;
        c = new ControleFinanceiro();
        this.aluno = aluno;
        initComponents();
        jComboBoxServico.setSelectedItem("Avaliação Física");
        jComboBoxServico.setEditable(false);
        jTextFieldUsuario.setText(aluno.getNome());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jPanelSair = new javax.swing.JPanel();
        jLabeSair = new javax.swing.JLabel();
        jLabelServico = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelLogin2 = new javax.swing.JLabel();
        jButtonLancar = new javax.swing.JButton();
        jLabelLogin3 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jComboBoxServico = new javax.swing.JComboBox<>();
        jLabelData = new javax.swing.JLabel();
        jLabelData1 = new javax.swing.JLabel();
        jButtonFechar = new javax.swing.JButton();
        jFormattedTextFieldDataPag = new javax.swing.JFormattedTextField();
        jLabelDados = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxFormaPag = new javax.swing.JComboBox<>();
        jFormattedTextFieldDataVenc = new javax.swing.JFormattedTextField();
        jLabelData2 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lançamento");
        setUndecorated(true);

        jPanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        jPanelSair.setBackground(new java.awt.Color(45, 118, 232));

        jLabeSair.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabeSair.setForeground(new java.awt.Color(255, 255, 255));
        jLabeSair.setText("  X");
        jLabeSair.setToolTipText("Sair");
        jLabeSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabeSairMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSairLayout = new javax.swing.GroupLayout(jPanelSair);
        jPanelSair.setLayout(jPanelSairLayout);
        jPanelSairLayout.setHorizontalGroup(
            jPanelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabeSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );
        jPanelSairLayout.setVerticalGroup(
            jPanelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSairLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabeSair))
        );

        jLabelServico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelServico.setForeground(new java.awt.Color(45, 118, 232));
        jLabelServico.setText("Serviço");

        jTextFieldUsuario.setEditable(false);
        jTextFieldUsuario.setEnabled(false);
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });

        jLabelLogin2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelLogin2.setForeground(new java.awt.Color(45, 118, 232));
        jLabelLogin2.setText("Aluno");

        jButtonLancar.setBackground(new java.awt.Color(45, 118, 232));
        jButtonLancar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonLancar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLancar.setText("Lançar");
        jButtonLancar.setToolTipText("Lançar pagamento");
        jButtonLancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLancarActionPerformed(evt);
            }
        });

        jLabelLogin3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelLogin3.setForeground(new java.awt.Color(45, 118, 232));
        jLabelLogin3.setText("Id");

        jTextFieldId.setEditable(false);
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jComboBoxServico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBoxServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avaliação Física", "Mensalidade" }));
        jComboBoxServico.setEnabled(false);
        jComboBoxServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServicoActionPerformed(evt);
            }
        });

        jLabelData.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(45, 118, 232));
        jLabelData.setText("Data Pagamento");

        jLabelData1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelData1.setForeground(new java.awt.Color(45, 118, 232));
        jLabelData1.setText("Valor");

        jButtonFechar.setBackground(new java.awt.Color(45, 118, 232));
        jButtonFechar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonFechar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFechar.setText("Fechar");
        jButtonFechar.setToolTipText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldDataPag.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataPag.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jFormattedTextFieldDataPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataPagActionPerformed(evt);
            }
        });

        jLabelDados.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabelDados.setForeground(new java.awt.Color(45, 118, 232));
        jLabelDados.setText("Lançamento de conta");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 118, 232));
        jLabel1.setText("Forma de Pagamento");

        jComboBoxFormaPag.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBoxFormaPag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão Crétido", "Cartão Débito", "Cheque" }));

        try {
            jFormattedTextFieldDataVenc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataVenc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jFormattedTextFieldDataVenc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataVencActionPerformed(evt);
            }
        });

        jLabelData2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelData2.setForeground(new java.awt.Color(45, 118, 232));
        jLabelData2.setText("Data Vencimento");

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabelDados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLogin3)
                            .addComponent(jLabelServico)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldId)
                            .addComponent(jComboBoxFormaPag, 0, 135, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelData2)
                                    .addComponent(jFormattedTextFieldDataVenc, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelData)
                                    .addComponent(jFormattedTextFieldDataPag, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonLancar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelData1)
                                    .addComponent(jButtonFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jTextFieldValor)))
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLogin2))
                        .addGap(41, 41, 41))
                    .addComponent(jComboBoxServico, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDados))
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabelLogin3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelServico, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelData1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addComponent(jComboBoxServico, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addComponent(jLabelData2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jFormattedTextFieldDataVenc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldDataPag, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLancar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(jComboBoxFormaPag, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelLogin.getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(632, 314));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabeSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeSairMousePressed
        
    }//GEN-LAST:event_jLabeSairMousePressed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonLancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLancarActionPerformed
       p = get();
       Projeto_GYM.fachada.cadastrarPagamento(p);
       Projeto_GYM.fachada.cadastrarControleFinanceiro(c);
       this.dispose();
    }//GEN-LAST:event_jButtonLancarActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jComboBoxServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxServicoActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jFormattedTextFieldDataPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataPagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataPagActionPerformed

    private void jFormattedTextFieldDataVencActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataVencActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataVencActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLancar;
    private javax.swing.JComboBox<String> jComboBoxFormaPag;
    private javax.swing.JComboBox<String> jComboBoxServico;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataPag;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataVenc;
    private javax.swing.JLabel jLabeSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDados;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelData1;
    private javax.swing.JLabel jLabelData2;
    private javax.swing.JLabel jLabelLogin2;
    private javax.swing.JLabel jLabelLogin3;
    private javax.swing.JLabel jLabelServico;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelSair;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables

    private Pagamento get(){
        Date dataPag = Util.getDate(jFormattedTextFieldDataPag.getText());
        Date dataVenc = Util.getDate(jFormattedTextFieldDataVenc.getText());
        
        p.setData(dataPag);
        p.setDescricao(jComboBoxServico.getSelectedItem()+"");
        p.setFormaPag(jComboBoxFormaPag.getSelectedItem()+"");
        p.setFuncionario(Projeto_GYM.fachada.getFuncionarioLogado());
        p.setValor(Float.parseFloat(jTextFieldValor.getText()));
        
        c.setData(dataPag);
        c.setDescricao(this.aluno.getNome());
        c.setValor(Float.parseFloat(jTextFieldValor.getText()));
        c.setConta(Projeto_GYM.fachada.getByNomeConta(jComboBoxServico.getSelectedItem()+""));
                
        return p;
    }
    
        public Pagamento set(){
        String dataVenc = Util.getDateString(p.getDataVenc());
        
        jTextFieldUsuario.setText(p.getAluno().getNome());
        jFormattedTextFieldDataVenc.setText(dataVenc);
        jComboBoxServico.setSelectedItem(p.getServico());
        jComboBoxServico.setEditable(false);
        jTextFieldValor.setText(p.getValor()+"");
                
        return p;
    }

}
