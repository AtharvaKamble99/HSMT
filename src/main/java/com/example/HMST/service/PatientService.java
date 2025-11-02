package com.example.HMST.service;

import com.example.HMST.models.Patient;
import com.example.HMST.repository.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;
    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    public List<Patient> getAllPatients() {
        try {
            System.out.println("Into Service Layer");
            return patientRepository.findAll();
        } catch (Exception e) {
            logger.error("An error occurred while fetching all patients: {}", e.getMessage(), e);
            return null;
        }
    }

    public Patient createPatient(Patient patient) {
        try {
            System.out.println("Into Service Layer");
            patientRepository.save(patient);
            return patient;
        } catch (Exception e) {
            logger.error("An error occurred while creating a patient: {}", e.getMessage(), e);
            return null;
        }
    }

    public void deletePatient(Long id) {
        try {
            System.out.println("Into Service Layer");
            patientRepository.deleteById(id);
        } catch (Exception e) {
            logger.error("An error occurred while deleting the patient with id {}: {}", id, e.getMessage(), e);
        }
    }

    public Patient getPatientById(Long id) {
        try {
                return (Patient) patientRepository.findById(id).orElse(null);
        } catch (Exception e) {
            logger.error("An error occurred while fetching the patient with id {}: {}", id, e.getMessage(), e);
            return null;
        }
    }

    public Patient updatePatient(Long id,Patient updatedPatient) {
        try {
            System.out.println("Into Service Layer");
            Optional<Patient> existingPatient = patientRepository.findById(id);
            if(existingPatient.isPresent()){
                Patient p = existingPatient.get();
                p.setName(updatedPatient.getName());
                p.setAge(updatedPatient.getAge());
                p.setGender(updatedPatient.getGender());
                Patient savedPatient = (Patient) patientRepository.save(p);
                return savedPatient;
            }
            else{
                logger.error("Patient with id {} not found",id);
                return null;
            }
        } catch (Exception e) {
            logger.error("An error occurred while updating the patient with id {}: {}", id, e.getMessage(), e);
            return null;
        }
    }

}