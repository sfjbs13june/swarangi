package com.swarangi.app.controller;

import com.swarangi.app.model.Appointment;
import com.swarangi.app.model.Prescription;
import com.swarangi.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    AppointmentRepository appointmentRepository;

    Prescription pres;
    @GetMapping("/doctorappointment")
    public List<Appointment> getAppointments(@RequestParam ("doctorName") String doctorName){

//        List listDoctors=new ArrayList();
//        Appointment appointment1=new Appointment("101","pat1","doc1","5th feb",pres);
//        Appointment appointment2=new Appointment("102","pat2","doc2","7th feb",pres);
//
//        listDoctors.add(appointment1);
//        listDoctors.add(appointment2);
//        //return listDoctors;
        return appointmentRepository.findByDoctorName(doctorName);

    }

    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){

        appointment = appointmentRepository.save(appointment);
        System.out.println("Data is Saved : " );
        return appointment;

    }

}
