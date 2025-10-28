package com.example.HMST.controllers;

import com.example.HMST.models.Doctor;
import com.example.HMST.models.Patient;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    @GetMapping
    public List<Doctor> getAllDoctors(){
        System.out.println("Fetching All Doctors");
        return null;
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor){
        System.out.println("Creating Doctor");
        return doctor;
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id){
        System.out.println("Fetching Doctor by Id ");
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id){
        System.out.println("deleting patient by Id");
    }

    @PutMapping
    public void updatePatient(@PathVariable Long id){

    }





}
