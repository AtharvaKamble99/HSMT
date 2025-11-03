package com.example.HMST.controllers;

import com.example.HMST.models.Doctor;
import com.example.HMST.models.Patient;
import com.example.HMST.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public Page<Doctor> getAllDoctors(@RequestParam (defaultValue = "0")int page, @RequestParam(defaultValue = "2")int size){
        System.out.println("Fetching All Doctors");
        return doctorService.getAllDoctors(page,size);
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
    public void deleteDoctor(@PathVariable Long id){
        System.out.println("deleting patient by Id");
        doctorService.deleteDoctor(id);
    }

    @PutMapping
    public void updateDoctor(@PathVariable Long id, @RequestBody Doctor doctor){
        doctorService.updateDoctor(id,doctor);
    }





}
