/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.Main;
import org.classes.Utilizador;
import org.tipos.Pacote;

/**
 *
 * @author MrFabio
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);

        if (Main.activa == 1) {//com ligação
            activatudo();
        } else//sem ligação
        {
            fechatudo();

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

        TitleLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabelXSAIR = new javax.swing.JLabel();
        jPanelRegisto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldRegistoNome = new javax.swing.JTextField();
        jPasswordFieldInicio = new javax.swing.JPasswordField();
        jButtonREGISTAR = new javax.swing.JButton();
        jTextFieldLigacao = new javax.swing.JTextField();
        jButtonTestar = new javax.swing.JButton();
        jPanelLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleLabel.setBackground(new java.awt.Color(0, 0, 0));
        TitleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TitleLabel.setText("BananaStarter");

        jLabel15.setText("Crowd Funding Manager");

        jLabelXSAIR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelXSAIR.setText("X");
        jLabelXSAIR.setToolTipText("SAIR");
        jLabelXSAIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelXSAIRMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelXSAIRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelXSAIRMouseExited(evt);
            }
        });

        jPanelRegisto.setBorder(javax.swing.BorderFactory.createTitledBorder("Registo"));

        jLabel1.setText("Nome");

        jLabel4.setText("Password");

        jTextFieldRegistoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldRegistoNomeKeyPressed(evt);
            }
        });

        jPasswordFieldInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldInicioKeyPressed(evt);
            }
        });

        jButtonREGISTAR.setText("Registar");
        jButtonREGISTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonREGISTARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistoLayout = new javax.swing.GroupLayout(jPanelRegisto);
        jPanelRegisto.setLayout(jPanelRegistoLayout);
        jPanelRegistoLayout.setHorizontalGroup(
            jPanelRegistoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistoLayout.createSequentialGroup()
                .addGroup(jPanelRegistoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelRegistoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(jTextFieldRegistoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRegistoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordFieldInicio)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonREGISTAR)
                .addContainerGap())
        );
        jPanelRegistoLayout.setVerticalGroup(
            jPanelRegistoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistoLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanelRegistoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldRegistoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegistoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordFieldInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonREGISTAR))
        );

        jTextFieldLigacao.setEditable(false);

        jButtonTestar.setText("Testar");
        jButtonTestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestarActionPerformed(evt);
            }
        });

        jPanelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        jLabel2.setText("USER");

        jTextField1.setText("user");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel3.setText("PASS");

        jPasswordField1.setText("pass");
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        jButtonLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonLogin.setText("LOGIN");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLoginLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonLogin)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLoginLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonLogin))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitleLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelXSAIR)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(54, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelRegisto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLigacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTestar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelXSAIR)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jPanelRegisto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jTextFieldLigacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTestar)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonLoginActionPerformed(null);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonLoginActionPerformed(null);
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        if (Main.activa == 1) {

            //boolean user = jTextField1.getText().equals("user");
            String user = jTextField1.getText();
            char[] pass = jPasswordField1.getPassword();
            StringBuilder password = new StringBuilder();
            for (char c : pass) {
                password.append(c);
            }

            Pacote login = new Pacote();
            Utilizador userpass = new Utilizador(user, password.toString());
            login.criaREQLOGIN(userpass);
            Main.enviaPacote(login);
            try {
                while (Main.ReqLoginInt == -1) {
                    synchronized (this) {
                        this.wait();
                    }
                }
            } catch (InterruptedException ex) {
                System.out.println("No wait do LOGIN " + ex.toString());
            }
            if (Main.ReqLoginInt == 1) {//Registou entao loga o man
                Main.ReqLoginInt = -1;
                Main.userlogado = user;
                Main.inicio.dispose();
                Main.iniciaInterfaceSD();

            } else if (Main.ReqLoginInt == 0) {

                JOptionPane.showMessageDialog(this, "Password inválida", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Utilizador não existe", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
            Main.ReqLoginInt = -1;
            jTextField1.setText(null);
            jPasswordField1.setText(null);
        } else {
            JOptionPane.showMessageDialog(this, "Perdeu-se a ligação ao servidor", "Error", JOptionPane.INFORMATION_MESSAGE);
            fechatudo();
        }

    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jLabelXSAIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelXSAIRMouseClicked

        try {
            Main.tcl.interrupt();
            Main.s.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
        System.exit(1);
    }//GEN-LAST:event_jLabelXSAIRMouseClicked

    private void jLabelXSAIRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelXSAIRMouseEntered

        jLabelXSAIR.setForeground(Color.red);
    }//GEN-LAST:event_jLabelXSAIRMouseEntered

    private void jLabelXSAIRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelXSAIRMouseExited
        jLabelXSAIR.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabelXSAIRMouseExited

    private void jButtonREGISTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonREGISTARActionPerformed

        if (Main.activa == 1) {

            String nomer = jTextFieldRegistoNome.getText();
            char[] pass = jPasswordFieldInicio.getPassword();
            StringBuilder password = new StringBuilder();
            for (char c : pass) {
                password.append(c);
            }

            if (nomer.length() > 0 && password.length() > 0) {

                Pacote pa = new Pacote();
                pa.criaREQREGISTO(nomer, password.toString());

                Main.enviaPacote(pa);

                try {
                    while (Main.ReqRegisto == -1) {
                        synchronized (this) {
                            this.wait();
                        }
                    }
                } catch (InterruptedException ex) {
                    System.out.println("No wait do Registo " + ex.toString());
                }

                if (Main.ReqRegisto == 1) {//registou
                    Main.ReqRegisto = -1;

                    Main.userlogado = nomer;
                    JOptionPane.showMessageDialog(this, nomer + " Registado com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
                    Main.inicio.dispose();

                    Main.iniciaInterfaceSD();

                } else {
                    Main.ReqRegisto = -1;
                    JOptionPane.showMessageDialog(this, "O nome de Utilizador " + nomer + " já existe", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Perdeu-se a ligação ao servidor", "Error", JOptionPane.INFORMATION_MESSAGE);
            fechatudo();
        }

    }//GEN-LAST:event_jButtonREGISTARActionPerformed

    private void jTextFieldRegistoNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRegistoNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonREGISTARActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldRegistoNomeKeyPressed

    private void jPasswordFieldInicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldInicioKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonREGISTARActionPerformed(null);
        }
    }//GEN-LAST:event_jPasswordFieldInicioKeyPressed

    private void jButtonTestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestarActionPerformed
        try {
            Main.iniciasocket();
            Main.activa = 1;
        } catch (IOException ex) {
            Main.activa = 0;
        }

        if (Main.activa == 1)//esta ligado
        {
            Main.iniciathreadcliente();
            activatudo();
        } else {
            fechatudo();
        }
    }//GEN-LAST:event_jButtonTestarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonREGISTAR;
    private javax.swing.JButton jButtonTestar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelXSAIR;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelRegisto;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordFieldInicio;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldLigacao;
    private javax.swing.JTextField jTextFieldRegistoNome;
    // End of variables declaration//GEN-END:variables

    private void activatudo() {
        this.jPanelRegisto.setEnabled(true);
        this.jPanelLogin.setEnabled(true);
        this.jTextFieldLigacao.setText("ACTIVA");
        this.jTextFieldLigacao.setForeground(Color.GREEN);
        //this.jButtonTestar.setEnabled(false);

    }

    private void fechatudo() {
        try {
            this.jPanelRegisto.wait(4000);
            this.jPanelLogin.wait(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*this.jPanelRegisto.setEnabled(false);
         this.jPanelLogin.setEnabled(false);*/
        this.jTextFieldLigacao.setText("FALHOU");
        this.jTextFieldLigacao.setForeground(Color.RED);
        //this.jButtonTestar.setEnabled(true);
    }
}
