package com.swarangi.app.controller;

import com.swarangi.app.model.Prescription;
import com.swarangi.app.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {
    @Autowired
    PrescriptionRepository prescriptionRepository;
    @GetMapping("/viewprescription")
    public List<Prescription> getAllPrescriptions(){
        return prescriptionRepository.findAll();
    }
    @PostMapping("/saveprescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){
        prescription = prescriptionRepository.save(prescription);
        System.out.println("Data is Saved : " );
        return prescription;
    }
}
