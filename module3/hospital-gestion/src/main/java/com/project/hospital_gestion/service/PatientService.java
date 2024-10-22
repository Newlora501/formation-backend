package com.project.hospital_gestion.service;

import com.project.hospital_gestion.entity.Patient;
import com.project.hospital_gestion.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RequiredArgsConstructor
@Service
public class PatientService {
    private  final PatientRepository patientRepository;

    public List<Patient> getPatients() {
        return patientRepository.findAll();

    }

    public Patient getPatientById(Long id){
        return  patientRepository.findById(id).orElse(null);
    }

    public  Patient savePatient(Patient patient){
        return  patientRepository.save(patient);
    }

    public Patient updatePatient(Long id, Patient patient){
        Patient existingPatient = getPatientById(id);
        existingPatient.setPatientName(patient.getPatientName());
        existingPatient.setDoctorId(patient.getDoctorId());
        existingPatient.setAge(patient.getAge());
        patientRepository.save(existingPatient);
        return  existingPatient;
    }

    public String deletePatient(Long id){
        Patient patient = getPatientById(id);
        patientRepository.deleteById(id);
        return "Patient delete";
    }
}