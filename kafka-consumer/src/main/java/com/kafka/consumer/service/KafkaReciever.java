package com.kafka.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.consumer.model.Festival;

@Service
public class KafkaReciever {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaReciever.class);

	@KafkaListener(topics = "${kafka.topic.name}", groupId = "${kafka.consumer.group.id}", containerFactory = "kafkaListenerContainerFactory")
	public void recieveData(Festival student) {
		LOGGER.info("Data - " + student.toString() + " recieved");
	}

}
