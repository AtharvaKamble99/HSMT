package com.example.HMST.service;

import com.example.HMST.models.Doctor;
import com.example.HMST.repository.DoctorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorService {

    private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);

    @Autowired
    private DoctorRepository doctorRepository;
    public Page<Doctor> getAllDoctors(int page, int size) {
        try {
            logger.info("Fetching all doctors from the service layer...");
            Pageable pageable = PageRequest.of(page,size);
            return doctorRepository.findAll(pageable);
        } catch (Exception e) {
            logger.error("An error occurred while fetching all doctors: {}", e.getMessage(), e);
            return null;
        }
    }

    public Doctor createDoctor(Doctor doctor) {
        try {
            logger.info("Creating a new doctor in the service layer...");
            doctorRepository.save(doctor);
            return doctor;
        } catch (Exception e) {
            logger.error("An error occurred while creating a doctor: {}", e.getMessage(), e);
            return null;
        }
    }

    public Doctor getDoctorById(Long id) {
        try {
            logger.info("Fetching doctor with ID: {}", id);
            return null;
        } catch (Exception e) {
            logger.error("An error occurred while fetching the doctor with ID {}: {}", id, e.getMessage(), e);
            return null;
        }
    }

    public void deleteDoctor(Long id) {
        try {
            logger.info("Deleting doctor with ID: {}", id);
        } catch (Exception e) {
            logger.error("An error occurred while deleting the doctor with ID {}: {}", id, e.getMessage(), e);
        }
    }

    public void updateDoctor(Long id,Doctor doctor) {
        try {
            logger.info("Updating doctor with ID: {}", id);
        } catch (Exception e) {
            logger.error("An error occurred while updating the doctor with ID {}: {}", id, e.getMessage(), e);
        }
    }
}
