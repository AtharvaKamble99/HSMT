package com.example.HMST.controllers;

import com.example.HMST.models.Bill;
import com.example.HMST.service.BillService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/bills")
public class BillController {

    private BillService billService;
    @GetMapping
    public Page<Bill> getAllBills(@RequestParam(defaultValue = "0")int page, @RequestParam(defaultValue = "2")int size){
        return billService.getAllBills(page,size);
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
    public void updateBill(@PathVariable Long id,@RequestBody Bill bill){
        System.out.println("Updating the bill");
        billService.updateBill(id,bill);
    }

}
