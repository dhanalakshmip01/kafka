package com.kafkademo.kafkademo.kafka;



import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	
	 private final Logger logger = LoggerFactory.getLogger(Consumer.class);

	    @KafkaListener(topics = "${tpd.topic-name}",groupId ="group-id")
	    public void consume(String message) throws IOException {
	        logger.info(String.format(" Consumed message ->", message));
	    }
}
