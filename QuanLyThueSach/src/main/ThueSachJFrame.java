package main;

import Classes.ConnectionData;
import Classes.DonHang;
import Classes.KhachHang;
import Classes.Sach;
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
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.omg.IOP.CodecPackage.FormatMismatch;

public class ThueSachJFrame extends javax.swing.JFrame {

    public ThueSachJFrame() {
        initComponents();
        setTitle("Thuê Sách");
        setLocation(300, 150);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/IconApp.png")));
        init();
    }
    
    public ThueSachJFrame(String maKH) {
        initComponents();
        setTitle("Thuê Sách");
        setLocation(300, 150);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/IconApp.png")));
        init();
        jtfMaKH.setText(maKH);
        jtfMaKH.setEnabled(false);
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
        jbtVTC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbSach = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfMaKH = new javax.swing.JTextField();
        jtfMaS = new javax.swing.JTextField();
        jbtXuatPhieu = new javax.swing.JButton();
        jbtThem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jlbNgayTra = new javax.swing.JLabel();
        jlbTongTien = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfSoLuong = new javax.swing.JTextField();

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
        jLabel1.setText("THUÊ SÁCH");

        jbtVTC.setBackground(new java.awt.Color(255, 255, 255));
        jbtVTC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/IconVTC.png"))); // NOI18N
        jbtVTC.setToolTipText("Quay lại giao diện chính");
        jbtVTC.setFocusable(false);
        jbtVTC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtVTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtVTCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jbtVTC, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtVTC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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
                "Mã sách", "Tên sách", "Số lượng thuê", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
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
        jtbSach.getTableHeader().setResizingAllowed(false);
        jtbSach.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtbSach);
        if (jtbSach.getColumnModel().getColumnCount() > 0) {
            jtbSach.getColumnModel().getColumn(0).setResizable(false);
            jtbSach.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtbSach.getColumnModel().getColumn(1).setResizable(false);
            jtbSach.getColumnModel().getColumn(1).setPreferredWidth(150);
            jtbSach.getColumnModel().getColumn(2).setResizable(false);
            jtbSach.getColumnModel().getColumn(2).setPreferredWidth(30);
            jtbSach.getColumnModel().getColumn(3).setResizable(false);
            jtbSach.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Mã khách hàng:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Mã sách:");

        jtfMaKH.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jtfMaS.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jbtXuatPhieu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtXuatPhieu.setText("Xuất phiếu");
        jbtXuatPhieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtXuatPhieuMouseClicked(evt);
            }
        });

        jbtThem.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtThem.setText("Thêm");
        jbtThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtThemMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Ngày trả: ");

        jlbNgayTra.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jlbTongTien.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Tổng tiền:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Số lượng:");

        jtfSoLuong.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfMaS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jtfMaKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfSoLuong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtXuatPhieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfMaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtfSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jbtThem))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jlbNgayTra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlbTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addComponent(jbtXuatPhieu)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    DonHang dh = new DonHang();
    int t = 0;
    String[] arr = {"Mã sách", "Tên sách", "Số lượng thuê", "Giá"};
    DefaultTableModel model;
    
    private void jbtVTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtVTCActionPerformed
        this.setVisible(false);
        new MainJFrame().setVisible(true);
    }//GEN-LAST:event_jbtVTCActionPerformed
    
    private void init(){
        jtbSach.removeAll();
        model = new DefaultTableModel(arr, 0);
        jtbSach.setModel(model);
        jtfMaKH.setEnabled(true);
        jtfMaKH.setText("");
        jtfMaS.setText("");
        jtfSoLuong.setText("");
        jlbNgayTra.setText("");
        jlbTongTien.setText("");
    }
    
    //thêm sách vào jtbSach
    private void themSachVaoTable(String maS, int soLM){
        try{
            TableModel model1 = jtbSach.getModel();
            Sach s = new Sach().TimSach(maS);
            int sLM = soLM;
            for (int i = 0; i < model1.getRowCount(); i++) {
                if (maS.equals(model1.getValueAt(i, 0).toString())) {
                    int sLDM = Integer.parseInt(model.getValueAt(i, 2).toString());
                    sLM += sLDM;
                    if (s.TimSach(maS) != null) {
                        if(sLM <= s.getSLS()){
                            model1.setValueAt(sLM, i, 2);
                            model1.setValueAt(sLM * s.getGia(), i, 3);
                            t += s.getGia() * soLM;
                            jlbTongTien.setText(String.format("%,.2f VNĐ", t));
                            jtfMaS.setText("");
                            jtfSoLuong.setText("");
                            jtfMaS.requestFocus();
                            return;
                        } else {
                            JOptionPane.showMessageDialog(null, "Số lượng sách không đủ!!!", "Error", JOptionPane.ERROR_MESSAGE);
                            jtfSoLuong.requestFocus();
                            return;
                        }   
                    }
                }
            }
            if(sLM <= s.getSLS()){
                Vector v = new Vector();
                v.add(maS);
                v.add(s.getTenSach());
                v.add(soLM);
                v.add(s.getGia() * soLM);
                model.addRow(v);
                jtbSach.setModel(model);
                jtfMaS.setText("");
                jtfSoLuong.setText("");
                jtfMaS.requestFocus();
                if ("".equals(jlbNgayTra.getText())) //xuất ngày trả và format dd-MM-yyyy
                    jlbNgayTra.setText(LocalDate.now().plusMonths(1).format(DateTimeFormatter.ofPattern("dd-MM-yyyy")).toString());
                t += s.getGia() * sLM;
                jlbTongTien.setText(String.format("%,d VNĐ", t));
            } else {
                JOptionPane.showMessageDialog(null, "Số lượng sách không đủ!!!", "Error", JOptionPane.ERROR_MESSAGE);
                jtfSoLuong.requestFocus();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //thêm sách từ jtbSach vào cho đối tượng dh
    private void themSachVaoDH(){
        TableModel model1 = jtbSach.getModel();
        for(int i = 0; i < model1.getRowCount(); i++){
            String maS = model1.getValueAt(i, 0).toString();
            String sLM = model1.getValueAt(i, 2).toString();
            try {
                dh.ThemSach(maS, sLM);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ThueSachJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //thêm từng cuốn sách vào bảng và add vào đối tượng dh(đơn hàng)
    private void jbtThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseClicked
        try {
            
            String maKH = jtfMaKH.getText();
            String maS = jtfMaS.getText();
            int soLM = Integer.parseInt(jtfSoLuong.getText());
            KhachHang kh = new KhachHang();
            Sach s = new Sach();
            if ("".equals(maKH)) {
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã khách hàng!!!", "Error", JOptionPane.ERROR_MESSAGE);
                jtfMaKH.requestFocus();
            } else if ("".equals(maS)) {
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã sách!!!", "Error", JOptionPane.ERROR_MESSAGE);
                jtfMaS.requestFocus();
            } else if ("".equals(jtfSoLuong.getText())) {
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập số lượng thuê!!!", "Error", JOptionPane.ERROR_MESSAGE);
                jtfSoLuong.requestFocus();
            } else if (kh.TimKH(maKH) == null) {
                JOptionPane.showMessageDialog(null, "Dữ liệu mã khách hàng không đúng!!!", "Error", JOptionPane.ERROR_MESSAGE);
                jtfMaKH.requestFocus();
            } else if(s.TimSach(maS) == null){
                JOptionPane.showMessageDialog(null, "Dữ liệu mã sách không đúng!!!", "Error", JOptionPane.ERROR_MESSAGE);
                jtfMaS.requestFocus();
            } else if(soLM <= 0){
                JOptionPane.showMessageDialog(null, "Dữ liệu số lượng không hợp lệ!!!", "Error", JOptionPane.ERROR_MESSAGE);
                jtfSoLuong.requestFocus();
            } else{
                jtfMaKH.setEnabled(false);
                themSachVaoTable(maS, soLM);
            }
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Dữ liệu số lượng hơp lệ!!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbtThemMouseClicked

    private void xuatPhieu(String maKH){
        File file = new File("PhieuThueSach.txt");
        file.delete();
        int maDH = 0;
        String tenKH = "";
        KhachHang kh = new KhachHang();
        try{
            //lấy tên khách hàng
            kh.TimKH(maKH);
            tenKH = kh.getHoTen();
            
            Connection conn = ConnectionData.ConnectionTest();
            PreparedStatement ps = conn.prepareStatement("SELECT* FROM dbo.[DonHang] WHERE MaKH = " + maKH);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //lấy mã đơn hàng
                DonHang dh = new DonHang();
                if(dh.KTTinhTrang(maKH) == false)
                    maDH = rs.getInt("MaDH");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        //Viết vào file txt
        try {
            Writer b = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("PhieuThueSach.txt"), "UTF8"));
            b.write("\t\tTÊN CỬA HÀNG THUÊ SÁCH\r\n\r\n");
            b.write("\t      590 CMT8, P.11, Q.3, TPHCM\r\n");
            b.write("\t\t   SĐT: 01212692802\r\n\r\n");
            b.write("\t\t --Phiếu Thuê sách-- " + "\r\n\r\n");
            b.write("Thời gian: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
            b.write("\t\tSố HD: " + String.valueOf(maDH) + "\r\n");
            b.write("Khách hàng: " + tenKH + "\r\n");
            b.write("----------------------------------------------------\r\n");
            b.write(" TT  Tên Sách\t\tSố lượng   Đơn giá(VNĐ)\r\n");
            b.write("----------------------------------------------------\r\n");
            int line = jtbSach.getRowCount();
            for (int i = 0; i < line; i++) {
                String s1 = String.valueOf(i+1);
                String s2 = jtbSach.getValueAt(i, 1).toString();
                //xu ly chuoi s2
                int l = s2.length();
                String temp = " ";
                if(l < 30)
                    for(int j = 1; j <= (20 - l); j++)
                        s2 = s2.concat(temp);
                String s3 = jtbSach.getValueAt(i, 2).toString();
                String s4 = jtbSach.getValueAt(i, 3).toString();
                b.write(" " + s1 + "   " + s2 + " " + s3 + "\t\t" + s4 + "\r\n");
            }
            b.write("----------------------------------------------------\r\n");
            b.write(String.format("Thành tiền: %,d VNĐ", t)+ "\r\n");
            b.write("----------------------------------------------------\r\n");
            b.write("Hạn trả: " + jlbNgayTra.getText() + "\r\n");
            b.write("----------------------------------------------------\r\n");
            b.write("Lưu ý:nếu trả trễ mỗi ngày sẽ tính tiền phạt 5.000vnđ\r\n");
            b.close();
        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //Mở file txt
        Runtime run = Runtime.getRuntime();
        try {
            run.exec("notepad PhieuThueSach.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void jbtXuatPhieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtXuatPhieuMouseClicked
        //thêm dữ liệu vào sql
        if(jtbSach.getRowCount() == 0)
            JOptionPane.showMessageDialog(null, "Dữ liệu sách thuê chưa có!!!", "Error", JOptionPane.ERROR_MESSAGE);
        else{
            try {
                themSachVaoDH();
                if(dh.ThemDonHang(jtfMaKH.getText()) == true){
                    xuatPhieu(jtfMaKH.getText());
                    init();
                }
                    
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ThueSachJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbtXuatPhieuMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int result = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Thoát Khỏi Chương Trình Hay Không?", "Thông Báo", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION)
            //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            System.exit(0);
        else if(result == JOptionPane.CANCEL_OPTION)
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(ThueSachJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThueSachJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThueSachJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThueSachJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ThueSachJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(ThueSachJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(ThueSachJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(ThueSachJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                new ThueSachJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtThem;
    private javax.swing.JButton jbtVTC;
    private javax.swing.JButton jbtXuatPhieu;
    private javax.swing.JLabel jlbNgayTra;
    private javax.swing.JLabel jlbTongTien;
    private javax.swing.JTable jtbSach;
    private javax.swing.JTextField jtfMaKH;
    private javax.swing.JTextField jtfMaS;
    private javax.swing.JTextField jtfSoLuong;
    // End of variables declaration//GEN-END:variables
}
