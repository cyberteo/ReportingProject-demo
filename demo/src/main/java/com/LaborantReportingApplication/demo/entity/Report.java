package com.LaborantReportingApplication.demo.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "reports")
@Data
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_number", nullable = false)
    private String fileNumber;

    @Column(name = "diagnosis_title", nullable = false)
    private String diagnosisTitle;

    @Column(name = "diagnosis_details")
    private String diagnosisDetails;

    @Column(name = "report_date", nullable = false)
    private Date reportDate;

    @Column(name = "report_image")
    private String reportImage;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "laborant_id", nullable = false)
    private Laborant laborant;
}