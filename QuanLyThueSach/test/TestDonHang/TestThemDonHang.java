/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDonHang;

import Classes.DonHang;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Quang Minh
 */
public class TestThemDonHang {
    DonHang dh = new DonHang();
    //Kiem tra them don hang
        //Moi don hang them 3 cuon sach --> Them vao don hang
    @Test
    //Test case("Chuoi")
    public void TestThemDonHangCase1() throws ClassNotFoundException{
        dh.ThemSach("1", "1");
        boolean actual = dh.ThemDonHang("day la chuoi");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case("")
    public void TestThemDonHangCase2() throws ClassNotFoundException{
        dh.ThemSach("1", "1");
        boolean actual = dh.ThemDonHang("");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case("-5")
    public void TestThemDonHangCase3() throws ClassNotFoundException{
        dh.ThemSach("1", "1");
        boolean actual = dh.ThemDonHang("-5");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case("0")
    public void TestThemDonHangCase4() throws ClassNotFoundException{
        dh.ThemSach("1", "1");
        boolean actual = dh.ThemDonHang("0");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case("7")
    public void TestThemDonHangCase5() throws ClassNotFoundException{
        dh.ThemSach("1", "1");
        boolean actual = dh.ThemDonHang("7");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(9 so)
    public void TestThemDonHangCase6() throws ClassNotFoundException{
        dh.ThemSach("1", "1");
        boolean actual = dh.ThemDonHang("123456789");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(12 so)
    public void TestThemDonHangCase7() throws ClassNotFoundException{
        dh.ThemSach("1", "5");
        boolean actual = dh.ThemDonHang("323456789012");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
}
