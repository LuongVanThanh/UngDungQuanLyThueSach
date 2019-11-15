/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author Quang Minh
 */
public class DonHang {
    private int MaDH;
    private String MaKH;
    private Date NgayMuon;
    private Date NgayTra;
    private int TienPhat;
    private int ThanhTien;
    private boolean TinhTrang;
    
    private Connection conn = null;
    private Statement stI = null;
    private Statement stR = null;
    
    private ArrayList<DH_Sach> arrDH_Sach = new ArrayList<>();
    private Sach S = new Sach();
    
    //Kiem tra kieu du lieu
    private boolean KTMaKH(String MaKH) throws ClassNotFoundException{
        if(MaKH.length() == 9 || MaKH.length() == 12){
            try {
                Long.parseLong(MaKH);
                KhachHang temp = new KhachHang();
                if(temp.TimKH(MaKH) != null){
                    return true;
                }
            }
            catch (NumberFormatException ex){
                return false;
            }
        }
        return false;
    }
    //Tinh tong tien khach hang phai tra
    private int TinhTien(){
        int temp = 0;
        for(int i = 0; i < arrDH_Sach.size(); i++){
            temp += arrDH_Sach.get(i).getGiaMuon();
        }
        return temp;
    }
    //Dem so luon sach muon
    private int SoSachMuon(){
        int sm = 0;
        for(int i = 0; i < arrDH_Sach.size(); i++){
            sm += arrDH_Sach.get(i).getSLM();
        }
        return sm;
    }
    //Them vao mang
    public boolean ThemSach(String MaS, String SLM) throws ClassNotFoundException{
        DH_Sach temp = new  DH_Sach();
        if(temp.ThemSach(MaS, SLM)){
            arrDH_Sach.add(temp);
            return true;
        }
        return false;
    }
    //Kiem tra TinhTrang
    public boolean KTTinhTrang(String MaKH) throws ClassNotFoundException{
        this.conn = ConnectionData.ConnectionTest();
            if(conn != null){
                try{
                    stR = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_READ_ONLY);
                    String sqlGetHoaDon = "SELECT TinhTrang From DonHang Where MaDH = "
                            + "(SELECT max(MaDH) FROM DonHang WHERE MaKH = N'"+MaKH+"');";
                    ResultSet rs = stR.executeQuery(sqlGetHoaDon);
                    rs.next();
                    if(rs.getInt("TinhTrang") != 0 ){
                        return true;
                    }
                }
                catch(SQLException ex){
                    return true;
                }
            }
        return false;    
    }
    //Them thong tin do hang
        //b1: Them thong tin DonHang
        //b2: Them thong tin vao DH_Sach
    public boolean ThemDonHang(String MaKH) throws ClassNotFoundException{
        if(KTMaKH(MaKH) && KTTinhTrang(MaKH)==true && arrDH_Sach != null){
            //gan gia tri
            this.MaKH = MaKH;
            this.NgayMuon = Date.valueOf(LocalDate.now());
            this.ThanhTien = TinhTien();
            //Luu vao csdl
            this.conn = ConnectionData.ConnectionTest();
            if(conn != null){
                try{
                    stI = conn.createStatement();
                    stR = conn.createStatement();
                    //Insert bang DonHang
                    String sqlInsert = "INSERT INTO DonHang(MaKH, NgayMuon, ThanhTien, TinhTrang) "
                            + "VALUES (N'"+this.MaKH+"', '"
                            +this.NgayMuon+ "', "+this.ThanhTien+"," +"'0'"+ ");";
                    stI.executeUpdate(sqlInsert);
                    //Lay MaDH
                    String sqlGetMaDH = "SELECT MaDH From DonHang Where MaDH = "
                            + "(SELECT max(MaDH) FROM DonHang);";
                    ResultSet rs = stR.executeQuery(sqlGetMaDH);
                    rs.next();
                    this.MaDH = rs.getInt("MaDH");
                    //Insert Bang DH_Sach
                    for(int i = 0; i < arrDH_Sach.size(); i++){
                        sqlInsert = "INSERT INTO DH_Sach(MaDH, MaS, SLM) "
                                + "VALUES("+this.MaDH+", "+arrDH_Sach.get(i).getMaS()
                                +", "+arrDH_Sach.get(i).getSLM()+");";
                        stI.executeUpdate(sqlInsert);
                        //Lay so sach co trong kho
                        String sqlgetSLS = "SELECT SLS FROM SACH WHERE MaS = "+
                                        arrDH_Sach.get(i).getMaS()+" ;";
                        rs = stR.executeQuery(sqlgetSLS);
                        rs.next();
                        int SLS = rs.getInt(1);
                        Sach temp = new Sach();
                        int soSachCon = SLS - arrDH_Sach.get(i).getSLM();
                        temp.capNhapSach(Integer.toString(arrDH_Sach.get(i).getMaS())
                                , Integer.toString(soSachCon));
                        }
                    return true;
                }
                catch(SQLException ex){
                    return false;
                }
            }
        }
        return false;
    }
    //tinh so tien phat
    private int TinhTienPhat(){
        long tempDate = this.NgayTra.getTime() - this.NgayMuon.getTime();
        tempDate = (tempDate / 86400000);
        if(tempDate > 30){
            return (int) ((tempDate-30) *5000);
        }
        return 0;
    }
    private boolean CapNhapSoSach(String maDH) throws ClassNotFoundException{
        this.conn = ConnectionData.ConnectionTest();
        if(conn != null){
            try{
                Statement st = conn.createStatement();
                String sqlGetDL = "Select * From DH_Sach Where MaDH = '"+maDH
                        + "';";
                ResultSet rs = stR.executeQuery(sqlGetDL);
                while(rs.next()){
                    String MaS = rs.getString(2);
                    String SLS = rs.getString(3);
                    S.capNhapSach(MaS,SLS);
                }
            }
            catch(ClassNotFoundException | SQLException ex){
                return false;
            }
        }
        return true;
    }
    public boolean TraSach(String MaKH) throws ClassNotFoundException{
        if(KTMaKH(MaKH) && KTTinhTrang(MaKH) != true){
            this.conn = ConnectionData.ConnectionTest();
            if(conn != null){
                try{
                    stR = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                            ResultSet.CONCUR_READ_ONLY);
                    stI = conn.createStatement();
                    //Lay MaDH
                    String sqlGetMaDH = "SELECT MaDH From DonHang Where MaDH = "
                            + "(SELECT max(MaDH) FROM DonHang WHERE MaKH = N'"+
                            MaKH+"');";
                    ResultSet rs = stR.executeQuery(sqlGetMaDH);
                    rs.next();
                    this.MaDH = rs.getInt("MaDH");
                    sqlGetMaDH = "SELECT * FROM DonHang Where MaDH = "
                            +this.MaDH+";";
                    rs = stR.executeQuery(sqlGetMaDH);
                    rs.next();
                    this.NgayMuon = rs.getDate("NgayMuon");
                    this.NgayTra = Date.valueOf(LocalDate.now());
                    this.TienPhat = TinhTienPhat();
                    String sqlUpdate = "UPDATE DonHang SET TinhTrang = 1, NgayTra = '"
                            +this.NgayTra+"', TienPhat = "+this.TienPhat 
                            +" WHERE MaDH = "+this.MaDH+";";
                    stI.executeUpdate(sqlUpdate);
                    boolean temp = CapNhapSoSach(String.valueOf(this.MaDH));
                    if(temp == false)
                        return false;
                    return true;
                }catch(SQLException ex){
                    return false;
                }
            }
        }
        return false;
    }
}
