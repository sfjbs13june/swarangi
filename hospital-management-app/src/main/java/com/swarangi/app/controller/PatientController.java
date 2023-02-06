package com.swarangi.app.controller;

import com.swarangi.app.model.Appointment;
import com.swarangi.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/patient")
public class PatientController {

    @Autowired
    AppointmentRepository appointmentRepository;
    @GetMapping("/myappointment")
    public List<Appointment> getMyAppointments(@RequestParam String patientName){

    }
    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){

    }
}
