/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Kelompok8;

import static Kelompok8.Tampilan_Awal.ID_BRG;
import static Kelompok8.Tampilan_Awal.NM_BRG;
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
public class Keranjang extends javax.swing.JFrame {
public static int ID_B;
private static String Usr;
private static int ID_U;
private static int ID_K;
private static int counter;
    /**
     * Creates new form Keranjang
     */
    public Keranjang() {
        initComponents();
               

        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
         load_data();
    }
 private void load_data() {
        WarungPedia Login = new WarungPedia();
        Usr = Login.ID_USER;
        DefaultTableModel DT = new DefaultTableModel();
        DT.addColumn("Nama Barang");
        DT.addColumn("Harga");
        DT.addColumn("Stok");
        try {
            String sql = "SELECT * FROM User WHERE Username ='"+Usr+"'";
            Connection level = (Connection)Koneksi.configDB();
            Statement gmt = level.createStatement();
            ResultSet ra = gmt.executeQuery(sql);
            if (counter < 2) {
                if(ra.next()){
                    String Level = ra.getString("Level");
                    
                    if(Level.equals("Penjual")){
                        String penjual = "SELECT * FROM penjual WHERE Username = '"+Usr+"'";
                        Connection kon = (Connection)Koneksi.configDB();
                        Statement stat = kon.createStatement();
                        ResultSet set = stat.executeQuery(penjual);
                        while(set.next()){
                            ID_U = set.getInt("ID_PENJUAL");
                        }
                        String brg = "SELECT NAMA_BARANG, HARGA, STOK FROM keranjang, penjual, barang "
                                + "WHERE barang.ID_BARANG = keranjang.ID_Barang "
                                + "AND keranjang.ID_Penjual = penjual.ID_PENJUAL "
                                + "AND keranjang.ID_Penjual = '"+ID_U+"' "
                                + "AND keranjang.Status = 'Belum Checkout' "
                                + "ORDER BY barang.NAMA_BARANG";
                        java.sql.Connection con = (Connection) Koneksi.configDB();
                        java.sql.Statement stm = con.createStatement();
                        java.sql.ResultSet res = stm.executeQuery(brg);
                        while (res.next()) {
                            DT.addRow(new Object[]{res.getString(1), res.getString(2),
                        res.getString(3)});
                        TB_Keranjang.setModel(DT);
                        }
                    }else if(Level.equals("Pembeli")){
                        String pembeli = "SELECT * FROM pembeli WHERE Username = '"+Usr+"'";
                        Connection kon = (Connection)Koneksi.configDB();
                        Statement stat = kon.createStatement();
                        ResultSet set = stat.executeQuery(pembeli);
                        while(set.next()){
                            System.out.println("Lah");
                            ID_U = set.getInt("ID_PEMBELI");
                            System.out.println("aneh");
                        }
                        System.out.println("aneh pol");
                        String brg = "SELECT NAMA_BARANG, HARGA, STOK FROM keranjang, pembeli, barang "
                                + "WHERE barang.ID_BARANG = keranjang.ID_Barang "
                                + "AND keranjang.ID_Pembeli = pembeli.ID_PEMBELI "
                                + "AND keranjang.ID_Pembeli = '"+ID_U+"' "
                                + "AND keranjang.Status = 'Belum Checkout' "
                                + "ORDER BY barang.NAMA_BARANG";
                        java.sql.Connection con = (Connection) Koneksi.configDB();
                        java.sql.Statement stm = con.createStatement();
                        java.sql.ResultSet res = stm.executeQuery(brg);
                        System.out.println("binggung");
                        while (res.next()) {
                            DT.addRow(new Object[]{res.getString(1), res.getString(2),
                        res.getString(3)});
                        TB_Keranjang.setModel(DT);
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
        lb_keranjangsaya = new javax.swing.JLabel();
        lb_back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_Keranjang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        chbx_hapus = new javax.swing.JCheckBox();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_keranjangsaya.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lb_keranjangsaya.setText("Keranjang Saya");
        jPanel1.add(lb_keranjangsaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pngwing 7.png"))); // NOI18N
        lb_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_backMouseClicked(evt);
            }
        });
        jPanel1.add(lb_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jPanel2.setPreferredSize(new java.awt.Dimension(1064, 1032));

        TB_Keranjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TB_Keranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_KeranjangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TB_Keranjang);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("*Klik barang yang ingin dicheck out");

        chbx_hapus.setText("Hapus");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chbx_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(chbx_hapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, -1, 1040));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/download 3.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_backMouseClicked
        // TODO add your handling code here:
        ProfilPejual user = new ProfilPejual();
        user.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lb_backMouseClicked

    private void TB_KeranjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_KeranjangMouseClicked
        // TODO add your handling code here:
        if (chbx_hapus.isSelected()) {
        int baris = TB_Keranjang.rowAtPoint(evt.getPoint());
        NM_BRG = TB_Keranjang.getValueAt(baris, 0).toString();
        WarungPedia Login = new WarungPedia();
        String ID = Login.ID_USER;
        System.out.println(NM_BRG);
        int jawab = JOptionPane.showOptionDialog(this,
                "Apakah anda yakin ingin menghapus barang dari keranjang anda?",
                "Hapus",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (jawab == JOptionPane.YES_OPTION) {
            try {
                String sql = "SELECT * FROM User WHERE Username = '"+ID+"'";
            Connection level = (Connection)Koneksi.configDB();
            Statement gmt = level.createStatement();
            ResultSet ra = gmt.executeQuery(sql);
            if (counter < 2) {
                if(ra.next()){
                    String Level = ra.getString("Level");
                    if(Level.equals("Penjual")){
                        String brg = "SELECT * FROM barang WHERE NAMA_BARANG = '"+NM_BRG+"'";
                        Connection nek = (Connection)Koneksi.configDB();
                        Statement st = nek.createStatement();
                        ResultSet rss = st.executeQuery(brg);
                        while(rss.next()){
                            ID_B = rss.getInt("ID_BARANG");
                        }
                        String krj = "SELECT * FROM keranjang WHERE ID_Barang = '"+ID_B+"' AND ID_Penjual = '"+ID_U+"'";
                        Connection con = (Connection)Koneksi.configDB();
                        Statement ment = con.createStatement();
                        ResultSet set = ment.executeQuery(krj);
                        while(set.next()){
                            ID_K = set.getInt("ID_Keranjang");
                        }
                        String dlt = "DELETE FROM keranjang WHERE ID_Keranjang = '"+ID_K+"'";
                        java.sql.Connection kon = (Connection) Koneksi.configDB();
                        java.sql.PreparedStatement pst = kon.prepareStatement(dlt);
                        pst.execute();
                        load_data();
                    }else if(Level.equals("Pembeli")){
                        String brg = "SELECT * FROM barang WHERE NAMA_BARANG = '"+NM_BRG+"'";
                        Connection nek = (Connection)Koneksi.configDB();
                        Statement st = nek.createStatement();
                        ResultSet rss = st.executeQuery(brg);
                        while(rss.next()){
                            ID_B = rss.getInt("ID_BARANG");
                        }
                        String krj = "SELECT * FROM keranjang WHERE ID_Barang = '"+ID_B+"' AND ID_Pembeli = '"+ID_U+"'";
                        Connection con = (Connection)Koneksi.configDB();
                        Statement ment = con.createStatement();
                        ResultSet set = ment.executeQuery(krj);
                        while(set.next()){
                            ID_K = set.getInt("ID_Keranjang");
                        }
                        System.out.println(ID_K);
                        String dlt = "DELETE FROM keranjang WHERE ID_Keranjang = '"+ID_K+"'";
                        java.sql.Connection kon = (Connection) Koneksi.configDB();
                        java.sql.PreparedStatement pst = kon.prepareStatement(dlt);
                        pst.execute();
                        load_data();
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
            }catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        }else{
            try {
            int baris = TB_Keranjang.rowAtPoint(evt.getPoint());
            NM_BRG = TB_Keranjang.getValueAt(baris, 0).toString();
            String sql = "SELECT * FROM barang WHERE NAMA_BARANG = '"+NM_BRG+"'";
            Connection level = (Connection)Koneksi.configDB();
            Statement gmt = level.createStatement();
            ResultSet ra = gmt.executeQuery(sql);
            while(ra.next()){
                ID_B = ra.getInt("ID_BARANG");
                }
            Check_Out Cout = new Check_Out();
            this.setVisible(false);
            Cout.setVisible(true);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        }
        
    }//GEN-LAST:event_TB_KeranjangMouseClicked
 

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
            java.util.logging.Logger.getLogger(Keranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Keranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Keranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Keranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Keranjang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TB_Keranjang;
    private javax.swing.JLabel background;
    private javax.swing.JCheckBox chbx_hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_back;
    private javax.swing.JLabel lb_keranjangsaya;
    // End of variables declaration//GEN-END:variables
}
