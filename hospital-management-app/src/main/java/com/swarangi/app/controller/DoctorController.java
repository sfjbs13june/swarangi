package com.swarangi.app.controller;

import com.swarangi.app.model.Appointment;
import com.swarangi.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    AppointmentRepository appointmentRepository;


    @GetMapping("/doctorappointment")
    public List<Appointment> getAppointments(@RequestParam ("doctorName") String doctorName){

        return appointmentRepository.findByDoctorName(doctorName);

    }

    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){

        appointment = appointmentRepository.save(appointment);
        System.out.println("Data is Saved : " );
        return appointment;

    }

}
