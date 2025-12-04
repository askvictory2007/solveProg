package com.edutech.progressive.service.impl;

import com.edutech.progressive.entity.Patient;
import com.edutech.progressive.service.PatientService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PatientServiceImplArraylist implements PatientService {

    private static List<Patient> patientList = new ArrayList<>();

    @Override
    public List<Patient> getAllPatients() {
        return patientList;
    }

    @Override
    public Integer addPatient(Patient patient) {
        patientList.add(patient);
        return patientList.size();
    }

    @Override
    public List<Patient> getAllPatientSortedByName() {
        List<Patient> sortedPatients = patientList;
        sortedPatients.sort(Comparator.comparing(Patient::getFullName));
        return sortedPatients;
    }

    @Override
    public void emptyArrayList() {
        patientList = new ArrayList<>();
    }
}