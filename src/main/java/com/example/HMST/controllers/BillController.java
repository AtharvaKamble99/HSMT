package com.example.HMST.controllers;

import com.example.HMST.models.Bill;
import com.example.HMST.service.BillService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/bills")
public class BillController {

    private BillService billService;
    @GetMapping
    public List<Bill> getAllBills(){
        return billService.getAllBills();
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill){
        System.out.println("Creating a new Bill");
        return billService.createBill(bill);
    }


    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id){
        System.out.println("Fetching bill by id");
        return billService.getBillById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id){
        System.out.println("Deleting a bill");
        billService.deleteBill(id);
    }

    @PutMapping
    public void updatePatient(@PathVariable Long id){
        System.out.println("Updating the bill");
        billService.updateBill(id);
    }

}
