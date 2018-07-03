package com.example.demo;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.fail;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void MathTest() {
        double a = 5;
        double b = 2;
        double result1 = MyMath.add(a, b);
        Assert.assertEquals(7, result1, 0);
    }

}
