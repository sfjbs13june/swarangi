package com.swarangi.app.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;



import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(OperationController.class)
public class OperationControllerIntegrationTest {

        @Autowired
        private MockMvc mockmvc;

        @Test
        public void testIntegrationAdd() throws Exception{
            long a=(long) 4.0;
            long b=(long) 5.0;
            ResultActions result=mockmvc.perform(get("/add").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
            result.andExpect(status().isOk());
            String res=result.andReturn().getResponse().getContentAsString();
            System.out.println(res);
            assertEquals("9",res);
        }
        @Test
        public void testIntegrationSub() throws Exception{
            long a=(long) 10.0;
            long b=(long) 3.0;
            ResultActions result=mockmvc.perform(post("/sub").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
            result.andExpect(status().isOk());
            String res=result.andReturn().getResponse().getContentAsString();
            System.out.println(res);
            assertEquals("7",res);
        }
        @Test
        public void testIntegrationMulti() throws Exception{
            long a=(long) 5.0;
            long b=(long) 4.0;
            ResultActions result=mockmvc.perform(put("/multi").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
            result.andExpect(status().isOk());
            String res=result.andReturn().getResponse().getContentAsString();
            System.out.println(res);
            assertEquals("20",res);
        }
        @Test
        public void testIntegrationDiv() throws Exception{
            long a=(long) 15.0;
            long b=(long) 3.0;
            ResultActions result=mockmvc.perform(delete("/div").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
            result.andExpect(status().isOk());
            String res=result.andReturn().getResponse().getContentAsString();
            System.out.println(res);
            assertEquals("5",res);
        }

}
