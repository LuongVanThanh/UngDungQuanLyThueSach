
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Quang Minh
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestDonHang.TestTraSach.class);

        if (!result.wasSuccessful()) {
            result.getFailures().forEach((failure) -> {
                System.err.println(failure);
            });
        } else {
            System.out.println("success");
        }
    }
}