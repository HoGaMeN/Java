/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Kelompok8;

import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author LiNuX112
 */
public class Ubah_Password extends javax.swing.JFrame {
private static int counter;
private PreparedStatement stat;
private ResultSet rs;
Koneksi k = new Koneksi();
String PW;
    /**
     * Creates new form Ubah_Password
     */
    public Ubah_Password() {
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
        jLabel1 = new javax.swing.JLabel();
        fld_PW_Lama = new javax.swing.JTextField();
        fld_PW_baru = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_ubah = new javax.swing.JButton();
        btn_tutup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(554, 370));
        setPreferredSize(new java.awt.Dimension(554, 370));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(554, 370));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ubah Password");

        fld_PW_Lama.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        fld_PW_Lama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_PW_LamaActionPerformed(evt);
            }
        });

        fld_PW_baru.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password Lama");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password Baru");

        btn_ubah.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btn_ubah.setText("Ubah");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });

        btn_tutup.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btn_tutup.setText("Tutup");
        btn_tutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tutupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(fld_PW_Lama, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fld_PW_baru)
                            .addComponent(btn_ubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_tutup, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(fld_PW_Lama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(fld_PW_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ubah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_tutup)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fld_PW_LamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_PW_LamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_PW_LamaActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        // TODO add your handling code here:
        WarungPedia Login = new WarungPedia();
        String ID = Login.ID_USER;
        if (fld_PW_Lama.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Mohon isikan password lama anda");
        }if (fld_PW_baru.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Mohon isikan password baru anda");
        }else{
            try {
            String PW_Penjual = "SELECT Password FROM User WHERE Username='"+ID+"'";
                        Connection kon = (Connection)Koneksi.configDB();
                        Statement stm = kon.createStatement();
                        ResultSet rs = stm.executeQuery(PW_Penjual);
                        while(rs.next()){
                            PW = rs.getString("Password");
                        }
                        System.out.println(PW);
                            if (fld_PW_Lama.getText().equals("") == fld_PW_baru.getText().equals("")) {
                                JOptionPane.showMessageDialog(rootPane, "Password lama dengan baru sama");
                            }if (PW.equals("") != fld_PW_Lama.getText().equals("")) {
                                JOptionPane.showMessageDialog(rootPane, "Password lama salah");
                            }else{
                                this.stat = Koneksi.configDB().prepareStatement("UPDATE user SET Password = '"+fld_PW_baru.getText()+"' WHERE Username ='"+ID+"'");
                                stat.executeUpdate();
                                JOptionPane.showMessageDialog(rootPane, "Password berhasil diubah, silakan login lagi");
                                this.setVisible(false);
                                Login.setVisible(true);
                            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        }
        
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_tutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tutupActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_tutupActionPerformed

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
            java.util.logging.Logger.getLogger(Ubah_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ubah_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ubah_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ubah_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ubah_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_tutup;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JTextField fld_PW_Lama;
    private javax.swing.JTextField fld_PW_baru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
