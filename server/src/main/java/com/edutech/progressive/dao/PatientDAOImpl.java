package com.edutech.progressive.dao;

import com.edutech.progressive.entity.Patient;

import java.util.List;

public class PatientDAOImpl implements PatientDAO {

    @Override
    public int addPatient(Patient patient) {
        return -1;
    }

    @Override
    public Patient getPatientById(int patientId) {
        return null;
    }

    @Override
    public void updatePatient(Patient patient) {

    }

    @Override
    public void deletePatient(int patientId) {

    }

    @Override
    public List<Patient> getAllPatients() {
        return List.of();
    }
}
