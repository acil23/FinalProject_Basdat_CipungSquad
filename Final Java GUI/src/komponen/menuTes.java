package komponen;

import HalamanUtama.*;
import java.awt.BorderLayout;
import komponen.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class menuTes extends javax.swing.JPanel {

    String kategori;
    AksesorisHp aksHp;
    SemuaAksesoris aksTes = new SemuaAksesoris();
    DefaultListModel<gantiList> listModel = new DefaultListModel<>();
    JList<gantiList> listMenu = new JList<>(listModel);
    private int hoverIndex = -1;

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public menuTes() throws SQLDataException {
        initComponents();
        setOpaque(false);
        aksHp = new AksesorisHp();
        listMenu.setOpaque(false);
        scrollMenu.getViewport().setOpaque(false);
        scrollMenu.setVerticalScrollBar(new JScrollBar());
        ListMenuIsi();

        listMenu.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int index = listMenu.locationToIndex(e.getPoint());
                if (index != hoverIndex) {
                    hoverIndex = index;
                    listMenu.repaint();

                    if (hoverIndex != -1 && hoverIndex != 1 && hoverIndex != 2 && hoverIndex != 7 && hoverIndex != 8) {
                        listMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    } else {
                        listMenu.setCursor(Cursor.getDefaultCursor());
                    }
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNama = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        scrollMenu = new javax.swing.JScrollPane();

        panelNama.setOpaque(false);
        panelNama.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(282, 15));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        panelNama.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("\"Aksesoris Trendi untuk Hidup yang Berwarna\"");
        panelNama.add(jLabel1, java.awt.BorderLayout.SOUTH);

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo-80.png"))); // NOI18N
        jLabel2.setText("CJN App");
        panelNama.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        scrollMenu.setOpaque(false);
        scrollMenu.setRequestFocusEnabled(false);
        jPanel2.add(scrollMenu, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ListMenuIsi() {
        listModel.addElement(new gantiList("Dashboard", "/icon/dash40.png"));
        listModel.addElement(new gantiList(" ", null));
        listModel.addElement(new gantiList("Menu Transaksi", null));
        listModel.addElement(new gantiList("Semua Aksesoris", "/icon/semua40.png"));
        listModel.addElement(new gantiList("Aksesoris Hp", "/icon/hp40.png"));
        listModel.addElement(new gantiList("Aksesoris Laptop", "/icon/laptop40.png"));
        listModel.addElement(new gantiList("Aksesoris Lainnya", "/icon/lain40.png"));
        listModel.addElement(new gantiList(" ", null));
        listModel.addElement(new gantiList("Lainnya", null));
        listModel.addElement(new gantiList("Daftar Barang", "/icon/history40.png"));
        listModel.addElement(new gantiList("Report", "/icon/report40.png"));
        listModel.addElement(new gantiList("Logout", "/icon/logout40.png"));
        listMenu.setCellRenderer(new MyCellRenderer());
        listMenu.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollMenu.setViewportView(listMenu);
        listAction();

    }

    class MyCellRenderer extends DefaultListCellRenderer {

        private final Color hoverBackgroundColor = new Color(0, 102, 204);
        private final Color defaultBackgroundColor = new Color(0, 0, 0, 0);

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            label.setOpaque(true);

            // Logika untuk mengubah warna latar belakang saat item dihover
            if (index == hoverIndex && index != 1 && index != 2 && index != 7 && index != 8) {
                label.setBackground(hoverBackgroundColor);
            } else {
                label.setBackground(defaultBackgroundColor);
            }

            if (value instanceof gantiList) {
                gantiList listItem = (gantiList) value;
                if (listItem.hasIcon()) {
                    String iconName = listItem.getIconName();
                    Icon icon = new ImageIcon(getClass().getResource(iconName));
                    label.setIcon(icon);
                    label.setForeground(Color.decode("#ffffff"));
                } else {
                    label.setIcon(null);
                    label.setForeground(Color.decode("#383535"));
                    label.setBorder(noFocusBorder);
                }
                label.setFont(new Font("Arial", 0, 17));
                label.setText(listItem.getText());
            }

            return label;
        }
    }

    private void listAction() {
        listMenu.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Check if the user is done adjusting the selection
                if (!e.getValueIsAdjusting()) {
                    // Get the selected item from the JList
                    gantiList selectedItem = listMenu.getSelectedValue();
                    String select = selectedItem.getText();
                    if (select.equals("Aksesoris Hp")) {
                        try {
                            pageAksesorisHp t = new pageAksesorisHp();
                            
                            t.setVisible(true);
                            SwingUtilities.getWindowAncestor(menuTes.this).dispose();
                            t.setLocationRelativeTo(null);
                            t.setDefaultCloseOperation(pageAksesorisHp.EXIT_ON_CLOSE);
                        } catch (SQLException ex) {
                            Logger.getLogger(SemuaAksesoris.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if (select.equals("Aksesoris Laptop")) {
                        try {
                            pageAksesorisLaptop t = new pageAksesorisLaptop();
                            t.setVisible(true);
                            SwingUtilities.getWindowAncestor(menuTes.this).dispose();
                            t.setLocationRelativeTo(null);
                            t.setDefaultCloseOperation(pageAksesorisLaptop.EXIT_ON_CLOSE);
                        } catch (SQLException ex) {
                            Logger.getLogger(SemuaAksesoris.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if (select.equals("Aksesoris Lainnya")) {
                        try {
                            pageAksesorisLainnya t = new pageAksesorisLainnya();
                            t.setVisible(true);
                            SwingUtilities.getWindowAncestor(menuTes.this).dispose();
                            t.setLocationRelativeTo(null);
                            t.setDefaultCloseOperation(pageAksesorisLainnya.EXIT_ON_CLOSE);
                        } catch (SQLException ex) {
                            Logger.getLogger(SemuaAksesoris.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if (select.equals("Semua Aksesoris")) {
                        try {
                            pageSemuaAksesoris t = new pageSemuaAksesoris();
                            t.setVisible(true);
                            SwingUtilities.getWindowAncestor(menuTes.this).dispose();
                            t.setLocationRelativeTo(null);
                            t.setDefaultCloseOperation(pageSemuaAksesoris.EXIT_ON_CLOSE);
                        } catch (SQLException ex) {
                            Logger.getLogger(SemuaAksesoris.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if (select.equals("Daftar Barang")) {
                        try {
                            tabelBarang t = new tabelBarang();
                            t.setVisible(true);
                            SwingUtilities.getWindowAncestor(menuTes.this).dispose();
                            t.setLocationRelativeTo(null);
                            t.setDefaultCloseOperation(tabelBarang.EXIT_ON_CLOSE);
                        } catch (SQLException ex) {
                            Logger.getLogger(SemuaAksesoris.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if (select.equals("Logout")) {
                        int option = JOptionPane.showConfirmDialog(null,
                                "Apakah Anda yakin ingin logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);

                        if (option == JOptionPane.YES_OPTION) {
                            try {
                                loginPage m = new loginPage();
                                m.setVisible(true);
                                SwingUtilities.getWindowAncestor(menuTes.this).dispose();
                                m.setLocationRelativeTo(null);
                                m.setDefaultCloseOperation(loginPage.EXIT_ON_CLOSE);
                            } catch (SQLException ex) {
                                Logger.getLogger(loginPage.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            listMenu.clearSelection();
                        }
                    } else if (select.equals("Report")) {
                        try {
                            pageLaporan t = new pageLaporan();
                            t.setVisible(true);
                            SwingUtilities.getWindowAncestor(menuTes.this).dispose();
                            t.setLocationRelativeTo(null);
                            t.setDefaultCloseOperation(pageLaporan.EXIT_ON_CLOSE);
                        } catch (SQLException ex) {
                            Logger.getLogger(pageLaporan.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if (select.equals("Dashboard")) {
                        try {
                            dashboard t = new dashboard();
                            t.setVisible(true);
                            SwingUtilities.getWindowAncestor(menuTes.this).dispose();
                            t.setLocationRelativeTo(null);
                            t.setDefaultCloseOperation(dashboard.EXIT_ON_CLOSE);
                        } catch (SQLException ex) {
                            Logger.getLogger(SemuaAksesoris.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        });

    }

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D d2 = (Graphics2D) g;
        d2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gd = new GradientPaint(0, 0, Color.decode("#9bafd9"), 0, getHeight(), Color.decode("#103783"));
        d2.setPaint(gd);
        d2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        d2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(g);
    }

    private int x;
    private int y;

    public void moving(JFrame frame) {
        panelNama.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
        });
        panelNama.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                frame.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelNama;
    private javax.swing.JScrollPane scrollMenu;
    // End of variables declaration//GEN-END:variables
}

class gantiList {

    private String text;
    private String iconName;

    public gantiList(String text, String iconName) {
        this.text = text;
        this.iconName = iconName;
    }

    public String getText() {
        return text;
    }

    public String getIconName() {
        return iconName;
    }

    public boolean hasIcon() {
        return iconName != null && !iconName.isEmpty();
    }
}
