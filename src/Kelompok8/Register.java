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
import java.nio.file.Files;
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
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author LiNuX112
 */
public class Register extends javax.swing.JFrame {
private Image image;
private String filename;
private String foto;
    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Utama = new javax.swing.JPanel();
        lb_register = new javax.swing.JLabel();
        lb_Username = new javax.swing.JLabel();
        lb_Password = new javax.swing.JLabel();
        lb_Nama = new javax.swing.JLabel();
        lb_Alamat = new javax.swing.JLabel();
        lb_Email = new javax.swing.JLabel();
        fld_Username = new javax.swing.JTextField();
        fld_Nama = new javax.swing.JTextField();
        fld_Email = new javax.swing.JTextField();
        fld_Alamat = new javax.swing.JTextField();
        btn_HaveAccount = new javax.swing.JButton();
        btn_Register = new javax.swing.JButton();
        lb_Telepon = new javax.swing.JLabel();
        fld_Telepon = new javax.swing.JTextField();
        fld_Password = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 1024));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Utama.setPreferredSize(new java.awt.Dimension(1047, 919));

        lb_register.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        lb_register.setText("PENDAFTARAN");

        lb_Username.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        lb_Username.setText("Username");

        lb_Password.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        lb_Password.setText("Password");

        lb_Nama.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        lb_Nama.setText("Nama");

        lb_Alamat.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        lb_Alamat.setText("Alamat");

        lb_Email.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        lb_Email.setText("Email");

        fld_Username.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        fld_Username.setPreferredSize(new java.awt.Dimension(473, 50));
        fld_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_UsernameActionPerformed(evt);
            }
        });

        fld_Nama.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        fld_Nama.setPreferredSize(new java.awt.Dimension(473, 50));
        fld_Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_NamaActionPerformed(evt);
            }
        });

        fld_Email.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        fld_Email.setPreferredSize(new java.awt.Dimension(473, 50));
        fld_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_EmailActionPerformed(evt);
            }
        });

        fld_Alamat.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        fld_Alamat.setPreferredSize(new java.awt.Dimension(473, 50));
        fld_Alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_AlamatActionPerformed(evt);
            }
        });

        btn_HaveAccount.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        btn_HaveAccount.setText("Sudah Punya");
        btn_HaveAccount.setPreferredSize(new java.awt.Dimension(262, 88));
        btn_HaveAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HaveAccountActionPerformed(evt);
            }
        });

        btn_Register.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        btn_Register.setText("Daftar");
        btn_Register.setPreferredSize(new java.awt.Dimension(262, 88));
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });

        lb_Telepon.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        lb_Telepon.setText("No.Telepon");

        fld_Telepon.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        fld_Telepon.setPreferredSize(new java.awt.Dimension(473, 50));
        fld_Telepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_TeleponActionPerformed(evt);
            }
        });

        fld_Password.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        fld_Password.setPreferredSize(new java.awt.Dimension(473, 50));
        fld_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_PasswordActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton1.setText("Foto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UtamaLayout = new javax.swing.GroupLayout(Utama);
        Utama.setLayout(UtamaLayout);
        UtamaLayout.setHorizontalGroup(
            UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UtamaLayout.createSequentialGroup()
                .addContainerGap(235, Short.MAX_VALUE)
                .addGroup(UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UtamaLayout.createSequentialGroup()
                        .addGroup(UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UtamaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb_Nama)
                                    .addComponent(lb_Username)
                                    .addComponent(fld_Username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_Password)
                                    .addComponent(lb_Email)
                                    .addComponent(fld_Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_Alamat)
                                    .addComponent(fld_Alamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fld_Nama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_Telepon)
                                    .addComponent(fld_Telepon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fld_Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lb_register))
                        .addGap(258, 258, 258))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UtamaLayout.createSequentialGroup()
                        .addComponent(btn_Register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btn_HaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(223, 223, 223))))
        );
        UtamaLayout.setVerticalGroup(
            UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UtamaLayout.createSequentialGroup()
                .addComponent(lb_register)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Nama)
                .addGap(1, 1, 1)
                .addComponent(fld_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lb_Username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fld_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fld_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fld_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Alamat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fld_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Telepon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fld_Telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_HaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        getContentPane().add(Utama, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 75, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/download 2.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fld_NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_NamaActionPerformed

    private void fld_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_EmailActionPerformed

    private void fld_AlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_AlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_AlamatActionPerformed

    private void btn_HaveAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HaveAccountActionPerformed
        // TODO add your handling code here:
        WarungPedia Login = new WarungPedia();
        Login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_HaveAccountActionPerformed

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        // TODO add your handling code here:
        if (fld_Nama.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nama masih kosong");
        }
        if (fld_Username.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Username masih kosong");
        }
        if (fld_Password.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Password masih kosong");
        }
        if (fld_Email.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Email masih kosong");
        }if(fld_Alamat.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Alamat masih kosong");
        }if(fld_Telepon.getText().equals("")){
            JOptionPane.showMessageDialog(this, "No.Telepon masih kosong");
        }else {
            try {
                String patch = "src/PP_Pembeli";
                File directory = new File(patch);
                File fileawal = null;
                File fileakhir = null;
                String ext = this.filename.substring(filename.lastIndexOf('.')+1);
                fileawal = new File(filename);
                fileakhir = new File(patch+"/"+fld_Nama.getText()+"."+ext);
                String pmbl = "Pembeli";
                String pembeli = "INSERT INTO user VALUES('" + fld_Username.getText() + "','"
                                    + fld_Password.getText() + "','"+pmbl+"')";
                String login = "INSERT INTO pembeli(Username,Nama_Pembeli,Email_Pembeli,Alamat_Pembeli,Telepon_Pembeli, Foto_Pembeli) VALUES('" + fld_Username.getText() + "','"+ fld_Nama.getText() +"'"
                        + ",'" + fld_Email.getText() + "','" + fld_Alamat.getText() + "','" + fld_Telepon.getText() + "','"+"src"+"/"+"PP_Pembeli"+"/"+fld_Nama.getText()+"."+ext+"')";
                java.sql.Connection con = (Connection) Koneksi.configDB();
                java.sql.PreparedStatement pst = con.prepareStatement(pembeli);
                java.sql.PreparedStatement lgn = con.prepareStatement(login);
                pst.execute();
                lgn.execute();
                Files.copy(fileawal.toPath(), fileakhir.toPath());
                WarungPedia Login = new WarungPedia();
                Login.setVisible(true);
                this.setVisible(false);
                JOptionPane.showMessageDialog(this, "Akun berhasil dibuat");
                fld_Username.setText("");
                fld_Nama.setText("");
                fld_Alamat.setText("");
                fld_Email.setText("");
                fld_Password.setText("");
                fld_Telepon.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());

            }
        }
    }//GEN-LAST:event_btn_RegisterActionPerformed

    private void fld_TeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_TeleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_TeleponActionPerformed

    private void fld_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_UsernameActionPerformed

    private void fld_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_PasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                        JFileChooser fc=new JFileChooser(); 
                        fc.showOpenDialog(this); 
                        File f=fc.getSelectedFile();
                        ImageIcon PP = new ImageIcon(f.toString());
                        Image img = PP.getImage().getScaledInstance(369, 369, SCALE_SMOOTH);
                        ImageIcon profil = new ImageIcon(img);
                        this.filename = f.getAbsolutePath();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel Utama;
    private javax.swing.JButton btn_HaveAccount;
    private javax.swing.JButton btn_Register;
    private javax.swing.JTextField fld_Alamat;
    private javax.swing.JTextField fld_Email;
    private javax.swing.JTextField fld_Nama;
    private javax.swing.JTextField fld_Password;
    private javax.swing.JTextField fld_Telepon;
    private javax.swing.JTextField fld_Username;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lb_Alamat;
    private javax.swing.JLabel lb_Email;
    private javax.swing.JLabel lb_Nama;
    private javax.swing.JLabel lb_Password;
    private javax.swing.JLabel lb_Telepon;
    private javax.swing.JLabel lb_Username;
    private javax.swing.JLabel lb_register;
    // End of variables declaration//GEN-END:variables
}
