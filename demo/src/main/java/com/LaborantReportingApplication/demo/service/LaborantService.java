package com.LaborantReportingApplication.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LaborantReportingApplication.demo.entity.Laborant;
import com.LaborantReportingApplication.demo.repository.LaborantRepository;

import java.util.List;

@Service
public class LaborantService {
    @Autowired
    private LaborantRepository laborantRepository;

    public List<Laborant> getAllLaborants() {
        return laborantRepository.findAll();
    }

    public Laborant getLaborantById(Long id) {
        return laborantRepository.findById(id).orElse(null);
    }

    public Laborant saveLaborant(Laborant laborant) {
        return laborantRepository.save(laborant);
    }

    public void deleteLaborant(Long id) {
        laborantRepository.deleteById(id);
    }
}