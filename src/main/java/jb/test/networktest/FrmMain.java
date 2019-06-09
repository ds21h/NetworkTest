/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb.test.networktest;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import org.json.JSONObject;

/**
 *
 * @author Jan
 */
public class FrmMain extends javax.swing.JFrame {
    private final String cVerbs[] = {"GET", "PUT", "POST", "DELETE"};
    private final String cMedia[] = {"Text", "JSON"};
    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        int lCount;
        
        initComponents();
        cmbVerb.removeAllItems();
        for (lCount = 0; lCount < cVerbs.length; lCount++){
            cmbVerb.addItem(cVerbs[lCount]);
        }
        cmbMediaReq.removeAllItems();
        cmbMediaResp.removeAllItems();
        for (lCount = 0; lCount < cMedia.length; lCount++){
            cmbMediaReq.addItem(cMedia[lCount]);
            cmbMediaResp.addItem(cMedia[lCount]);
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

        lbIP = new javax.swing.JLabel();
        txtIP1 = new javax.swing.JTextField();
        txtIP2 = new javax.swing.JTextField();
        txtIP3 = new javax.swing.JTextField();
        txtIP4 = new javax.swing.JTextField();
        lbPort = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        lbURI = new javax.swing.JLabel();
        txtURI = new javax.swing.JTextField();
        scrRequest = new javax.swing.JScrollPane();
        txtRequest = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        lbPar = new javax.swing.JLabel();
        txtPar = new javax.swing.JTextField();
        cmbVerb = new javax.swing.JComboBox<>();
        lbResponse = new javax.swing.JLabel();
        cmbMediaReq = new javax.swing.JComboBox<>();
        scrResponse = new javax.swing.JScrollPane();
        txtResponse = new javax.swing.JTextArea();
        lbRequest = new javax.swing.JLabel();
        cmbMediaResp = new javax.swing.JComboBox<>();

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

        txtURI.setToolTipText("");
        txtURI.setMaximumSize(new java.awt.Dimension(6, 20));
        txtURI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtURIFocusLost(evt);
            }
        });
        txtURI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtURIKeyTyped(evt);
            }
        });

        txtRequest.setColumns(20);
        txtRequest.setLineWrap(true);
        txtRequest.setRows(5);
        scrRequest.setViewportView(txtRequest);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        lbPar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPar.setText("Par:");
        lbPar.setToolTipText("");
        lbPar.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtPar.setToolTipText("");
        txtPar.setMaximumSize(new java.awt.Dimension(6, 20));
        txtPar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtParFocusLost(evt);
            }
        });
        txtPar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtParKeyTyped(evt);
            }
        });

        lbResponse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbResponse.setText("Response:");

        cmbMediaReq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtResponse.setEditable(false);
        txtResponse.setColumns(20);
        txtResponse.setLineWrap(true);
        txtResponse.setRows(5);
        scrResponse.setViewportView(txtResponse);

        lbRequest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbRequest.setText("Request:");

        cmbMediaResp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbIP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIP1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIP2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbPar, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(cmbVerb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbURI)))
                            .addComponent(cmbMediaReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrRequest, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtURI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIP3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIP4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(lbPort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 316, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbMediaResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(scrResponse))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSend))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRequest)
                            .addComponent(lbResponse))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(txtURI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbVerb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPar)
                    .addComponent(txtPar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(lbRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbMediaReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(lbResponse)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMediaResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        sTestPortField(txtPort);
    }//GEN-LAST:event_txtPortFocusLost

    private void txtPortKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPortKeyTyped
        hInputDigit(evt);
    }//GEN-LAST:event_txtPortKeyTyped

    private void txtURIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtURIFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtURIFocusLost

    private void txtURIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtURIKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtURIKeyTyped

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        sSendRequest();
    }//GEN-LAST:event_btnSendActionPerformed

    private void txtParFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtParFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParFocusLost

    private void txtParKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParKeyTyped

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

    private boolean sTestPortField(JTextField pPort) {
        String lText;
        boolean lOK;
        int lComp;

        lText = pPort.getText().trim();
        try {
            lComp = Integer.parseInt(lText);
            if (lComp < 0 || lComp > 65535) {
                lOK = false;
            } else {
                lOK = true;
            }
        } catch (NumberFormatException pExc) {
            lOK = false;
        }
        if (lOK) {
            pPort.setForeground(Color.BLACK);
        } else {
            pPort.setForeground(Color.red);
        }
        return lOK;
    }

    private void sSendRequest() {
        int lResult;
        RestAPI lRest;
        RestAPI.RestResult lReply;
        String lVerb;

        lVerb = (String)cmbVerb.getSelectedItem();
        lRest = new RestAPI();
        txtResponse.setText("");
        lRest.xMethod(lVerb);
        lRest.xMediaRequest(RestAPI.cMediaText);
        lRest.xMediaReply(RestAPI.cMediaJSON);
        lRest.xUrl("http://" + txtIP1.getText() + "." + txtIP2.getText() + "." + txtIP3.getText() + "." + txtIP4.getText() + ":" + txtPort.getText() + "/" + txtURI.getText());
        lRest.xPars(txtPar.getText());
        lRest.xRequest(txtRequest.getText());
        lReply = lRest.xCallApi();
        lResult = lReply.xResult();
        if (lResult != Result.cResultOK) {
            txtResponse.append(lReply.xText() + "\n");
        }
        txtResponse.append(lReply.xReplyS());
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
    private javax.swing.JComboBox<String> cmbMediaReq;
    private javax.swing.JComboBox<String> cmbMediaResp;
    private javax.swing.JComboBox<String> cmbVerb;
    private javax.swing.JLabel lbIP;
    private javax.swing.JLabel lbPar;
    private javax.swing.JLabel lbPort;
    private javax.swing.JLabel lbRequest;
    private javax.swing.JLabel lbResponse;
    private javax.swing.JLabel lbURI;
    private javax.swing.JScrollPane scrRequest;
    private javax.swing.JScrollPane scrResponse;
    private javax.swing.JTextField txtIP1;
    private javax.swing.JTextField txtIP2;
    private javax.swing.JTextField txtIP3;
    private javax.swing.JTextField txtIP4;
    private javax.swing.JTextField txtPar;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextArea txtRequest;
    private javax.swing.JTextArea txtResponse;
    private javax.swing.JTextField txtURI;
    // End of variables declaration//GEN-END:variables
}
