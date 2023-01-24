package com.swarangi.app.cotroller;

import com.swarangi.app.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {
    @GetMapping("/get/students")
    public List<Student> getStudents() {
        List listStudents = new ArrayList();
        Student student1 = new Student("jack", "01", "4th", "xyz");
        Student student2 = new Student("merry", "02", "5th", "pqr");
        Student student3 = new Student("jill", "03", "5th", "lmn");
        Student student4 = new Student("ross", "04", "9th", "jkl");
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        listStudents.add(student4);
        return listStudents;
    }
        @GetMapping("/map/students")
        public Map mapStudents(){
            Map studentMap=new HashMap<>();
            Student student1=new Student("hari","05","3rd","pqr");
            Student student2=new Student("jack","06","6th","lmn");
            Student student3=new Student("sham","09","5th","kml");

            studentMap.put(student1.getName(),student1);
            studentMap.put(student2.getName(),student2);
            studentMap.put(student3.getName(),student3);
            return studentMap;


        }
}
