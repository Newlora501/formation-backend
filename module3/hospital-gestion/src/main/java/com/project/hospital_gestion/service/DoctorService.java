package com.project.hospital_gestion.service;

import com.project.hospital_gestion.entity.Doctor;
import com.project.hospital_gestion.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RequiredArgsConstructor
@Service
public class DoctorService {

    private  final DoctorRepository doctorRepository;

    public List<Doctor> getDoctors() {
        return doctorRepository.findAll();

    }

    public Doctor getDoctorById(Long id){
        return  doctorRepository.findById(id).orElse(null);
    }

    public  Doctor saveDoctor(Doctor doctor){
        return  doctorRepository.save(doctor);
    }

    public Doctor updateDoctor(Long id, Doctor doctor){
        Doctor existingDoctor = getDoctorById(id);
        existingDoctor.setDoctorName(doctor.getDoctorName());
        doctorRepository.save(existingDoctor);
        return  existingDoctor;
    }

    public void deleteDoctor(Long id){
        doctorRepository.deleteById(id);
    }
}
