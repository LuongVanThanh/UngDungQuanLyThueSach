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

public class Sach {
    private int MaS;
    private String Ten;
    private int Gia;
    private int SLS;
    
    private ConnectionData cn = null;
    private Connection conn = null;
    private Statement st = null;
    
    //Kiểm tra dữ liệu vào
    private boolean KTTen(String t){
        if(t.length() < 50){
            return true;
        }
        return false;
    }
    private boolean KTGia(String g){
        if(g != ""){
            try {
                if(Integer.parseInt(g) > 0)
                    return true;
            } catch (NumberFormatException e) {
                 return false;
            }
        }
        return false;
    }
    private boolean KTSLS(String g){
        if(g != ""){
            try {
                if(Integer.parseInt(g) > 0)
                    return true;
            } catch (NumberFormatException e) {
                 return false;
            }
        }
        return false;
    }
    private boolean KTMaS(String MaS){
        if(MaS != ""){
            try {
                if(Integer.parseInt(MaS) > 0)
                    return true;
            } catch (NumberFormatException e) {
                 return false;
            }
        }
        return false;
    }
    
    //Lay thong tin
    public int getMaS(){
        return this.MaS;
    }
    public String getTenSach(){
        return this.Ten;
    }
    public int getGia(){
        return this.Gia;
    }
    public int getSLS(){
        return this.SLS;
    }
    
    //Them sach
    public boolean ThemSach(String Ten, String Gia, String SLS) throws ClassNotFoundException{
        if(KTTen(Ten)&&KTGia(Gia)&&KTSLS(SLS)){
            //Gan gia tri
            this.Ten = Ten;
            this.Gia = Integer.parseInt(Gia);
            this.SLS = Integer.parseInt(SLS);
            //Them du lieu vao csdl
            conn = ConnectionData.ConnectionTest();
            if(conn != null){
                try{
                    st = conn.createStatement();
                    //Insert
                    String sqlInsert = "INSERT INTO Sach(TenSach, GiaSach, SLS)"
                            + " VALUES (N'" + this.Ten +"', " + this.Gia + ", "+ this.SLS +");";
                    st.executeUpdate(sqlInsert);
                    return true;
                }catch(SQLException ex){
                    return false;   
                }
            }
        }
        return false;
    }

    //Cập nhập thông tin cho sách
    public boolean capNhapSach(String MaS, String Ten, String Gia, String SLS) 
            throws ClassNotFoundException{
        if(KTMaS(MaS) && KTTen(Ten) && KTGia(Gia) && KTSLS(SLS)){
            //Cap nhap csdl
            conn = ConnectionData.ConnectionTest();
            if(conn != null&& TimSach(MaS)!= null){
                try {
                    //Gan gia tri
                    this.MaS = Integer.parseInt(MaS);
                    this.Ten = Ten;
                    this.Gia = Integer.parseInt(Gia);
                    this.SLS = Integer.parseInt(SLS);
                    st = conn.createStatement();
                    //Update
                    String sqlUpdate = "UPDATE Sach set TenSach = N'"+this.Ten+
                            "', GiaSach = "+this.Gia+", SLS = "+this.SLS+
                            " WHERE MaS = "+this.MaS+";";
                    st.executeUpdate(sqlUpdate);
                    return true;
                } catch (SQLException e) {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean capNhapSach(String MaS, String SLS) throws ClassNotFoundException{
        if(KTMaS(MaS) && KTSLS(SLS)){
            //Gan gia tri
            this.MaS = Integer.parseInt(MaS);
            this.SLS = Integer.parseInt(SLS);
            //Cap nhap csdl
            conn = ConnectionData.ConnectionTest();
            if(conn != null&& TimSach(MaS)!= null){
                try {
                    //Gan gia tri
                    this.SLS = Integer.parseInt(SLS);
                    st = conn.createStatement();
                    //Update
                    String sqlUpdate = "UPDATE Sach set SLS = "+this.SLS+
                            " WHERE MaS = "+this.MaS+";";
                    st.executeUpdate(sqlUpdate);
                    return true;
                } catch (SQLException e) {
                    return false;
                }
            }
        }
        return false;
    }
    //Tim kiem sach
    public Sach TimSach(String MaS) throws ClassNotFoundException{
        if(KTMaS(MaS)){
            String sqlSelect = "SELECT * FROM Sach"
                    + " WHERE MaS = " + Integer.parseInt(MaS) +" ;";
            conn = ConnectionData.ConnectionTest();
            try{
                if(conn != null){
                    st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sqlSelect);
                    rs.next();
                    this.MaS = rs.getInt("MaS");
                    this.Ten = rs.getString("TenSach");
                    this.Gia = rs.getInt("GiaSach");
                    this.SLS = rs.getInt("SLS");
                
                    return this;
                }
            }
            catch(SQLException ex){
                return null; 
            }
        }
        return null;
    }
}