package com.LaborantReportingApplication.demo.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.LaborantReportingApplication.demo.entity.Laborant;

public interface LaborantRepository extends JpaRepository<Laborant, Long> {
    Laborant findByHospitalId(String hospitalId);
}
