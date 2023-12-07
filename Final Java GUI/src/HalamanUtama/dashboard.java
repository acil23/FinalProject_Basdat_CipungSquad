package HalamanUtama;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import komponen.AksesorisHp;
import tombolDanBackground.tombolBulatLogOut;
import komponen.kasir;
import komponen.login1;
import komponen.menuTes;
import komponen.saldo;

public class dashboard extends javax.swing.JFrame {

    kasir kas;
    saldo sal;

    public dashboard() throws SQLDataException, SQLException {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        kas = new kasir();
        sal = new saldo();
        panelKasir.add(kas);
        panelSaldo.add(sal);
        moving(this);
        tombolan();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        border21 = new tombolDanBackground.Border2();
        bulat1 = new tombolDanBackground.tombolBulat();
        bulatLogOut1 = new tombolDanBackground.tombolBulatLogOut();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        historyButton = new javax.swing.JButton();
        barangButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        panelGerak = new javax.swing.JPanel();
        panelKasir = new javax.swing.JPanel();
        panelSaldo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bulat1.setBackground(new java.awt.Color(203, 101, 198));
        bulat1.setForeground(new java.awt.Color(255, 255, 255));
        bulat1.setText("TRANSAKSI");
        bulat1.setContentAreaFilled(false);
        bulat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bulat1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bulat1MouseExited(evt);
            }
        });

        bulatLogOut1.setBackground(new java.awt.Color(203, 101, 198));
        bulatLogOut1.setForeground(new java.awt.Color(255, 255, 255));
        bulatLogOut1.setText("Log Out");
        bulatLogOut1.setContentAreaFilled(false);
        bulatLogOut1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bulatLogOut1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bulatLogOut1MouseExited(evt);
            }
        });
        bulatLogOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulatLogOut1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lokasi.png"))); // NOI18N
        jLabel5.setText("Jawa Timur, Jalan Bendungan Sigura-gura No. 1");

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(675, 500));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo-250.png"))); // NOI18N
        jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CJN App");
        jPanel1.add(jLabel3, java.awt.BorderLayout.NORTH);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("\"Aksesoris Trendi untuk Hidup yang Berwarna\"");
        jPanel1.add(jLabel4, java.awt.BorderLayout.SOUTH);

        historyButton.setBackground(new java.awt.Color(153, 73, 149));
        historyButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        historyButton.setForeground(new java.awt.Color(255, 255, 255));
        historyButton.setText("Report");
        historyButton.setBorderPainted(false);
        historyButton.setFocusPainted(false);
        historyButton.setFocusable(false);
        historyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButtonActionPerformed(evt);
            }
        });

        barangButton.setBackground(new java.awt.Color(153, 73, 149));
        barangButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        barangButton.setForeground(new java.awt.Color(255, 255, 255));
        barangButton.setText("Daftar Barang");
        barangButton.setBorderPainted(false);
        barangButton.setFocusPainted(false);
        barangButton.setFocusable(false);
        barangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barangButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Daftar Menu");

        panelGerak.setOpaque(false);

        javax.swing.GroupLayout panelGerakLayout = new javax.swing.GroupLayout(panelGerak);
        panelGerak.setLayout(panelGerakLayout);
        panelGerakLayout.setHorizontalGroup(
            panelGerakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        panelGerakLayout.setVerticalGroup(
            panelGerakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        panelKasir.setOpaque(false);
        panelKasir.setPreferredSize(new java.awt.Dimension(236, 100));
        panelKasir.setLayout(new java.awt.BorderLayout());

        panelSaldo.setOpaque(false);
        panelSaldo.setPreferredSize(new java.awt.Dimension(250, 100));
        panelSaldo.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout border21Layout = new javax.swing.GroupLayout(border21);
        border21.setLayout(border21Layout);
        border21Layout.setHorizontalGroup(
            border21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(border21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(border21Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(border21Layout.createSequentialGroup()
                        .addGroup(border21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bulat1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(border21Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(border21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(barangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(historyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(border21Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(border21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(border21Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(border21Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(panelKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, border21Layout.createSequentialGroup()
                .addComponent(panelGerak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(bulatLogOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        border21Layout.setVerticalGroup(
            border21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, border21Layout.createSequentialGroup()
                .addGroup(border21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(border21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bulatLogOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelGerak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(border21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(border21Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(border21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(border21Layout.createSequentialGroup()
                                .addComponent(bulat1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, border21Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(border21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelKasir, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(panelSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38)))
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, border21Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(barangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(historyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(312, 312, 312))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(border21, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(border21, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bulatLogOut1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bulatLogOut1MouseEntered
        bulatLogOut1.setBackground(new Color(255, 0, 0, 80));
    }//GEN-LAST:event_bulatLogOut1MouseEntered

    private void bulatLogOut1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bulatLogOut1MouseExited
        bulatLogOut1.setBackground(new Color(203, 101, 198));
    }//GEN-LAST:event_bulatLogOut1MouseExited

    private void bulat1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bulat1MouseEntered
        bulat1.setBackground(new Color(0, 255, 0, 80));
    }//GEN-LAST:event_bulat1MouseEntered

    private void bulat1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bulat1MouseExited
        bulat1.setBackground(new Color(203, 101, 198));
    }//GEN-LAST:event_bulat1MouseExited

    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
        try {
            pageLaporan t = new pageLaporan();
            t.setVisible(true);
            dispose();
            t.setLocationRelativeTo(null);
            t.setDefaultCloseOperation(pageLaporan.EXIT_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(pageLaporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_historyButtonActionPerformed

    private void barangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barangButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barangButtonActionPerformed

    private void bulatLogOut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulatLogOut1ActionPerformed
        int option = JOptionPane.showConfirmDialog(null,
                "Apakah Anda yakin ingin logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            try {
                loginPage m = new loginPage();
                m.setVisible(true);
                dispose();
                m.setLocationRelativeTo(null);
                m.setDefaultCloseOperation(loginPage.EXIT_ON_CLOSE);
            } catch (SQLException ex) {
                Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            repaint();
        }
    }//GEN-LAST:event_bulatLogOut1ActionPerformed

    private int x;
    private int y;

    public void moving(JFrame frame) {
        panelGerak.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
        });
        panelGerak.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                frame.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
            }
        });
    }

    public void tombolan() {
        barangButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    tabelBarang m = new tabelBarang();
                    m.setVisible(true);
                    dispose();
                    m.setLocationRelativeTo(null);
                    m.setDefaultCloseOperation(dashboard.EXIT_ON_CLOSE);
                } catch (SQLException ex) {
                    Logger.getLogger(AksesorisHp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        historyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    pageLaporan m = new pageLaporan();
                    m.setVisible(true);
                    dispose();
                    m.setLocationRelativeTo(null);
                    m.setDefaultCloseOperation(dashboard.EXIT_ON_CLOSE);
                } catch (SQLException ex) {
                    Logger.getLogger(AksesorisHp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new dashboard().setVisible(true);
                } catch (SQLDataException ex) {
                    Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton barangButton;
    private tombolDanBackground.Border2 border21;
    private tombolDanBackground.tombolBulat bulat1;
    private tombolDanBackground.tombolBulatLogOut bulatLogOut1;
    private javax.swing.JButton historyButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelGerak;
    private javax.swing.JPanel panelKasir;
    private javax.swing.JPanel panelSaldo;
    // End of variables declaration//GEN-END:variables
}
