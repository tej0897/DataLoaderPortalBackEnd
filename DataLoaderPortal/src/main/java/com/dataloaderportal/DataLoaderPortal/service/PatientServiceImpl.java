package com.dataloaderportal.DataLoaderPortal.service;


import com.dataloaderportal.DataLoaderPortal.entity.Patient;
import com.dataloaderportal.DataLoaderPortal.repo.PatientRepo;
import org.springframework.security.core.parameters.P;

import java.util.List;

public class PatientServiceImpl implements PatientService {

    private PatientRepo patientRepo;


    @Override
    public List<Patient> addData(List<Patient> patientList) {
        return patientRepo.saveAll(patientList);
    }
}
