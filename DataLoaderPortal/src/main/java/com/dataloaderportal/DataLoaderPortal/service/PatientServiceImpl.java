package com.dataloaderportal.DataLoaderPortal.service;


import com.dataloaderportal.DataLoaderPortal.entity.Patient;
import com.dataloaderportal.DataLoaderPortal.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepo patientRepo;


    @Override
    public List<Patient> addData(List<Patient> patientList) {
        return patientRepo.saveAll(patientList);
    }
}
