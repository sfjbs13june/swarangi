package com.swarangi.app.model;

public class Appointment {

    public Appointment(String appointmentId, String patientName, String doctorName, String date, Prescription prescription) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
        this.prescription = prescription;
    }

    public Appointment() {

    }

    String appointmentId;
    String patientName;
    String doctorName;
    String date;
    Prescription prescription;
}
