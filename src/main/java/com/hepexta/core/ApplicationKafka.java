package com.hepexta.core;

import com.hepexta.core.dto.TransferData;
import com.hepexta.core.kafka.producer.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.Date;

/**
 * Created by Sergey on 01.04.2018.
 */
@SpringBootApplication
public class ApplicationKafka implements CommandLineRunner {

	public static Logger logger = LoggerFactory.getLogger(ApplicationKafka.class);

	public static void main(String[] args) {
		System.out.println("Lauching");
		SpringApplication.run(ApplicationKafka.class);
	}

	@Autowired
	Producer producer;

	@Override
	public void run(String... args) {
		logger.info("Sending data");
		producer.produce( new TransferData("You", 1, new Date() ) );
		producer.produce( new TransferData("Me", 2, new Date() ) );
	//	sendMessage( new TransferData("You", 1, new Date() ) );
		logger.info("All received");
	}
}
