package com.swarangi.app.controller;

import com.swarangi.app.exception.*;
import com.swarangi.app.exception.AgeNotFoundException;
import com.swarangi.app.exception.PatientNotFoundException;
import com.swarangi.app.model.Patient;
import com.swarangi.app.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController
{
    @Autowired
    PatientService patientService;
    @PostMapping("/patient/save")
    public Patient savePatient(@RequestBody Patient patient) throws PatientNotFoundException, NameNotFoundException, AgeNotFoundException, GenderNotFoundException, DiseaseNotFoundException {
        if(patient.getId()==null)
        {
            throw new PatientNotFoundException("There is no patient available");
        }
        if(patient.getName()==null)
        {
            throw new NameNotFoundException("There is not Patient name here.");
        }
        if(patient.getAge()==null)
        {
            throw new AgeNotFoundException("Patient age is not found.");
        }
        if(patient.getGender()==null)
        {
            throw new GenderNotFoundException("Patient Gender is not found");
        }
        if(patient.getDisease()==null)
        {
            throw new DiseaseNotFoundException("Patient disease is not found.");
        }
        System.out.println(patient);
        return patient;
    }
    @PutMapping("/patient/update")
    public Patient updatePatient(@RequestBody Patient patient,@RequestParam("disease") String disease,@RequestParam("age") String age)
    {
        return patientService.updateDetails(patient,disease,age);
    }
}
