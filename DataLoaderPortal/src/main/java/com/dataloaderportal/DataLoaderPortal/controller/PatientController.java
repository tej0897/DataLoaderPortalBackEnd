package com.dataloaderportal.DataLoaderPortal.controller;

import com.dataloaderportal.DataLoaderPortal.entity.Patient;
import com.dataloaderportal.DataLoaderPortal.service.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class PatientController {

    @Autowired
    private PatientServiceImpl patientService;

    @PostMapping("/addData")
    public ResponseEntity<?>addData(@RequestBody List<Patient> patientList){
        if (patientService.addData(patientList)!=null){
            return new ResponseEntity<>(patientList, HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Operation Failure", HttpStatus.CONFLICT);
    }
}
