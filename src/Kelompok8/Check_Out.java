/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Kelompok8;

import java.awt.Graphics;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import static java.awt.Image.SCALE_SMOOTH;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Check_Out extends javax.swing.JFrame {
private static int counter;
private static String Usr;
private static int ID_U;
private static int ID_K;
private static int ID_BRG;
private static String foto;
private static int STK;
private static int Jum;
private static int HRG;
private static int TTL;
private static int SSTK;
private PreparedStatement stat;
private ResultSet rs;
Koneksi k = new Koneksi();


    DateFormat DF = new SimpleDateFormat("MM/dd/YY");
    Date DT = new Date();
    Calendar CR = Calendar.getInstance();
    /**
     * Creates new form Check_Out
     */
    public Check_Out() {
        initComponents();
        Keranjang ker = new Keranjang();
        WarungPedia Log = new WarungPedia();
        ID_BRG = ker.ID_B;
        Usr = WarungPedia.ID_USER;
        lb_TGL.setText(" " + DF.format(DT));
        lb_TGL.setVisible(false);
        
        try {
            String ID = "SELECT * FROM User WHERE Username = '"+Usr+"'";
            Connection con = (Connection)Koneksi.configDB();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(ID);
            if (counter < 2) {
                if(rs.next()){
                    String Level = rs.getString("Level");
                    if(Level.equals("Penjual")){
                        String stk = "SELECT * FROM penjual WHERE Username = '"+Usr+"'";
                        Connection kon = (Connection)Koneksi.configDB();
                        Statement gmt = kon.createStatement();
                        ResultSet ra = gmt.executeQuery(stk);
                        while(ra.next()){
                            ID_U = ra.getInt("ID_PENJUAL");
                        }
                    }else if(Level.equals("Pembeli")){
                        String stk = "SELECT * FROM pembeli WHERE Username = '"+Usr+"'";
                        Connection kon = (Connection)Koneksi.configDB();
                        Statement gmt = kon.createStatement();
                        ResultSet ra = gmt.executeQuery(stk);
                        while(ra.next()){
                            ID_U = ra.getInt("ID_PEMBELI");
                        }

                    }else{
                        JOptionPane.showMessageDialog(this, "User belum login, harap login terlebih dahulu");
                        this.setVisible(false);
                        Log.setVisible(true);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "User belum login, harap login terlebih dahulu");
                    counter++;
                }
            }else{
                JOptionPane.showMessageDialog(this, "Akses tidak Normal, Aplikasi akan ditutup!!");
                System.exit(0);
            }
            String sql = "SELECT * FROM barang WHERE ID_BARANG = '"+ID_BRG+"'";
            Connection level = (Connection)Koneksi.configDB();
            Statement gmt = level.createStatement();
            ResultSet ra = gmt.executeQuery(sql);
            while(ra.next()){
                lb_nama_barang.setText(ra.getString("NAMA_BARANG"));
                lb_stok.setText(ra.getString("STOK"));
                foto = ra.getString("Foto_Barang");
                HRG = ra.getInt("HARGA");
                File f = new File(this.foto);
                ImageIcon icon = new ImageIcon(f.toString());
                Image newimg = icon.getImage().getScaledInstance(236, 370, SCALE_SMOOTH);
                ImageIcon ic = new ImageIcon(newimg);
                lb_gambar_barang.setText("");
                lb_gambar_barang.setIcon(ic);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lb_gambar_barang = new javax.swing.JLabel();
        lb_nama_barang = new javax.swing.JLabel();
        lb_jumlah_terjual = new javax.swing.JLabel();
        lb_harga = new javax.swing.JLabel();
        btn_beli = new javax.swing.JButton();
        lb_total_harga = new javax.swing.JLabel();
        lb_stok = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_TGL = new javax.swing.JLabel();
        fld_jumlah = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lb_back = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1341, 952));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(577, 952));

        lb_gambar_barang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_gambar_barang.setText("Gambar");
        lb_gambar_barang.setPreferredSize(new java.awt.Dimension(577, 660));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lb_gambar_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_gambar_barang, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        lb_nama_barang.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lb_nama_barang.setText("Nama Barang");

        lb_jumlah_terjual.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lb_jumlah_terjual.setText("STOK :");

        lb_harga.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        lb_harga.setText("Rp.");

        btn_beli.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        btn_beli.setText("Check Out");
        btn_beli.setPreferredSize(new java.awt.Dimension(206, 53));
        btn_beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_beliActionPerformed(evt);
            }
        });

        lb_total_harga.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N

        lb_stok.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Jumlah :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel2.setText("TOTAL");

        fld_jumlah.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        fld_jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fld_jumlahKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton1.setText("Hitung Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lb_jumlah_terjual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb_stok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fld_jumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_nama_barang)
                            .addComponent(btn_beli, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_TGL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(lb_harga)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_total_harga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lb_TGL, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_nama_barang)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_jumlah_terjual)
                            .addComponent(lb_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(fld_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lb_harga)
                                .addComponent(jLabel2))
                            .addComponent(lb_total_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btn_beli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        lb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pngwing 7.png"))); // NOI18N
        lb_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_backMouseClicked(evt);
            }
        });

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/download 3 (1).png"))); // NOI18N
        background.setText("jLabel3");
        background.setPreferredSize(new java.awt.Dimension(1440, 1024));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lb_back)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lb_back)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_beliActionPerformed
        // TODO add your handling code here:
        int jawab = JOptionPane.showOptionDialog(this, 
                            "Pastikan jumlah yang masukkan benar!!", 
                            "YA", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
                        if(jawab == JOptionPane.YES_OPTION){
                            STK = Integer.parseInt(lb_stok.getText());
                            Jum = Integer.parseInt(fld_jumlah.getText());
                            if (Jum > STK) {
                                JOptionPane.showMessageDialog(rootPane, "Jumlah barang yang akan dibeli melebihi stok yang tersedia");
                            }else{
                                SSTK = STK - Jum;
                                TTL = Jum * HRG;
                                try {
                                    String sql = "SELECT * FROM User WHERE Username ='"+Usr+"'";
                                    Connection level = (Connection)Koneksi.configDB();
                                    Statement gmt = level.createStatement();
                                    ResultSet ra = gmt.executeQuery(sql);
                                    if (counter < 2) {
                                        if(ra.next()){
                                            String Level = ra.getString("Level");
                                            if(Level.equals("Penjual")){
                                                String stk = "SELECT * FROM keranjang WHERE ID_Penjual = '"+ID_U+"' AND ID_Barang= '"+ID_BRG+"'";
                                                Connection kon = (Connection)Koneksi.configDB();
                                                Statement stm = kon.createStatement();
                                                ResultSet rs = stm.executeQuery(stk);
                                                while(rs.next()){
                                                    ID_K = rs.getInt("ID_Keranjang");
                                                }
                                                this.stat = Koneksi.configDB().prepareStatement("UPDATE keranjang SET Status= 'Sudah dicheckout',TANGGAL_PEMBELIAN='"+lb_TGL.getText()+"',TOTAL='"+TTL+"' WHERE ID_Keranjang = '"+ID_K+"';");
                                                stat.executeUpdate();
                                                this.stat = Koneksi.configDB().prepareStatement("UPDATE barang SET STOK= '"+SSTK+"' WHERE ID_BARANG = '"+ID_BRG+"';");
                                                stat.executeUpdate();
                                                JOptionPane.showMessageDialog(rootPane, "Pesanan anda akan diproses oleh penjual dan dikirimkan ke alamat anda, lakukan pembayaran ditempat saat barang sudah diantar.");
                                                PesananSaya histori = new PesananSaya();
                                                histori.setVisible(true);
                                                this.setVisible(false);

                                            }else if(Level.equals("Pembeli")){
                                                System.out.println("nice");
                                                String stk = "SELECT * FROM keranjang WHERE ID_Pembeli = '"+ID_U+"' AND ID_Barang= '"+ID_BRG+"'";
                                                Connection kon = (Connection)Koneksi.configDB();
                                                Statement stm = kon.createStatement();
                                                ResultSet rs = stm.executeQuery(stk);
                                                while(rs.next()){
                                                    ID_K = rs.getInt("ID_Keranjang");
                                                }
                                                this.stat = Koneksi.configDB().prepareStatement("UPDATE keranjang SET Status= 'Sudah dicheckout',TANGGAL_PEMBELIAN='"+lb_TGL.getText()+"',TOTAL='"+TTL+"' WHERE ID_Keranjang = '"+ID_K+"';");
                                                stat.executeUpdate();
                                                this.stat = Koneksi.configDB().prepareStatement("UPDATE barang SET STOK= '"+SSTK+"' WHERE ID_BARANG = '"+ID_BRG+"';");
                                                stat.executeUpdate();
                                                JOptionPane.showMessageDialog(rootPane, "Pesanan anda akan diproses oleh penjual dan dikirimkan ke alamat anda, lakukan pembayaran ditempat saat barang sudah diantar.");
                                                PesananSaya histori = new PesananSaya();
                                                histori.setVisible(true);
                                                this.setVisible(false);
                                            }else{
                                                JOptionPane.showMessageDialog(this, "User belum login, harap login terlebih dahulu");
                                                WarungPedia Login = new WarungPedia();
                                                this.setVisible(false);
                                                Login.setVisible(true);
                                            }
                                        }else{
                                            JOptionPane.showMessageDialog(this, "User belum login, harap login terlebih dahulu");
                                            counter++;
                                        }
                                    }else{
                                        JOptionPane.showMessageDialog(this, "Akses tidak Normal, Aplikasi akan ditutup!!");
                                        System.exit(0);
                                    }
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(rootPane, e);
                                }
                            }
                        }
    }//GEN-LAST:event_btn_beliActionPerformed

    private void lb_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_backMouseClicked
        // TODO add your handling code here:
        Tampilan_Awal toko = new Tampilan_Awal();
        toko.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lb_backMouseClicked

    private void fld_jumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fld_jumlahKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_jumlahKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Jum = Integer.parseInt(fld_jumlah.getText());
        TTL = Jum * HRG;
        String Total = String.valueOf(TTL);
        lb_total_harga.setText(Total);
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
            java.util.logging.Logger.getLogger(Check_Out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Check_Out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Check_Out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Check_Out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Check_Out().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_beli;
    private javax.swing.JTextField fld_jumlah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_TGL;
    private javax.swing.JLabel lb_back;
    private javax.swing.JLabel lb_gambar_barang;
    private javax.swing.JLabel lb_harga;
    private javax.swing.JLabel lb_jumlah_terjual;
    private javax.swing.JLabel lb_nama_barang;
    private javax.swing.JLabel lb_stok;
    private javax.swing.JLabel lb_total_harga;
    // End of variables declaration//GEN-END:variables
}
