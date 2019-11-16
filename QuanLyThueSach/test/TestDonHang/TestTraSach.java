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
public class TestTraSach {
    //Kiem tra tra sach
    DonHang dh = new DonHang();
    @Test
    //Test case(MaKH = "")
    public void TestTraSachCase1() throws ClassNotFoundException{
        boolean actual = dh.TraSach("");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaKH = "chuoi")
    public void TestTraSachCase2() throws ClassNotFoundException{
        boolean actual = dh.TraSach("dau la chuoi");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaKH = "-123456789")
    public void TestTraSachCase3() throws ClassNotFoundException{
        boolean actual = dh.TraSach("-123456789");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaKH = "-323456789012")
    public void TestTraSachCase4() throws ClassNotFoundException{
        boolean actual = dh.TraSach("-323456789012");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaKH = "123456789")
    public void TestTraSachCase5() throws ClassNotFoundException{
        boolean actual = dh.TraSach("123456789");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
    @Test
    //Test case(MaKH = "323456789012")
    public void TestTraSachCase6() throws ClassNotFoundException{
        boolean actual = dh.TraSach("323456789012");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
}
