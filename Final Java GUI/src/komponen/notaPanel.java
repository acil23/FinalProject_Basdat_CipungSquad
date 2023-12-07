package komponen;

import koneksiDanJavaClass.DatabaseConnector;
import HalamanUtama.dashboard;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

public class notaPanel extends javax.swing.JPanel {

    public notaPanel() throws SQLException {
        initComponents();
        DatabaseConnector.getConnection();
        String query = "SELECT * FROM nota";
        Statement st = DatabaseConnector.connection.createStatement();
        ResultSet rs = st.executeQuery(query);

        if (rs.next()) {
            invoiceLabel.setText(rs.getString("invoice"));
            namakasir.setText(rs.getString("kasir"));
            totalItem.setText(rs.getInt("item") + " item");
            totalTransaksi.setText("Rp. " + (rs.getInt("total_transaksi") + rs.getInt("disc")));
            jumlahDibayar.setText("Rp. " + rs.getInt("dibayar"));
            kembalian.setText("Rp. " + rs.getInt("kembalian"));
            diskon.setText("Rp. " + rs.getInt("disc"));
            totalAkhir.setText("Rp. " + rs.getInt("total_transaksi"));
        }
        Date tglWkt = new Date();
        SimpleDateFormat format = new SimpleDateFormat("EEEE, d MMMM yyyy -- HH.mm.ss.SS", new Locale("id"));
        String hasilFormat = format.format(tglWkt);

        tanggalWaktu.setText(hasilFormat);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        panelKet = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tanggalWaktu = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        bulat21 = new tombolDanBackground.tombolBulat2();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        invoiceLabel = new javax.swing.JLabel();
        namakasir = new javax.swing.JLabel();
        namaPelanggan = new javax.swing.JLabel();
        totalItem = new javax.swing.JLabel();
        totalTransaksi = new javax.swing.JLabel();
        diskon = new javax.swing.JLabel();
        totalAkhir = new javax.swing.JLabel();
        jumlahDibayar = new javax.swing.JLabel();
        kembalian = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelKet.setOpaque(false);
        panelKet.setLayout(new java.awt.GridLayout(9, 1));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        panelKet.add(jPanel11);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Invoice");
        panelKet.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Kasir");
        panelKet.add(jLabel11);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Pelanggan");
        panelKet.add(jLabel12);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Total Item");
        panelKet.add(jLabel13);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Total Transaksi");
        panelKet.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Dibayar");
        panelKet.add(jLabel15);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Kembalian");
        panelKet.add(jLabel16);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        panelKet.add(jPanel14);

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 100));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo-40.png"))); // NOI18N
        jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CJN App");
        jPanel1.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("\"Aksesoris Trendi untuk Hidup yang Berwarna\"");
        jPanel1.add(jLabel4, java.awt.BorderLayout.SOUTH);

        jPanel2.add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(5, 1));

        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jawa Timur, Jalan Bendungan Sigura-gura No. 1");
        jPanel3.add(jLabel1);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Malang");
        jPanel3.add(jLabel5);

        tanggalWaktu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanggalWaktu.setText("Sabtu, 2 Desember 2023 -- 13.30.34.56");
        jPanel3.add(tanggalWaktu);

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("----------------------------------------------------------------------------------------------------");
        jPanel6.add(jLabel7, java.awt.BorderLayout.NORTH);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Slip Pembayaran");
        jPanel7.add(jLabel8, java.awt.BorderLayout.NORTH);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(517, 200));
        jPanel9.setLayout(new java.awt.GridLayout(2, 1));

        bulat21.setBackground(new java.awt.Color(102, 255, 102));
        bulat21.setText("SELESAI !");
        bulat21.setContentAreaFilled(false);
        bulat21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulat21ActionPerformed(evt);
            }
        });
        jPanel9.add(bulat21);

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Transaksi Berhasil !");
        jPanel10.add(jLabel9, java.awt.BorderLayout.CENTER);

        jPanel12.setOpaque(false);
        jPanel12.setPreferredSize(new java.awt.Dimension(517, 50));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel12, java.awt.BorderLayout.SOUTH);

        jPanel9.add(jPanel10);

        jPanel8.add(jPanel9, java.awt.BorderLayout.SOUTH);

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel16.setBackground(new java.awt.Color(255, 204, 204));
        jPanel16.setOpaque(false);
        jPanel16.setPreferredSize(new java.awt.Dimension(250, 292));
        jPanel16.setLayout(new java.awt.GridLayout(11, 1));

        jPanel19.setOpaque(false);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel19);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Invoice");
        jPanel16.add(jLabel17);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Kasir");
        jPanel16.add(jLabel18);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Pelanggan");
        jPanel16.add(jLabel19);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Total Item");
        jPanel16.add(jLabel20);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Total Transaksi");
        jPanel16.add(jLabel21);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Anda Hemat");
        jPanel16.add(jLabel6);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Total");
        jPanel16.add(jLabel24);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Dibayar");
        jPanel16.add(jLabel22);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Kembalian");
        jPanel16.add(jLabel23);

        jPanel15.add(jPanel16, java.awt.BorderLayout.WEST);

        jPanel17.setBackground(new java.awt.Color(204, 204, 255));
        jPanel17.setOpaque(false);
        jPanel17.setPreferredSize(new java.awt.Dimension(250, 292));
        jPanel17.setLayout(new java.awt.GridLayout(11, 1));

        jPanel21.setOpaque(false);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel21);

        invoiceLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        invoiceLabel.setText("Invoice");
        jPanel17.add(invoiceLabel);

        namakasir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namakasir.setText("Kasir");
        jPanel17.add(namakasir);

        namaPelanggan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namaPelanggan.setText("Pelanggan");
        jPanel17.add(namaPelanggan);

        totalItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalItem.setText("Total Item");
        jPanel17.add(totalItem);

        totalTransaksi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalTransaksi.setText("Total Transaksi");
        jPanel17.add(totalTransaksi);

        diskon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        diskon.setText("Diskon");
        jPanel17.add(diskon);

        totalAkhir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalAkhir.setText("Total Akhir");
        jPanel17.add(totalAkhir);

        jumlahDibayar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jumlahDibayar.setText("Dibayar");
        jPanel17.add(jumlahDibayar);

        kembalian.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kembalian.setText("Kembalian");
        jPanel17.add(kembalian);

        jPanel15.add(jPanel17, java.awt.BorderLayout.EAST);

        jPanel18.setOpaque(false);
        jPanel18.setLayout(new java.awt.GridLayout(11, 1));

        jPanel23.setOpaque(false);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel18.add(jPanel23);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText(":");
        jPanel18.add(jLabel31);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText(":");
        jPanel18.add(jLabel32);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText(":");
        jPanel18.add(jLabel33);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText(":");
        jPanel18.add(jLabel34);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText(":");
        jPanel18.add(jLabel35);

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText(":");
        jPanel18.add(jLabel36);

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText(":");
        jPanel18.add(jLabel37);

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText(":");
        jPanel18.add(jLabel38);

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText(":");
        jPanel18.add(jLabel39);

        jPanel15.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7, java.awt.BorderLayout.CENTER);

        add(jPanel6, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void bulat21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulat21ActionPerformed
        try {

            String query = "SELECT * FROM nota";
            Statement st = DatabaseConnector.connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                String query2 = "INSERT INTO Transaksi (invoice, tanggal, kasir, pelanggan, item, total_transaksi, dibayar, kembalian, disc) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

                try (PreparedStatement preparedStatement = DatabaseConnector.connection.prepareStatement(query2)) {
                    preparedStatement.setString(1, rs.getString("invoice"));
                    preparedStatement.setString(2, rs.getString("tanggal"));
                    preparedStatement.setString(3, rs.getString("kasir"));
                    preparedStatement.setString(4, rs.getString("pelanggan"));
                    preparedStatement.setInt(5, rs.getInt("item"));
                    preparedStatement.setInt(6, rs.getInt("total_transaksi"));
                    preparedStatement.setInt(7, rs.getInt("dibayar"));
                    preparedStatement.setInt(8, rs.getInt("kembalian"));
                    preparedStatement.setInt(9, rs.getInt("disc"));

                    // Execute the insert statement
                    preparedStatement.executeUpdate();
                }
            }

            String queryK = "SELECT b.id_barang, b.nama_barang,k.jumlah, k.sub_total  FROM Barang b\n"
                    + "INNER JOIN keranjang k\n"
                    + "ON b.nama_barang = k.nama_barang";
            Statement st2 = DatabaseConnector.connection.createStatement();
            ResultSet rs2 = st2.executeQuery(queryK);

            while (rs2.next()) {
                if (rs2.getInt("jumlah") > 0) {
                    String query2 = "INSERT INTO Transaksi_Barang (invoice, id_barang, nama_barang, jumlah, sub_total) VALUES (?, ?, ?, ?, ?)";

                    try (PreparedStatement preparedStatement = DatabaseConnector.connection.prepareStatement(query2)) {
                        preparedStatement.setString(1, rs.getString("invoice"));
                        preparedStatement.setString(2, rs2.getString("id_barang"));
                        preparedStatement.setString(3, rs2.getString("nama_barang"));
                        preparedStatement.setInt(4, rs2.getInt("jumlah"));
                        preparedStatement.setInt(5, rs2.getInt("sub_total"));

                        // Execute the insert statement
                        preparedStatement.executeUpdate();
                    }
                }
            }

            String query3 = "DELETE FROM nota\n"
                    + "DELETE FROM keranjang";
            st.executeQuery(query3);
        } catch (SQLException ex) {
            Logger.getLogger(SemuaAksesoris.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bulat21ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tombolDanBackground.tombolBulat2 bulat21;
    private javax.swing.JLabel diskon;
    private javax.swing.JLabel invoiceLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jumlahDibayar;
    private javax.swing.JLabel kembalian;
    private javax.swing.JLabel namaPelanggan;
    private javax.swing.JLabel namakasir;
    private javax.swing.JPanel panelKet;
    private javax.swing.JLabel tanggalWaktu;
    private javax.swing.JLabel totalAkhir;
    private javax.swing.JLabel totalItem;
    private javax.swing.JLabel totalTransaksi;
    // End of variables declaration//GEN-END:variables

}
