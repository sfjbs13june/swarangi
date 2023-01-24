package com.swarangi.app;

import com.swarangi.app.cotroller.StudentController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class StudentControlllerTest {
    StudentController studentControlller=new StudentController();

    @Test
    public void testGetStudents(){
        int expectedSize=4;
        List result= studentControlller.getStudents();
        Assertions.assertEquals(expectedSize,result.size());
    }
    @Test
    public void testMapStudent(){
       int expectedsize=3;

        Map result=studentControlller.mapStudents();
        Assertions.assertEquals(expectedsize,result.size());
    }
}
