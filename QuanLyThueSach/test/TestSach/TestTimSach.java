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
public class TestTimSach {
    Sach s = new Sach();
    /*
    2.Test chức năng tìm kiếm sách
            Test kiểu dữ liệu nhập vào
                2.1 Test kiểu dữ liệu cho Mã Sách(là số nguyên > 0)
            Test dữ liệu tìm thấy
                2.2 Kiểu dữ liệu tồn tại(--> lấy được)
                2.3 Kiểu dữ liệu không tồn tại(--> không lấy được)
    */
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
}
