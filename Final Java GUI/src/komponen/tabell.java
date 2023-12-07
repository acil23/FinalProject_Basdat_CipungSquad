package komponen;

import HalamanUtama.dialogUpdate;
import HalamanUtama.dialogTambahBarang;
import koneksiDanJavaClass.DatabaseConnector;
import HalamanUtama.tabelBarang;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import tombolDanBackground.Border2;

public class tabell extends javax.swing.JPanel {

    private JTable table;
    Border2 border = new Border2();
    masukkanBarang msk = new masukkanBarang();
    DefaultTableModel model;

    public tabell() throws SQLDataException {
        initComponents();
        setOpaque(false);
        geser.setVerticalScrollBar(new JScrollBar());
        tombolHapus.setVisible(false);
        tombolUpdate.setVisible(false);
        tombolCancel.setVisible(false);
        try {
            DatabaseConnector.getConnection(); // Try to establish the connection
            if (DatabaseConnector.connection == null) {
                // Handle connection failure
                throw new SQLException("Failed to establish a database connection.");
            }
            setOpaque(false);
            isiTabel();

        } catch (SQLException e) {
            // Handle the exception, log the error, or show a message to the user
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        banyakBarangLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tombolHapus = new javax.swing.JButton();
        tombolUpdate = new javax.swing.JButton();
        tombolCancel = new javax.swing.JButton();
        tombolTambah = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchTextField = new koneksiDanJavaClass.textSearch();
        geser = new javax.swing.JScrollPane();

        banyakBarangLabel.setText("jLabel1");

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Daftar Barang");
        jPanel3.add(jLabel1);

        jPanel1.add(jPanel3, java.awt.BorderLayout.WEST);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel2.setLayout(new java.awt.GridLayout(1, 4));

        tombolHapus.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        tombolHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tombolHapus.png"))); // NOI18N
        tombolHapus.setBorderPainted(false);
        tombolHapus.setContentAreaFilled(false);
        tombolHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolHapusActionPerformed(evt);
            }
        });
        jPanel2.add(tombolHapus);

        tombolUpdate.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        tombolUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tombolUpdate.png"))); // NOI18N
        tombolUpdate.setBorderPainted(false);
        tombolUpdate.setContentAreaFilled(false);
        tombolUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolUpdate.setPreferredSize(new java.awt.Dimension(100, 47));
        tombolUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(tombolUpdate);

        tombolCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tombolCancel.png"))); // NOI18N
        tombolCancel.setContentAreaFilled(false);
        tombolCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolCancelActionPerformed(evt);
            }
        });
        jPanel2.add(tombolCancel);

        tombolTambah.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        tombolTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tombolTambah.png"))); // NOI18N
        tombolTambah.setBorderPainted(false);
        tombolTambah.setContentAreaFilled(false);
        tombolTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolTambah.setPreferredSize(new java.awt.Dimension(100, 47));
        tombolTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTambahActionPerformed(evt);
            }
        });
        jPanel2.add(tombolTambah);

        jPanel1.add(jPanel2, java.awt.BorderLayout.EAST);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(110, 35));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/loupe (1).png"))); // NOI18N
        jPanel5.add(jLabel2, java.awt.BorderLayout.WEST);

        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });
        jPanel5.add(searchTextField, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);
        jPanel4.add(geser, java.awt.BorderLayout.CENTER);

        add(jPanel4, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void isiTabel() {
        try {

            DatabaseConnector.getConnection();

            String query = "SELECT * FROM Barang";
            Statement statement = DatabaseConnector.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery(query);

            // Mengambil metadata untuk menentukan jumlah kolom
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            int baris = 0;

            while (resultSet.next()) {
                baris++;
            }

            resultSet.beforeFirst();

            // Menyiapkan data untuk tabel
            Object[][] data = new Object[baris][columnCount + 1];

            // Fill the data array with the query results and add numbers to the first column
            int row = 0;
            while (resultSet.next()) {
                // Add the row number as the first column
                data[row][0] = row + 1;

                // Add the remaining columns from the query results
                for (int i = 1; i <= columnCount; i++) {
                    data[row][i] = resultSet.getObject(i);
                }

                row++;
            }

            // Column names, including the additional "No" column
            String[] columnNames = new String[columnCount + 1];
            columnNames[0] = "No"; // Name for the additional column
            for (int i = 1; i <= columnCount; i++) {
                columnNames[i] = metaData.getColumnName(i);
            }

            model = new DefaultTableModel(data, columnNames);

            // Membuat tabel dengan menggunakan model
            table = new JTable(model);
            geser.setViewportView(table);

            table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    // Mengatur visibilitas tombol "Tambah" berdasarkan apakah baris telah dipilih
                    tombolHapus.setVisible(table.getSelectedRow() != -1);
                    tombolUpdate.setVisible(table.getSelectedRow() != -1);
                    tombolCancel.setVisible(table.getSelectedRow() != -1);
                }
            });

            tombolUpdate.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Mendapatkan nilai dari setiap kolom pada baris yang dipilih
                    int selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) {
                        ArrayList<String> listPilihan = new ArrayList<>();
                        for (int i = 0; i < model.getColumnCount(); i++) {
                            String nilaiKolom = model.getValueAt(selectedRow, i).toString();
                            listPilihan.add(nilaiKolom);
                        }
                        String queryHapus = "DELETE FROM barangPilih";
                        try (PreparedStatement p = DatabaseConnector.connection.prepareStatement(queryHapus)) {
                            p.executeUpdate();
                        } catch (SQLException ex) {
                            Logger.getLogger(tabell.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        String query = "INSERT INTO barangPilih (id_barang, nama_barang, harga_satuan, kategori) VALUES (?, ?, ?, ?)";

                        try (PreparedStatement preparedStatement = DatabaseConnector.connection.prepareStatement(query)) {
                            preparedStatement.setString(1, listPilihan.get(1));
                            preparedStatement.setString(2, listPilihan.get(2));
                            preparedStatement.setInt(3, Integer.parseInt(listPilihan.get(3)));
                            preparedStatement.setString(4, listPilihan.get(4));

                            // Execute the insert statement
                            preparedStatement.executeUpdate();
                        } catch (SQLException ex) {
                            Logger.getLogger(tabell.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    try {
                        tampilkanDialogUpdate();
                    } catch (SQLException et) {

                    }
                }
            }
            );

            tombolHapus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Mendapatkan nilai dari setiap kolom pada baris yang dipilih
                    int selectedRow = table.getSelectedRow();
                    String idBrg = "";
                    if (selectedRow != -1) {
                        idBrg = model.getValueAt(selectedRow, 1).toString();
                    }

                    int option = JOptionPane.showConfirmDialog(null,
                            "Apakah Anda yakin ingin menghapus barang ini ?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);

                    if (option == JOptionPane.YES_OPTION) {
                        if (!idBrg.equals("")) {
                            String query = "DELETE FROM Barang\n"
                                    + "WHERE id_barang = ?";

                            try (PreparedStatement preparedStatement = DatabaseConnector.connection.prepareStatement(query)) {
                                preparedStatement.setString(1, idBrg);
                                preparedStatement.executeUpdate();
                                JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(tabell.this),
                                        "Barang berhasil dihapus",
                                        "Sukses",
                                        JOptionPane.INFORMATION_MESSAGE);
                                SwingUtilities.getWindowAncestor(tabell.this).dispose();
                                tabelBarang tb = new tabelBarang();
                                tb.setVisible(true);
                                tb.setLocationRelativeTo(null);
                                tb.setDefaultCloseOperation(tabelBarang.EXIT_ON_CLOSE);

                            } catch (SQLException ex) {
                                Logger.getLogger(tabell.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            repaint();
                            revalidate();
                        }
                    }

                }
            }
            );

            tombolCancel.addActionListener(
                    new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e
                ) {
                    // Menghilangkan pemilihan dan menyembunyikan tombol "Tambah"
                    table.clearSelection();
                    tombolHapus.setVisible(false);
                    tombolUpdate.setVisible(false);
                    tombolCancel.setVisible(false);
                }
            }
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void tampilkanDialog() {
        // Membuat instance dari kelas JDialog
        dialogTambahBarang d = new dialogTambahBarang((Frame) SwingUtilities.getWindowAncestor(tabell.this), true);
        d.setVisible(true);
    }

    private void tampilkanDialogUpdate() throws SQLException {
        dialogUpdate du = new dialogUpdate((Frame) SwingUtilities.getWindowAncestor(tabell.this), true);
        du.setVisible(true);
    }
    
    public void search(String src){
        model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(src));
    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void tombolTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTambahActionPerformed
        tampilkanDialog();
    }//GEN-LAST:event_tombolTambahActionPerformed

    private void tombolHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombolHapusActionPerformed

    private void tombolUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombolUpdateActionPerformed

    private void tombolCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombolCancelActionPerformed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        String searchApa = searchTextField.getText();
        search(searchApa);
    }//GEN-LAST:event_searchTextFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banyakBarangLabel;
    private javax.swing.JScrollPane geser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private koneksiDanJavaClass.textSearch searchTextField;
    private javax.swing.JButton tombolCancel;
    private javax.swing.JButton tombolHapus;
    private javax.swing.JButton tombolTambah;
    private javax.swing.JButton tombolUpdate;
    // End of variables declaration//GEN-END:variables
}
