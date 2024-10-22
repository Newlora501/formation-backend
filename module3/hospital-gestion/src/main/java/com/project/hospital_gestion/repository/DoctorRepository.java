package com.project.hospital_gestion.repository;

import com.project.hospital_gestion.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
