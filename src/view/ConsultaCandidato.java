/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author giliarde
 */
public class ConsultaCandidato extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaCandidato
     */
    public ConsultaCandidato() {
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

        jPTituloCandidadosCadastrados = new javax.swing.JPanel();
        jLCandidadosCadastrados = new javax.swing.JLabel();
        jPCandidadosCadastrados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCandidatosCadastrados = new javax.swing.JTable();
        jBSairCandidadoCadastrados = new javax.swing.JButton();

        jPTituloCandidadosCadastrados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLCandidadosCadastrados.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCandidadosCadastrados.setText("Candidados Cadastrados");

        javax.swing.GroupLayout jPTituloCandidadosCadastradosLayout = new javax.swing.GroupLayout(jPTituloCandidadosCadastrados);
        jPTituloCandidadosCadastrados.setLayout(jPTituloCandidadosCadastradosLayout);
        jPTituloCandidadosCadastradosLayout.setHorizontalGroup(
            jPTituloCandidadosCadastradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloCandidadosCadastradosLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLCandidadosCadastrados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPTituloCandidadosCadastradosLayout.setVerticalGroup(
            jPTituloCandidadosCadastradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloCandidadosCadastradosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLCandidadosCadastrados)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPCandidadosCadastrados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTCandidatosCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Candidato", "Numero", "Cargo Eletivo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTCandidatosCadastrados);

        javax.swing.GroupLayout jPCandidadosCadastradosLayout = new javax.swing.GroupLayout(jPCandidadosCadastrados);
        jPCandidadosCadastrados.setLayout(jPCandidadosCadastradosLayout);
        jPCandidadosCadastradosLayout.setHorizontalGroup(
            jPCandidadosCadastradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCandidadosCadastradosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPCandidadosCadastradosLayout.setVerticalGroup(
            jPCandidadosCadastradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCandidadosCadastradosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jBSairCandidadoCadastrados.setText("Sair");
        jBSairCandidadoCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairCandidadoCadastradosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPTituloCandidadosCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPCandidadosCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSairCandidadoCadastrados)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPTituloCandidadosCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPCandidadosCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSairCandidadoCadastrados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSairCandidadoCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairCandidadoCadastradosActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSairCandidadoCadastradosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSairCandidadoCadastrados;
    private javax.swing.JLabel jLCandidadosCadastrados;
    private javax.swing.JPanel jPCandidadosCadastrados;
    private javax.swing.JPanel jPTituloCandidadosCadastrados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCandidatosCadastrados;
    // End of variables declaration//GEN-END:variables
}
