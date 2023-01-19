package com.swarangi.app.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OperationControllerTest {
        OperationController oc=new OperationController();
        @Test
        public void testAdd(){
            long result=oc.add(5,6);
            Assertions.assertEquals(result,11);
        }

        @Test
        public void testSub(){
            long result=oc.sub(10,3);
            Assertions.assertEquals(result,7);
        }

}
