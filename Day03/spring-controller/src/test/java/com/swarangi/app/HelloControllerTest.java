package com.swarangi.app;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.util.AssertionErrors;



public class HelloControllerTest {
    HelloController helloController=new HelloController();
    @Test

    public void testSayHello(){
        String expectedResult = "Hello from App";
        String result=helloController.SayHello();
        Assert.assertEquals(expectedResult,result);
    }

    @Test

    public void testrequestHello(){
        String expectedResult = "Hello from Request mapping";
        String result=helloController.requestHello();
        Assert.assertEquals(expectedResult,result);
    }

}
