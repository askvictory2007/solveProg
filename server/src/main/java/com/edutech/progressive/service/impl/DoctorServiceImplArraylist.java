package com.edutech.progressive.service.impl;

import com.edutech.progressive.entity.Doctor;
import com.edutech.progressive.service.DoctorService;

import java.util.List;

public class DoctorServiceImplArraylist  implements DoctorService {

    @Override
    public void emptyArrayList() {

    }

    @Override
    public List<Doctor> getAllDoctors() {
        return List.of();
    }

    @Override
    public Integer addDoctor(Doctor doctor) {
        return -1;
    }

    @Override
    public List<Doctor> getDoctorSortedByExperience() {
        return List.of();
    }
}