/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package komponen;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksiDanJavaClass.DatabaseConnector;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author LENOVO T460S
 */
public class laporan extends javax.swing.JPanel {

    /**
     * Creates new form laporan
     */
    public laporan() {
        initComponents();

        panelTanggal.setVisible(false);
        invoiceComboBox.setVisible(false);

        laporanJenis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mendapatkan item yang dipilih
                String selectedItem = (String) laporanJenis.getSelectedItem();

                if ("Transaksi".equals(selectedItem)) {
                    panelTanggal.setVisible(true);
                    invoiceComboBox.setVisible(false);
                } else if ("Transaksi Barang".equals(selectedItem)) {
                    Connection connection = DatabaseConnector.getConnection();
                    Statement st;
                    try {
                        st = connection.createStatement();
                        ResultSet rs = st.executeQuery("SELECT DISTINCT invoice FROM Transaksi_Barang");
                        invoiceComboBox.removeAllItems();
                        invoiceComboBox.addItem("invoice");
                        while (rs.next()) {
                            invoiceComboBox.addItem(rs.getString("invoice"));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(laporan.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    panelTanggal.setVisible(false);
                    invoiceComboBox.setVisible(true);
                }
            }
        });

        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    generateAndDisplayReport();
                } catch (SQLException ex) {
                    Logger.getLogger(laporan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel15 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        laporanJenis = new javax.swing.JComboBox<>();
        printButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        invoiceComboBox = new javax.swing.JComboBox<>();
        panelTanggal = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tglAwal = new javax.swing.JComboBox<>();
        thnAwal = new javax.swing.JComboBox<>();
        blnAwal = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        tglAkhir = new javax.swing.JComboBox<>();
        thnAkhir = new javax.swing.JComboBox<>();
        blnAkhir = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tampilReport = new javax.swing.JPanel();

        jPanel15.setLayout(new java.awt.BorderLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sampai");
        jLabel8.setOpaque(true);

        jPanel17.setLayout(new java.awt.BorderLayout());

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(925, 50));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Laporan Transaksi");
        jPanel2.add(jLabel2, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(925, 50));
        jPanel5.setLayout(new java.awt.BorderLayout());

        laporanJenis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        laporanJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Jenis Laporan]", "Transaksi", "Transaksi Barang" }));
        laporanJenis.setPreferredSize(new java.awt.Dimension(140, 26));
        jPanel5.add(laporanJenis, java.awt.BorderLayout.WEST);

        printButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        printButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/printButton.png"))); // NOI18N
        printButton.setContentAreaFilled(false);
        printButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(printButton, java.awt.BorderLayout.EAST);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        invoiceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Invoice" }));
        jPanel1.add(invoiceComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        panelTanggal.setOpaque(false);
        panelTanggal.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel3.setLayout(new java.awt.BorderLayout());

        tglAwal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tanggal", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        tglAwal.setPreferredSize(new java.awt.Dimension(80, 22));
        jPanel3.add(tglAwal, java.awt.BorderLayout.LINE_START);

        thnAwal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tahun", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));
        thnAwal.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanel3.add(thnAwal, java.awt.BorderLayout.LINE_END);

        blnAwal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulan", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel3.add(blnAwal, java.awt.BorderLayout.CENTER);

        panelTanggal.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel7.setLayout(new java.awt.BorderLayout());

        tglAkhir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tanggal", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel7.add(tglAkhir, java.awt.BorderLayout.LINE_START);

        thnAkhir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tahun", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));
        thnAkhir.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanel7.add(thnAkhir, java.awt.BorderLayout.LINE_END);

        blnAkhir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulan", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel7.add(blnAkhir, java.awt.BorderLayout.CENTER);

        panelTanggal.add(jPanel7, java.awt.BorderLayout.LINE_END);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sampai");
        panelTanggal.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        jPanel5.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        tampilReport.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout tampilReportLayout = new javax.swing.GroupLayout(tampilReport);
        tampilReport.setLayout(tampilReportLayout);
        tampilReportLayout.setHorizontalGroup(
            tampilReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
        );
        tampilReportLayout.setVerticalGroup(
            tampilReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        jPanel4.add(tampilReport, java.awt.BorderLayout.CENTER);

        add(jPanel4, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void generateAndDisplayReport() throws SQLException {
        // Get the selected report type from the combo box
        String selectedReportType = (String) laporanJenis.getSelectedItem();

        // Check if a report type is selected
        if ("Transaksi".equals(selectedReportType)) {
            displayTransaksiReport();
        } else if ("Transaksi Barang".equals(selectedReportType)) {
            displayTransaksiBarangReport();
        }
    }

    private void displayTransaksiReport() {
        try {

            // Establish a database connection (replace with your database details)
            Connection connection = DatabaseConnector.getConnection();

           String reportPath = "src/Report/Transaksi.jasper";

            JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(reportPath);

            String tanggalAwal = (String) thnAwal.getSelectedItem() + "-" + blnAwal.getSelectedItem() + "-" + tglAwal.getSelectedItem();
            String tanggalAkhir = (String) thnAkhir.getSelectedItem() + "-" + blnAkhir.getSelectedItem() + "-" + tglAkhir.getSelectedItem();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date yourStartDate = new Date(2000 - 1900, 8, 23);
            Date yourEndDate = new Date(2023 - 1900, 12, 31);
            
            try {
                yourStartDate = dateFormat.parse(tanggalAwal);
                yourEndDate = dateFormat.parse(tanggalAkhir);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            // Set parameters if needed
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("tanggalAwal", yourStartDate);
            parameters.put("tanggalAkhir", yourEndDate);
            // Fill the report with data from the database
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);

            // Display the JasperViewer in the tampilReport panel
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setZoomRatio((float) 0.5);
            tampilReport.removeAll();
            tampilReport.setLayout(new BorderLayout());
            tampilReport.add(jasperViewer.getContentPane(), BorderLayout.CENTER);
            tampilReport.revalidate();
        } catch (JRException e) {
            e.printStackTrace();
        }
    }

    private void displayTransaksiBarangReport() throws SQLException {
        try {

            // Establish a database connection (replace with your database details)
            Connection connection = DatabaseConnector.getConnection();

            // Load the compiled JasperReport file
            String reportPath = "src/Report/transaksiBarang2.jasper";
            JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(reportPath);

            String par = (String) invoiceComboBox.getSelectedItem();
            
            // Set parameters if needed
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("inv", par);
            // Fill the report with data from the database
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);

            // Display the JasperViewer in the tampilReport panel
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setZoomRatio((float) 0.5);
            tampilReport.removeAll();
            tampilReport.setLayout(new BorderLayout());
            tampilReport.add(jasperViewer.getContentPane(), BorderLayout.CENTER);
            tampilReport.revalidate();
        } catch (JRException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> blnAkhir;
    private javax.swing.JComboBox<String> blnAwal;
    private javax.swing.JComboBox<String> invoiceComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JComboBox<String> laporanJenis;
    private javax.swing.JPanel panelTanggal;
    private javax.swing.JButton printButton;
    private javax.swing.JPanel tampilReport;
    private javax.swing.JComboBox<String> tglAkhir;
    private javax.swing.JComboBox<String> tglAwal;
    private javax.swing.JComboBox<String> thnAkhir;
    private javax.swing.JComboBox<String> thnAwal;
    // End of variables declaration//GEN-END:variables
}
