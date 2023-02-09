package com.mongo.app.controller;

import com.mongo.app.model.Patient;
import com.mongo.app.repository.PatientRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientRespository patientRespository;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Patient create(@RequestBody  Patient patient) {
        patient = patientRespository.save(patient);
        return patient;
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public List<Patient> readStudent() {
        return patientRespository.findAll();
    }

    @RequestMapping(value = "/read/{name}", method = RequestMethod.GET)
    public Patient readByNameStudent(@PathVariable("name") String name) {
        return patientRespository.findByName(name);
    }
}
