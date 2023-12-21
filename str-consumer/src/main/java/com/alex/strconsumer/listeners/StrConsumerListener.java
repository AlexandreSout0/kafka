package com.alex.strconsumer.listeners;

import com.alex.strconsumer.custom.StrConsumerCustomListener;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import static org.apache.kafka.common.requests.FetchMetadata.log;

@Log4j2
@Component
public class StrConsumerListener {
    //@KafkaListener(groupId = "group-1", topicPartitions = {@TopicPartition(topic = "str-topic", partitions = {"0"})}, containerFactory = "strContainerFactory")
    @StrConsumerCustomListener(groupId = "group-1")
    public void create(String message) {
        log.info("CREATE ::: Receive message --> {} ", message );
    }
    @SneakyThrows
    @StrConsumerCustomListener(groupId = "group-1")
    public void log(String message) {
        log.info("LOG ::: Receive message --> {} ", message );
        throw new IllegalArgumentException("EXCEPTION ... ");
    }

    @StrConsumerCustomListener(groupId = "group-2", containerFactory = "validMessageContainerFactory")
    public void history(String message) {
        log.info("HISTORY ::: Receive message --> {} ", message );
    }
}
