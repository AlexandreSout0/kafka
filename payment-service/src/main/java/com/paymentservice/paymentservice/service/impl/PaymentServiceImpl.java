package com.paymentservice.paymentservice.service.impl;

import com.paymentservice.paymentservice.model.Payment;
import com.paymentservice.paymentservice.service.PaymentService;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import static org.apache.kafka.common.utils.Utils.sleep;

import java.io.Serializable;

import static org.apache.kafka.common.requests.FetchMetadata.log;

@Log4j2
@Service
public class PaymentServiceImpl  implements PaymentService {

    @Autowired
    private KafkaTemplate<String, Serializable> kafkaTemplate;

    @SneakyThrows
    @Override
    public void sendPayment(Payment payment) throws InterruptedException {
        log.info("PAYMENT_SERVICE_IMPL :::  Recebi o pagamento {}", payment);
        Thread.sleep(1000);
        log.info("PAYMENT_SERVICE_IMPL :::  Enviando o pagamento");
        kafkaTemplate.send("payment-topic", payment);
    }
}
