package com.ednaldo.hr_payroll.services;

import com.ednaldo.hr_payroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, int days) {
        return new Payment("Ednaldo", 200.0, days);
    }
}
