/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb.test.networktest;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Jan
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
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

        lbIP = new javax.swing.JLabel();
        txtIP1 = new javax.swing.JTextField();
        txtIP2 = new javax.swing.JTextField();
        txtIP3 = new javax.swing.JTextField();
        txtIP4 = new javax.swing.JTextField();
        lbPort = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        lbURI = new javax.swing.JLabel();
        txtPort1 = new javax.swing.JTextField();
        scrResponse = new javax.swing.JScrollPane();
        txtResponse = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbIP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbIP.setText("IP:");
        lbIP.setToolTipText("");
        lbIP.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtIP1.setToolTipText("");
        txtIP1.setMaximumSize(new java.awt.Dimension(6, 20));
        txtIP1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIP1FocusLost(evt);
            }
        });
        txtIP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIP1KeyTyped(evt);
            }
        });

        txtIP2.setToolTipText("");
        txtIP2.setMaximumSize(new java.awt.Dimension(6, 20));
        txtIP2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIP2FocusLost(evt);
            }
        });
        txtIP2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIP2KeyTyped(evt);
            }
        });

        txtIP3.setToolTipText("");
        txtIP3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIP3FocusLost(evt);
            }
        });
        txtIP3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIP3KeyTyped(evt);
            }
        });

        txtIP4.setToolTipText("");
        txtIP4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIP4FocusLost(evt);
            }
        });
        txtIP4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIP4KeyTyped(evt);
            }
        });

        lbPort.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPort.setText("Port:");
        lbPort.setToolTipText("");
        lbPort.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtPort.setToolTipText("");
        txtPort.setMaximumSize(new java.awt.Dimension(6, 20));
        txtPort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPortFocusLost(evt);
            }
        });
        txtPort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPortKeyTyped(evt);
            }
        });

        lbURI.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbURI.setText("URI:");
        lbURI.setToolTipText("");
        lbURI.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtPort1.setToolTipText("");
        txtPort1.setMaximumSize(new java.awt.Dimension(6, 20));
        txtPort1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPort1FocusLost(evt);
            }
        });
        txtPort1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPort1KeyTyped(evt);
            }
        });

        txtResponse.setColumns(20);
        txtResponse.setRows(5);
        scrResponse.setViewportView(txtResponse);

        btnSend.setText("Send");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrResponse)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbURI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPort1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbIP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIP1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIP2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIP3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIP4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbPort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 106, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSend)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIP)
                    .addComponent(txtIP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPort)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbURI)
                    .addComponent(txtPort1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnSend)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIP2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIP2FocusLost
        sTestIPField(txtIP2);
    }//GEN-LAST:event_txtIP2FocusLost

    private void txtIP2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIP2KeyTyped
        hInputDigit(evt);
    }//GEN-LAST:event_txtIP2KeyTyped

    private void txtIP3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIP3FocusLost
        sTestIPField(txtIP3);
    }//GEN-LAST:event_txtIP3FocusLost

    private void txtIP3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIP3KeyTyped
        hInputDigit(evt);
    }//GEN-LAST:event_txtIP3KeyTyped

    private void txtIP4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIP4FocusLost
        sTestIPField(txtIP4);
    }//GEN-LAST:event_txtIP4FocusLost

    private void txtIP4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIP4KeyTyped
        hInputDigit(evt);
    }//GEN-LAST:event_txtIP4KeyTyped

    private void txtIP1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIP1FocusLost
        sTestIPField(txtIP1);
    }//GEN-LAST:event_txtIP1FocusLost

    private void txtIP1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIP1KeyTyped
        hInputDigit(evt);
    }//GEN-LAST:event_txtIP1KeyTyped

    private void txtPortFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPortFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPortFocusLost

    private void txtPortKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPortKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPortKeyTyped

    private void txtPort1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPort1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPort1FocusLost

    private void txtPort1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPort1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPort1KeyTyped

    private void hInputDigit(KeyEvent pEvent) {
        char lInput;

        lInput = pEvent.getKeyChar();
        if (lInput < '0' || lInput > '9') {
            pEvent.consume();
        }
    }

    private boolean sTestIPField(JTextField pIP) {
        String lText;
        boolean lOK;
        int lComp;

        lText = pIP.getText().trim();
        try {
            lComp = Integer.parseInt(lText);
            if (lComp < 0 || lComp > 255) {
                lOK = false;
            } else {
                lOK = true;
            }
        } catch (NumberFormatException pExc) {
            lOK = false;
        }
        if (lOK) {
            pIP.setForeground(Color.BLACK);
        } else {
            pIP.setForeground(Color.red);
        }
        return lOK;
    }

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel lbIP;
    private javax.swing.JLabel lbPort;
    private javax.swing.JLabel lbURI;
    private javax.swing.JScrollPane scrResponse;
    private javax.swing.JTextField txtIP1;
    private javax.swing.JTextField txtIP2;
    private javax.swing.JTextField txtIP3;
    private javax.swing.JTextField txtIP4;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtPort1;
    private javax.swing.JTextArea txtResponse;
    // End of variables declaration//GEN-END:variables
}