package com.LaborantReportingApplication.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.LaborantReportingApplication.demo.entity.Report;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Long> {
    List<Report> findByPatientFirstNameContainingOrPatientLastNameContainingOrPatientTcNumberContainingOrLaborantFirstNameContainingOrLaborantLastNameContaining(
        String patientFirstName, String patientLastName, String patientTcNumber, String laborantFirstName, String laborantLastName);
    List<Report> findAllByOrderByReportDateAsc();
}
