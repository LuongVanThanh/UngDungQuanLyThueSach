/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDonHang;

import Classes.DH_Sach;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Quang Minh
 */
public class TestThemSach {
    DH_Sach dh = new DH_Sach();
    
    //Them sach vao de co the luu vao bang DH-Sach
    /*
        1.Ma Sach la so nguyen > 0, va phai co du lieu trong ban sach
        2.So luong muon la so sach muon mot lan, phai la so nguyen > 0 va phai
    nho hon hoac bang so sach co trong kho
    */
    @Test
    //Test case('ki tu', 1)
    public void TestThemSachVaoMangCase1() throws ClassNotFoundException{
        boolean actual = dh.ThemSach("day la ki tu", "1");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case('', 1)
    public void TestThemSachVaoMangCase2() throws ClassNotFoundException{
        boolean actual = dh.ThemSach("", "1");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(-5, 1)
    public void TestThemSachVaoMangCase3() throws ClassNotFoundException{
        boolean actual = dh.ThemSach("-5", "1");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(0, 1)
    public void TestThemSachVaoMangCase4() throws ClassNotFoundException{
        boolean actual = dh.ThemSach("0", "1");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(1, 100)
    public void TestThemSachVaoMangCase5() throws ClassNotFoundException{
        boolean actual = dh.ThemSach("1", "100");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(1, 1)
    public void TestThemSachVaoMangCase6() throws ClassNotFoundException{
        boolean actual = dh.ThemSach("1", "1");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(1,'ki tu')
    public void TestThemSachVaoMangCase7() throws ClassNotFoundException{
        boolean actual = dh.ThemSach("1", "day la ki tu");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(1,'')
    public void TestThemSachVaoMangCase8() throws ClassNotFoundException{
        boolean actual = dh.ThemSach("1", "");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(1,-5)
    public void TestThemSachVaoMangCase9() throws ClassNotFoundException{
        boolean actual = dh.ThemSach("1", "-5");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(1,0)
    public void TestThemSachVaoMangCase10() throws ClassNotFoundException{
        boolean actual = dh.ThemSach("1", "0");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(1,7)(7 so sach muon vuot qua 5)
    public void TestThemSachVaoMangCase11() throws ClassNotFoundException{
        boolean actual = dh.ThemSach("1", "7");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(100,1)
    public void TestThemSachVaoMangCase12() throws ClassNotFoundException{
        boolean actual = dh.ThemSach("100", "1");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }    
}
