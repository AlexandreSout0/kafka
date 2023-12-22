package com.alx.jsonconsumer.listener;

import com.alx.jsonconsumer.model.Payment;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import static java.lang.Thread.sleep;
import static org.apache.kafka.common.requests.FetchMetadata.log;

@Log4j2
@Component
public class JsonListener {

    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "create-group", containerFactory = "jsonContainerFactory")
    public void antiFraud(@Payload Payment payment) throws InterruptedException {
        log.info("::: Recebi o pagamento {}", payment.toString());
        Thread.sleep(2000);
        log.info("==> Validando Fraude ... ");
        Thread.sleep(2000);
        log.info("==> Compra Aprovada ... ");
        Thread.sleep(2000);

    }

    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "pdf-group", containerFactory = "jsonContainerFactory")
    public void pdfGenerator(@Payload Payment payment) throws InterruptedException {
        Thread.sleep(3000);
        log.info("==> Gerando PDF ID {} !", payment.getId());
        Thread.sleep(3000);
    }

    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "email-group", containerFactory = "jsonContainerFactory")
    public void sendEmail() throws InterruptedException {
        Thread.sleep(3000);
        log.info("==> Enviando email de Confirmação !");
    }

}
