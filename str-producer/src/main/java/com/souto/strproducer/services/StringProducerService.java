package com.souto.strproducer.services;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import java.util.concurrent.CompletableFuture;
import static org.apache.kafka.common.requests.FetchMetadata.log;

@Log4j2
@Service
public class StringProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){

        CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send("str-topic", message).toCompletableFuture();
        future.whenComplete((result, exception) -> {
            if (exception == null) {
                log.info("Send message with sucess {}", message );
                log.info("Partiton => {} | Offset => {}",result.getRecordMetadata().partition(), result.getRecordMetadata().offset());
            } else {
                log.error("Error send message {}",message);
            }
        });

    }


}
