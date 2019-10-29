package TestKhachHang;


import Classes.KhachHang;
import org.junit.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Quang Minh
 */
public class TestTimKH {
    KhachHang kh = new KhachHang();
 //Test cho tim kiem khach hang
    @Test
    //Test case (MaKH = '')
    public void TestTimKhachHangCase1() throws ClassNotFoundException{
        KhachHang actual = kh.TimKH("");
        KhachHang expected = null;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 'chuoi')
    public void TestTimKhachHangCase2() throws ClassNotFoundException{
        KhachHang actual = kh.TimKH("Day la chuoi");
        KhachHang expected = null;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 9 so am)
    public void TestTimKhachHangCase3() throws ClassNotFoundException{
        KhachHang actual = kh.TimKH("-123456789");
        KhachHang expected = null;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 12 so am)
    public void TestTimKhachHangCase4() throws ClassNotFoundException{
        KhachHang actual = kh.TimKH("-123456789012");
        KhachHang expected = null;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 10 so)
    public void TestTimKhachHangCase5() throws ClassNotFoundException{
        KhachHang actual = kh.TimKH("1234567890");
        KhachHang expected = null;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 9 so[Khong co trong csdl])
    public void TestTimKhachHangCase6() throws ClassNotFoundException{
        KhachHang actual = kh.TimKH("987654321");
        KhachHang expected = null;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 12 so[Khong co trong csdl])
    public void TestTimKhachHangCase7() throws ClassNotFoundException{
        KhachHang actual = kh.TimKH("987654321012");
        KhachHang expected = null;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 9 so[co trong csdl])
    public void TestTimKhachHangCase8() throws ClassNotFoundException{
        String actual = kh.TimKH("123456789").getMaKH();
        String expected = "123456789";
        
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 12 so[co trong csdl])
    public void TestTimKhachHangCase9() throws ClassNotFoundException{
        String actual = kh.TimKH("323456789012").getMaKH();
        String expected = "323456789012";
        
        Assert.assertEquals(expected, actual);
    }   
}
