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

class DH_Sach{
    private Sach sach = new Sach();
    private int SLM;
    private int GiaMuon;
            
    
    private boolean KTSach(String MaS) throws ClassNotFoundException{
        if(MaS != ""){
            try {
                Integer.parseInt(MaS);
                sach = sach.TimSach(MaS);
                if(sach != null)
                    return true;
            } catch (NumberFormatException e) {
                 return false;
            }
        }
        return false;
    }
    private boolean KTSLM(String SLM){
        if(SLM != ""){
            try {
                int t =Integer.parseInt(SLM);
                if(t < sach.getSLS()){
                    return true;
                }
            } catch (NumberFormatException e) {
                 return false;
            }
        }
        return false;
    }
    
    public boolean ThemSach(String MaS, String SLM) throws ClassNotFoundException{
        if(KTSach(MaS) && KTSLM(SLM)){
            this.sach = this.sach.TimSach(MaS);
            this.SLM = Integer.parseInt(SLM);
            this.GiaMuon = this.sach.getGia() * this.SLM;
            return true;
        }
        return false;
    }
    //Lay thong tin de luu vao csdl
    public Sach getMaS(){
        return this.sach;
    }
    public int getSLM(){
        return this.getSLM();
    }
    public int getGiaMuon(){
        return this.GiaMuon;
    }
}

public class DonHang {
    private int MaDH;
    private String MaKH;
    private Date NgayTra;
    private int ThanhTien;
    private boolean TinhTrang;
    
    private Connection conn = null;
    private Statement stI = null;
    private Statement stR = null;
    
    private ArrayList<DH_Sach> arrDH_Sach = new ArrayList<>();
    
    //Kiem tra kieu du lieu
    private boolean KTMaKH(String MaKH) throws ClassNotFoundException{
        if(MaKH.length() == 9 || MaKH.length() == 12){
            try {
                Integer.parseInt(MaKH);
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
    //Thiet lap ngay tra sach
    private void ThietLapNgayTra(){
        LocalDate temp = LocalDate.now();
        temp = temp.plusMonths(1);
        this.NgayTra = Date.valueOf(temp);
    }
    //Tinh tong tien khach hang phai tra
    private int TinhTien(){
        int temp = 0;
        for(int i = 0; i < arrDH_Sach.size(); i++){
            temp += arrDH_Sach.get(i).getGiaMuon();
        }
        return temp;
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
    public boolean KTTinhTrang() throws ClassNotFoundException{
        this.conn = ConnectionData.ConnectionTest();
            if(conn != null){
                try{
                    stR = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_READ_ONLY);
                    String sqlGetHoaDon = "SELECT * FROM DonHang "
                            + "WHERE MaKH = '"+MaKH+"' ;";
                    ResultSet rs = stR.executeQuery(sqlGetHoaDon);
                    rs.last();
                    if(rs.getBoolean("TinhTrang") == true ){
                        return true;
                    }
                }
                catch(SQLException ex){
                    return false;
                }
            }
        return false;    
    }
    //Them thong tin do hang
        //b1: Them thong tin DonHang
        //b2: Them thong tin vao DH_Sach
    public boolean ThemDonHang(String MaKH) throws SQLException, ClassNotFoundException{
        if(KTMaKH(MaKH) && KTTinhTrang() && arrDH_Sach != null){
            //gan gia tri
            this.MaKH = MaKH;
            ThietLapNgayTra();
            this.ThanhTien = TinhTien();
            //Luu vao csdl
            this.conn = ConnectionData.ConnectionTest();
            if(conn != null){
                try{
                    stI = conn.createStatement();
                    stR = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                            ResultSet.CONCUR_READ_ONLY);
                    //Insert bang DonHang
                    String sqlInsert = "INSERT INTO DonHang(MaKH, NgayTra, ThanhTien) "
                            + "VALUES ('"+this.MaKH+"', "+this.NgayTra+", "+this.ThanhTien+");";
                    
                    stI.executeUpdate(sqlInsert);
                    //Lay MaDH
                    String sqlGetMaDH = "SELECT MaDH FROM DonHang";
                    ResultSet rs = stR.executeQuery(sqlGetMaDH);
                    rs.last();
                    this.MaDH = rs.getInt("MaDH");
                    //Insert Bang DH_Sach
                    for(int i = 0; i < arrDH_Sach.size(); i++){
                        sqlInsert = "INSERT INTO DH_Sach(MaDH, MaS, SLM) "
                                + "VALUES('"+this.MaKH+"', "+arrDH_Sach.get(i).getMaS()+", "+arrDH_Sach.get(i).getSLM()+")";
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
    //Tra sach
    public boolean TraSach(String MaKH) throws ClassNotFoundException{
        if(KTMaKH(MaKH) && KTTinhTrang() != true){
            this.conn = ConnectionData.ConnectionTest();
            if(conn != null){
                try{
                    stR = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                            ResultSet.CONCUR_READ_ONLY);
                    stI = conn.createStatement();
                    //Lay MaDH
                    String sqlGetMaDH = "SELECT MaDH FROM DonHang";
                    ResultSet rs = stR.executeQuery(sqlGetMaDH);
                    rs.last();
                    this.MaDH = rs.getInt("MaDH");
                    String sqlUpdate = "UPDATE DonHang SET TinhTrang= 'True', "
                            + "WHERE MaDH ='"+this.MaKH+"'";
                    stI.executeUpdate(sqlUpdate);
                }catch(Exception ex){
                    return false;
                }
            }
        }
        return false;
    }
}
