/*
 * This file is part of StatusMCServerTool.
 *
 * StatusMCServerTool is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * StatusMCServerTool is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with StatusMCServerTool. If not, see <https://www.gnu.org/licenses/>.
 */
package com.devparada.frame;

import com.devparada.logic.ImageServer;
import com.devparada.logic.StatusMCServer;
import com.devparada.persistency.DBManager;
import java.awt.GridBagConstraints;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author devparada
 */
public class InitFrame extends javax.swing.JFrame {

    private String HostIpDialog;

    /**
     * Creates new form InitFrame
     */
    public InitFrame() {
        initComponents();
    }

    public String getHostIpDialog() {
        return HostIpDialog;
    }

    public void setHostIpDialog(String HostIpDialog) {
        this.HostIpDialog = HostIpDialog;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jDlgAdd = new javax.swing.JDialog();
        jLblAdd = new javax.swing.JTextField();
        jTxtAdd = new javax.swing.JTextField();
        jBtnAdd = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jPnlMain = new javax.swing.JPanel();
        jPanelIntro = new javax.swing.JPanel();
        jBtnIntroAdd = new javax.swing.JButton();
        jLblIntro = new javax.swing.JTextField();
        jPnlInfo = new javax.swing.JPanel();
        jLblImage = new javax.swing.JTextField();
        jLblVersion = new javax.swing.JTextField();
        jLblIHostIp = new javax.swing.JTextField();
        jLblOnline = new javax.swing.JTextField();
        jLblPlayers = new javax.swing.JTextField();

        jDlgAdd.setTitle("Add Server");
        jDlgAdd.setModal(true);
        jDlgAdd.setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        jDlgAdd.setName("dialogAddServer"); // NOI18N

        jLblAdd.setEditable(false);
        jLblAdd.setBackground(new java.awt.Color(214, 217, 223));
        jLblAdd.setForeground(new java.awt.Color(0, 0, 0));
        jLblAdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLblAdd.setText("Intraduce the server IP (with port if different)");
        jLblAdd.setBorder(null);

        jTxtAdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtAdd.setText("myserverminecraft.ddns.net:24321");

        jBtnAdd.setBackground(new java.awt.Color(0, 204, 51));
        jBtnAdd.setText("+ Add");
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDlgAddLayout = new javax.swing.GroupLayout(jDlgAdd.getContentPane());
        jDlgAdd.getContentPane().setLayout(jDlgAddLayout);
        jDlgAddLayout.setHorizontalGroup(
            jDlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgAddLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTxtAdd)
                    .addComponent(jLblAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDlgAddLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jDlgAddLayout.setVerticalGroup(
            jDlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgAddLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLblAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jTxtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jBtnAdd)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jDlgAdd.pack();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StatusMCServerTool");
        setMinimumSize(new java.awt.Dimension(759, 403));
        setPreferredSize(new java.awt.Dimension(759, 403));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPnlMain.setLayout(new javax.swing.BoxLayout(jPnlMain, javax.swing.BoxLayout.Y_AXIS));

        jPanelIntro.setPreferredSize(new java.awt.Dimension(480, 168));

        jBtnIntroAdd.setBackground(new java.awt.Color(0, 204, 51));
        jBtnIntroAdd.setText("+");
        jBtnIntroAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIntroAddActionPerformed(evt);
            }
        });

        jLblIntro.setEditable(false);
        jLblIntro.setBackground(new java.awt.Color(214, 217, 223));
        jLblIntro.setForeground(new java.awt.Color(0, 0, 0));
        jLblIntro.setText("Click the + button to add more servers:");
        jLblIntro.setBorder(null);

        javax.swing.GroupLayout jPanelIntroLayout = new javax.swing.GroupLayout(jPanelIntro);
        jPanelIntro.setLayout(jPanelIntroLayout);
        jPanelIntroLayout.setHorizontalGroup(
            jPanelIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroLayout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addGroup(jPanelIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntroLayout.createSequentialGroup()
                        .addComponent(jLblIntro, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelIntroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                        .addComponent(jBtnIntroAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))))
        );
        jPanelIntroLayout.setVerticalGroup(
            jPanelIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIntroLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLblIntro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jBtnIntroAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPnlMain.add(jPanelIntro);

        jPnlInfo.setLayout(new java.awt.GridBagLayout());

        jLblImage.setEditable(false);
        jLblImage.setBackground(new java.awt.Color(214, 217, 223));
        jLblImage.setForeground(new java.awt.Color(0, 0, 0));
        jLblImage.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jLblImage.setText("IMG");
        jLblImage.setBorder(null);
        jLblImage.setMinimumSize(new java.awt.Dimension(64, 64));
        jLblImage.setPreferredSize(new java.awt.Dimension(64, 64));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPnlInfo.add(jLblImage, gridBagConstraints);

        jLblVersion.setEditable(false);
        jLblVersion.setBackground(new java.awt.Color(214, 217, 223));
        jLblVersion.setForeground(new java.awt.Color(0, 0, 0));
        jLblVersion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLblVersion.setText("Version MC");
        jLblVersion.setBorder(null);
        jLblVersion.setMinimumSize(new java.awt.Dimension(96, 64));
        jLblVersion.setPreferredSize(new java.awt.Dimension(96, 64));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPnlInfo.add(jLblVersion, gridBagConstraints);

        jLblIHostIp.setEditable(false);
        jLblIHostIp.setBackground(new java.awt.Color(214, 217, 223));
        jLblIHostIp.setForeground(new java.awt.Color(0, 0, 0));
        jLblIHostIp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jLblIHostIp.setText("ip.a.a.a:25555");
        jLblIHostIp.setBorder(null);
        jLblIHostIp.setMinimumSize(new java.awt.Dimension(96, 64));
        jLblIHostIp.setPreferredSize(new java.awt.Dimension(196, 64));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPnlInfo.add(jLblIHostIp, gridBagConstraints);

        jLblOnline.setEditable(false);
        jLblOnline.setBackground(new java.awt.Color(214, 217, 223));
        jLblOnline.setForeground(new java.awt.Color(0, 0, 0));
        jLblOnline.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLblOnline.setText("Online");
        jLblOnline.setBorder(null);
        jLblOnline.setMinimumSize(new java.awt.Dimension(96, 64));
        jLblOnline.setPreferredSize(new java.awt.Dimension(96, 64));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPnlInfo.add(jLblOnline, gridBagConstraints);

        jLblPlayers.setEditable(false);
        jLblPlayers.setBackground(new java.awt.Color(214, 217, 223));
        jLblPlayers.setForeground(new java.awt.Color(0, 0, 0));
        jLblPlayers.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLblPlayers.setText("Players");
        jLblPlayers.setBorder(null);
        jLblPlayers.setMinimumSize(new java.awt.Dimension(96, 64));
        jLblPlayers.setPreferredSize(new java.awt.Dimension(96, 64));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPnlInfo.add(jLblPlayers, gridBagConstraints);

        jPnlMain.add(jPnlInfo);

        jScrollPane.setViewportView(jPnlMain);

        getContentPane().add(jScrollPane);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIntroAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIntroAddActionPerformed
        jDlgAdd.setVisible(true);
    }//GEN-LAST:event_jBtnIntroAddActionPerformed

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
        jDlgAdd.setVisible(false);
        setHostIpDialog(jTxtAdd.getText());
        jTxtAdd.setText("");
        addPanel();
    }//GEN-LAST:event_jBtnAddActionPerformed

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
            java.util.logging.Logger.getLogger(InitFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InitFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InitFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InitFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                InitFrame testFrame = new InitFrame();
                testFrame.setVisible(true);
                testFrame.start();
            }
        });
    }

    private void addPanel() {
        JPanel jPanelServer = new JPanel();
        String ipServer = "";
        int port = 25565; // Default port of the servers

        String JTxtText = getHostIpDialog();

        if (JTxtText.length() != 0) {
            String[] ipServerArray = JTxtText.split(":");

            ipServer = ipServerArray[0];

            if (ipServerArray.length == 2) {
                port = Integer.parseInt(ipServerArray[1]);
            }
        }

        StatusMCServer statusServer = new StatusMCServer(ipServer, port);

        JLabel jTxtIMG = new JLabel();
        JTextField jTxtHostIp = new JTextField(JTxtText);
        JTextField jTxtOnline = new JTextField(statusServer.showDataSection(JTxtText, "online"));
        JTextField jTxtVersion = new JTextField(statusServer.showDataSection(JTxtText, "version"));
        JTextField jTxtPlayers = new JTextField(statusServer.showDataSection(JTxtText, "players"));

        GridBagConstraints gridBagConstraints;

        jPanelServer.setLayout(new java.awt.GridBagLayout());

        jTxtIMG.setBackground(new java.awt.Color(214, 217, 223));
        jTxtIMG.setForeground(new java.awt.Color(0, 0, 0));
        jTxtIMG.setHorizontalAlignment(JTextField.RIGHT);
        jTxtIMG.setBorder(null);
        jTxtIMG.setMinimumSize(new java.awt.Dimension(64, 64));
        jTxtIMG.setPreferredSize(new java.awt.Dimension(64, 64));

        ImageServer image = new ImageServer();
        // Create ImageIcon with base64 Image without "data:image/png;base64"
        System.out.println(image);
        ImageIcon imageIcon = new ImageIcon(image.showImage(statusServer.showDataSection(JTxtText, "icon")));
        jTxtIMG.setIcon(imageIcon);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelServer.add(jTxtIMG, gridBagConstraints);

        jTxtVersion.setEditable(false);
        jTxtVersion.setBackground(new java.awt.Color(214, 217, 223));
        jTxtVersion.setForeground(new java.awt.Color(0, 0, 0));
        jTxtVersion.setHorizontalAlignment(JTextField.CENTER);
        jTxtVersion.setBorder(null);
        jTxtVersion.setMinimumSize(new java.awt.Dimension(96, 64));
        jTxtVersion.setPreferredSize(new java.awt.Dimension(96, 64));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelServer.add(jTxtVersion, gridBagConstraints);

        jTxtHostIp.setEditable(false);
        jTxtHostIp.setBackground(new java.awt.Color(214, 217, 223));
        jTxtHostIp.setForeground(new java.awt.Color(0, 0, 0));
        jTxtHostIp.setHorizontalAlignment(JTextField.RIGHT);
        jTxtHostIp.setBorder(null);
        jTxtVersion.setMinimumSize(new java.awt.Dimension(196, 64));
        jTxtVersion.setPreferredSize(new java.awt.Dimension(196, 64));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelServer.add(jTxtHostIp, gridBagConstraints);

        jTxtOnline.setEditable(false);
        jTxtOnline.setBackground(new java.awt.Color(214, 217, 223));
        jTxtOnline.setForeground(new java.awt.Color(0, 0, 0));
        jTxtOnline.setBorder(null);
        jTxtOnline.setMinimumSize(new java.awt.Dimension(96, 64));
        jTxtOnline.setPreferredSize(new java.awt.Dimension(96, 64));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelServer.add(jTxtOnline, gridBagConstraints);

        jTxtPlayers.setEditable(false);
        jTxtPlayers.setBackground(new java.awt.Color(214, 217, 223));
        jTxtPlayers.setForeground(new java.awt.Color(0, 0, 0));
        jTxtPlayers.setBorder(null);
        jTxtPlayers.setMinimumSize(new java.awt.Dimension(96, 64));
        jTxtPlayers.setPreferredSize(new java.awt.Dimension(96, 64));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelServer.add(jTxtPlayers, gridBagConstraints);

        jPnlMain.add(jPanelServer);
        jPnlMain.revalidate();
        jPnlMain.repaint();
        start();
    }

    private void start() {
        File DB = new File("MCServers.db");
        if (!DB.exists()) {
            DBManager.createTable();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnIntroAdd;
    private javax.swing.JDialog jDlgAdd;
    private javax.swing.JTextField jLblAdd;
    private javax.swing.JTextField jLblIHostIp;
    private javax.swing.JTextField jLblImage;
    private javax.swing.JTextField jLblIntro;
    private javax.swing.JTextField jLblOnline;
    private javax.swing.JTextField jLblPlayers;
    private javax.swing.JTextField jLblVersion;
    private javax.swing.JPanel jPanelIntro;
    private javax.swing.JPanel jPnlInfo;
    private javax.swing.JPanel jPnlMain;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextField jTxtAdd;
    // End of variables declaration//GEN-END:variables
}
