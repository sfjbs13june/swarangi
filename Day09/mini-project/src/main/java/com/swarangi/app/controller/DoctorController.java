package com.swarangi.app.controller;

import com.swarangi.app.model.Appointment;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/doctor")
public class DoctorController {

    @GetMapping("/doctorappointment")
    public List<Appointment> getAppointments(){

        List appointment=new ArrayList();
    Appointment appointment1=new Appointment("123","jack","rose","12th feb");
        appointment.add(appointment1);
        return appointment;
    }
    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        System.out.println(appointment);
        return appointment;
    }
    @GetMapping("/map/doctor")
    public Map mapDoctor()
    {
        Map mapDoctor = new HashMap();
        Appointment appointment1 = new Appointment("5","Raj","Seema","14th feb");
        mapDoctor.put(appointment1.getDoctorName(),appointment1);
        return mapDoctor;
    }

}
