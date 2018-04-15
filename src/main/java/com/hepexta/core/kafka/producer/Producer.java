package com.hepexta.core.kafka.producer;

import com.hepexta.core.dto.TransferData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class Producer {

	public static Logger logger = LoggerFactory.getLogger(Producer.class);

	@Autowired
	private KafkaTemplate<String, TransferData> template;

	public void produce(TransferData transferData) {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.execute(new PoolCaller(transferData));
		executorService.shutdown();
	}

	private class PoolCaller implements Runnable {

		private final int POOL_CALLER_SLEEP_TIME = 5000;

		TransferData transferData;

		PoolCaller( TransferData transferData ) {
			transferData.setDate( new Date() );
			this.transferData = transferData;
		}

		@Override
		public void run() {
			try {

				// Waiting to simulate data fetching from kafka
				logger.info( "Starting long operation" );
				Thread.sleep(POOL_CALLER_SLEEP_TIME);
				template.send( "myTopic", UUID.randomUUID().toString(),transferData);

				produce(transferData);

			} catch (Exception e) {
				logger.error("Error", e);
			}
		}
	}
}
