/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Kelompok8;

import java.awt.Graphics;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author LiNuX112
 */
public class Setting_Penjual extends javax.swing.JFrame {

    /**
     * Creates new form Setting_Penjual
     */
    public Setting_Penjual() {
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

        Panel = new javax.swing.JPanel();
        lg_Setting = new javax.swing.JLabel();
        lb_Pengaturan = new javax.swing.JLabel();
        lb_Profil = new javax.swing.JLabel();
        lb_Pw = new javax.swing.JLabel();
        lb_Home = new javax.swing.JLabel();
        lb_Logout = new javax.swing.JLabel();
        btn_UbahPassword = new javax.swing.JButton();
        btn_UbahProfil = new javax.swing.JButton();
        btn_Kembali = new javax.swing.JButton();
        btn_SingOut = new javax.swing.JButton();
        lb_Back = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(929, 1160));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setPreferredSize(new java.awt.Dimension(789, 910));

        lg_Setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Filter_alt.png"))); // NOI18N

        lb_Pengaturan.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lb_Pengaturan.setText("PENGATURAN");

        lb_Profil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/account-circle-line.png"))); // NOI18N

        lb_Pw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Lock_fill.png"))); // NOI18N

        lb_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Home_fill.png"))); // NOI18N

        lb_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Sign_out_squre_duotone_line.png"))); // NOI18N

        btn_UbahPassword.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_UbahPassword.setText("Ubah Password");
        btn_UbahPassword.setPreferredSize(new java.awt.Dimension(494, 85));
        btn_UbahPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UbahPasswordActionPerformed(evt);
            }
        });

        btn_UbahProfil.setBackground(new java.awt.Color(204, 204, 204));
        btn_UbahProfil.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_UbahProfil.setText("Ubah Profil");
        btn_UbahProfil.setPreferredSize(new java.awt.Dimension(494, 85));
        btn_UbahProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UbahProfilActionPerformed(evt);
            }
        });

        btn_Kembali.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_Kembali.setText("Kembali");
        btn_Kembali.setPreferredSize(new java.awt.Dimension(494, 85));
        btn_Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KembaliActionPerformed(evt);
            }
        });

        btn_SingOut.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_SingOut.setText("Sing Out");
        btn_SingOut.setPreferredSize(new java.awt.Dimension(494, 85));
        btn_SingOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SingOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lg_Setting)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_Pengaturan))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_Pw)
                                    .addComponent(lb_Profil)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(lb_Logout)))
                                .addGap(44, 44, 44)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_SingOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_UbahProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_UbahPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(lb_Home)
                                .addGap(44, 44, 44)
                                .addComponent(btn_Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lg_Setting))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lb_Pengaturan)))
                .addGap(62, 62, 62)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Profil)
                    .addComponent(btn_UbahProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Pw)
                    .addComponent(btn_UbahPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Home))
                .addGap(77, 77, 77)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_SingOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Logout))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 790));

        lb_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pngwing 7.png"))); // NOI18N
        getContentPane().add(lb_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/download 2 (1).png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KembaliActionPerformed
        // TODO add your handling code here:
        ProfilPejual user = new ProfilPejual();
        user.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_KembaliActionPerformed

    private void btn_SingOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SingOutActionPerformed
        // TODO add your handling code here:
        int jawab = JOptionPane.showOptionDialog(this,
            "Ingin Logout?",
            "LOGOUT",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, null, null);

        if(jawab == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Akun telah diLogout");
            WarungPedia login = new WarungPedia();
            login.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btn_SingOutActionPerformed

    private void btn_UbahProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UbahProfilActionPerformed
        // TODO add your handling code here:
        Ubah_Profil ubah = new Ubah_Profil();
        ubah.setVisible(true);
    }//GEN-LAST:event_btn_UbahProfilActionPerformed

    private void btn_UbahPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UbahPasswordActionPerformed
        // TODO add your handling code here:
        Ubah_Password UB_PW = new Ubah_Password();
        this.setVisible(false);
        UB_PW.setVisible(true);
        
    }//GEN-LAST:event_btn_UbahPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Setting_Penjual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setting_Penjual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setting_Penjual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setting_Penjual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setting_Penjual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btn_Kembali;
    private javax.swing.JButton btn_SingOut;
    private javax.swing.JButton btn_UbahPassword;
    private javax.swing.JButton btn_UbahProfil;
    private javax.swing.JLabel lb_Back;
    private javax.swing.JLabel lb_Home;
    private javax.swing.JLabel lb_Logout;
    private javax.swing.JLabel lb_Pengaturan;
    private javax.swing.JLabel lb_Profil;
    private javax.swing.JLabel lb_Pw;
    private javax.swing.JLabel lg_Setting;
    // End of variables declaration//GEN-END:variables
}
