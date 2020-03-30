package com.mamangeri.view;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Form extends javax.swing.JFrame {

    public Form() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtHP = new javax.swing.JTextField();
        cWaktu = new javax.swing.JComboBox<>();
        cJenis = new javax.swing.JComboBox<>();
        cTempat = new javax.swing.JComboBox<>();
        txtTotal = new javax.swing.JTextField();
        btnProses = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Waktu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 141, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("No. HP");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 103, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Jenis");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 182, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Tempat");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 223, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Total");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 262, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Nama");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 67, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText(":");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 141, 50, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText(":");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 67, 50, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText(":");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 223, 50, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText(":");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 182, 50, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText(":");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 262, 50, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText(":");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 103, 50, -1));

        txtNama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 65, 229, -1));

        txtHP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 101, 229, -1));

        cWaktu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cWaktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Jam", "2 Jam", "3 Jam", "4 Jam", "5 Jam" }));
        getContentPane().add(cWaktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 137, 229, -1));

        cJenis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PS 1: 2000/jam", "PS 2: 3000/jam", "PS 3: 5000/jam", "PS 4: 8000/jam" }));
        getContentPane().add(cJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 178, 229, -1));

        cTempat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cTempat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bilik 1", "Bilik 2", "Bilik 3", "Bilik 4", "Bilik 5" }));
        getContentPane().add(cTempat, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 219, 229, -1));

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 260, 229, -1));

        btnProses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProses.setText("Proses");
        btnProses.setFocusPainted(false);
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });
        getContentPane().add(btnProses, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 296, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("RENTAL PS");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 12, -1, -1));

        setSize(new java.awt.Dimension(410, 358));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        // TODO add your handling code here:
        ambil(cWaktu.getSelectedIndex(), cJenis.getSelectedIndex());
        hitungTotal(harga, waktu);
        notif();
        
        txtTotal.setText("Rp. " + Integer.toString(total));
      
        try {
            inputData();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnProsesActionPerformed

    public static void main(String args[]) {
        
        System.setProperty("awt.useSystemAAFontSettings","on");
        System.setProperty("swing.aatext", "true");
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new Form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProses;
    private javax.swing.JComboBox<String> cJenis;
    private javax.swing.JComboBox<String> cTempat;
    private javax.swing.JComboBox<String> cWaktu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtHP;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    // Variabel coding
    private static Connection con;
    private Statement st;
    private String nama;
    private int harga;
    private int waktu;
    private int total;
    
    // Koneksi database
    protected static Connection koneksi() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_ps","root","toor");
        } catch (SQLException e) {
            return null;
        }
        return con;
    }
    
    // 
    
    protected void inputData() throws SQLException, ClassNotFoundException {
        st = (Statement) koneksi().createStatement();
        st.executeUpdate("INSERT INTO tb_customer VALUES(null,'"
                            + txtNama.getText().trim() + "','"
                            + txtHP.getText().trim() + "','"
                            + cWaktu.getSelectedItem().toString() + "','"
                            + cJenis.getSelectedItem().toString().substring(0, 4) + "','"
                            + cTempat.getSelectedItem().toString() + "','"
                            + txtTotal.getText() + "')"
                        );
    }
    
    // Method coding
    protected int hitungTotal(int harga, int waktu) {
        total = harga * waktu;
        return total;
    }
    
    protected void ambil(int cWaktu, int cJenis) {
        switch (cWaktu) {
            case 0:
                waktu = 1;
                break;
            case 1:
                waktu = 2;
                break;
            case 2:
                waktu = 3;
                break;
            case 3:
                waktu = 4;
                break;
            case 4:
                waktu = 5;
                break;
            default:
                System.err.println("Kesalahan");
                break;
        }
        
        switch (cJenis) {
            case 0:
                harga = 2000;
                break;
            case 1:
                harga = 3000;
                break;
            case 2:
                harga = 5000;
                break;
            case 3:
                harga = 8000;
                break;
            default:
                System.err.println("Kesalahan");
                break;
        }
    }
    
    protected void notif() {
        nama = txtNama.getText();
        String tempat = (String) cTempat.getSelectedItem();
        JOptionPane.showMessageDialog(null, nama + " telah terdaftar di " + tempat);
    }
    
}
