package com.example.HMST.controllers;

import com.example.HMST.models.Patient;
import com.example.HMST.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;
    @GetMapping
    public List<Patient> getAllPatients(){
        System.out.println("Fetching all patients");
        return patientService.getAllPatients();
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
        System.out.println("Creating Patient");
        return patientService.createPatient(patient);
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id){
        System.out.println("Fetching Patient by Id ");
        return patientService.getPatientById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id){
        System.out.println("deleting patient by Id");
        patientService.deletePatient(id);
    }

    @PutMapping
    public void updatePatient(@PathVariable Long id, @RequestBody Patient patient){
        patientService.updatePatient(id,patient);

    }
}
