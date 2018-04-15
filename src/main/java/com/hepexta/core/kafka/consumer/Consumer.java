package com.hepexta.core.kafka.consumer;

import com.hepexta.core.dto.TransferData;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Consumer {

	private static Logger logger = LoggerFactory.getLogger(Consumer.class);

	@KafkaListener(topics = "myTopic")
	public void listen(ConsumerRecord<String, TransferData> record) throws Exception {
		logger.info("OLOLO {}", record.value().toString());

	}
}