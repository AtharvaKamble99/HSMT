package com.example.HMST.controllers;

import com.example.HMST.models.Bill;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/bills")
public class BillController {

    @GetMapping
    public List<Bill> getAllBills(){
        return null;
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill){
        System.out.println("Creating a new Bill");
        return bill;
    }


    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id){
        System.out.println("Fethcing bill by id");
        return null;
    }


    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id){
        System.out.println("Deleting a bill");
    }

    @PutMapping
    public void updatePatient(@PathVariable Long id){

    }

}
