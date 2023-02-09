package com.mongo.app.model;

public class Patient {


    public Patient(String patientname, String patientid, String contactNumber) {
        this.patientname = patientname;
        this.patientid = patientid;
        this.contactNumber = contactNumber;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    String patientname;
    String patientid;

    String contactNumber;
}
