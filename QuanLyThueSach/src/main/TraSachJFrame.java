
package main;

import Classes.ConnectionData;
import Classes.DonHang;
import Classes.KhachHang;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TraSachJFrame extends javax.swing.JFrame {

    public TraSachJFrame() {
        initComponents();
        setTitle("Trả Sách");
        setLocation(300, 150);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/IconApp.png")));
        loadDaTaDH();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtVTC1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbTraSach = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jtfMaKH = new javax.swing.JTextField();
        jbtTimKiem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtbDHSach = new javax.swing.JTable();
        jbtTraSach = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trả Sách");

        jbtVTC1.setBackground(new java.awt.Color(255, 255, 255));
        jbtVTC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/IconVTC.png"))); // NOI18N
        jbtVTC1.setToolTipText("Quay lại giao diện chính");
        jbtVTC1.setFocusable(false);
        jbtVTC1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtVTC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtVTC1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtVTC1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtVTC1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jtbTraSach = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtbTraSach.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jtbTraSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã DH", "Mã khách hàng", "Ngày mượn", "Ngày trả", "Thành tiền", "Tiền phạt", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbTraSach.getTableHeader().setReorderingAllowed(false);
        jtbTraSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbTraSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbTraSach);
        if (jtbTraSach.getColumnModel().getColumnCount() > 0) {
            jtbTraSach.getColumnModel().getColumn(0).setResizable(false);
            jtbTraSach.getColumnModel().getColumn(0).setPreferredWidth(20);
            jtbTraSach.getColumnModel().getColumn(1).setResizable(false);
            jtbTraSach.getColumnModel().getColumn(1).setPreferredWidth(20);
            jtbTraSach.getColumnModel().getColumn(2).setResizable(false);
            jtbTraSach.getColumnModel().getColumn(2).setPreferredWidth(50);
            jtbTraSach.getColumnModel().getColumn(3).setResizable(false);
            jtbTraSach.getColumnModel().getColumn(3).setPreferredWidth(50);
            jtbTraSach.getColumnModel().getColumn(4).setResizable(false);
            jtbTraSach.getColumnModel().getColumn(4).setPreferredWidth(50);
            jtbTraSach.getColumnModel().getColumn(5).setResizable(false);
            jtbTraSach.getColumnModel().getColumn(5).setPreferredWidth(50);
            jtbTraSach.getColumnModel().getColumn(6).setResizable(false);
            jtbTraSach.getColumnModel().getColumn(6).setPreferredWidth(40);
        }

        jtfMaKH.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jbtTimKiem.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtTimKiem.setText("Tìm kiếm");
        jbtTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtTimKiemMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Mã KH:");

        jtbDHSach = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtbDHSach.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtbDHSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã DH", "Mã sách", "Số lượng mượn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jtbDHSach.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jtbDHSach);
        if (jtbDHSach.getColumnModel().getColumnCount() > 0) {
            jtbDHSach.getColumnModel().getColumn(0).setResizable(false);
            jtbDHSach.getColumnModel().getColumn(0).setPreferredWidth(20);
            jtbDHSach.getColumnModel().getColumn(1).setResizable(false);
            jtbDHSach.getColumnModel().getColumn(1).setPreferredWidth(20);
            jtbDHSach.getColumnModel().getColumn(2).setResizable(false);
            jtbDHSach.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        jbtTraSach.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtTraSach.setText("Trả sách");
        jbtTraSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtTraSachMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jbtTraSach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfMaKH))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtTimKiem)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtTraSach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //chỉnh kích thước cột của jtbTraSach
    private void setSizeColumn(){
        jtbTraSach.getColumnModel().getColumn(0).setPreferredWidth(50);
        jtbTraSach.getColumnModel().getColumn(1).setPreferredWidth(100);
        jtbTraSach.getColumnModel().getColumn(2).setPreferredWidth(100);
        jtbTraSach.getColumnModel().getColumn(3).setPreferredWidth(100);
        jtbTraSach.getColumnModel().getColumn(4).setPreferredWidth(100);
        jtbTraSach.getColumnModel().getColumn(5).setPreferredWidth(100);
        jtbTraSach.getColumnModel().getColumn(6).setPreferredWidth(50);
    }
    
    private void loadDaTaDH(){
        try{
            jtbTraSach.removeAll();
            String[] arr = {"Mã DH", "Mã KH", "Ngày mượn", "Ngày trả", "Thành tiền", "Tiền phạt", "Trạng thái"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
            Connection conn = ConnectionData.ConnectionTest();
            PreparedStatement ps = conn.prepareStatement("SELECT* FROM dbo.[DonHang]");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getInt("MaDH"));
                v.add(rs.getString("MaKH"));
                v.add(rs.getDate("NgayMuon"));
                v.add(rs.getDate("NgayTra"));
                v.add(rs.getInt("ThanhTien"));
                v.add(rs.getInt("TienPhat"));
                v.add(rs.getInt("TinhTrang"));
                model.addRow(v);
            }
            jtbTraSach.setModel(model);
            setSizeColumn();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void loadDaTaDH(String maKH){
        try{
            jtbTraSach.removeAll();
            String[] arr = {"Mã DH", "Mã KH", "Ngày mượn", "Ngày trả", "Thành tiền", "Tiền phạt", "Trạng thái"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
            Connection conn = ConnectionData.ConnectionTest();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM dbo.[DonHang] WHERE MaKH = " + "'" + maKH + "'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getInt("MaDH"));
                v.add(rs.getString("MaKH"));
                v.add(rs.getDate("NgayMuon"));
                v.add(rs.getDate("NgayTra"));
                v.add(rs.getInt("ThanhTien"));
                v.add(rs.getInt("TienPhat"));
                v.add(rs.getInt("TinhTrang"));
                model.addRow(v);
            }
            jtbTraSach.setModel(model);
            setSizeColumn();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void loadDaTaSach(String maDH){
        try{
            jtbDHSach.removeAll();
            String[] arr = {"Mã DH", "Mã Sách", "Số lượng mượn"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
            Connection conn = ConnectionData.ConnectionTest();
            PreparedStatement ps = conn.prepareStatement("SELECT* FROM dbo.[DH_SACH] WHERE MaDH = " + "'" + maDH + "'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getInt("MaDH"));
                v.add(rs.getInt("MaS"));
                v.add(rs.getInt("SLM"));
                model.addRow(v);
            }
            jtbDHSach.setModel(model);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void xuatPhieuTienPhat(int dhChon){
        File file = new File("PhieuTienPhat.txt");
        file.delete();
        String tenKH = "";
        String maDH = "";
        String maKH = "";
        int tienPhat = 0;
        int ngayTre = 0;
        try{
            maDH = jtbTraSach.getValueAt(dhChon, 0).toString();
            maKH = jtbTraSach.getValueAt(dhChon, 1).toString();
            tienPhat = Integer.parseInt(jtbTraSach.getValueAt(dhChon, 5).toString());
            ngayTre = tienPhat / 5000;
            KhachHang kh = new KhachHang();
            kh.TimKH(maKH);
            tenKH = kh.getHoTen();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        //Viết vào file txt
        try {
            Writer b = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("PhieuTienPhat.txt"), "UTF8"));
            b.write("\t\tTÊN CỬA HÀNG THUÊ SÁCH\r\n\r\n");
            b.write("\t371 Nguyễn Kiệm, P.3, Q.Gò Vấp, TPHCM\r\n");
            b.write("\t\t   SĐT: 01212692802\r\n\r\n");
            b.write("\t\t --Phiếu Tiền Phạt-- " + "\r\n\r\n");
            b.write("Thời gian: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
            b.write("\t\tSố DH: " + maDH + "\r\n");
            b.write("Khách hàng: " + tenKH );
            b.write("\t\tMã KH: " + maKH + "\r\n");
            b.write("----------------------------------------------------\r\n");
            b.write(" TT  Số ngày trễ\t Tiền phạt(VNĐ)\r\n");
            b.write("----------------------------------------------------\r\n");
            b.write(" 1  \t " + ngayTre + "\t\t      " + tienPhat + "\r\n");
            b.write("----------------------------------------------------\r\n");
            b.write(String.format("Thành tiền: %,d VNĐ\r\n\r\n", tienPhat));
            b.write("Cảm ơn đã thuê sách của chúng tôi\r\n");
            b.close();
        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //Mở file txt
        Runtime run = Runtime.getRuntime();
        try {
            run.exec("notepad PhieuTienPhat.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void jbtVTC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtVTC1ActionPerformed
        this.setVisible(false);
        new MainJFrame().setVisible(true);
    }//GEN-LAST:event_jbtVTC1ActionPerformed

    private void jtbTraSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbTraSachMouseClicked
        int i = jtbTraSach.getSelectedRow();
        TableModel model = jtbTraSach.getModel();
        String maDH = model.getValueAt(i, 0).toString();
        int tinhTrang = Integer.parseInt(model.getValueAt(i, 6).toString());
        loadDaTaSach(maDH);
        if(tinhTrang == 0)
            jbtTraSach.setForeground(Color.red);
        else
            jbtTraSach.setForeground(Color.black);
    }//GEN-LAST:event_jtbTraSachMouseClicked

    private void jbtTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtTimKiemMouseClicked
        try{
            String maKH = jtfMaKH.getText();
            KhachHang kh = new KhachHang();
            if ("".equals(maKH)) {
                    JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã khách hàng!!!", "Error", JOptionPane.ERROR_MESSAGE);
                    jtfMaKH.requestFocus();
            } else if(kh.TimKH(maKH) == null){
                JOptionPane.showMessageDialog(null, "Mã khách hàng không hợp lệ!!!", "Error", JOptionPane.ERROR_MESSAGE);
                jtfMaKH.requestFocus();
            } else
                loadDaTaDH(maKH);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtTimKiemMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int result = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Thoát Khỏi Chương Trình Hay Không?", "Thông Báo", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION)
            //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            System.exit(0);
        else if(result == JOptionPane.CANCEL_OPTION)
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void jbtTraSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtTraSachMouseClicked
        if(jtbTraSach.getSelectedRow() != -1){
            int i = jtbTraSach.getSelectedRow();
            TableModel model = jtbTraSach.getModel();
            String maKH = model.getValueAt(i, 1).toString();
            int tinhTrang = Integer.parseInt(model.getValueAt(i, 6).toString());
            if(tinhTrang == 1){
                JOptionPane.showMessageDialog(null, "Sách đã trả rồi!!!", "Thông Báo", JOptionPane.DEFAULT_OPTION);
            } else{
                try {
                    int result = JOptionPane.showConfirmDialog(null, "Khách hàng trả sách???", "Thông Báo", JOptionPane.YES_NO_OPTION);
                    if (result == JOptionPane.YES_OPTION) {
                        DonHang dh = new DonHang();
                        dh.TraSach(maKH);
                        loadDaTaDH();
                        xuatPhieuTienPhat(i);
                        jbtTraSach.setForeground(Color.black);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
    }//GEN-LAST:event_jbtTraSachMouseClicked

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
            java.util.logging.Logger.getLogger(TraSachJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraSachJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraSachJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraSachJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //xuất màn hình giống form giống hệ thống trên máy
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TraSachJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(TraSachJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(TraSachJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(TraSachJFrame.class.getName()).log(Level.SEVERE, null, ex);  
                }
                new TraSachJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbtTimKiem;
    private javax.swing.JButton jbtTraSach;
    private javax.swing.JButton jbtVTC1;
    private javax.swing.JTable jtbDHSach;
    private javax.swing.JTable jtbTraSach;
    private javax.swing.JTextField jtfMaKH;
    // End of variables declaration//GEN-END:variables
}
