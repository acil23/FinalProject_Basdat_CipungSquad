package tombolDanBackground;

import HalamanUtama.pageSemuaAksesoris;
import HalamanUtama.konfirmasi;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import komponen.SemuaAksesoris;

public class tombolBulat extends javax.swing.JButton {

    public tombolBulat() {
        initComponents();
        setOpaque(false);
        setFont(new Font("Sylfaen", 1, 20));
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    pageSemuaAksesoris t = new pageSemuaAksesoris();
                    t.setVisible(true);
                    SwingUtilities.getWindowAncestor(tombolBulat.this).dispose();
                    t.setLocationRelativeTo(null);
                    t.setDefaultCloseOperation(pageSemuaAksesoris.EXIT_ON_CLOSE);
                } catch (SQLException ex) {
                    Logger.getLogger(SemuaAksesoris.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray);
        } else {
            g.setColor(getBackground());
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int diameter = Math.min(getWidth(), getHeight());
        g2d.fill(new Ellipse2D.Double((getWidth() - diameter) / 2, (getHeight() - diameter) / 2, diameter, diameter));

        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        // No border
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 100); // Adjust the size as needed
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
