
import Classes.ConnectionData;
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
public class TestConnection {
    @Test
    public void testConnect() throws ClassNotFoundException{
        boolean actual = false;
        boolean expected = true;
        if(ConnectionData.ConnectionTest() != null)    
            actual = true;
        Assert.assertEquals(expected, actual);
    }
}
