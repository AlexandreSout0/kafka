package com.paymentservice.paymentservice.service.impl;

import com.paymentservice.paymentservice.model.Payment;
import com.paymentservice.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import static org.apache.kafka.common.requests.FetchMetadata.log;

@Log4j2
@Service
public class PaymentServiceImpl  implements PaymentService {
    @Override
    public void sendPayment(Payment payment){
        log.info("PAYMENT_SERVICE_IMPL :::  Recebi o pagamento {}", payment);
    }
}
