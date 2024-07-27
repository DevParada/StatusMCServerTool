/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.devparada.frame;

import com.devparada.logic.StatusMCServer;
import com.devparada.persistency.DBManager;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author devparada
 */
public class TestFrame extends javax.swing.JFrame {

    /**
     * Creates new form StatusMCServerFrame
     */
    public TestFrame() {
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

        jDialog1 = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jPnlMain = new javax.swing.JPanel();
        jPanelIntro = new javax.swing.JPanel();
        jLblAdd = new javax.swing.JLabel();
        jBtnAdd = new javax.swing.JButton();
        jPnlData = new javax.swing.JPanel();
        jLblImage = new javax.swing.JLabel();
        jPnlInfo = new javax.swing.JPanel();
        jLblIpHosts = new javax.swing.JLabel();
        jLblOnline = new javax.swing.JLabel();
        jLblVersion = new javax.swing.JLabel();
        jLblPlayers = new javax.swing.JLabel();

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("jLabel4");

        jTextField1.setText("jTextField1");

        jButton2.setText("Confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jDialog1.pack();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setToolTipText("");

        jPnlMain.setLayout(new javax.swing.BoxLayout(jPnlMain, javax.swing.BoxLayout.Y_AXIS));

        jPanelIntro.setPreferredSize(new java.awt.Dimension(480, 168));

        jLblAdd.setText("Click the + button to add more servers:");

        jBtnAdd.setBackground(new java.awt.Color(0, 204, 51));
        jBtnAdd.setText("+");
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIntroLayout = new javax.swing.GroupLayout(jPanelIntro);
        jPanelIntro.setLayout(jPanelIntroLayout);
        jPanelIntroLayout.setHorizontalGroup(
            jPanelIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroLayout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(jLblAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIntroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanelIntroLayout.setVerticalGroup(
            jPanelIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLblAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jBtnAdd)
                .addContainerGap())
        );

        jPnlMain.add(jPanelIntro);

        jLblImage.setText("jLabel2");

        jPnlInfo.setLayout(new java.awt.GridLayout(2, 2));

        jLblIpHosts.setText("ip.a.a.a:25555");
        jPnlInfo.add(jLblIpHosts);

        jLblOnline.setText("Online");
        jPnlInfo.add(jLblOnline);

        jLblVersion.setText("Version MC");
        jPnlInfo.add(jLblVersion);

        jLblPlayers.setText("Players");
        jPnlInfo.add(jLblPlayers);

        javax.swing.GroupLayout jPnlDataLayout = new javax.swing.GroupLayout(jPnlData);
        jPnlData.setLayout(jPnlDataLayout);
        jPnlDataLayout.setHorizontalGroup(
            jPnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlDataLayout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addComponent(jLblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPnlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPnlDataLayout.setVerticalGroup(
            jPnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlDataLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPnlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPnlMain.add(jPnlData);

        jScrollPane.setViewportView(jPnlMain);

        getContentPane().add(jScrollPane);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jBtnAddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDialog1.setVisible(false);
        addPanel();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StatusMCServerFrame().setVisible(true);
            }
        });
    }

    private void addPanel() {
        JPanel newPanel = new JPanel();

        JLabel jLabel1 = new JLabel("Test 1");
        JLabel jLabel2 = new JLabel("Host:25555");
        JLabel jLabel3 = new JLabel("Test 3");
        JLabel jLabel4 = new JLabel("Test 4");
        JLabel jLabel5 = new JLabel("Test 5");

        GroupLayout jPanel33Layout = new GroupLayout(newPanel);
        newPanel.setLayout(jPanel33Layout);

        JPanel panelE = new JPanel();
        panelE.setLayout(new java.awt.GridLayout(2, 2));

        jPanel33Layout.setHorizontalGroup(
                jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel33Layout.createSequentialGroup()
                                .addContainerGap(224, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(panelE, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
                jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panelE, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        newPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        panelE.add(jLabel2);
        panelE.add(jLabel3);
        panelE.add(jLabel4);
        panelE.add(jLabel5);

        jPnlMain.add(newPanel);
        jPnlMain.revalidate();
        jPnlMain.repaint();
        start();
    }

    public JLabel getlabel(JPanel panel) {
        for (Component comp : panel.getComponents()) {
            if (comp instanceof JLabel jLabel) {
                return jLabel;
            }
        }
        return null;
    }

    public String test(JPanel newPanel) {
        final StatusMCServer[] statusServerArrayFinal = new StatusMCServer[1];
        final String[] ipServerArrayFinal = new String[1];

        System.out.println(getlabel(newPanel));
        System.out.println(newPanel);

        //String JLabelText = getlabel(newPanel).getText();
        String JLabelText = "a";

        if (JLabelText.length() != 0) {
            System.out.println("Test test");
            String[] ipServerArray = JLabelText.split(":");

            String ipServer = ipServerArray[0];
            ipServerArrayFinal[0] = ipServer;

            int port;

            if (ipServerArray.length != 2) {
                port = 25565; // Default port of the servers
            } else {
                port = Integer.parseInt(ipServerArray[1]);
            }

            StatusMCServer statusServer = new StatusMCServer(ipServer, port);
            statusServerArrayFinal[0] = statusServer;

            showDataFrame(statusServerArrayFinal[0], ipServerArrayFinal[0]);
        }

        /*
        
        if (jTxtNameServer.getText().length() != 0) {
            System.out.println("Test jBtnCheck");
            String[] ipServerArray = jTxtNameServer.getText().split(":");

            String ipServer = ipServerArray[0];
            ipServerArrayFinal[0] = ipServer;

            int port;

            if (ipServerArray.length != 2) {
                port = 25565; // Default port of the servers
            } else {
                port = Integer.parseInt(ipServerArray[1]);
            }

            StatusMCServer statusServer = new StatusMCServer(ipServer, port);
            statusServerArrayFinal[0] = statusServer;

            showDataFrame(statusServerArrayFinal[0], ipServerArrayFinal[0]);
         */
        return "a";
    }

    private void start() {
        File DB = new File("MCServers.db");
        if (!DB.exists()) {
            DBManager.createTable();
        }

        final StatusMCServer[] statusServerArrayFinal = new StatusMCServer[1];
        final String[] ipServerArrayFinal = new String[1];

        // Add Listener of the click in the boton JBtnCheck
        /*jBtnCheck.addActionListener((ActionEvent e) -> {
            if (jTxtNameServer.getText().length() != 0) {
                System.out.println("Test jBtnCheck");
                String[] ipServerArray = jTxtNameServer.getText().split(":");

                String ipServer = ipServerArray[0];
                ipServerArrayFinal[0] = ipServer;

                int port;

                if (ipServerArray.length != 2) {
                    port = 25565; // Default port of the servers
                } else {
                    port = Integer.parseInt(ipServerArray[1]);
                }

                StatusMCServer statusServer = new StatusMCServer(ipServer, port);
                statusServerArrayFinal[0] = statusServer;

                showDataFrame(statusServerArrayFinal[0], ipServerArrayFinal[0]);
            }
        });*/
    }

    private void showDataFrame(StatusMCServer statusServer, String ipServer) {
        System.out.println("Test showDataFrame");
        if ("0".equals(statusServer.obtainData(ipServer))) {
            // jLblTxtArResult.setText("Server status:");
            // jTxtArResult.setText("ERROR: Not found this server");
        } else {
            //  jLblTxtArResult.setText("Server status: " + ipServer);
            //  jTxtArResult.setText(statusServer.obtainData(ipServer));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLblAdd;
    private javax.swing.JLabel jLblImage;
    private javax.swing.JLabel jLblIpHosts;
    private javax.swing.JLabel jLblOnline;
    private javax.swing.JLabel jLblPlayers;
    private javax.swing.JLabel jLblVersion;
    private javax.swing.JPanel jPanelIntro;
    private javax.swing.JPanel jPnlData;
    private javax.swing.JPanel jPnlInfo;
    private javax.swing.JPanel jPnlMain;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
