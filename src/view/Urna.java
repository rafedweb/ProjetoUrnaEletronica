/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CandidatoControlle;
import controller.VotoControlle;
import java.awt.Image;
import java.util.Calendar;
import javafx.scene.chart.PieChart;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class Urna extends javax.swing.JPanel {

     private CandidatoControlle candidatoController;
     private VotoControlle votoController;
    /**
     * Creates new form Urna
     */
    public Urna() {
        this.candidatoController = new CandidatoControlle();
        this.votoController = new VotoControlle();
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

        jPanel1 = new javax.swing.JPanel();
        jBTRES = new javax.swing.JButton();
        jBUM = new javax.swing.JButton();
        jBDOIS = new javax.swing.JButton();
        jBQUANTRO = new javax.swing.JButton();
        jBSETE = new javax.swing.JButton();
        jBCINCO = new javax.swing.JButton();
        jBSEIS = new javax.swing.JButton();
        jBOITO = new javax.swing.JButton();
        jBBRANCO = new javax.swing.JButton();
        jBNOVE = new javax.swing.JButton();
        jBZERO = new javax.swing.JButton();
        jBCONFIRMAR = new javax.swing.JButton();
        jBCANCELAR = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTNome = new javax.swing.JTextField();
        jLFoto = new javax.swing.JLabel();
        jTDigitoUM = new javax.swing.JTextField();
        jTCargo = new javax.swing.JTextField();
        jTDigitoDOIS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jBTRES.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBTRES.setText("3");
        jBTRES.setToolTipText("");
        jBTRES.setPreferredSize(new java.awt.Dimension(75, 70));
        jBTRES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTRESActionPerformed(evt);
            }
        });

        jBUM.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBUM.setText("1");
        jBUM.setPreferredSize(new java.awt.Dimension(75, 70));
        jBUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUMActionPerformed(evt);
            }
        });

        jBDOIS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBDOIS.setText("2");
        jBDOIS.setPreferredSize(new java.awt.Dimension(75, 70));
        jBDOIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDOISActionPerformed(evt);
            }
        });

        jBQUANTRO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBQUANTRO.setText("4");
        jBQUANTRO.setToolTipText("");
        jBQUANTRO.setPreferredSize(new java.awt.Dimension(75, 70));
        jBQUANTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBQUANTROActionPerformed(evt);
            }
        });

        jBSETE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBSETE.setText("7");
        jBSETE.setToolTipText("");
        jBSETE.setPreferredSize(new java.awt.Dimension(75, 70));
        jBSETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSETEActionPerformed(evt);
            }
        });

        jBCINCO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBCINCO.setText("5");
        jBCINCO.setToolTipText("");
        jBCINCO.setPreferredSize(new java.awt.Dimension(75, 70));
        jBCINCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCINCOActionPerformed(evt);
            }
        });

        jBSEIS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBSEIS.setText("6");
        jBSEIS.setToolTipText("");
        jBSEIS.setPreferredSize(new java.awt.Dimension(75, 70));
        jBSEIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSEISActionPerformed(evt);
            }
        });

        jBOITO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBOITO.setText("8");
        jBOITO.setToolTipText("");
        jBOITO.setPreferredSize(new java.awt.Dimension(75, 70));
        jBOITO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOITOActionPerformed(evt);
            }
        });

        jBBRANCO.setBackground(new java.awt.Color(255, 255, 255));
        jBBRANCO.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBBRANCO.setText("Branco");
        jBBRANCO.setToolTipText("");
        jBBRANCO.setPreferredSize(new java.awt.Dimension(70, 70));
        jBBRANCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBRANCOActionPerformed(evt);
            }
        });

        jBNOVE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBNOVE.setText("9");
        jBNOVE.setToolTipText("");
        jBNOVE.setPreferredSize(new java.awt.Dimension(75, 70));
        jBNOVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNOVEActionPerformed(evt);
            }
        });

        jBZERO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBZERO.setText("0");
        jBZERO.setToolTipText("");
        jBZERO.setPreferredSize(new java.awt.Dimension(70, 70));
        jBZERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBZEROActionPerformed(evt);
            }
        });

        jBCONFIRMAR.setBackground(new java.awt.Color(0, 153, 51));
        jBCONFIRMAR.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBCONFIRMAR.setText("Confirma");
        jBCONFIRMAR.setToolTipText("");
        jBCONFIRMAR.setPreferredSize(new java.awt.Dimension(70, 70));
        jBCONFIRMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCONFIRMARActionPerformed(evt);
            }
        });

        jBCANCELAR.setBackground(new java.awt.Color(255, 0, 51));
        jBCANCELAR.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBCANCELAR.setText("Corrige");
        jBCANCELAR.setToolTipText("");
        jBCANCELAR.setPreferredSize(new java.awt.Dimension(70, 70));
        jBCANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCANCELARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBBRANCO, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBCONFIRMAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBUM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBDOIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBQUANTRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCINCO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSEIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBSETE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBZERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBOITO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBNOVE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBUM, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDOIS, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTRES, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBQUANTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSETE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBOITO, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNOVE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBZERO, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBBRANCO, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jBCONFIRMAR, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTNome.setEditable(false);
        jTNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTNome, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTDigitoUM.setEditable(false);
        jTDigitoUM.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTDigitoUM.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTCargo.setEditable(false);
        jTCargo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTCargo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTDigitoDOIS.setEditable(false);
        jTDigitoDOIS.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTDigitoDOIS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("FATENE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTDigitoUM, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTDigitoDOIS, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTCargo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDigitoUM, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDigitoDOIS, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUMActionPerformed
        // TODO add your handling code here:
        if ("".equals(jTDigitoUM.getText()) || jTDigitoUM.getText().isEmpty()) {
            jTDigitoUM.setText("1");
        }else{
            if ("".equals(jTDigitoDOIS.getText()) || jTDigitoDOIS.getText().isEmpty()) {
              jTDigitoDOIS.setText("1"); 
              BuscarCandidato();
            }            
        }
    }//GEN-LAST:event_jBUMActionPerformed

    private void jBDOISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDOISActionPerformed
        // TODO add your handling code here:
         if ("".equals(jTDigitoUM.getText()) || jTDigitoUM.getText().isEmpty()) {
            jTDigitoUM.setText("2");
        }else{
            if ("".equals(jTDigitoDOIS.getText()) || jTDigitoDOIS.getText().isEmpty()) {
              jTDigitoDOIS.setText("2");
              BuscarCandidato();
            }
        }
    }//GEN-LAST:event_jBDOISActionPerformed

    private void jBTRESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTRESActionPerformed
        // TODO add your handling code here:
         if ("".equals(jTDigitoUM.getText()) || jTDigitoUM.getText().isEmpty()) {
            jTDigitoUM.setText("3");
        }else{
            if ("".equals(jTDigitoDOIS.getText()) || jTDigitoDOIS.getText().isEmpty()) {
              jTDigitoDOIS.setText("3");
              BuscarCandidato();
            }
        }
    }//GEN-LAST:event_jBTRESActionPerformed

    private void jBQUANTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBQUANTROActionPerformed
        // TODO add your handling code here:
         if ("".equals(jTDigitoUM.getText())|| jTDigitoUM.getText().isEmpty()) {
            jTDigitoUM.setText("4");
        }else{
             if ("".equals(jTDigitoDOIS.getText()) || jTDigitoDOIS.getText().isEmpty()) {
              jTDigitoDOIS.setText("4");  
              BuscarCandidato();
            }
        }
    }//GEN-LAST:event_jBQUANTROActionPerformed

    private void jBCINCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCINCOActionPerformed
        // TODO add your handling code here:
         if ("".equals(jTDigitoUM.getText()) || jTDigitoUM.getText().isEmpty()) {
            jTDigitoUM.setText("5");
        }else{
             if ("".equals(jTDigitoDOIS.getText()) || jTDigitoDOIS.getText().isEmpty()) {
              jTDigitoDOIS.setText("5");  
              BuscarCandidato();
            }
        }
    }//GEN-LAST:event_jBCINCOActionPerformed

    private void jBSEISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSEISActionPerformed
        // TODO add your handling code here:
         if ("".equals(jTDigitoUM.getText()) || jTDigitoUM.getText().isEmpty()) {
            jTDigitoUM.setText("6");
        }else{
             if ("".equals(jTDigitoDOIS.getText()) || jTDigitoDOIS.getText().isEmpty()) {
              jTDigitoDOIS.setText("6"); 
              BuscarCandidato();
            }
        }
    }//GEN-LAST:event_jBSEISActionPerformed

    private void jBSETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSETEActionPerformed
        // TODO add your handling code here:
         if ("".equals(jTDigitoUM.getText()) || jTDigitoUM.getText().isEmpty()) {
            jTDigitoUM.setText("7");
        }else{
             if ("".equals(jTDigitoDOIS.getText()) || jTDigitoDOIS.getText().isEmpty()) {
              jTDigitoDOIS.setText("7");
              BuscarCandidato();
            }
        }
    }//GEN-LAST:event_jBSETEActionPerformed

    private void jBOITOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOITOActionPerformed
        // TODO add your handling code here:
         if ("".equals(jTDigitoUM.getText()) || jTDigitoUM.getText().isEmpty()) {
            jTDigitoUM.setText("8");
            BuscarCandidato();
        }else{
             if ("".equals(jTDigitoDOIS.getText()) || jTDigitoDOIS.getText().isEmpty()) {
              jTDigitoDOIS.setText("8");
              BuscarCandidato();
            }
        }
    }//GEN-LAST:event_jBOITOActionPerformed

    private void jBNOVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNOVEActionPerformed
        // TODO add your handling code here:
         if ("".equals(jTDigitoUM.getText()) || jTDigitoUM.getText().isEmpty()) {
            jTDigitoUM.setText("9");
        }else{
            if ("".equals(jTDigitoDOIS.getText()) || jTDigitoDOIS.getText().isEmpty()) {
              jTDigitoDOIS.setText("9");
              BuscarCandidato();
            }
        }
    }//GEN-LAST:event_jBNOVEActionPerformed

    private void jBZEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBZEROActionPerformed
        // TODO add your handling code here:
         if ("".equals(jTDigitoUM.getText()) || jTDigitoUM.getText().isEmpty()) {
            jTDigitoUM.setText("0");
        }else{
            if ("".equals(jTDigitoDOIS.getText()) || jTDigitoDOIS.getText().isEmpty()) {
              jTDigitoDOIS.setText("0"); 
              BuscarCandidato();
            }
        }
    }//GEN-LAST:event_jBZEROActionPerformed

    private void jBBRANCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBRANCOActionPerformed
        // TODO add your handling code here:
        
        jTDigitoUM.setText("0");
        jTDigitoDOIS.setText("0"); 
        
        votoController.voto.setValorVoto(00);
        votoController.voto.setDataVoto(Calendar.getInstance());
        votoController.candidato = null;
        votoController.Votar();
    }//GEN-LAST:event_jBBRANCOActionPerformed

    private void jBCONFIRMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCONFIRMARActionPerformed
        // TODO add your handling code here:
        if ("".equals(jTDigitoUM.getText()) || "".equals(jTDigitoDOIS.getText())) {
            JOptionPane.showMessageDialog(this, "Voto invalido, preencha o número do candidato!");
        }else{
            String numero = jTDigitoUM.getText() + jTDigitoDOIS.getText();
            int valor = Integer.parseInt(numero);
            
           votoController.candidato = candidatoController.BuscarCandidato(valor);
           
            if (votoController.candidato == null) { 
                //valor 1 significa voto nulo
                valor = 1;
            }
           votoController.voto.setValorVoto(valor);
           votoController.voto.setDataVoto(Calendar.getInstance());
           votoController.Votar();
           LimparCampos();
        }
    }//GEN-LAST:event_jBCONFIRMARActionPerformed

    private void BuscarCandidato(){
           String numero = jTDigitoUM.getText() + jTDigitoDOIS.getText();
            int valor = Integer.parseInt(numero);
            
           votoController.candidato = candidatoController.BuscarCandidato(valor);
           
           if (votoController.candidato != null) {
            jTNome.setText(votoController.candidato.getNome());
            jTCargo.setText(votoController.candidato.getCargo());
            
            ImageIcon imagem = new ImageIcon(votoController.candidato.getFoto());
            
            jLFoto.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jLFoto.getWidth(), jLFoto.getHeight(), Image.SCALE_DEFAULT)));
           }
           
    } 
    
    private void LimparCampos(){
        jTDigitoUM.setText("");
        jTDigitoDOIS.setText("");
        jTCargo.setText("");
        jTNome.setText("");
    }
    
    private void jBCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCANCELARActionPerformed
        // TODO add your handling code here:
        LimparCampos();        
    }//GEN-LAST:event_jBCANCELARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBRANCO;
    private javax.swing.JButton jBCANCELAR;
    private javax.swing.JButton jBCINCO;
    private javax.swing.JButton jBCONFIRMAR;
    private javax.swing.JButton jBDOIS;
    private javax.swing.JButton jBNOVE;
    private javax.swing.JButton jBOITO;
    private javax.swing.JButton jBQUANTRO;
    private javax.swing.JButton jBSEIS;
    private javax.swing.JButton jBSETE;
    private javax.swing.JButton jBTRES;
    private javax.swing.JButton jBUM;
    private javax.swing.JButton jBZERO;
    private javax.swing.JLabel jLFoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTCargo;
    private javax.swing.JTextField jTDigitoDOIS;
    private javax.swing.JTextField jTDigitoUM;
    private javax.swing.JTextField jTNome;
    // End of variables declaration//GEN-END:variables
}
