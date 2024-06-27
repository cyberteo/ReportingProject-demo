package com.LaborantReportingApplication.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.LaborantReportingApplication.demo.entity.Laborant;
import com.LaborantReportingApplication.demo.service.LaborantService;

import java.util.List;

@RestController
@RequestMapping("/api/laborants")
public class LaborantController {
    @Autowired
    private LaborantService laborantService;

    @GetMapping
    public List<Laborant> getAllLaborants() {
        return laborantService.getAllLaborants();
    }

    @GetMapping("/{id}")
    public Laborant getLaborantById(@PathVariable Long id) {
        return laborantService.getLaborantById(id);
    }

    @PostMapping
    public Laborant createLaborant(@RequestBody Laborant laborant) {
        return laborantService.saveLaborant(laborant);
    }

    @PutMapping("/{id}")
    public Laborant updateLaborant(@PathVariable Long id, @RequestBody Laborant laborant) {
        laborant.setId(id);
        return laborantService.saveLaborant(laborant);
    }

    @DeleteMapping("/{id}")
    public void deleteLaborant(@PathVariable Long id) {
        laborantService.deleteLaborant(id);
    }
}