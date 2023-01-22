package com.swarangi.app.service;

import com.swarangi.app.model.Patient;
import org.springframework.stereotype.Component;

@Component
public class PatientService {

    public Patient updateDetails(Patient patient,String disease,String age){
        patient.setDisease(disease);
        patient.setAge(age);
        return patient;
    }
}
