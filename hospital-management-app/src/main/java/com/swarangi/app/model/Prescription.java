package com.swarangi.app.model;

public class Prescription {
    public Prescription(String prescriptionId, String appointmentId, String description, String patientName, String doctorName) {
        this.prescriptionId = prescriptionId;
        this.appointmentId = appointmentId;
        this.description = description;
        this.patientName = patientName;
        this.doctorName = doctorName;
    }

    public Prescription() {

    }

    String prescriptionId;
    String appointmentId;
    String description;
    String patientName;
    String doctorName;
}
