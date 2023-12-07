package komponen;

import koneksiDanJavaClass.DatabaseConnector;
import HalamanUtama.konfirmasi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class SemuaAksesoris extends javax.swing.JPanel {

    int total_harga = 0;
    int banyakBarang = 0;
    private JButton pesan;
    private HashMap<String, Integer> jumlahBarangMap = new HashMap<>();
    private JLabel totalLabel;
    private JPanel[] panels;
    private JButton perbaruiKeranjang = new JButton("Save Pilihan");
    private Timer searchTimer;

    public SemuaAksesoris() throws SQLDataException {
        initComponents();
        setOpaque(false);
        geser.setVerticalScrollBar(new JScrollBar());
        try {
            DatabaseConnector.getConnection(); // Try to establish the connection
            if (DatabaseConnector.connection == null) {
                // Handle connection failure
                throw new SQLException("Failed to establish a database connection.");
            }
            setOpaque(false);
            loadBarangWithSearch("");
        } catch (SQLException e) {
            // Handle the exception, log the error, or show a message to the user
            e.printStackTrace();
        }

        searchTimer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSearch();
            }
        });
        searchTimer.setRepeats(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        banyakBarangLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        searchField = new koneksiDanJavaClass.textSearch();
        jLabel2 = new javax.swing.JLabel();
        pesanPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        geser = new javax.swing.JScrollPane();
        buttonPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        banyakBarangLabel.setText("jLabel1");

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(searchField, java.awt.BorderLayout.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/loupe (1).png"))); // NOI18N
        jPanel1.add(jLabel2, java.awt.BorderLayout.WEST);

        add(jPanel1, java.awt.BorderLayout.NORTH);

        pesanPanel.setBackground(new java.awt.Color(153, 174, 224));
        pesanPanel.setPreferredSize(new java.awt.Dimension(100, 50));
        pesanPanel.setLayout(new java.awt.BorderLayout());
        add(pesanPanel, java.awt.BorderLayout.SOUTH);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        buttonPanel.setOpaque(false);

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        geser.setViewportView(buttonPanel);

        jPanel2.add(geser, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Semua Aksesoris");
        jLabel1.setPreferredSize(new java.awt.Dimension(152, 40));
        jPanel2.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void performSearch() {
        try {
            String searchTerm = searchField.getText().trim().toLowerCase();

            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    // Clear existing components
                    buttonPanel.removeAll();
                    buttonPanel.revalidate();
                    buttonPanel.repaint();

                    pesanPanel.removeAll();
                    pesanPanel.revalidate();
                    pesanPanel.repaint();

                    try {
                        loadBarangWithSearch(searchTerm);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void startSearchTimer() {
        if (!searchTimer.isRunning()) {
            searchTimer.start();
        } else {
            searchTimer.restart();
        }
    }

    private void loadBarangWithSearch(String searchTerm) throws SQLException {
        total_harga = 0;
        banyakBarang = 0;
        DatabaseConnector.getConnection();
        String query = "SELECT b.id_barang, b.nama_barang, b.harga_satuan, b.kategori, k.jumlah FROM Barang b\n"
                + "LEFT JOIN keranjang k\n"
                + "ON b.nama_barang = k.nama_barang";
        PreparedStatement preparedStatement;
        preparedStatement = DatabaseConnector.connection.prepareStatement(query,
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = preparedStatement.executeQuery();

        resultSet.last();
        int rowCount = resultSet.getRow();
        panels = new JPanel[rowCount];
        totalLabel = new JLabel();
        resultSet.beforeFirst();
        int index = 0;
        pesan = new JButton("Pesan");
        buttonPanel.setLayout(new GridLayout(0, 1));
        buttonPanel.setOpaque(false);
        panels = new JPanel[rowCount]; // Reset panels array

        while (resultSet.next()) {
            String namaBarang = resultSet.getString("nama_barang");
            String kt = resultSet.getString("kategori");
            int hargaSatuan = resultSet.getInt("harga_satuan");
            int jumlah = resultSet.getInt("jumlah");

            JPanel panel = new JPanel(new FlowLayout(FlowLayout.TRAILING));
            panel.setOpaque(false);
            // Menggunakan FlowLayout dengan pengaturan
            // RIGHT

            JLabel nameLabel = new JLabel(namaBarang);
            nameLabel.setForeground(Color.decode("#4f3637"));
            nameLabel.setFont(new java.awt.Font("Sitka Small", 1, 15));
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    panel.setOpaque(true);
                    panel.setBackground(Color.decode("#4f3637"));
                    nameLabel.setForeground(Color.WHITE);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    panel.setBackground(null);
                    panel.setOpaque(false);
                    nameLabel.setForeground(Color.decode("#4f3637"));
                }
            });

            banyakBarang = banyakBarang + jumlah;
            total_harga = total_harga + (jumlah * hargaSatuan);

            jumlahBarangMap.put(namaBarang, jumlahBarangMap.getOrDefault(namaBarang, jumlah));

            if (jumlah == 0) {
                nameLabel.setText(namaBarang);
            } else {
                nameLabel.setText(namaBarang + " (" + jumlahBarangMap.getOrDefault(namaBarang, jumlah) + ")");
            }

            panel.add(nameLabel, BorderLayout.WEST);

            JButton plusButton = new JButton("+");
            plusButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    total_harga += hargaSatuan;
                    totalLabel.setText((banyakBarang + 1) + " Item       " + total_harga);

                    banyakBarang++;
                    updateBanyakBarangLabel(banyakBarang);

                    // Menambah jumlah barang untuk nama barang tertentu
                    jumlahBarangMap.put(namaBarang, jumlahBarangMap.getOrDefault(namaBarang, jumlah) + 1);

                    nameLabel.setText(namaBarang + " (" + jumlahBarangMap.get(namaBarang) + ")");

                }
            });

            JButton minusButton = new JButton("-");
            minusButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (banyakBarang > 0 && jumlahBarangMap.get(namaBarang) > 0) {
                        total_harga -= hargaSatuan;
                        totalLabel.setText((banyakBarang - 1) + " Item       " + total_harga);

                        banyakBarang--;
                        updateBanyakBarangLabel(banyakBarang);

                        // Mengurangi jumlah barang untuk nama barang tertentu
                        int currentCount = jumlahBarangMap.get(namaBarang);
                        if (currentCount > 0) {
                            jumlahBarangMap.put(namaBarang, currentCount - 1);
                        }
                        if (jumlahBarangMap.get(namaBarang) == 0) {
                            nameLabel.setText(namaBarang);
                        } else {
                            nameLabel.setText(namaBarang + " (" + jumlahBarangMap.get(namaBarang) + ")");
                        }
                    }
                }
            });
            panel.add(nameLabel, BorderLayout.WEST);
            panel.add(minusButton);
            panel.add(plusButton);

            panels[index++] = panel;

            if (namaBarang.toLowerCase().contains(searchTerm)) {
                // Add components for the matching item
                buttonPanel.add(panel);
            }

        }

        totalLabel = new JLabel((banyakBarang) + " Item       " + total_harga);
        totalLabel.setFont(new Font("Sitka Small", 1, 15));
        totalLabel.setForeground(Color.WHITE);
        pesanPanel.setFont(new Font("Arial", 1, 17));
        pesan.setFont(new Font("Arial", 1, 18));
        pesanPanel.add(totalLabel, BorderLayout.WEST);
        pesanPanel.add(pesan, BorderLayout.CENTER);
        pesanPanel.add(perbaruiKeranjang, BorderLayout.EAST);
        pesanPanel.setBackground(Color.decode("#103783"));

        pesan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check if there are items in the order
                if (banyakBarang > 0) {
                    try {
                        // Save order details to a temporary file
                        saveOrderDetails();
                        konfirmasi t = new konfirmasi();
                        t.setVisible(true);
                        SwingUtilities.getWindowAncestor(SemuaAksesoris.this).dispose();
                        t.setLocationRelativeTo(null);
                        t.setDefaultCloseOperation(konfirmasi.EXIT_ON_CLOSE);
                    } catch (SQLException ex) {
                        Logger.getLogger(SemuaAksesoris.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    // If no items in the order, you might want to display a message
                    JOptionPane.showMessageDialog(SemuaAksesoris.this, "No items in the order.");
                }
            }
        });

        perbaruiKeranjang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    saveOrderDetails();
                    JOptionPane.showMessageDialog(SemuaAksesoris.this, "Pilihan Berhasil Disimpan");
                } catch (SQLException ex) {
                    Logger.getLogger(AksesorisHp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                startSearchTimer();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                startSearchTimer();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components don't fire these events
            }
        });

    }

    private void updateBanyakBarangLabel(int banyakBarang) {
        banyakBarangLabel.setText("(" + banyakBarang + ")");
    }

    private void saveOrderDetails() throws SQLException {

        for (String namaBarang : jumlahBarangMap.keySet()) {
            int jumlah = jumlahBarangMap.get(namaBarang);
//                int total = jumlahBarangMap.get(namaBarang);

            int hargaSatuan = getHargaSatuan(namaBarang); // Assuming you have a method to get harga_satuan
            int totalHarga = jumlah * hargaSatuan;
            insertTransaction(namaBarang, jumlah, hargaSatuan, totalHarga);

        }
    }

    private int getHargaSatuan(String namaBarang) {

        String query = "SELECT harga_satuan FROM Barang WHERE nama_barang = ?";

        try (PreparedStatement preparedStatement = DatabaseConnector.connection.prepareStatement(query)) {
            preparedStatement.setString(1, namaBarang);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt("harga_satuan");
                }
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(SemuaAksesoris.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    private void insertTransaction(String namaBarang, int jumlah, int hargaSatuan, int totalHarga) throws SQLException {
        String ker = "SELECT nama_barang FROM keranjang";
        Statement st = DatabaseConnector.connection.createStatement();
        ResultSet rs = st.executeQuery(ker);
        while (rs.next()) {
            if (namaBarang.equals(rs.getString("nama_barang"))) {
                String q = "UPDATE keranjang SET jumlah = ?, sub_total = ? WHERE nama_barang = ?";
                try (PreparedStatement preparedStatement = DatabaseConnector.connection.prepareStatement(q)) {
                    preparedStatement.setInt(1, jumlah);
                    preparedStatement.setInt(2, totalHarga);
                    preparedStatement.setString(3, namaBarang);
                    preparedStatement.executeUpdate();
                }
                return;
            }
        }
        String query = "INSERT INTO keranjang (nama_barang, jumlah, harga_satuan, sub_total) VALUES (?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = DatabaseConnector.connection.prepareStatement(query)) {
            preparedStatement.setString(1, namaBarang);
            preparedStatement.setInt(2, jumlah);
            preparedStatement.setInt(3, hargaSatuan);
            preparedStatement.setInt(4, totalHarga);

            // Execute the insert statement
            preparedStatement.executeUpdate();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banyakBarangLabel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JScrollPane geser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pesanPanel;
    private koneksiDanJavaClass.textSearch searchField;
    // End of variables declaration//GEN-END:variables
}
