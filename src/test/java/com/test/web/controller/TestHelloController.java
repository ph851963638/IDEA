package com.test.web.controller;

import com.test.controller.HelloController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestHelloController {
    HelloController helloController=null;
    @Before
    public void setup(){
        helloController= new HelloController();

    }
   @Test
    public void hello(){
     String strHello=helloController.hello();
       System.out.println(strHello);
       Assert.assertTrue(strHello.equals("hello,World"));


   }


}
