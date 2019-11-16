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
public class TestThemSach {
    /*
        1. Test chức năng thêm sách
            Test kiểu dữ liệu nhập vào
                1.1 Test kiểu dữ liệu cho Tên(TenS < 50)
                1.2 Test kiểu dữ liệu cho Giá(là số nguyên, > 0)
                1.3 Test kiểu dữ liệu cho SLS(là số nguyên, > 0)
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
        boolean actual = s.ThemSach("Minh", "5000", "50");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
}
