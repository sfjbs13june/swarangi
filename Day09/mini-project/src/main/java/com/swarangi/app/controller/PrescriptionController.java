package com.swarangi.app.controller;

import com.swarangi.app.model.Appointment;
import com.swarangi.app.model.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/Prescription")
public class PrescriptionController
{
    @GetMapping("/viewprescription")
    public List<Prescription> getAllPrescriptions(@RequestParam String patientName){
        List appointment = new ArrayList();
        Prescription prescription1 = new Prescription("104","111","Asthama","Rekha","Amit");
        appointment.add(prescription1);
        return appointment;
    }

    @PostMapping("/saveprescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){
        System.out.println(prescription);
        return prescription;
    }

    @GetMapping("/Map/prescription")
    public Map MapPrescription()
    {
        Map MapPrescription = new HashMap();
        Prescription prescription1 = new Prescription("104","111","Asthama","Rekha","Amit");
        MapPrescription.put(prescription1.getPrescriptionId(),prescription1);
        return MapPrescription;
    }
}
