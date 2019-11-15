/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Classes.ConnectionData;
import Classes.Sach;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ASUS
 */
public class ThemSachJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThemSachJPanel
     */
    public ThemSachJPanel() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfMaSach = new javax.swing.JTextField();
        jtfTenSach = new javax.swing.JTextField();
        jtfGiaChoThue = new javax.swing.JTextField();
        jtfSoLuong = new javax.swing.JTextField();
        jbtThem = new javax.swing.JButton();
        jbtCapNhatS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbSach = new javax.swing.JTable();
        jbtReset = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Mã sách: ");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Tên sách:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Giá cho thuê:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Số lượng sách:");

        jtfMaSach.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtfMaSach.setEnabled(false);

        jtfTenSach.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jtfGiaChoThue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jtfSoLuong.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jbtThem.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtThem.setText("Thêm");
        jbtThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtThemMouseClicked(evt);
            }
        });
        jbtThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemActionPerformed(evt);
            }
        });

        jbtCapNhatS.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtCapNhatS.setText("Cập nhật");
        jbtCapNhatS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtCapNhatSMouseClicked(evt);
            }
        });

        jtbSach = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtbSach.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jtbSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Giá cho thuê", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbSach.getTableHeader().setReorderingAllowed(false);
        jtbSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbSach);
        if (jtbSach.getColumnModel().getColumnCount() > 0) {
            jtbSach.getColumnModel().getColumn(0).setResizable(false);
            jtbSach.getColumnModel().getColumn(1).setResizable(false);
            jtbSach.getColumnModel().getColumn(2).setResizable(false);
            jtbSach.getColumnModel().getColumn(3).setResizable(false);
        }

        jbtReset.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtReset.setText("Reset");
        jbtReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtResetMouseClicked(evt);
            }
        });
        jbtReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(22, 22, 22)
                                    .addComponent(jtfGiaChoThue, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGap(49, 49, 49)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtfMaSach)
                                        .addComponent(jtfTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtReset, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jbtCapNhatS, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtfTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfGiaChoThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtThem)
                    .addComponent(jbtReset)
                    .addComponent(jbtCapNhatS))
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //lấy mã sách tự động
    private void loadMaS(){
        int maS;
        TableModel model = jtbSach.getModel();
        if(model.getRowCount() == 0)
            maS = 0;
        else{
            int i = model.getRowCount() - 1;
            maS = Integer.parseInt(model.getValueAt(i, 0).toString());
        }
        jtfMaSach.setText(String.valueOf(maS+1));
    }
    //trở về mặc định lúc thêm
    private void init(){
        showData();
        jtfTenSach.setText("");
        jtfGiaChoThue.setText("");
        jtfSoLuong.setText("");
        loadMaS();
        jtfTenSach.requestFocus();
    }
    //show dữ vào bảng sách
    private void showData(){
        try{
            jtbSach.removeAll();
            String[] arr = {"Mã sách", "Tên sách", "Giá cho thuê", "Số lượng"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
            Connection conn = ConnectionData.ConnectionTest();
            PreparedStatement ps = conn.prepareStatement("SELECT* FROM dbo.[Sach]");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getInt("MaS"));
                v.add(rs.getString("TenSach"));
                v.add(rs.getInt("GiaSach"));
                v.add(rs.getInt("SLS"));
                model.addRow(v);
            }
            jtbSach.setModel(model);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void jbtThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemActionPerformed

    }//GEN-LAST:event_jbtThemActionPerformed

    private void jbtThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseClicked
        if(jtbSach.getSelectedRow() == -1){
            try {
                String tenS = jtfTenSach.getText().trim();
                String giaS = jtfGiaChoThue.getText();
                String soLuongS = jtfSoLuong.getText();
                if ("".equals(tenS)) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa nhập tên sách!!!", "Error", JOptionPane.ERROR_MESSAGE);
                    jtfTenSach.requestFocus();
                } else if ("".equals(giaS)) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa nhập giá sách!!!", "Error", JOptionPane.ERROR_MESSAGE);
                    jtfGiaChoThue.requestFocus();
                } else if ("".equals(soLuongS)) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa nhập số lượng sách!!!", "Error", JOptionPane.ERROR_MESSAGE);
                    jtfSoLuong.requestFocus();
                } else {
                    Sach s = new Sach();
                    if (s.ThemSach(tenS, giaS, soLuongS) == true) {
                        init();
                    } else {
                        throw new Exception("Dữ liệu không hợp lệ!");
                    }
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ThemSachJPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jbtThemMouseClicked
    
    //xử lý chọn bên table đưa data lên text field
    private void jtbSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbSachMouseClicked
        int i = jtbSach.getSelectedRow();
        TableModel model = jtbSach.getModel();
        jtfMaSach.setText(model.getValueAt(i, 0).toString());
        jtfTenSach.setText(model.getValueAt(i, 1).toString());
        jtfGiaChoThue.setText(model.getValueAt(i, 2).toString());
        jtfSoLuong.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_jtbSachMouseClicked

    private void jbtResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtResetActionPerformed

    private void jbtResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtResetMouseClicked
        init();
    }//GEN-LAST:event_jbtResetMouseClicked

    private void jbtCapNhatSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtCapNhatSMouseClicked
        try {
            String maS = jtfMaSach.getText();
            String tenS = jtfTenSach.getText();
            String giaS = jtfGiaChoThue.getText();
            String soLuongS = jtfSoLuong.getText();
            if ("".equals(tenS)) {
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập tên sách!!!", "Error", JOptionPane.ERROR_MESSAGE);
                jtfTenSach.requestFocus();
            } else if ("".equals(giaS)) {
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập giá sách!!!", "Error", JOptionPane.ERROR_MESSAGE);
                jtfGiaChoThue.requestFocus();
            } else if ("".equals(soLuongS)) {
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập số lượng sách!!!", "Error", JOptionPane.ERROR_MESSAGE);
                jtfSoLuong.requestFocus();
            } else {
                Sach s = new Sach();
                if (s.capNhapSach(maS, tenS, giaS, soLuongS) == true) {
                    init();
                } else {
                    throw new Exception("Dữ liệu không hợp lệ!");
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThemSachJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtCapNhatSMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtCapNhatS;
    private javax.swing.JButton jbtReset;
    private javax.swing.JButton jbtThem;
    private javax.swing.JTable jtbSach;
    private javax.swing.JTextField jtfGiaChoThue;
    private javax.swing.JTextField jtfMaSach;
    private javax.swing.JTextField jtfSoLuong;
    private javax.swing.JTextField jtfTenSach;
    // End of variables declaration//GEN-END:variables
}
