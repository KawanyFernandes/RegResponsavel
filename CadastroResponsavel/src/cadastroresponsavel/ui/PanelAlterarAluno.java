/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.ui;

import cadastroresponsavel.controller.AlunoController;
import cadastroresponsavel.controller.ResponsavelController;
import cadastroresponsavel.model.Aluno;
import cadastroresponsavel.model.Responsavel;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author Andre
 */
public class PanelAlterarAluno extends javax.swing.JPanel {
    Aluno a = new Aluno();
    AlunoController ac = new AlunoController();
    ResponsavelController rc = new ResponsavelController();
    private List<Responsavel> responsaveis;
    /**
     * Creates new form PanelCadastroUsuario
     */
    public PanelAlterarAluno(Aluno a) {
        initComponents();
        tfProntuario.setText(Integer.toString(a.getProntuario()));
        tfNome.setText(a.getNome());
        tfTelefone.setText(a.getTelefone());
        tfDataNascimento.setText(a.getData());
        
        responsaveis = rc.obterResponsavel(a);
        this.preencherTabelaResponsaveis(responsaveis);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNome = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        btAlterar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        lbProntuario = new javax.swing.JLabel();
        tfProntuario = new javax.swing.JTextField();
        lbDataNascimento = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        tfDataNascimento = new javax.swing.JFormattedTextField();
        tfTelefone = new javax.swing.JFormattedTextField();
        lbResponsaveis = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResponsaveis = new javax.swing.JTable();
        btAdicionar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();

        lbNome.setText("Nome:");

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Cadastrar Alterar Aluno");

        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeKeyTyped(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        lbProntuario.setText("Prontuário:");

        tfProntuario.setEnabled(false);

        lbDataNascimento.setText("Data de nascimento:");

        lbTelefone.setText("Telefone:");

        tfDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        try {
            tfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbResponsaveis.setText("Responsáveis:");

        tbResponsaveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tbResponsaveis);

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbDataNascimento)
                                    .addComponent(lbProntuario)
                                    .addComponent(lbNome)
                                    .addComponent(lbTelefone)
                                    .addComponent(btAdicionar)
                                    .addComponent(lbResponsaveis)
                                    .addComponent(btRemover))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfDataNascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProntuario)
                    .addComponent(tfProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataNascimento)
                    .addComponent(tfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbResponsaveis)
                        .addGap(18, 18, 18)
                        .addComponent(btAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btRemover))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(btCancelar)
                    .addComponent(btLimpar))
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        a.setNome(tfNome.getText());
        a.setData(tfDataNascimento.getText());
        a.setProntuario(Integer.parseInt("0" + tfProntuario.getText()));
        a.setTelefone(tfTelefone.getText());
        
        ac.atualizar(a);
        limpar();
        JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        System.exit(0);        
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        a.setProntuario(Integer.parseInt("0" + tfProntuario.getText()));
        JFrame frame = new FrameCadastrarResponsavel(a);
        frame.setVisible(true);
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        Responsavel resp = new Responsavel();
        int linha = tbResponsaveis.getSelectedRow();
        if(linha < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um contato.");
        } else {
            ResponsavelController rc = new ResponsavelController();
            rc.removerResponsavel(responsaveis.get(linha));
            JOptionPane.showMessageDialog(null, "Responsavel removido com sucesso!");
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void tfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeKeyTyped

    private void limpar(){
        tfNome.setText("");
        tfProntuario.setText("");
        tfTelefone.setText("");
        tfDataNascimento.setText("");
    }
    
     private void preencherTabelaResponsaveis(List responsaveis) {
       
        ResponsavelTableModel modeloTabela = new ResponsavelTableModel(responsaveis);
       
        tbResponsaveis.setModel(modeloTabela);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDataNascimento;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbProntuario;
    private javax.swing.JLabel lbResponsaveis;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tbResponsaveis;
    private javax.swing.JFormattedTextField tfDataNascimento;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfProntuario;
    private javax.swing.JFormattedTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
