package com.example.HMST.service;

import com.example.HMST.models.Doctor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class DoctorService  {

    public List<Doctor> getAllDoctors(){
        try{
            System.out.println("Into Service Layer");
            return null;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }


    public Doctor createDoctor(Doctor doctor){
        try{
            System.out.println("Into Service Layer");
            return null;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }


    public Doctor getDoctorById(Long id){
        try{
            System.out.println("Into Service Layer");
            return null;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }


    public void deletePatient(Long id){

        try{
            System.out.println("Into Service Layer");

        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }


    public void updatePatient(Long id){
        try{
            System.out.println("Into Service Layer");

        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }


}
