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
public class Relatorio extends javax.swing.JInternalFrame {

    /** Creates new form Relatorio */
    public Relatorio() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPRelatorioVotacao = new javax.swing.JPanel();
        jTCandidato01 = new javax.swing.JTextField();
        jTCandidato05 = new javax.swing.JTextField();
        jTCandidato02 = new javax.swing.JTextField();
        jTCandidato03 = new javax.swing.JTextField();
        jTCandidato04 = new javax.swing.JTextField();
        jTCandidato06 = new javax.swing.JTextField();
        jTNumCand01 = new javax.swing.JTextField();
        jTQtdVotos01 = new javax.swing.JTextField();
        jTVotosBrancos = new javax.swing.JTextField();
        jTVotosNulos = new javax.swing.JTextField();
        jTVotosValidos = new javax.swing.JTextField();
        jTEleitores = new javax.swing.JTextField();
        jBSair = new javax.swing.JButton();
        jLVotosBrancos = new javax.swing.JLabel();
        jLVotosNulos = new javax.swing.JLabel();
        jLVotosValidos = new javax.swing.JLabel();
        jLEleitores = new javax.swing.JLabel();
        jTNumCand02 = new javax.swing.JTextField();
        jTNumCand03 = new javax.swing.JTextField();
        jTQtdVotos03 = new javax.swing.JTextField();
        jTQtdVotos04 = new javax.swing.JTextField();
        jTNumCand04 = new javax.swing.JTextField();
        jTQtdVotos05 = new javax.swing.JTextField();
        jTQtdVotos06 = new javax.swing.JTextField();
        jTNumCand06 = new javax.swing.JTextField();
        jTQtdVotos02 = new javax.swing.JTextField();
        jTNumCand05 = new javax.swing.JTextField();
        jLNomeCandidado = new javax.swing.JLabel();
        jLNumeroCandidado = new javax.swing.JLabel();
        jLQtdVotos = new javax.swing.JLabel();
        jPTituloRelatorio = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);

        jPRelatorioVotacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBSair.setText("Sair");

        jLVotosBrancos.setText("Brancos");

        jLVotosNulos.setText("Nulos");

        jLVotosValidos.setText("Validos");

        jLEleitores.setText("Eleitores");

        jLNomeCandidado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLNomeCandidado.setText("Candidato");

        jLNumeroCandidado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLNumeroCandidado.setText("Numero");

        jLQtdVotos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLQtdVotos.setText("Qtd Votos");

        jPTituloRelatorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Relatorio das Eleições");

        javax.swing.GroupLayout jPTituloRelatorioLayout = new javax.swing.GroupLayout(jPTituloRelatorio);
        jPTituloRelatorio.setLayout(jPTituloRelatorioLayout);
        jPTituloRelatorioLayout.setHorizontalGroup(
            jPTituloRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloRelatorioLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel5)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPTituloRelatorioLayout.setVerticalGroup(
            jPTituloRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPRelatorioVotacaoLayout = new javax.swing.GroupLayout(jPRelatorioVotacao);
        jPRelatorioVotacao.setLayout(jPRelatorioVotacaoLayout);
        jPRelatorioVotacaoLayout.setHorizontalGroup(
            jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRelatorioVotacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPRelatorioVotacaoLayout.createSequentialGroup()
                        .addGroup(jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPRelatorioVotacaoLayout.createSequentialGroup()
                                    .addGroup(jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTCandidato02, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTCandidato03, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTCandidato04, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTCandidato05, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTCandidato01, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPRelatorioVotacaoLayout.createSequentialGroup()
                                            .addComponent(jTVotosBrancos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTVotosNulos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTVotosValidos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTCandidato06, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRelatorioVotacaoLayout.createSequentialGroup()
                                    .addComponent(jLNomeCandidado)
                                    .addGap(90, 90, 90)))
                            .addGroup(jPRelatorioVotacaoLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLVotosBrancos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLVotosNulos)
                                .addGap(65, 65, 65)
                                .addComponent(jLVotosValidos)
                                .addGap(32, 32, 32)))
                        .addGroup(jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPRelatorioVotacaoLayout.createSequentialGroup()
                                .addComponent(jTEleitores, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPRelatorioVotacaoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLEleitores)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPTituloRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPRelatorioVotacaoLayout.createSequentialGroup()
                            .addComponent(jTNumCand02, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTQtdVotos02, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPRelatorioVotacaoLayout.createSequentialGroup()
                            .addComponent(jTNumCand03, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTQtdVotos03, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPRelatorioVotacaoLayout.createSequentialGroup()
                            .addComponent(jTNumCand04, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTQtdVotos04, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPRelatorioVotacaoLayout.createSequentialGroup()
                            .addComponent(jTNumCand05, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTQtdVotos05, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPRelatorioVotacaoLayout.createSequentialGroup()
                            .addComponent(jTNumCand06, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTQtdVotos06, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPRelatorioVotacaoLayout.createSequentialGroup()
                            .addGroup(jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTNumCand01, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPRelatorioVotacaoLayout.createSequentialGroup()
                                    .addComponent(jLNumeroCandidado)
                                    .addGap(8, 8, 8)))
                            .addGap(18, 18, 18)
                            .addGroup(jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLQtdVotos)
                                .addComponent(jTQtdVotos01, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPRelatorioVotacaoLayout.setVerticalGroup(
            jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRelatorioVotacaoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPTituloRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNomeCandidado)
                    .addComponent(jLNumeroCandidado)
                    .addComponent(jLQtdVotos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCandidato01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNumCand01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQtdVotos01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCandidato02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNumCand02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQtdVotos02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCandidato03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNumCand03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQtdVotos03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCandidato04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQtdVotos04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNumCand04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCandidato05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQtdVotos05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNumCand05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCandidato06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNumCand06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQtdVotos06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLVotosBrancos)
                    .addComponent(jLVotosNulos)
                    .addComponent(jLVotosValidos)
                    .addComponent(jLEleitores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRelatorioVotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTVotosBrancos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTEleitores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTVotosValidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTVotosNulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSair))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPRelatorioVotacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPRelatorioVotacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLEleitores;
    private javax.swing.JLabel jLNomeCandidado;
    private javax.swing.JLabel jLNumeroCandidado;
    private javax.swing.JLabel jLQtdVotos;
    private javax.swing.JLabel jLVotosBrancos;
    private javax.swing.JLabel jLVotosNulos;
    private javax.swing.JLabel jLVotosValidos;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPRelatorioVotacao;
    private javax.swing.JPanel jPTituloRelatorio;
    private javax.swing.JTextField jTCandidato01;
    private javax.swing.JTextField jTCandidato02;
    private javax.swing.JTextField jTCandidato03;
    private javax.swing.JTextField jTCandidato04;
    private javax.swing.JTextField jTCandidato05;
    private javax.swing.JTextField jTCandidato06;
    private javax.swing.JTextField jTEleitores;
    private javax.swing.JTextField jTNumCand01;
    private javax.swing.JTextField jTNumCand02;
    private javax.swing.JTextField jTNumCand03;
    private javax.swing.JTextField jTNumCand04;
    private javax.swing.JTextField jTNumCand05;
    private javax.swing.JTextField jTNumCand06;
    private javax.swing.JTextField jTQtdVotos01;
    private javax.swing.JTextField jTQtdVotos02;
    private javax.swing.JTextField jTQtdVotos03;
    private javax.swing.JTextField jTQtdVotos04;
    private javax.swing.JTextField jTQtdVotos05;
    private javax.swing.JTextField jTQtdVotos06;
    private javax.swing.JTextField jTVotosBrancos;
    private javax.swing.JTextField jTVotosNulos;
    private javax.swing.JTextField jTVotosValidos;
    // End of variables declaration//GEN-END:variables

}
