package com.example.HMST.service;

import com.example.HMST.models.Appointment;
import com.example.HMST.repository.AppointmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    private static final Logger logger = LoggerFactory.getLogger(AppointmentService.class);

    public List<Appointment> getAllAppointments() {
        try {
            logger.info("Fetching all appointments from the service layer...");
            return appointmentRepository.findAll();
        } catch (Exception e) {
            logger.error("An error occurred while fetching all appointments: {}", e.getMessage(), e);
            return null;
        }
    }

    public Appointment createAppointment(Appointment appointment) {
        try {
            logger.info("Creating a new appointment in the service layer...");
            appointmentRepository.save(appointment);
            return appointment;
        } catch (Exception e) {
            logger.error("An error occurred while creating an appointment: {}", e.getMessage(), e);
            return null;
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            return (Appointment) appointmentRepository.findById(id).orElse(null);
        } catch (Exception e) {
            logger.error("An error occurred while fetching the appointment with ID {}: {}", id, e.getMessage(), e);
            return null;
        }
    }

    public void deleteAppointment(Long id) {
        try {
            logger.info("Deleting appointment with ID: {}", id);
            appointmentRepository.deleteById(id);
        } catch (Exception e) {
            logger.error("An error occurred while deleting the appointment with ID {}: {}", id, e.getMessage(), e);
        }
    }

    public Appointment updateAppointment(Long id, Appointment updatedappointment) {
        try {
            Optional<Appointment> existingAppointment= appointmentRepository.findById(id);
            if(existingAppointment.isPresent()){
                Appointment a = existingAppointment.get();
                a.setDate(updatedappointment.getDate());
                a.setDoctorId(updatedappointment.getDoctorId());
                a.setPatientId(updatedappointment.getPatientId());
                Appointment savedApp= (Appointment) appointmentRepository.save(a);
                return savedApp;
            }
            else{
                logger.error("Appointment with id {} not found",id);
                return null;
            }
        } catch (Exception e) {
            logger.error("An error occurred while updating the appointment with ID {}: {}", id, e.getMessage(), e);
            return null;
        }
    }
}
