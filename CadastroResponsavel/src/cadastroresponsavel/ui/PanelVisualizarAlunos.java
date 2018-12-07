/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.ui;

import cadastroresponsavel.controller.AlunoController;
import cadastroresponsavel.model.Aluno;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Andre
 */
public class PanelVisualizarAlunos extends javax.swing.JPanel {
    private List<Aluno> alunos;
    /**
     * Creates new form PanelVisualizarAlunos
     */
    public PanelVisualizarAlunos() {
        initComponents();
        AlunoController ac = new AlunoController();
        alunos = ac.visualizarAluno();
        this.preencherTabela(alunos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        btOrdenarProntuario = new javax.swing.JButton();
        btOrdenarResponsavel = new javax.swing.JButton();
        btOrdenarNome = new javax.swing.JButton();
        btAlterarAluno = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        lbProcurar = new javax.swing.JLabel();
        btProcurarAluno = new javax.swing.JButton();
        tfProntuarioProcurar = new javax.swing.JTextField();
        jsBarraRolagem = new javax.swing.JScrollPane();
        tbAlunos = new javax.swing.JTable();

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Visualização de Alunos");

        btOrdenarProntuario.setText("Ordernar por prontuário");
        btOrdenarProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdenarProntuarioActionPerformed(evt);
            }
        });

        btOrdenarResponsavel.setText("Ordernar por responsável");
        btOrdenarResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdenarResponsavelActionPerformed(evt);
            }
        });

        btOrdenarNome.setText("Ordernar por nome");
        btOrdenarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdenarNomeActionPerformed(evt);
            }
        });

        btAlterarAluno.setText("Alterar");
        btAlterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarAlunoActionPerformed(evt);
            }
        });

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        lbProcurar.setText("Prontuário do aluno a procurar:");

        btProcurarAluno.setText("Procurar");
        btProcurarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProcurarAlunoActionPerformed(evt);
            }
        });

        tbAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Prontuário", "Nome", "Responsável"
            }
        ));
        jsBarraRolagem.setViewportView(tbAlunos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbProcurar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfProntuarioProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btProcurarAluno))
                            .addComponent(jsBarraRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btAlterarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btOrdenarProntuario)
                                        .addGap(42, 42, 42)
                                        .addComponent(btOrdenarNome)))
                                .addGap(56, 56, 56)
                                .addComponent(btOrdenarResponsavel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProcurar)
                    .addComponent(btProcurarAluno)
                    .addComponent(tfProntuarioProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jsBarraRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btOrdenarProntuario)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btOrdenarResponsavel)
                        .addComponent(btOrdenarNome)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAlterarAluno)
                    .addComponent(btRemover))
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btOrdenarProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdenarProntuarioActionPerformed

    }//GEN-LAST:event_btOrdenarProntuarioActionPerformed

    private void btOrdenarResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdenarResponsavelActionPerformed

    }//GEN-LAST:event_btOrdenarResponsavelActionPerformed

    private void btOrdenarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdenarNomeActionPerformed

    }//GEN-LAST:event_btOrdenarNomeActionPerformed

    private void btAlterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarAlunoActionPerformed
        JPanel panel = new PanelAlterarAluno();
        JFrame frame = new JFrame();
         
        frame.setSize(605, 523);
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.add(panel);
        frame.setVisible(true);
    }//GEN-LAST:event_btAlterarAlunoActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed

    }//GEN-LAST:event_btRemoverActionPerformed

    private void btProcurarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProcurarAlunoActionPerformed

    }//GEN-LAST:event_btProcurarAlunoActionPerformed


    private void preencherTabela(List alunos) {
       
        AlunosTableModelo modeloTabela = new AlunosTableModelo(alunos);
       
        tbAlunos.setModel(modeloTabela);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarAluno;
    private javax.swing.JButton btOrdenarNome;
    private javax.swing.JButton btOrdenarProntuario;
    private javax.swing.JButton btOrdenarResponsavel;
    private javax.swing.JButton btProcurarAluno;
    private javax.swing.JButton btRemover;
    private javax.swing.JScrollPane jsBarraRolagem;
    private javax.swing.JLabel lbProcurar;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tbAlunos;
    private javax.swing.JTextField tfProntuarioProcurar;
    // End of variables declaration//GEN-END:variables
}
