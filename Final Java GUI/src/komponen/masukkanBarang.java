package komponen;

import koneksiDanJavaClass.DatabaseConnector;
import HalamanUtama.tabelBarang;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class masukkanBarang extends javax.swing.JPanel {

    public masukkanBarang() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel15 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        kodeBarang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        namaBarang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        harga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        kategori = new javax.swing.JComboBox<>();
        jPanel18 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        tombolTambah = new javax.swing.JButton();
        tombolSelesai = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setOpaque(false);
        add(jPanel2, java.awt.BorderLayout.WEST);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setOpaque(false);
        add(jPanel1, java.awt.BorderLayout.EAST);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(12, 1));

        jPanel5.setBackground(new java.awt.Color(153, 255, 153));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel5.setLayout(new java.awt.BorderLayout());
        jPanel3.add(jPanel5);

        jPanel19.setOpaque(false);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel19);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel10.setLayout(new java.awt.BorderLayout());
        jPanel10.add(kodeBarang, java.awt.BorderLayout.CENTER);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kode Barang    ");
        jLabel2.setOpaque(true);
        jPanel10.add(jLabel2, java.awt.BorderLayout.WEST);

        jPanel4.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4);

        jPanel14.setBackground(new java.awt.Color(204, 204, 0));
        jPanel14.setOpaque(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel14);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel11.setLayout(new java.awt.BorderLayout());
        jPanel11.add(namaBarang, java.awt.BorderLayout.CENTER);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Barang   ");
        jLabel3.setOpaque(true);
        jPanel11.add(jLabel3, java.awt.BorderLayout.WEST);

        jPanel6.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6);

        jPanel16.setOpaque(false);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel16);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel12.setLayout(new java.awt.BorderLayout());
        jPanel12.add(harga, java.awt.BorderLayout.CENTER);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Harga Satuan    ");
        jLabel4.setOpaque(true);
        jPanel12.add(jLabel4, java.awt.BorderLayout.WEST);

        jPanel7.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel7);

        jPanel17.setBackground(new java.awt.Color(204, 204, 0));
        jPanel17.setOpaque(false);
        jPanel17.setPreferredSize(new java.awt.Dimension(682, 17));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel17);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel13.setLayout(new java.awt.BorderLayout());

        kategori.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kategori", "Hp", "Laptop", "Lainnya" }));
        jPanel13.add(kategori, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel8);

        jPanel18.setBackground(new java.awt.Color(242, 26, 43));
        jPanel18.setOpaque(false);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel18);

        jPanel9.setBackground(new java.awt.Color(204, 255, 204));
        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.BorderLayout());

        tombolTambah.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tombolTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tombolTambah.png"))); // NOI18N
        tombolTambah.setBorderPainted(false);
        tombolTambah.setContentAreaFilled(false);
        tombolTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolTambah.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tombolTambah.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        tombolTambah.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        tombolTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTambahActionPerformed(evt);
            }
        });
        jPanel9.add(tombolTambah, java.awt.BorderLayout.WEST);

        tombolSelesai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tombolSelesai.png"))); // NOI18N
        tombolSelesai.setContentAreaFilled(false);
        tombolSelesai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolSelesaiActionPerformed(evt);
            }
        });
        jPanel9.add(tombolSelesai, java.awt.BorderLayout.EAST);

        jPanel3.add(jPanel9);

        jPanel20.setBackground(new java.awt.Color(242, 26, 43));
        jPanel20.setOpaque(false);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel20);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tambahBarang() throws SQLException {
        String id = kodeBarang.getText();
        String namaB = namaBarang.getText();
        String kat = (String) kategori.getSelectedItem();
        String hrg = harga.getText();
        int hargaSatuan = 0;

        if (id.equals("") || namaB.equals("")) {
            JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(masukkanBarang.this),
                    "Error: Kok ada yang kosong sih",
                    "Kesalahan",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            hargaSatuan = Integer.parseInt(hrg);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(masukkanBarang.this),
                    "Error: Harga harus Integer",
                    "Kesalahan",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return;
        }

        if (kat.equals("Pilih Kategori")) {
            JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(masukkanBarang.this),
                    "Error: Pilih Kategorinya yaa !!!",
                    "Kesalahan",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (hargaSatuan > 0) {
            DatabaseConnector.getConnection();
            String query = "INSERT INTO Barang (id_barang, nama_barang, harga_satuan, kategori) VALUES (?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = DatabaseConnector.connection.prepareStatement(query)) {
                preparedStatement.setString(1, id);
                preparedStatement.setString(2, namaB);
                preparedStatement.setInt(3, hargaSatuan);
                preparedStatement.setString(4, kat);

                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(masukkanBarang.this),
                        "Barang berhasil ditambahkan",
                        "Sukses",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(masukkanBarang.this),
                    "Error: Harga kok negatif :0",
                    "Kesalahan",
                    JOptionPane.ERROR_MESSAGE);
        }
    }


    private void tombolTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTambahActionPerformed
        try {
            tambahBarang();
        } catch (SQLException ex) {
            Logger.getLogger(masukkanBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tombolTambahActionPerformed

    private void tombolSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolSelesaiActionPerformed
        try {
            
            tabelBarang t = new tabelBarang();
            t.setVisible(true);
            SwingUtilities.getWindowAncestor(SwingUtilities.getWindowAncestor(masukkanBarang.this)).dispose();
            t.setLocationRelativeTo(null);
            t.setDefaultCloseOperation(tabelBarang.EXIT_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(SemuaAksesoris.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tombolSelesaiActionPerformed

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D d2 = (Graphics2D) g;
        d2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gd = new GradientPaint(0, 0, Color.decode("#6DC5E3"), 0, getHeight(), Color.WHITE);
        d2.setPaint(gd);
        d2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paintComponent(g);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JComboBox<String> kategori;
    private javax.swing.JTextField kodeBarang;
    private javax.swing.JTextField namaBarang;
    private javax.swing.JButton tombolSelesai;
    private javax.swing.JButton tombolTambah;
    // End of variables declaration//GEN-END:variables
}
