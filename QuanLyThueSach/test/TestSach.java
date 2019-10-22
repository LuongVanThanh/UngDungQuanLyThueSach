
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
public class TestSach {
    /*
        1. Test chức năng thêm sách
            Test kiểu dữ liệu nhập vào
                1.1 Test kiểu dữ liệu cho Tên(TenS < 50)
                1.2 Test kiểu dữ liệu cho Giá(là số nguyên, > 0)
                1.3 Test kiểu dữ liệu cho SLS(là số nguyên, > 0)
            Kiểm tra CSDL đã đc nhập đúng hay chưa manual test
    
        2.Test chức năng tìm kiếm sách
            Test kiểu dữ liệu nhập vào
                2.1 Test kiểu dữ liệu cho Mã Sách(là số nguyên > 0)
            Test dữ liệu tìm thấy
                2.2 Kiểu dữ liệu tồn tại(--> lấy được)
                2.3 Kiểu dữ liệu không tồn tại(--> không lấy được)
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
    Sach s = new Sach();
    
//Them Sách --> Kiểm tra dữ liệu vào

    @Test
    //test case (50 ki tự, 1000, 1000) --> fail
    public void TestThemSachCase1() throws ClassNotFoundException{
        boolean actual = s.ThemSach("01234567890123456789012345678901234567890123456789"
                , "1000", "1000");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //test case ("Minh", kí tự, 1000)-->fail
    public void TestThemSachCase2() throws ClassNotFoundException{
        boolean actual = s.ThemSach("Minh", "day la ki tu", "1000");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //test case("Minh", -5, 1000)-->fail
    public void TestThemSachCase3() throws ClassNotFoundException{
        boolean actual = s.ThemSach("Minh", "-5", "1000");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //test case("Minh", 5, kí tự)-->fail
    public void TestThemSachCase4() throws ClassNotFoundException{
        boolean actual = s.ThemSach("Minh", "5", "day la ki tu");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //test case("Minh", 5, -5)--> fail
    public void TestThemSachCase5() throws ClassNotFoundException{
        boolean actual = s.ThemSach("Minh", "day la ki tu", "-5");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //test case("Minh", 5, -5)-->pass
    public void TestThemSachCase6() throws ClassNotFoundException{
        boolean actual = s.ThemSach("Minh", "5", "5");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
    
//Tim sach kiem tra du lieu vao
    
    @Test
    //test case(Chuoi)-->fail
    public void TestTimSachCase1() throws ClassNotFoundException{
        Sach actual = s.TimSach("Day la mot chuoi");
        Sach expected = null;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(-5)-->fail
    public void TestTimSachCase2() throws ClassNotFoundException{
        Sach actual = s.TimSach("-5");
        Sach expected = null;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case('')--> fail
    public void TestTimSachCase3() throws ClassNotFoundException{
        Sach actual = s.TimSach("");
        Sach expected = null;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(0)-->fail
    public void TestTimSachCase4() throws ClassNotFoundException{
        Sach actual = s.TimSach("0");
        Sach expected = null;
        Assert.assertEquals(expected, actual);
    }
    
    //Test kieu du lieu hop le
    @Test
    //Test case(100)-->fail[Do khong tim thay ma sach]
    public void TestTimSachCase5() throws ClassNotFoundException{
        Sach actual = s.TimSach("100");
        Sach expected = null;
        Assert.assertEquals(expected, actual);
    }
    //Test case(1)-->pass
    public void TestTimSachCase6() throws ClassNotFoundException{
        boolean actual = false;
        boolean expected = true;
        if(s.TimSach("1") != null)
            actual = true;
        Assert.assertEquals(expected, actual);
    }
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
        boolean actual = s.capNhapSach("1", "Minh", "5", "7");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
}
