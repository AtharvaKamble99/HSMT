package com.example.HMST.service;

import com.example.HMST.models.Appointment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AppointmentService {

    public List<Appointment> getAllAppointments(){
        try{
            System.out.println("Into Service Layer");
            return null;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Appointment createAppointment(Appointment appointment){
        try{
            System.out.println("Into Service Layer");
            return null;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Appointment getAppointmentById(Long id ){
        try{
            return null;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void deleteAppointment(@PathVariable Long id){
        try{
            System.out.println("Into Service Layer");

        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }

    public void updatePatient(@PathVariable Long id){
        try{
            System.out.println("Into Service Layer");

        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
}
