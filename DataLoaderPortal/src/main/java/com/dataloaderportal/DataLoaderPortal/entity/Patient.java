package com.dataloaderportal.DataLoaderPortal.entity;

import javax.persistence.*;

@Entity
public class Patient {

    @Id
    @Column(name="patientID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long patientID;

    private String patientName;
    private String address;
    private String dob;
    private String email;
    private String phone;
    private String drugID;
    private String drugName;

    @Override
    public String toString() {
        return "Patient{" +
                "patientID=" + patientID +
                ", patientName='" + patientName + '\'' +
                ", address='" + address + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", drugID='" + drugID + '\'' +
                ", drugName='" + drugName + '\'' +
                '}';
    }

    public Patient() {
    }

    public Patient(Long patientID, String patientName, String address, String dob, String email, String phone, String drugID, String drugName) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.address = address;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.drugID = drugID;
        this.drugName = drugName;
    }

    public Long getPatientID() {
        return patientID;
    }

    public void setPatientID(Long patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDrugID() {
        return drugID;
    }

    public void setDrugID(String drugID) {
        this.drugID = drugID;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
}
