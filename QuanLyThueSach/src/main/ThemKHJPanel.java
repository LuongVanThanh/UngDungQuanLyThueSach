/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Classes.ConnectionData;
import Classes.KhachHang;
import Classes.Sach;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author ASUS
 */
public class ThemKHJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThemKHJPanel
     */
    public ThemKHJPanel() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfMaKH = new javax.swing.JTextField();
        jtfHoTen = new javax.swing.JTextField();
        jtfSDT = new javax.swing.JTextField();
        jbtThemKH = new javax.swing.JButton();
        jbtCapNhatKH = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbKH = new javax.swing.JTable();
        jbtReset = new javax.swing.JButton();

        jPanel2.setPreferredSize(new java.awt.Dimension(1003, 359));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Mã khách hàng");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Tên khách hàng:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Số điện thoại:");

        jtfMaKH.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jtfHoTen.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jtfSDT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jbtThemKH.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtThemKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/IconThem.png"))); // NOI18N
        jbtThemKH.setToolTipText("thêm");
        jbtThemKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtThemKHMouseClicked(evt);
            }
        });

        jbtCapNhatKH.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtCapNhatKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/IconCapNhat.png"))); // NOI18N
        jbtCapNhatKH.setToolTipText("cập nhật");
        jbtCapNhatKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtCapNhatKHMouseClicked(evt);
            }
        });

        jtbKH = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtbKH.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jtbKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Họ tên", "Số điện thoại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbKH.getTableHeader().setReorderingAllowed(false);
        jtbKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbKHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbKH);
        if (jtbKH.getColumnModel().getColumnCount() > 0) {
            jtbKH.getColumnModel().getColumn(0).setResizable(false);
            jtbKH.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtbKH.getColumnModel().getColumn(1).setResizable(false);
            jtbKH.getColumnModel().getColumn(1).setPreferredWidth(50);
            jtbKH.getColumnModel().getColumn(2).setResizable(false);
            jtbKH.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        jbtReset.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/IconReset.png"))); // NOI18N
        jbtReset.setToolTipText("reset");
        jbtReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtResetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(jtfSDT)
                            .addComponent(jtfMaKH)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtReset, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jbtCapNhatKH, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jbtThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtfMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jbtReset))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtCapNhatKH))))
                    .addComponent(jbtThemKH))
                .addGap(74, 125, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
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

    private void init(){
        jtfMaKH.setText("");
        jtfHoTen.setText("");
        jtfSDT.setText("");
        jtfMaKH.requestFocus();
        showData();     
    }
    
    public static String chuanHoaChuoi(String chuoi){
        try{
            String s = chuoi.trim();
            s = s.replaceAll("\\s+", " ");
            s = s.toLowerCase();
            s = s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    s = s.substring(0, i+1) + s.substring(i + 1, i + 2).toUpperCase()
                            + s.substring(i + 2, s.length());
                }
            }
            return s;
        } catch(Exception ex){
            return ex.getMessage();
        }
        
    }
    
    private void showData(){
        try{
            jtbKH.removeAll();
            String[] arr = {"Mã KH", "Họ tên", "Số điện thoại"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
            Connection conn = ConnectionData.ConnectionTest();
            PreparedStatement ps = conn.prepareStatement("SELECT* FROM dbo.[KhachHang]");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("MaKH"));
                v.add(rs.getString("HoTen"));
                v.add(rs.getString("SDT"));
                model.addRow(v);
            }
            jtbKH.setModel(model);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void jbtThemKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemKHMouseClicked
        if(jtbKH.getSelectedRow() == -1){
            try {
                String maKH = jtfMaKH.getText();
                String hoTen = jtfHoTen.getText().trim();
                String soDT = jtfSDT.getText();
                if ("".equals(maKH)) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã khách hàng!!!", "Error", JOptionPane.ERROR_MESSAGE);
                    jtfMaKH.requestFocus();
                } else if ("".equals(hoTen)) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa nhập họ tên!!!", "Error", JOptionPane.ERROR_MESSAGE);
                    jtfHoTen.requestFocus();
                } else if ("".equals(soDT)) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa nhập số điện thoại!!!", "Error", JOptionPane.ERROR_MESSAGE);
                    jtfSDT.requestFocus();
                } else {
                    hoTen = chuanHoaChuoi(hoTen);
                    KhachHang s = new KhachHang();
                    if (s.ThemKH(maKH, hoTen, soDT) == true) {
                        init();
                        int res = JOptionPane.showConfirmDialog(null, "Bạn có muốn chuyển sang form thuê sách???", "Thông báo", JOptionPane.YES_NO_OPTION);
                        if(res == JOptionPane.YES_OPTION){
                            ThueSachJFrame tsj = new ThueSachJFrame(maKH);
                        // lấy jframe đang chứa nó ẩn đi
                        this.getTopLevelAncestor().setVisible(false);
                        tsj.setVisible(true);
                        }
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
    }//GEN-LAST:event_jbtThemKHMouseClicked

    private void jtbKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbKHMouseClicked
        int i = jtbKH.getSelectedRow();
        TableModel model = jtbKH.getModel();
        jtfMaKH.setText(model.getValueAt(i, 0).toString());
        jtfHoTen.setText(model.getValueAt(i, 1).toString());
        jtfSDT.setText(model.getValueAt(i, 2).toString());
    }//GEN-LAST:event_jtbKHMouseClicked

    private void jbtResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtResetMouseClicked
        init();
    }//GEN-LAST:event_jbtResetMouseClicked

    private void jbtCapNhatKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtCapNhatKHMouseClicked
        try {
                String maKH = jtfMaKH.getText();
                String hoTen = jtfHoTen.getText().trim();
                String soDT = jtfSDT.getText();
                if ("".equals(maKH)) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã khách hàng!!!", "Error", JOptionPane.ERROR_MESSAGE);
                    jtfMaKH.requestFocus();
                } else if ("".equals(hoTen)) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa nhập họ tên!!!", "Error", JOptionPane.ERROR_MESSAGE);
                    jtfHoTen.requestFocus();
                } else if ("".equals(soDT)) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa nhập số điện thoại!!!", "Error", JOptionPane.ERROR_MESSAGE);
                    jtfSDT.requestFocus();
                } else {
                    hoTen = chuanHoaChuoi(hoTen);
                    KhachHang s = new KhachHang();
                    if (s.capNhapKH(maKH, hoTen, soDT) == true) {
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
    }//GEN-LAST:event_jbtCapNhatKHMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtCapNhatKH;
    private javax.swing.JButton jbtReset;
    private javax.swing.JButton jbtThemKH;
    private javax.swing.JTable jtbKH;
    private javax.swing.JTextField jtfHoTen;
    private javax.swing.JTextField jtfMaKH;
    private javax.swing.JTextField jtfSDT;
    // End of variables declaration//GEN-END:variables
}
