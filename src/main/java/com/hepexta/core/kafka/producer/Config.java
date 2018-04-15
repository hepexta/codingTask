package com.hepexta.core.kafka.producer;

import com.hepexta.core.dto.TransferData;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.kafka.core.*;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class Config {

/*	@Bean
	public ProducerFactory<String, TransferData> producerFactory1() {
		return new DefaultKafkaProducerFactory<String, TransferData>(producerConfigs(), new StringDeserializer<>(),
				new JsonDeserializer<TransferData>(TransferData.class));
	}*/

	@Bean
	public ProducerFactory<String, TransferData> producerFactory() {
		return new DefaultKafkaProducerFactory<>(producerConfigs());
	}

	@Bean
	public Map<String, Object> producerConfigs() {
		Map<String, Object> props = new HashMap<>();
		props.put( ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.put( ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		props.put( ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		props.put( "value.serializer", JsonSerializer.class);
		return props;
	}

	@Bean
	public KafkaTemplate<String, TransferData> kafkaTemplate() {
		return new KafkaTemplate<>(producerFactory());
	}

}