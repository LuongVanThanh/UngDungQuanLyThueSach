
import static org.junit.Assert.*;
import org.junit.Test;
import static main.ThemKHJPanel.chuanHoaChuoi;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class testChuanHoaChuoi {
    //chuỗi có số
    @Test
    public void test1(){
        String actual = chuanHoaChuoi("   1t 32d  ");
        String expected ="1t 32d";
        assertEquals(expected, actual);
    }
    
    //chuỗi có kí tự đặt biệt
    @Test
    public void test2(){
        String actual = chuanHoaChuoi("   .t .d  ");
        String expected =".t .d";
        assertEquals(expected, actual);
    }
    
    @Test
    public void test3(){
        String actual = chuanHoaChuoi("   thAnh hoAI  ");
        String excepted = "Thanh Hoai";
        assertEquals(excepted, actual);
    }
    
    @Test
    public void test4(){
        String actual = chuanHoaChuoi("Thanh Hoai");
        String excepted = "Thanh Hoai";
        assertEquals(excepted, actual);
    }
    
    @Test
    public void test5(){
        String actual = chuanHoaChuoi("    thanH HoaI  ");
        String excepted = "Thanh Hoai";
        assertEquals(excepted, actual);
    }
    
    @Test
    public void test6(){
        String actual = chuanHoaChuoi("    THANH      HOAI   IT     TA  ");
        String excepted = "Thanh Hoai It Ta";
        assertEquals(excepted, actual);
    }
    
    
}


