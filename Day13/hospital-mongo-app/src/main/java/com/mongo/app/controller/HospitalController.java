package com.mongo.app.controller;

import com.mongo.app.model.Hospital;
import com.mongo.app.repository.HospitalRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class HospitalController {
    @Autowired
    HospitalRespository hospitalRespository;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Hospital create(@RequestBody Hospital student) {
        student = hospitalRespository.save(student);
        return student;
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public List<Hospital> readStudent() {
        return hospitalRespository.findAll();
    }

    @RequestMapping(value = "/read/{name}", method = RequestMethod.GET)
    public Hospital readByNameStudent(@PathVariable("name") String name) {
        return hospitalRespository.findByName(name);
    }
}
