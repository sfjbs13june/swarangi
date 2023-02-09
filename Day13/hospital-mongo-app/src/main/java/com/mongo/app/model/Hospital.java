package com.mongo.app.model;

public class Hospital {


    public Hospital(String hospitalname, String address, String contactNumber) {
        this.hospitalname = hospitalname;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    String hospitalname;
    String address;

    String contactNumber;
}
