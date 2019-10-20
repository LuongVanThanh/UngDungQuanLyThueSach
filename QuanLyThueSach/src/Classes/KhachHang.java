/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Quang Minh
 */
public class KhachHang {
    private String MaKH;
    private String HoTen;
    private int SDT;
    
    private Connection conn = null;
    private ConnectionData cn = null;
    private Statement st = null;
    
    //Kiem tra kieu du lieu nhap vao
    private boolean KTMaKH(String MaKH){
        if(MaKH.length() == 9 || MaKH.length() == 12){
            try {
                Integer.parseInt(MaKH);
                return true;
            }
            catch (NumberFormatException ex){
                return false;
            }
        }
        return false;
    }
    private boolean KTHoTen (String HoTen){
        if(HoTen.length() > 50 || HoTen == ""){
            return false;
        }
        return true;
    }
    private boolean KTsdt(String sdt){
        if(sdt.length() >9 && sdt.length() < 12){
           try{
               Integer.parseInt(sdt);
               return true;
           }
           catch(NumberFormatException ex){
               return false;
           }
        }
        return false;
    }
    
    //them thong tin khach hang
    public boolean ThemKH(String MaKH, String HoTen, String sdt){
        if(KTMaKH(MaKH) && KTHoTen(HoTen) && KTsdt(sdt)){
            //Gan gia tri;
            this.MaKH = MaKH;
            this.HoTen = HoTen;
            this.SDT = Integer.parseInt(sdt);
            //Them du lieu vao csdl
            conn = ConnectionData.ConnectionTest();
            if(conn != null){
                try {
                    st = conn.createStatement();
                     //Insert
                     String sqlInsert = "INSERT INTO KhachHang(MaKH, HoTen, SDT)"
                             + " VALUES(N'" + this.MaKH +"', " + this.HoTen +", "+ this.SDT +")";
                     st.executeUpdate(sqlInsert);
                     return true;
                } catch (SQLException e) { 
                    return false;
                }
            }
        }
        return false;
    }
    
    //lay thông tin khách hàng
    public KhachHang TimKH(String MaKH){
        if(KTMaKH(MaKH)){
            String sqlSelect = "SELECT * FROM KhachHang "
                    + "Where MaKH = " + Integer.parseInt(MaKH) + " ;";
            conn = ConnectionData.ConnectionTest();
            if(conn != null){
                try{
                    st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_READ_ONLY);
                    ResultSet rs = st.executeQuery(sqlSelect);
                    this.MaKH = rs.getString("MaKH");
                    this.HoTen = rs.getString("HoTen");
                    this.SDT = rs.getInt("SDT");
                    return this;
                }
                catch(Exception ex){
                    return null;
                }
            }
        }
        return null;
    }
}
