
package view;
import controller.CandidatoControlle;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


 public class CadastrarCandidato extends javax.swing.JInternalFrame {
 private CandidatoControlle candidatoController;
   
 
   
     
    public CadastrarCandidato(){ 
        this.candidatoController = new CandidatoControlle();
        
        
        initComponents();
    }
    
    public void Salvar(){
        candidatoController.candidato.setNome(jTNome.getText());
        candidatoController.candidato.setCargo(jTCargo.getText());
        candidatoController.candidato.setNumero(Integer.parseInt(jTNumero.getText()));
        
        
        candidatoController.Salvar(candidatoController.candidato);
    }
    
    public void LimparCampos(){
        jTNome.setText("");
        jTNumero.setText("");
        jTCargo.setText("");
        jLImagem.setText(null);
        jLImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/semFoto.jpg")));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTNome = new javax.swing.JTextField();
        jTCargo = new javax.swing.JTextField();
        jTNumero = new javax.swing.JTextField();
        jLNome = new javax.swing.JLabel();
        jLCargo = new javax.swing.JLabel();
        jLNumero = new javax.swing.JLabel();
        jBSalvar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jLTituloTela = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLImagem = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBVisualisar = new javax.swing.JButton();
        jBFoto = new javax.swing.JButton();

        jLNome.setText("Nome:");

        jLCargo.setText("Cargo:");

        jLNumero.setText("Numero");

        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jLTituloTela.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLTituloTela.setText("Cadastro de Candidatos");
        jLTituloTela.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/semFoto.jpg"))); // NOI18N
        jLImagem.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(522, 522, 522))
        );

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBVisualisar.setText("Visualisar");
        jBVisualisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisualisarActionPerformed(evt);
            }
        });

        jBFoto.setText("Foto");
        jBFoto.setToolTipText("");
        jBFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNumero)
                            .addComponent(jLCargo)
                            .addComponent(jLNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLTituloTela, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBVisualisar)
                        .addGap(18, 18, 18)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTituloTela, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNome))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCargo))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNumero)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBVisualisar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        // TODO add your handling code here:         
        
        Salvar();
        LimparCampos();  
        JOptionPane.showMessageDialog(null,"Candidato salvo com sucesso!");
       
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
      candidatoController.candidato = candidatoController.BuscarCandidato(Integer.parseInt(jTNumero.getText()));
       if (candidatoController.candidato != null) {
            jTNome.setText(candidatoController.candidato.getNome());
            jTCargo.setText(candidatoController.candidato.getCargo());
            
            ImageIcon imagem = new ImageIcon(candidatoController.candidato.getFoto());
            
            jLImagem.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jLImagem.getWidth(), jLImagem.getHeight(), Image.SCALE_DEFAULT)));
           }      
      
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        // TODO add your handling code here:
        
        Long idCandidato = candidatoController.BuscarCandidato(Integer.parseInt(jTNumero.getText())).getId();
        candidatoController.RemoveCandidato(Integer.valueOf(idCandidato.toString()));
        JOptionPane.showMessageDialog(null,"Candidato exlcuido com sucesso!");
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBVisualisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualisarActionPerformed
        
       ConsultaCandidato consultacandidato = new ConsultaCandidato();
        this.getParent().add(consultacandidato);
        consultacandidato.setVisible(true);
    }//GEN-LAST:event_jBVisualisarActionPerformed

    private void jBFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFotoActionPerformed
        // TODO add your handling code here:
      JFileChooser arquivo = new JFileChooser();
        arquivo.setDialogTitle("selecione imagem");
        arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int opc = arquivo.showOpenDialog(this);

         if (opc == JFileChooser.APPROVE_OPTION){
             File file = new File("caminho");
                  file = arquivo.getSelectedFile();
              String filename = file.getAbsolutePath();
             // String nomeArquivo = file.getName();
               ImageIcon imagem = new ImageIcon(arquivo.getSelectedFile().getPath());
               jLImagem.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jLImagem.getWidth(), jLImagem.getHeight(), Image.SCALE_DEFAULT)));
                
               candidatoController.candidato.setFoto(filename);
    
          }

    }//GEN-LAST:event_jBFotoActionPerformed

    public byte[] imageToByte(String image) throws IOException {
           InputStream is = null;
           byte[] buffer = null;
           is = new FileInputStream(image);
           buffer = new byte[is.available()];
           is.read(buffer);
           is.close();
           return buffer;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBFoto;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jBVisualisar;
    private javax.swing.JLabel jLCargo;
    private javax.swing.JLabel jLImagem;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLTituloTela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTCargo;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNumero;
    // End of variables declaration//GEN-END:variables
}
