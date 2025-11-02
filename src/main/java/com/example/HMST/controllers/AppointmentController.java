package com.example.HMST.controllers;

import com.example.HMST.models.Appointment;
import com.example.HMST.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;
    @GetMapping
    public List<Appointment> getAllAppointments(){
        System.out.println("Fetching all Appointments");
        return appointmentService.getAllAppointments();
    }

    @PostMapping
   public Appointment createAppointment(@RequestBody Appointment appointment){
            System.out.println("Creating an Appointment");
        return appointmentService.createAppointment(appointment);
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id ){
        System.out.println("Fetching Appointment By Id");
        return appointmentService.getAppointmentById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id){
        System.out.println("Appointment deleted");
        appointmentService.deleteAppointment(id);
    }

    @PutMapping
    public void updateAppointment(@PathVariable Long id, @RequestBody Appointment appointment){
        appointmentService.updateAppointment(id,appointment);

    }
}
