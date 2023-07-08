package br.com.study.rabbitmq_example_consumer;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class RabbitmqExampleConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqExampleConsumerApplication.class, args);
	}

}
