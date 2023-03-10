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
import java.sql.PreparedStatement;
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
public class ProfilPejual extends javax.swing.JFrame {
    private PreparedStatement stat;
    private ResultSet rs;
    private static int counter;
    private Image image;
    private String filename;
    Koneksi k = new Koneksi();
    private String foto;
    /**
     * Creates new form ProfilPejual
     */
    
    public ProfilPejual() {
        initComponents();
        
        
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        WarungPedia Login = new WarungPedia();
        String ID = Login.ID_USER;
        System.out.println(ID);
        
        try {
            String sql = "SELECT * FROM pembeli WHERE Username = '"+ID+"'";
            Connection level = (Connection)Koneksi.configDB();
            Statement gmt = level.createStatement();
            ResultSet ra = gmt.executeQuery(sql);
            while(ra.next()){
                lb_Name_User.setText(ra.getString("Nama_Pembeli"));
                lb_email_user.setText(ra.getString("Email_Pembeli"));
                txt_area_alamat_user.setText(ra.getString("Alamat_Pembeli"));
                lb_no_hp_user.setText(ra.getString("Telepon_Pembeli"));
                foto = ra.getString("Foto_Pembeli");
                if(foto.equals("")){
                    
                }else{
                File f = new File(this.foto);
                ImageIcon icon = new ImageIcon(f.toString());
                Image newimg = icon.getImage().getScaledInstance(369, 369, SCALE_SMOOTH);
                ImageIcon ic = new ImageIcon(newimg);
                Lb_Photo_Profil.setIcon(ic);
                }
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
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
        Panel_Profil = new javax.swing.JPanel();
        lb_profil = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        lb_alamat = new javax.swing.JLabel();
        lb_no_hp = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lb_email_user = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area_alamat_user = new javax.swing.JTextArea();
        lb_no_hp_user = new javax.swing.JLabel();
        Btn_Back = new javax.swing.JLabel();
        Lb_Photo_Profil = new javax.swing.JLabel();
        lb_Name_User = new javax.swing.JLabel();
        lb_Keranjang = new javax.swing.JLabel();
        lb_History = new javax.swing.JLabel();
        lb_Setting = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Profil.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Profil.setMinimumSize(new java.awt.Dimension(726, 662));

        lb_profil.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lb_profil.setText("Profil");

        lb_email.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lb_email.setText("Email");

        lb_alamat.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lb_alamat.setText("Alamat");

        lb_no_hp.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lb_no_hp.setText("No HP");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel6.setText(":");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel7.setText(":");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel8.setText(":");

        lb_email_user.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        lb_email_user.setText("211111003@mhs.stiki.ac.id");

        txt_area_alamat_user.setEditable(false);
        txt_area_alamat_user.setColumns(20);
        txt_area_alamat_user.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        txt_area_alamat_user.setRows(5);
        jScrollPane1.setViewportView(txt_area_alamat_user);

        lb_no_hp_user.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        lb_no_hp_user.setText("087857172381");

        javax.swing.GroupLayout Panel_ProfilLayout = new javax.swing.GroupLayout(Panel_Profil);
        Panel_Profil.setLayout(Panel_ProfilLayout);
        Panel_ProfilLayout.setHorizontalGroup(
            Panel_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProfilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ProfilLayout.createSequentialGroup()
                        .addGroup(Panel_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_profil)
                            .addComponent(lb_email)
                            .addComponent(lb_alamat))
                        .addGap(58, 58, 58))
                    .addGroup(Panel_ProfilLayout.createSequentialGroup()
                        .addComponent(lb_no_hp)
                        .addGap(8, 8, 8)))
                .addGroup(Panel_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ProfilLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(lb_email_user))
                    .addGroup(Panel_ProfilLayout.createSequentialGroup()
                        .addGroup(Panel_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_no_hp_user, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel_ProfilLayout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(8, 8, 8)))))
                .addContainerGap())
        );
        Panel_ProfilLayout.setVerticalGroup(
            Panel_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProfilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_profil)
                .addGap(88, 88, 88)
                .addGroup(Panel_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_email)
                    .addComponent(jLabel6)
                    .addComponent(lb_email_user))
                .addGap(18, 18, 18)
                .addGroup(Panel_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_alamat)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(Panel_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_no_hp_user)
                    .addComponent(jLabel8)
                    .addComponent(lb_no_hp))
                .addGap(36, 36, 36))
        );

        Btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pngwing 7.png"))); // NOI18N
        Btn_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_BackMouseClicked(evt);
            }
        });

        Lb_Photo_Profil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb_Photo_Profil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Picsart_22-09-26_16-04-45-131.png"))); // NOI18N
        Lb_Photo_Profil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lb_Photo_ProfilMouseClicked(evt);
            }
        });

        lb_Name_User.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lb_Name_User.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Name_User.setText("Warung Pedia");

        lb_Keranjang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/kisspng-shopping-cart-logo-shopping-bags-trolleys-5afb65b0c66925 1.png"))); // NOI18N
        lb_Keranjang.setPreferredSize(new java.awt.Dimension(103, 117));
        lb_Keranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_KeranjangMouseClicked(evt);
            }
        });

        lb_History.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/newsletter-line.png"))); // NOI18N
        lb_History.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_HistoryMouseClicked(evt);
            }
        });

        lb_Setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pngegg 1.png"))); // NOI18N
        lb_Setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_SettingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout UtamaLayout = new javax.swing.GroupLayout(Utama);
        Utama.setLayout(UtamaLayout);
        UtamaLayout.setHorizontalGroup(
            UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UtamaLayout.createSequentialGroup()
                .addComponent(Btn_Back)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(UtamaLayout.createSequentialGroup()
                .addGroup(UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UtamaLayout.createSequentialGroup()
                        .addGroup(UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_Name_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lb_Photo_Profil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UtamaLayout.createSequentialGroup()
                        .addGap(0, 78, Short.MAX_VALUE)
                        .addComponent(lb_Keranjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_History)
                        .addGap(18, 18, 18)
                        .addComponent(lb_Setting)
                        .addGap(77, 77, 77)))
                .addComponent(Panel_Profil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        UtamaLayout.setVerticalGroup(
            UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UtamaLayout.createSequentialGroup()
                .addComponent(Btn_Back)
                .addGap(103, 103, 103)
                .addGroup(UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel_Profil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(UtamaLayout.createSequentialGroup()
                        .addComponent(Lb_Photo_Profil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_Name_User)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_History)
                            .addComponent(lb_Keranjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_Setting))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_SettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_SettingMouseClicked
        // TODO add your handling code here:
        Setting seting = new Setting();
        this.setVisible(false);
        seting.setVisible(true);
    }//GEN-LAST:event_lb_SettingMouseClicked

    private void Btn_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BackMouseClicked
        // TODO add your handling code here:
        Tampilan_Awal Awal = new Tampilan_Awal();
        this.setVisible(false);
        Awal.setVisible(true);
    }//GEN-LAST:event_Btn_BackMouseClicked

    private void lb_HistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_HistoryMouseClicked
        // TODO add your handling code here:
        PesananSaya history = new PesananSaya();
        history.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lb_HistoryMouseClicked

    private void Lb_Photo_ProfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lb_Photo_ProfilMouseClicked
        // TODO add your handling code here:
         /*try{
            WarungPedia Login = new WarungPedia();
            String ID = Login.ID_USER;
            String sql = "SELECT * FROM Pembeli WHERE Username='"+ID+"'";
            Connection level = (Connection)Koneksi.configDB();
            Statement gmt = level.createStatement();
            ResultSet ra = gmt.executeQuery(sql);
            
            if (counter < 2) {
                if(ra.next()){
                    String Level = ra.getString("Foto_Pembeli");
                    System.out.println(Level);
                    if(Level.equals(null)){
                        JFileChooser fc=new JFileChooser(); 
                        fc.showOpenDialog(this); 
                        File f=fc.getSelectedFile();
                        ImageIcon PP = new ImageIcon(f.toString());
                        Image img = PP.getImage().getScaledInstance(369, 369, SCALE_SMOOTH);
                        ImageIcon profil = new ImageIcon(img);
                        Lb_Photo_Profil.setIcon(profil);
                        this.filename = f.getAbsolutePath();
                        int jawab = JOptionPane.showOptionDialog(this, 
                            "Simpan Hasil Ubah?", 
                            "Simpan", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
                        if(jawab == JOptionPane.YES_OPTION){
                            String patch = "src/PP_Pembeli";
                            System.out.println("tes"+patch);
                            File directory = new File(patch);
                            File fileawal = null;
                            File fileakhir = null;
                            String ext = this.filename.substring(filename.lastIndexOf('.')+1);
                            fileawal = new File(filename);
                            fileakhir = new File(patch+"/"+lb_Name_User.getText()+"."+ext);
                            System.out.println(ID);
                            this.stat = Koneksi.configDB().prepareStatement("UPDATE pembeli set Foto_Pembeli='"+"src"+"/"+"PP_Pembeli"+"/"+lb_Name_User.getText()+"."+ext+/*fileakhirtemporary.getText()+"' WHERE Username='"+ID+"'");
                            stat.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Foto berhasil diubah");
                            Files.copy(fileawal.toPath(), fileakhir.toPath());
                        }
                    }else{
                        JFileChooser fc=new JFileChooser(); 
                        fc.showOpenDialog(this); 
                        File f=fc.getSelectedFile();
                        ImageIcon PP = new ImageIcon(f.toString());
                        Image img = PP.getImage().getScaledInstance(369, 369, SCALE_SMOOTH);
                        ImageIcon profil = new ImageIcon(img);
                        Lb_Photo_Profil.setIcon(profil);
                        this.filename = f.getAbsolutePath();
                        int jawab = JOptionPane.showOptionDialog(this, 
                            "Simpan Hasil Ubah?", 
                            "Simpan", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
                        if(jawab == JOptionPane.YES_OPTION){
                            String patch = "src/PP_Pembeli";
                            File directory = new File(patch);
                            System.out.println("tes"+patch);
                            File fileawal = null;
                            File fileakhir = null;
                            String ext = this.filename.substring(filename.lastIndexOf('.')+1);
                            fileawal = new File(filename);
                            fileakhir = new File(patch+"/"+lb_Name_User.getText()+"."+ext);
                            System.out.println(ID);
                            this.stat = Koneksi.configDB().prepareStatement("UPDATE pembeli set Foto_Pembeli='"+"src"+"/"+"PP_Pembeli"+"/"+lb_Name_User.getText()+"."+ext+/*fileakhirtemporary.getText()+"' WHERE Username='"+ID+"'");
                            stat.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Foto berhasil diubah");
                            Files.copy(fileawal.toPath(), fileakhir.toPath());
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Silahkan cek kembali username dan password anda!!");
                    counter++;
                }
            }else{
                JOptionPane.showMessageDialog(this, "Akses tidak Normal, Aplikasi akan ditutup!!");
                System.exit(0);
            }
            }catch(Exception e){
            System.out.println(e.getMessage());
            }*/
    }//GEN-LAST:event_Lb_Photo_ProfilMouseClicked

    private void lb_KeranjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_KeranjangMouseClicked
        // TODO add your handling code here:
        Keranjang krj = new Keranjang();
        this.setVisible(false);
        krj.setVisible(true);
    }//GEN-LAST:event_lb_KeranjangMouseClicked

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
            java.util.logging.Logger.getLogger(ProfilPejual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfilPejual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfilPejual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfilPejual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfilPejual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_Back;
    private javax.swing.JLabel Lb_Photo_Profil;
    private javax.swing.JPanel Panel_Profil;
    private javax.swing.JPanel Utama;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_History;
    private javax.swing.JLabel lb_Keranjang;
    private javax.swing.JLabel lb_Name_User;
    private javax.swing.JLabel lb_Setting;
    private javax.swing.JLabel lb_alamat;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_email_user;
    private javax.swing.JLabel lb_no_hp;
    private javax.swing.JLabel lb_no_hp_user;
    private javax.swing.JLabel lb_profil;
    private javax.swing.JTextArea txt_area_alamat_user;
    // End of variables declaration//GEN-END:variables
}
