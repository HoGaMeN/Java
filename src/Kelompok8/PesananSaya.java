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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class PesananSaya extends javax.swing.JFrame {
private static String Usr;
private static int counter;
private static int ID_U;
    /**
     * Creates new form PesananSaya
     */
    public PesananSaya() {
        initComponents();
        
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
        
        WarungPedia Login = new WarungPedia();
        Usr = Login.ID_USER;
        DefaultTableModel DT = new DefaultTableModel();
        DT.addColumn("Nama Barang");
        DT.addColumn("Tanggal Pemesanan");
        DT.addColumn("Total");
        try {
            String sql = "SELECT * FROM User WHERE Username ='"+Usr+"'";
            Connection level = (Connection)Koneksi.configDB();
            Statement gmt = level.createStatement();
            ResultSet ra = gmt.executeQuery(sql);
            if (counter < 2) {
                if(ra.next()){
                    String Level = ra.getString("Level");
                    if(Level.equals("Penjual")){
                        String User = "SELECT * FROM penjual WHERE Username = '"+Usr+"'";
                        Connection kon = (Connection)Koneksi.configDB();
                        Statement ment = kon.createStatement();
                        ResultSet rst = ment.executeQuery(User);
                        while(rst.next()){
                            ID_U = rst.getInt("ID_PENJUAL");
                        }
                        String brg = "SELECT NAMA_BARANG, TANGGAL_PEMBELIAN, TOTAL "
                                + "FROM barang, keranjang, penjual "
                                + "WHERE barang.ID_BARANG = keranjang.ID_Barang "
                                + "AND penjual.ID_PENJUAL = keranjang.ID_Penjual "
                                + "AND keranjang.ID_Penjual = '"+ID_U+"' "
                                + "AND keranjang.Status = 'Sudah dicheckout' "
                                + "ORDER BY barang.NAMA_BARANG";
                        java.sql.Connection con = (Connection) Koneksi.configDB();
                        java.sql.Statement stm = con.createStatement();
                        java.sql.ResultSet res = stm.executeQuery(brg);
                        while (res.next()) {
                            DT.addRow(new Object[]{res.getString(1), res.getString(2),
                        res.getString(3)});
                        TB_History.setModel(DT);
                        }
                    }else if(Level.equals("Pembeli")){
                        String User = "SELECT * FROM pembeli WHERE Username = '"+Usr+"'";
                        Connection kon = (Connection)Koneksi.configDB();
                        Statement ment = kon.createStatement();
                        ResultSet rst = ment.executeQuery(User);
                        while(rst.next()){
                            ID_U = rst.getInt("ID_PEMBELi");
                        }
                        String brg = "SELECT NAMA_BARANG, TANGGAL_PEMBELIAN, TOTAL "
                                + "FROM barang, keranjang, pembeli "
                                + "WHERE barang.ID_BARANG = keranjang.ID_Barang "
                                + "AND pembeli.ID_PEMBELI = keranjang.ID_Pembeli "
                                + "AND keranjang.ID_Pembeli = '"+ID_U+"' "
                                + "AND keranjang.Status = 'Sudah dicheckout' "
                                + "ORDER BY barang.NAMA_BARANG";
                        java.sql.Connection con = (Connection) Koneksi.configDB();
                        java.sql.Statement stm = con.createStatement();
                        java.sql.ResultSet res = stm.executeQuery(brg);
                        while (res.next()) {
                            DT.addRow(new Object[]{res.getString(1), res.getString(2),
                        res.getString(3)});
                        TB_History.setModel(DT);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "User belum login, harap login terlebih dahulu");
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_History = new javax.swing.JTable();
        lb_back = new javax.swing.JLabel();
        lb_pesanansaya = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1064, 1165));

        TB_History.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }
    );
    jScrollPane1.setViewportView(TB_History);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1152, Short.MAX_VALUE)
            .addContainerGap())
    );

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

    lb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pngwing 7.png"))); // NOI18N
    lb_back.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            lb_backMouseClicked(evt);
        }
    });
    getContentPane().add(lb_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

    lb_pesanansaya.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
    lb_pesanansaya.setText("Pesanan Saya");
    getContentPane().add(lb_pesanansaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

    background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/download 2 (2).png"))); // NOI18N
    getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_backMouseClicked
        // TODO add your handling code here:
        ProfilPejual user = new ProfilPejual();
        user.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lb_backMouseClicked

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
            java.util.logging.Logger.getLogger(PesananSaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesananSaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesananSaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesananSaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesananSaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TB_History;
    private javax.swing.JLabel background;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_back;
    private javax.swing.JLabel lb_pesanansaya;
    // End of variables declaration//GEN-END:variables
}
