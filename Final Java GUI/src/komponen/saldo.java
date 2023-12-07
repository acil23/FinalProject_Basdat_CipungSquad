
package komponen;

import koneksiDanJavaClass.DatabaseConnector;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class saldo extends javax.swing.JPanel {

    public saldo() throws SQLException {
        initComponents();
        setOpaque(false);
        saldoSkrg();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        saldoKasir = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Saldo");

        saldoKasir.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        saldoKasir.setForeground(new java.awt.Color(255, 255, 255));
        saldoKasir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saldoKasir.setText("Rp. 800.000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saldoKasir, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saldoKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saldoSkrg() throws SQLException {
        String saldoSkrg = "";
        int jumlahSaldo = 0;
        DatabaseConnector.getConnection();
        String query = "SELECT * FROM kasirSkrg";
        Statement st = DatabaseConnector.connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        if(rs.next()){
            jumlahSaldo = rs.getInt("saldo");
        }
        
        saldoKasir.setText("Rp. " + jumlahSaldo);
    
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D d2 = (Graphics2D) g;
        d2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gd = new GradientPaint(0, 0, Color.BLACK, 0, getHeight(), new Color(203,101,198));
        d2.setPaint(gd);
        d2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel saldoKasir;
    // End of variables declaration//GEN-END:variables
}
