package com.example.HMST.service;

import com.example.HMST.models.Bill;
import com.example.HMST.repository.BillRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BillService {

    private static final Logger logger = LoggerFactory.getLogger(BillService.class);

    @Autowired
    private BillRepository billRepository;
    public Page<Bill> getAllBills(int page, int size) {
        try {
            logger.info("Fetching all bills from the service layer...");
            Pageable pageable = PageRequest.of(page,size);
            return billRepository.findAll(pageable);
        } catch (Exception e) {
            logger.error("An error occurred while fetching all bills: {}", e.getMessage(), e);
            return null;
        }
    }

    public Bill createBill(Bill bill) {
        try {
            logger.info("Creating a new bill in the service layer...");
            return null;
        } catch (Exception e) {
            logger.error("An error occurred while creating a bill: {}", e.getMessage(), e);
            return null;
        }
    }

    public Bill getBillById(Long id) {
        try {
            logger.info("Fetching bill with ID: {}", id);
            return null;
        } catch (Exception e) {
            logger.error("An error occurred while fetching the bill with ID {}: {}", id, e.getMessage(), e);
            return null;
        }
    }

    public void deleteBill(Long id) {
        try {
            logger.info("Deleting bill with ID: {}", id);
        } catch (Exception e) {
            logger.error("An error occurred while deleting the bill with ID {}: {}", id, e.getMessage(), e);
        }
    }

    public void updateBill(Long id,Bill bill) {
        try {
            logger.info("Updating bill with ID: {}", id);
        } catch (Exception e) {
            logger.error("An error occurred while updating the bill with ID {}: {}", id, e.getMessage(), e);
        }
    }
}
