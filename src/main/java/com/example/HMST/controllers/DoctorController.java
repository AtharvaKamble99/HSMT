package com.example.HMST.controllers;

import com.example.HMST.models.Doctor;
import com.example.HMST.models.Patient;
import com.example.HMST.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> getAllDoctors(){
        System.out.println("Fetching All Doctors");
        return doctorService.getAllDoctors();
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor){
        System.out.println("Creating Doctor");
        return doctorService.createDoctor(doctor);
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id){
        System.out.println("Fetching Doctor by Id ");
        return doctorService.getDoctorById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id){
        System.out.println("deleting patient by Id");
        doctorService.deleteDoctor(id);
    }

    @PutMapping
    public void updatePatient(@PathVariable Long id){
        doctorService.updateDoctor(id);
    }





}
