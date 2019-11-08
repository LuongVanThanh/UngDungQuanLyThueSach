package TestSach;


import Classes.Sach;
import junit.framework.Assert;
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
public class TestCapNhapSach {
    Sach s = new Sach();
    /*
    3.Test cập nhập sách
            Test kiểu dữ liệu nhập vào
                3.1 Test kiểu dữ liệu cho Tên(TenS < 50)
                3.2 Test kiểu dữ liệu cho Giá(là số nguyên, > 0)
                3.3 Test kiểu dữ liệu cho SLS(là số nguyên, > 0)
                3.4 Test kiểu dữ liệu cho Mã Sách(là số nguyên > 0)
            Test dữ liệu tìm thấy
                3.5 Kiểu dữ liệu tồn tại(--> lấy được)
                3.6 Kiểu dữ liệu không tồn tại(--> không lấy được)
            Kiểm tra CSDL đã đc nhập đúng hay chưa manual test
    */
    //Test cap nhap sach
    
    @Test
    //Test case(MaS ="chuoi")--> fail
    public void TestCapNhapSachCase1() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("day la chuoi", "Minh", "1000", "1000");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS < 0)-->fail
    public void TestCapNhapSachCase2() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("-5", "Minh", "1000", "1000");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS = 0)-->fail
    public void TestCapNhapSachCase3() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("0", "Minh", "1000", "1000");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS = 100)-->fail
    public void TestCapNhapSachCase4() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("100", "Minh", "1000", "7");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS = 1, ten > 50)-->fail
    public void TestCapNhapSachCase5() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("1"
                , "012345678901234567890123456789012345678901234567890", "1000", "1000");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS = 1, Ten ="Minh", gia = chuoi)-->fail
    public void TestCapNhapSachCase6() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("1", "Minh", "day la chuoi", "1000");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS = 1, ten ="Minh", gia = 0)-->fail
    public void TestCapNhapSachCase7() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("1", "Minh", "0", "1000");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS = 1, ten = Minh, gia = -5)-->fail
    public void TestCapNhapSachCase8() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("1", "Minh", "-5", "1000");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS = 1, ten = Minh, gia = 5, SLS = chuoi)-->fail
    public void TestCapNhapSachCase9() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("1", "Minh", "5", "day la chuoi");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS = 1, ten = Minh, gia = 5, SLS = - 5)-->fail
    public void TestCapNhapSachCase10() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("1", "Minh", "5", "-5");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS = 1, ten = Minh, gia = 5, SLS = 0)-->fail
    public void TestCapNhapSachCase11() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("1", "Minh", "5", "0");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS = 1, ten = Minh, gia = 5, SLS = 1)-->true
    public void TestCapNhapSachCase12() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("1", "Minh", "5000", "70");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS ="chuoi")--> fail
    public void TestCapNhapSachCase13() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("day la chuoi","1");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS < 0)-->fail
    public void TestCapNhapSachCase14() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("-5", "1");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS = 0)-->fail
    public void TestCapNhapSachCase15() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("0","1");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS = 100)-->fail
    public void TestCapNhapSachCase16() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("100", "1");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS = 1, SLS = '')
    public void TestCapNhapSachCase17() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("1", "");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS = 1, SLS = 'Chuoi')
    public void TestCapNhapSachCase18() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("1", "day la chuoi");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS = 1, SLS = '-5')
    public void TestCapNhapSachCase19() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("1", "-5");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS = 1, SLS = '0')
    public void TestCapNhapSachCase20() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("1", "0");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaS = 1, SLS = 1)
    public void TestCapNhapSachCase21() throws ClassNotFoundException{
        boolean actual = s.capNhapSach("1", "60");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
}
