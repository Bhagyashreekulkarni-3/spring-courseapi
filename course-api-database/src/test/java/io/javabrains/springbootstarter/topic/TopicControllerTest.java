package io.javabrains.springbootstarter.topic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

class TopicControllerTest {

	@Autowired
	TopicRepository topicRepository;
	
	@Test
	@Order(1)
	public void testCreate () {
		Topic t = new Topic();
		t.setId("Spring");
		t.setName("iPhone XR");
		t.setDescription("Fantastic");
		
		topicRepository.save(t);
		assertNotNull(topicRepository.findById("Spring").get());
	}

	

}
