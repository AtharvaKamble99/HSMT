package com.example.HMST.service;

import com.example.HMST.models.Bill;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class BillService {

    public List<Bill> getAllBills(){
        try{
            System.out.println("Into Service Layer");
            return null;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }


    public Bill createBill(Bill bill){
        try{
            System.out.println("Into Service Layer");
            return null;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }



    public Bill getBillById(Long id){
        try{
            System.out.println("Into Service Layer");
            return null;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }



    public void deleteBill(Long id){

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
