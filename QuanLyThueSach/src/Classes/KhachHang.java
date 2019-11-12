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
    private String SDT;
    
    private Connection conn = null;
    private ConnectionData cn = null;
    private Statement st = null;
    
    //Kiem tra kieu du lieu nhap vao
    private boolean KTMaKH(String MaKH){
        if((MaKH.length() == 9) || (MaKH.length() == 12)){
            try {
                for(int i = 0; i < MaKH.length(); i++){
                    if(!Character.isDigit(MaKH.charAt(i)))
                        return false;
                }
            }
            catch (NumberFormatException ex){
                return false;
            }
        }
        return false;
    }
    private boolean KTHoTen (String HoTen){
        if(HoTen.length() > 50){
            return false;
        }   
        for(int i = 0; i < HoTen.length(); i++){
            if(!Character.isAlphabetic(HoTen.charAt(i)) && HoTen.charAt(i)!= ' '
                    && HoTen.charAt(i) != '\'')
                return false;
        }
        return true;
    }
    private boolean KTsdt(String sdt){
        if(sdt.length() == 10 && sdt.charAt(0) == '0'){
           try{
               for(int i = 0; i < sdt.length(); i++){
                   if(Character.isDigit(sdt.charAt(i)))
                       return false;
               }
           }
           catch(NumberFormatException ex){
               return false;
           }
        }
        return false;
    }
    
    //Lay thong tin
    public String getMaKH(){
        return this.MaKH;
    }
    public String getHoTen(){
        return this.HoTen;
    }
    public String getSDT(){
        return this.SDT;
    }
    
    //them thong tin khach hang
    public boolean ThemKH(String MaKH, String HoTen, String sdt) throws ClassNotFoundException{
        if(KTMaKH(MaKH) && KTHoTen(HoTen) && KTsdt(sdt)){
            //Gan gia tri;
            this.MaKH = MaKH;
            this.HoTen = HoTen;
            this.SDT = sdt;
            //Them du lieu vao csdl
            conn = ConnectionData.ConnectionTest();
            if(conn != null){
                try {
                    st = conn.createStatement();
                     //Insert
                     String sqlInsert = "INSERT INTO KhachHang(MaKH, HoTen, SDT)"
                             + " VALUES(N'" + this.MaKH +"', N'" + this.HoTen 
                             +"', N'"+ SDT +"');";
                     st.executeUpdate(sqlInsert);
                     return true;
                } catch (SQLException e) { 
                    return false;
                }
            }
        }
        return false;
    }
    public boolean capNhapKH(String MaKH, String HoTen, String sdt) 
            throws ClassNotFoundException{
        if(KTMaKH(MaKH) && KTHoTen(HoTen) && KTsdt(sdt)){
            //Cap nhap csdl
            conn = ConnectionData.ConnectionTest();
            if(conn != null&& TimKH(MaKH)!= null){
                try {
                    //Gan gia tri
                    this.MaKH = MaKH;
                    this.HoTen = HoTen;
                    this.SDT = sdt;
                    st = conn.createStatement();
                    //Update
                    String sqlUpdate = "UPDATE KhachHang set MaKH = '"+this.MaKH+
                            "', HoTen = N'"+this.HoTen+"', SDT = "+this.SDT+
                            " WHERE MaKH = "+this.MaKH+";";
                    System.out.println(sqlUpdate);
                    st.executeUpdate(sqlUpdate);
                    return true;
                } catch (SQLException e) {
                    return false;
                }
            }
        }
        return false;
    }
    //lay thông tin khách hàng
    public KhachHang TimKH(String MaKH) throws ClassNotFoundException{
        if(KTMaKH(MaKH)){
            String sqlSelect = "SELECT * FROM KhachHang Where MaKH = N'"+
                    MaKH+"';";
            conn = ConnectionData.ConnectionTest();
            
            try{
                if(conn != null){
                    st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sqlSelect);
                    rs.next();
                    this.MaKH = rs.getString(1);
                    this.HoTen = rs.getString(2);
                    this.SDT = rs.getString(3);
                    
                    return this;
                }
            }
            catch (SQLException ex){
                return null;
            }
        }
        return null;
    }
    public boolean CapNhapTHKH(String MaKH, String HoTen, String sdt) throws ClassNotFoundException{
        if(KTMaKH(MaKH) && KTHoTen(HoTen) && KTsdt(sdt)){
            if(TimKH(MaKH)!= null){
                conn = ConnectionData.ConnectionTest();
                if(conn != null){
                    try {
                        st = conn.createStatement();
                        String sqlUpdate = "UPDATE KhachHang SET HoTen =N'"+HoTen
                                +"', sdt =N'"+sdt+"' WHERE MaKH= N'" +MaKH+"';";
                        return true;
                    } catch (Exception e) {
                        return false;
                    }
                }
            }
        }
        return false;
    }
}
