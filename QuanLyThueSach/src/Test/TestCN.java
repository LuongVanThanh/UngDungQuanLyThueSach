/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import main.Sach;
import main.KhachHang;
import main.DonHang;
import main.ConnectionData;

/**
 *
 * @author Quang Minh
 */
public class TestCN {
    
    public static void main(String[] args){
        KhachHang kh = new KhachHang();
        Sach s = new Sach();
        DonHang dh = new DonHang();
        
        
        //Kien tra ket noi voi csdl
        if(ConnectionData.ConnectionTest() != null)
            System.out.println("Ket noi CSDL thanh cong");
        else
            System.out.println("Ket noi CSDL that bai");
    //Kiem tra khach hang
        //1.Kiem tra them khach hang
        if(kh.ThemKH("191904574", "Nguyen Cong Quang Minh", "0704407256"))
            System.out.println("Them Khach Hang thanh cong");
        else
            System.out.println("Them Khach Hang that bai");
        //2.Kiem tra tim khach hang
        if(kh.TimKH("191904574")!= null)
            System.out.println("Tim khach hang thanh cong");
        else
            System.out.println("Tim Khach Hang that bai");
    //Kiem tra Sach
        //1.Kiem tra them sach
        //2.Kiem tra tim sach
        //3.Kiem tra cap nhap sach
    }
}
