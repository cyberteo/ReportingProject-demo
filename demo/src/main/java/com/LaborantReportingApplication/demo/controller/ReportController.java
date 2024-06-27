package com.LaborantReportingApplication.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.LaborantReportingApplication.demo.entity.Report;
import com.LaborantReportingApplication.demo.service.ReportService;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping
    public List<Report> getAllReports() {
        return reportService.getAllReports();
    }

    @GetMapping("/{id}")
    public Report getReportById(@PathVariable Long id) {
        return reportService.getReportById(id);
    }

    @PostMapping
    public Report createReport(@RequestBody Report report) {
        return reportService.saveReport(report);
    }

    @PutMapping("/{id}")
    public Report updateReport(@PathVariable Long id, @RequestBody Report report) {
        report.setId(id);
        return reportService.saveReport(report);
    }

    @DeleteMapping("/{id}")
    public void deleteReport(@PathVariable Long id) {
        reportService.deleteReport(id);
    }

    @GetMapping("/search")
    public List<Report> searchReports(@RequestParam String query) {
        return reportService.searchReports(query);
    }

    @GetMapping("/sort")
    public List<Report> sortReportsByDate() {
        return reportService.sortReportsByDate();
    }
}