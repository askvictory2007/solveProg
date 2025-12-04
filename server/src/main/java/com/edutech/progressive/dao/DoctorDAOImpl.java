package com.edutech.progressive.dao;


import com.edutech.progressive.entity.Doctor;

import java.util.List;

public class DoctorDAOImpl implements DoctorDAO{


    @Override
    public int addDoctor(Doctor doctor) {
        return -1;
    }

    @Override
    public Doctor getDoctorById(int doctorId) {
        return null;
    }

    @Override
    public void updateDoctor(Doctor doctor) {

    }

    @Override
    public void deleteDoctor(int doctorId) {

    }

    @Override
    public List<Doctor> getAllDoctors() {
        return List.of();
    }
}
