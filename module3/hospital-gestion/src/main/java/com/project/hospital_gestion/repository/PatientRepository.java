package com.project.hospital_gestion.repository;

import com.project.hospital_gestion.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
