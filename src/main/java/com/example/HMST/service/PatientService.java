package com.example.HMST.service;

import com.example.HMST.models.Patient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PatientService {

    public List<Patient> getAllPatients(){
        try{
            System.out.println("Into Service Layer");
            return null;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Patient createPatient(Patient patient){
        try{
            System.out.println("Into Service Layer");
            return null;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void deletePatient(Long id ){
        try{
            System.out.println("Into Service Layer");

        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }

    public Patient getPatientById(Long id){
        try{
            return null;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void updatePatient( Long id){
        try{
            System.out.println("Into Service Layer");

        }catch (Exception e){
            System.out.println(e.getMessage());

        }

    }
}
