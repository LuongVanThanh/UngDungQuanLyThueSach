/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author ASUS
 */
public class ThemThongTinJFrame extends javax.swing.JFrame {

    private JPanel childPanel;
    
    public ThemThongTinJFrame() {
        initComponents();
        setTitle("Thêm Thông Tin");
        setLocation(300, 150);
        jbtVTC.setToolTipText("Quay lai giao diện chính");
        
        //thay icon
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/IconApp.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jpnView = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jbtVTC = new javax.swing.JButton();
        jbtThemSach = new javax.swing.JButton();
        jbtThemKH = new javax.swing.JButton();
        jbtCNSach = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jbtVTC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/IconVTC.png"))); // NOI18N
        jbtVTC.setToolTipText("Quay lại giao diện chính");
        jbtVTC.setFocusable(false);
        jbtVTC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtVTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtVTCActionPerformed(evt);
            }
        });

        jbtThemSach.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jbtThemSach.setText("Thêm sách");
        jbtThemSach.setFocusable(false);
        jbtThemSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemSachActionPerformed(evt);
            }
        });

        jbtThemKH.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jbtThemKH.setText("Thêm khách hàng");
        jbtThemKH.setFocusable(false);
        jbtThemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemKHActionPerformed(evt);
            }
        });

        jbtCNSach.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jbtCNSach.setText("Cập nhật sách");
        jbtCNSach.setFocusable(false);
        jbtCNSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCNSachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jbtThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtCNSach, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtThemKH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jbtVTC, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtVTC, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtCNSach, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //sự kiện click hình ngôi nhà
    private void jbtVTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtVTCActionPerformed
        this.setVisible(false);
        new MainJFrame().setVisible(true);
    }//GEN-LAST:event_jbtVTCActionPerformed

    //sự kiện click nút thêm sách
    private void jbtThemSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemSachActionPerformed
        jbtThemSach.setBackground(new Color(80, 100, 191));
        jbtThemKH.setBackground(new Color(240, 240, 240));
        jbtCNSach.setBackground(new Color(240, 240, 240));
        childPanel = new ThemSachJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(childPanel);
        jpnView.validate();
    }//GEN-LAST:event_jbtThemSachActionPerformed

    //sự kiện click nút thêm khách hàng
    private void jbtThemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemKHActionPerformed
        jbtThemKH.setBackground(new Color(80, 100, 191));
        jbtThemSach.setBackground(new Color(240, 240, 240));
        jbtCNSach.setBackground(new Color(240, 240, 240));
        childPanel = new ThemKHJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(childPanel);
        jpnView.validate();
    }//GEN-LAST:event_jbtThemKHActionPerformed

    private void jbtCNSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCNSachActionPerformed
        jbtCNSach.setBackground(new Color(80, 100, 191));
        jbtThemSach.setBackground(new Color(240, 240, 240));
        jbtThemKH.setBackground(new Color(240, 240, 240));
        childPanel = new CNSachJPanel();
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(childPanel);
        jpnView.validate();
    }//GEN-LAST:event_jbtCNSachActionPerformed

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
            java.util.logging.Logger.getLogger(ThemThongTinJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemThongTinJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemThongTinJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemThongTinJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ThemThongTinJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(ThemThongTinJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(ThemThongTinJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(ThemThongTinJFrame.class.getName()).log(Level.SEVERE, null, ex);  
                }
                new ThemThongTinJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtCNSach;
    private javax.swing.JButton jbtThemKH;
    private javax.swing.JButton jbtThemSach;
    private javax.swing.JButton jbtVTC;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
