package com.LaborantReportingApplication.demo.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.LaborantReportingApplication.demo.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByTcNumber(String tcNumber);
}
