package com.swarangi.app.controller;


import com.swarangi.app.model.Appointment;
import com.swarangi.app.model.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/patient")
public class PatientController {
    @GetMapping("/myappointment")
    public List<Appointment> getMyAppointments(@RequestParam String patientName) {
        List appointment = new ArrayList();
        Appointment appointment1 = new Appointment("234","Rekha","Amit","14th Feb");
        appointment.add(appointment1);
        return appointment;
    }

    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment) {
        System.out.println(appointment);
        return appointment;
    }

    @GetMapping("/map/patient")
    public Map mapPatient()
    {
        Map mapPatient = new HashMap();
        Prescription prescription1 = new Prescription("104","111","Asthama","Rekha","Amit");
        mapPatient.put(prescription1.getPatientName(),prescription1);
        return mapPatient;
    }
}