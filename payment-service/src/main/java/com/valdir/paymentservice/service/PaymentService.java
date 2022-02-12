package com.valdir.paymentservice.service;

import com.valdir.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
