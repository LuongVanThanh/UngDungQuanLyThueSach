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
public class TestThemKH {
    /*
        1.Test them khach hang
            1.1Test du lieu dau vao
            1.2manual test kiem tra csdl da duoc ghi dung hay khong
    */
    KhachHang kh = new KhachHang();
    
//1.1Test du lieu dau vao
    @Test
    //Test case (MaKH = "chuoi")
    public void TestThemKhachHangCase1() throws ClassNotFoundException{
        boolean actual = kh.ThemKH("Day la chuoi", "Minh", "0704407256");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = "")
    public void TestThemKhachHangCase2() throws ClassNotFoundException{
        boolean actual = kh.ThemKH("", "Minh", "0704407256");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 9 so am)
    public void TestThemKhachHangCase3() throws ClassNotFoundException{
        boolean actual = kh.ThemKH("-123456789", "Minh", "0704407256");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 12 so am)
    public void TestThemKhachHangCase4() throws ClassNotFoundException{
        boolean actual = kh.ThemKH("-123456789012", "Minh", "0704407256");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 7 so)
    public void TestThemKhachHangCase5() throws ClassNotFoundException{
        boolean actual = kh.ThemKH("1234567", "Minh", "0704407256");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 9 so, Ten > 50)
    public void TestThemKhachHangCase6() throws ClassNotFoundException{
        boolean actual = kh.ThemKH("123456789", 
                "012345678901234567890123456789012345678901234567890123456789"
                , "0704407256");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 9so , Ten < 50, chu)
    public void TestThemKhachHangCase7() throws ClassNotFoundException{
        boolean actual = kh.ThemKH("123456789", "Minh", "day la chuoi");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 9so , Ten < 50, am)
    public void TestThemKhachHangCase8() throws ClassNotFoundException{
        boolean actual = kh.ThemKH("123456789", "Minh", "-10");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 9so , Ten < 50, )
    public void TestThemKhachHangCase9() throws ClassNotFoundException{
        boolean actual = kh.ThemKH("123456789", "Minh", "");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 9so , Ten < 50, 10 so)
    public void TestThemKhachHangCase10() throws ClassNotFoundException{
        boolean actual = kh.ThemKH("123456789", "Minh", "0704407256");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 9so , Ten < 50, 11 so)
    public void TestThemKhachHangCase11() throws ClassNotFoundException{
        boolean actual = kh.ThemKH("223456789", "Minh", "12345678901");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 12so , Ten < 50, chu)
    public void TestThemKhachHangCase12() throws ClassNotFoundException{
        boolean actual = kh.ThemKH("123456789012", "Minh", "day la chuoi");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 12so , Ten < 50, so am)
    public void TestThemKhachHangCase13() throws ClassNotFoundException{
        boolean actual = kh.ThemKH("123456789012", "Minh", "-12");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 12so , Ten < 50, )
    public void TestThemKhachHangCase14() throws ClassNotFoundException{
        boolean actual = kh.ThemKH("123456789012", "Minh", "");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 12so , Ten < 50, 8so)
    public void TestThemKhachHangCase15() throws ClassNotFoundException{
        boolean actual = kh.ThemKH("123456789012", "Minh", "07044072");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 12so , Ten < 50, 10so)
    public void TestThemKhachHangCase16() throws ClassNotFoundException{
        boolean actual = kh.ThemKH("323456789012", "Minh", "0704407256");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case (MaKH = 12so , Ten < 50, chu)
    public void TestThemKhachHangCase17() throws ClassNotFoundException{
        boolean actual = kh.ThemKH("423456789012", "Minh", "0704407256");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
}
