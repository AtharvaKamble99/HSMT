package com.example.HMST.controllers;

import com.example.HMST.models.Appointment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {
    @GetMapping
    public List<Appointment> getAllAppointments(){
        System.out.println("Fetching all Appointments");
        return null;
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment){
        System.out.println("Creating an Appointment");
        return appointment;
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id ){
        System.out.println("Fetching Appointment By Id");
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id){
        System.out.println("Appointment deleted");
    }

    @PutMapping
    public void updatePatient(@PathVariable Long id){

    }
}
