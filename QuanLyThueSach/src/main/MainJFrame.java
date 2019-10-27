/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();

        setTitle("Quản Lý Thuê Sách");
        setLocation(300, 150);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/IconApp.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jbtThemThongTin = new javax.swing.JButton();
        jbtTraSach = new javax.swing.JButton();
        jbtThueSach = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jbtThemThongTin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbtThemThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/IconNTT.png"))); // NOI18N
        jbtThemThongTin.setText("  Nhập Thông Tin");
        jbtThemThongTin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtThemThongTin.setFocusable(false);
        jbtThemThongTin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtThemThongTin.setNextFocusableComponent(this);
        jbtThemThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemThongTinActionPerformed(evt);
            }
        });

        jbtTraSach.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbtTraSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/IconTraS.png"))); // NOI18N
        jbtTraSach.setText("  Quản Lý Trả Sách");
        jbtTraSach.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtTraSach.setFocusable(false);
        jbtTraSach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtTraSach.setNextFocusableComponent(this);
        jbtTraSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTraSachActionPerformed(evt);
            }
        });

        jbtThueSach.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbtThueSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/IconTS.png"))); // NOI18N
        jbtThueSach.setText("  Quản Lý Thuê Sách");
        jbtThueSach.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtThueSach.setFocusable(false);
        jbtThueSach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtThueSach.setNextFocusableComponent(this);
        jbtThueSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThueSachActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ứng Dụng Quản Lý Thuê Sách");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtThemThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtTraSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtThueSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addGap(250, 250, 250))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jbtThemThongTin)
                .addGap(30, 30, 30)
                .addComponent(jbtThueSach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jbtTraSach, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtThueSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThueSachActionPerformed
        this.setVisible(false);
        new ThueSachJFrame().setVisible(true);
    }//GEN-LAST:event_jbtThueSachActionPerformed

    private void jbtTraSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTraSachActionPerformed
        this.setVisible(false);
        new TraSachJFrame().setVisible(true);
    }//GEN-LAST:event_jbtTraSachActionPerformed

    private void jbtThemThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemThongTinActionPerformed
        this.setVisible(false);
        new ThemThongTinJFrame().setVisible(true);
    }//GEN-LAST:event_jbtThemThongTinActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);  
                }
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtThemThongTin;
    private javax.swing.JButton jbtThueSach;
    private javax.swing.JButton jbtTraSach;
    // End of variables declaration//GEN-END:variables

}
