package com.edutech.progressive.service.impl;

import com.edutech.progressive.entity.Patient;
import com.edutech.progressive.service.PatientService;

import java.util.List;

public class PatientServiceImplArraylist implements PatientService {

    @Override
    public List<Patient> getAllPatients() {
        return List.of();
    }

    @Override
    public Integer addPatient(Patient patient) {
        return -1;
    }

    @Override
    public List<Patient> getAllPatientSortedByName() {
        return List.of();
    }

    @Override
    public void emptyArrayList() {

    }
}