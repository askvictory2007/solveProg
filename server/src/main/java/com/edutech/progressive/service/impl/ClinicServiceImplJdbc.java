package com.edutech.progressive.service.impl;

import com.edutech.progressive.dao.ClinicDAO;
import com.edutech.progressive.entity.Clinic;
import com.edutech.progressive.service.ClinicService;

import java.util.List;

public class ClinicServiceImplJdbc implements ClinicService {

    private ClinicDAO clinicDAO;

    public ClinicServiceImplJdbc(ClinicDAO clinicDAO) {
        this.clinicDAO = clinicDAO;
    }

    @Override
    public List<Clinic> getAllClinics() {
        return List.of();
    }

    @Override
    public Clinic getClinicById(int clinicId) {
        return null;
    }

    @Override
    public Integer addClinic(Clinic clinic) {
        return -1;
    }

    @Override
    public void updateClinic(Clinic clinic) {

    }

    @Override
    public void deleteClinic(int clinicId) {

    }
}