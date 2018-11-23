/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CandidatoControlle;
import controller.VotoControlle;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;

/**
 *
 * @author giliarde
 */
public class MenuView extends javax.swing.JFrame {

    private CandidatoControlle candidatoController;
     private VotoControlle votoController;
    /**
     * Creates new form MenuView
     */
    public MenuView() {
        this.candidatoController = new CandidatoControlle();
        this.votoController = new VotoControlle();

        Login lg = new Login();

        this.setLocationRelativeTo(null);
        this.setExtendedState(this.MAXIMIZED_BOTH);        

        initComponents();
        this.jBPrincipal.add(lg);                
        lg.setVisible(true);
        
        
        try {
            lg.setMaximum(true);
       
           lg.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
           
        } catch (PropertyVetoException ex) {
           Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBPrincipal = new javax.swing.JDesktopPane();
        CadastrarCandidato = new javax.swing.JButton();
        jBLimparBase = new javax.swing.JButton();
        jBRelatorio = new javax.swing.JButton();
        jBUrnaElectronica = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CadastrarCandidato.setText("Cadastrar Candidato");
        CadastrarCandidato.setToolTipText("");
        CadastrarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarCandidatoActionPerformed(evt);
            }
        });
        jBPrincipal.add(CadastrarCandidato);
        CadastrarCandidato.setBounds(70, 430, 280, 40);

        jBLimparBase.setText("Limpar Base de Dados");
        jBLimparBase.setToolTipText("");
        jBLimparBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparBaseActionPerformed(evt);
            }
        });
        jBPrincipal.add(jBLimparBase);
        jBLimparBase.setBounds(70, 500, 280, 40);

        jBRelatorio.setText("Relatório");
        jBRelatorio.setToolTipText("");
        jBRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRelatorioActionPerformed(evt);
            }
        });
        jBPrincipal.add(jBRelatorio);
        jBRelatorio.setBounds(70, 360, 130, 40);

        jBUrnaElectronica.setText("Urna");
        jBUrnaElectronica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUrnaElectronicaActionPerformed(evt);
            }
        });
        jBPrincipal.add(jBUrnaElectronica);
        jBUrnaElectronica.setBounds(220, 360, 130, 40);

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });
        jBPrincipal.add(jBSair);
        jBSair.setBounds(270, 563, 80, 40);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void CadastrarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarCandidatoActionPerformed
        // TODO add your handling code here:
        
        CadastrarCandidato telaCadastrar = new CadastrarCandidato();
        this.jBPrincipal.add(telaCadastrar);
        telaCadastrar.setVisible(true);
    }//GEN-LAST:event_CadastrarCandidatoActionPerformed

    private void jBUrnaElectronicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUrnaElectronicaActionPerformed
        // TODO add your handling code here:
        UrnaEletronica urna = new UrnaEletronica();
       this.jBPrincipal.add(urna);
       try {
            urna.setMaximum(true);
       
           urna.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
           
        } catch (PropertyVetoException ex) {
           Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
       }
       urna.setVisible(true);
       urna.setLocation(0,0);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_jBUrnaElectronicaActionPerformed

    private void jBRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRelatorioActionPerformed
        // TODO add your handling code here:
        Relatorio relatorio = new Relatorio();
        this.jBPrincipal.add(relatorio);      
        relatorio.setVisible(true);
    }//GEN-LAST:event_jBRelatorioActionPerformed

    private void jBLimparBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparBaseActionPerformed
        // TODO add your handling code here:
        votoController.Limpar();
        candidatoController.Limpar();
        
    }//GEN-LAST:event_jBLimparBaseActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarCandidato;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jBLimparBase;
    private javax.swing.JDesktopPane jBPrincipal;
    private javax.swing.JButton jBRelatorio;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBUrnaElectronica;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
