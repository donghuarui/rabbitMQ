package com.dhr.rabbitMQ;


import com.dhr.RabbitMqApplication;
import com.dhr.controller.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes= RabbitMqApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RabbitMqApplicationTests {
	@Autowired
	private HelloSender helloSender;

	@Test
	public void testRabbit() {
		helloSender.send();
	}

}
