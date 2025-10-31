package com.example.HMST.service;

import com.example.HMST.models.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PatientService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    public List<Patient> getAllPatients() {
        try {
            System.out.println("Into Service Layer");
            return null;
        } catch (Exception e) {
            logger.error("An error occurred while fetching all patients: {}", e.getMessage(), e);
            return null;
        }
    }

    public Patient createPatient(Patient patient) {
        try {
            System.out.println("Into Service Layer");
            return null;
        } catch (Exception e) {
            logger.error("An error occurred while creating a patient: {}", e.getMessage(), e);
            return null;
        }
    }

    public void deletePatient(Long id) {
        try {
            System.out.println("Into Service Layer");
        } catch (Exception e) {
            logger.error("An error occurred while deleting the patient with id {}: {}", id, e.getMessage(), e);
        }
    }

    public Patient getPatientById(Long id) {
        try {
            return null;
        } catch (Exception e) {
            logger.error("An error occurred while fetching the patient with id {}: {}", id, e.getMessage(), e);
            return null;
        }
    }

    public void updatePatient(Long id) {
        try {
            System.out.println("Into Service Layer");
        } catch (Exception e) {
            logger.error("An error occurred while updating the patient with id {}: {}", id, e.getMessage(), e);
        }
    }

}