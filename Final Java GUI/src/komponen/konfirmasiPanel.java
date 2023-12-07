package komponen;

import koneksiDanJavaClass.DatabaseConnector;
import HalamanUtama.pageSemuaAksesoris;
import HalamanUtama.nota;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class konfirmasiPanel extends javax.swing.JPanel {

    private JPanel[] panels;
    private int totalBayar = 0;
    private static Set<String> generatedCodes = new HashSet<>();
    private static Set<String> existingDatabaseKeys = new HashSet<>();
    private String invoice;
    String bayar;
    int jumlahItem;
    String tanggal;
    private JPanel daftarBrg = new JPanel();
    int diskon = 0;
    
    public konfirmasiPanel() {
        initComponents();
        invoice = generateUniqueRandomCode();

        try {
            DatabaseConnector.getConnection(); // Try to establish the connection
            if (DatabaseConnector.connection == null) {
                // Handle connection failure
                throw new SQLException("Failed to establish a database connection.");
            }
            setOpaque(false);
            loadbarang();
        } catch (SQLException e) {
            // Handle the exception, log the error, or show a message to the user
            e.printStackTrace();
        }
    }

    public String getInvoice() {
        return invoice;
    }

    public String getBayar() {
        return bayar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        panelBayar = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        fieldBayar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        fieldDiskon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tambahDiskonButton = new javax.swing.JButton();
        totalPesan = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        konfirmTombol = new javax.swing.JButton();
        daftarBarangnya = new javax.swing.JScrollPane();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(643, 100));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Slip Konfirmasi");
        jLabel1.setPreferredSize(new java.awt.Dimension(159, 52));
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Daftar Pesanan");
        jLabel3.setPreferredSize(new java.awt.Dimension(84, 36));
        jPanel1.add(jLabel3, java.awt.BorderLayout.PAGE_END);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(643, 120));
        jPanel4.setLayout(new java.awt.BorderLayout());

        panelBayar.setBackground(new java.awt.Color(153, 0, 153));
        panelBayar.setPreferredSize(new java.awt.Dimension(643, 60));
        panelBayar.setLayout(new java.awt.BorderLayout());

        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(360, 54));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel2.setLayout(new java.awt.BorderLayout());

        fieldBayar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(fieldBayar, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bayar Rp.      ");
        jPanel2.add(jLabel2, java.awt.BorderLayout.WEST);

        jPanel9.add(jPanel2, java.awt.BorderLayout.SOUTH);

        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel5.setLayout(new java.awt.BorderLayout());

        fieldDiskon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(fieldDiskon, java.awt.BorderLayout.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Diskon Rp.   ");
        jPanel5.add(jLabel4, java.awt.BorderLayout.WEST);

        tambahDiskonButton.setText("Tambah Diskon");
        tambahDiskonButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tambahDiskonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahDiskonButtonActionPerformed(evt);
            }
        });
        jPanel5.add(tambahDiskonButton, java.awt.BorderLayout.LINE_END);

        jPanel9.add(jPanel5, java.awt.BorderLayout.NORTH);

        panelBayar.add(jPanel9, java.awt.BorderLayout.EAST);

        totalPesan.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        totalPesan.setForeground(new java.awt.Color(255, 255, 255));
        totalPesan.setText("total");
        totalPesan.setPreferredSize(new java.awt.Dimension(224, 16));
        panelBayar.add(totalPesan, java.awt.BorderLayout.WEST);

        jPanel4.add(panelBayar, java.awt.BorderLayout.NORTH);

        jPanel8.setBackground(new java.awt.Color(153, 0, 153));

        konfirmTombol.setBackground(new java.awt.Color(255, 255, 204));
        konfirmTombol.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        konfirmTombol.setForeground(new java.awt.Color(0, 153, 0));
        konfirmTombol.setText("Konfirmasi Pesanan");
        konfirmTombol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        konfirmTombol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konfirmTombolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(konfirmTombol)
                .addGap(254, 254, 254))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(konfirmTombol)
                .addGap(17, 17, 17))
        );

        jPanel4.add(jPanel8, java.awt.BorderLayout.SOUTH);

        add(jPanel4, java.awt.BorderLayout.PAGE_END);
        add(daftarBarangnya, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void konfirmTombolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konfirmTombolActionPerformed

        String queryHapus = "DELETE FROM nota";
        try (PreparedStatement preparedStatement = DatabaseConnector.connection.prepareStatement(queryHapus)) {
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(login1.class.getName()).log(Level.SEVERE, null, ex);
        }
        String kasir = null;
        String queryKasir = "SELECT * FROM kasirSkrg";

        try (PreparedStatement preparedStatement = DatabaseConnector.connection.prepareStatement(queryKasir); ResultSet resultSet = preparedStatement.executeQuery()) {

            if (resultSet.next()) {
                kasir = resultSet.getString("nick_name");
            }

        } catch (SQLException ex) {
            Logger.getLogger(login1.class.getName()).log(Level.SEVERE, null, ex);
        }

        String query2 = "INSERT INTO nota (invoice, tanggal, kasir, pelanggan, item, total_transaksi, dibayar, kembalian, disc) VALUES (?, ?, ?, ?, ?, ?, ?,?,?)";

        try (PreparedStatement ps = DatabaseConnector.connection.prepareStatement(query2)) {
            int dibayar = Integer.parseInt(fieldBayar.getText());
            int disc = 0;
            if (!fieldDiskon.getText().equals("")) {
                disc = Integer.parseInt(fieldDiskon.getText());
            }
            int kembalian = dibayar - totalBayar + disc;
            ps.setString(1, invoice);
            ps.setString(2, tanggal);
            ps.setString(3, kasir);
            ps.setString(4, "Pelanggan");
            ps.setInt(5, jumlahItem);
            ps.setInt(6, (totalBayar-disc));
            ps.setInt(7, dibayar);
            ps.setInt(8, kembalian);
            ps.setInt(9, disc);

            // Execute the insert statement
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(konfirmasiPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            nota t = new nota();
            t.setVisible(true);
            SwingUtilities.getWindowAncestor(konfirmasiPanel.this).dispose();
            t.setLocationRelativeTo(null);
            t.setDefaultCloseOperation(nota.EXIT_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(SemuaAksesoris.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_konfirmTombolActionPerformed

    private void tambahDiskonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahDiskonButtonActionPerformed
        if (!fieldDiskon.getText().equals("")) {
            diskon = Integer.parseInt(fieldDiskon.getText());
        }
        totalPesan.setText("Total Pesanan = Rp. " + (totalBayar-diskon));
    }//GEN-LAST:event_tambahDiskonButtonActionPerformed

    public void loadbarang() throws SQLException {
        DatabaseConnector.getConnection();
        String query = "SELECT * FROM keranjang";
        PreparedStatement preparedStatement;
        preparedStatement = DatabaseConnector.connection.prepareStatement(query,
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = preparedStatement.executeQuery();

        int rowCount = 0;
        while (rs.next()) {
            if (rs.getInt("jumlah") > 0) {
                rowCount++;
            }
        }

        panels = new JPanel[rowCount];
        rs.beforeFirst();
        int index = 0;
        daftarBrg.setLayout(new GridLayout(0, 1));
        daftarBrg.setOpaque(false);
        panels = new JPanel[rowCount]; // Reset panels array

        while (rs.next()) {
            if (rs.getInt("jumlah") > 0) {
                String nama_barang = rs.getString("nama_barang");
                int jumlah = rs.getInt("jumlah");
                int harga_satuan = rs.getInt("harga_satuan");
                int sub_total = rs.getInt("sub_total");

                jumlahItem += jumlah;
                totalBayar += sub_total;

                JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
                panel.setOpaque(false);
                JLabel nameLabel = new JLabel(nama_barang + " (" + jumlah + ") " + " x " + harga_satuan + " --->> " + sub_total);
                nameLabel.setForeground(Color.BLACK);
                nameLabel.setFont(new java.awt.Font("Sitka Small", 1, 15));

                panel.add(nameLabel, BorderLayout.EAST);
                panel.setOpaque(false);

                panels[index++] = panel;
            }
        }

        java.util.Date tglWkt = new java.util.Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", new Locale("id"));
        String hasilFormat = format.format(tglWkt);

        tanggal = hasilFormat;

        for (JPanel panel : panels) {
            daftarBrg.add(panel);
        }
        
        daftarBarangnya.setViewportView(daftarBrg);
        totalPesan.setText("Total Pesanan = Rp. " + totalBayar);
        
        

    }

    public static void loadExistingKeysFromDatabase() {
        String sql = "SELECT invoice FROM Transaksi";
        try (PreparedStatement statement = DatabaseConnector.connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                existingDatabaseKeys.add(resultSet.getString("invoice"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String generateUniqueRandomCode() {
        // Format tanggal yang diinginkan dalam awalan kode
        String dateFormat = "yyMMdd";

        // Mendapatkan tanggal hari ini menggunakan kelas LocalDate
        LocalDate today = LocalDate.now();

        // Menggunakan DateTimeFormatter untuk memformat tanggal ke dalam string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        String todayDate = today.format(formatter);

        // Awalan kode dengan tanggal hari ini
        String prefix = "TRX#" + todayDate;

        // Panjang karakter yang diinginkan setelah awalan
        int length1 = 3;
        int length2 = 3;

        // Karakter yang diizinkan dalam kode
        String allowedHuruf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String allowedAngkaa = "0123456789";

        // Membuat objek Random
        Random random = new Random();

        // Membuat StringBuilder untuk menyimpan kode
        StringBuilder codeBuilder = new StringBuilder(prefix);

        // Menghasilkan karakter acak dan menambahkannya ke StringBuilder
        for (int i = 0; i < length1; i++) {
            int randomIndex = random.nextInt(allowedHuruf.length());
            char randomChar = allowedHuruf.charAt(randomIndex);
            codeBuilder.append(randomChar);
        }

        for (int i = 0; i < length2; i++) {
            int randomIndex = random.nextInt(allowedAngkaa.length());
            char randomChar = allowedAngkaa.charAt(randomIndex);
            codeBuilder.append(randomChar);
        }

        // Mendapatkan kode akhir
        String generatedCode = codeBuilder.toString();

        // Memeriksa apakah kode sudah ada dalam generatedCodes atau existingDatabaseKeys
        while (generatedCodes.contains(generatedCode) || existingDatabaseKeys.contains(generatedCode)) {
            // Jika sudah ada, menghasilkan kode baru
            generatedCode = generateUniqueRandomCode();
        }

        // Menambahkan kode ke set generatedCodes
        generatedCodes.add(generatedCode);

        // Mengembalikan hasil akhir
        return generatedCode;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane daftarBarangnya;
    private javax.swing.JTextField fieldBayar;
    private javax.swing.JTextField fieldDiskon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton konfirmTombol;
    private javax.swing.JPanel panelBayar;
    private javax.swing.JButton tambahDiskonButton;
    private javax.swing.JLabel totalPesan;
    // End of variables declaration//GEN-END:variables
}
